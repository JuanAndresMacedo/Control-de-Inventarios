package Interfaz;

import Dominio.*;
import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class RegistroVuelo extends javax.swing.JFrame {

    private Sistema modelo;
    private DefaultTableModel modeloTabla;

    //Constructor
    public RegistroVuelo(Sistema unModelo) {
        initComponents();
        modelo = unModelo;
        modeloTabla = new DefaultTableModel();
        inicializarTabla();
        alinearDatos();

        //Centrar
        this.setLocationRelativeTo(null);
    }

    private void inicializarTabla() {
        modeloTabla.addColumn("De");
        for (int i = 1; i <= 10; i++) {
            modeloTabla.addColumn("" + i);
        }
        Object[] datosArchivo = new Object[11];
        Object[] datosManual = new Object[11];
        
        for (int i = 0; i < 11; i++) {
            if (i == 0) {
                datosArchivo[i] = "Archivo";
                datosManual[i] = "Manual";
            } else {
                datosArchivo[i] = "-";
                datosManual[i] = "-";
            }
        }

        modeloTabla.addRow(datosArchivo);
        modeloTabla.addRow(datosManual);
        jTable1.setModel(modeloTabla);
    }

    private void alinearDatos() {
        DefaultTableCellRenderer alinear = new DefaultTableCellRenderer();
        alinear.setHorizontalAlignment(SwingConstants.CENTER);

        for (int i = 0; i < 11; i++) {
            jTable1.getColumnModel().getColumn(i).setCellRenderer(alinear);
        }
    }

    public void llenarTablaArchivo(String[] datosProcesados) {
        jLabelArea.setText("Area: " + datosProcesados[1]);
        jLabelFila.setText("Fila: " + datosProcesados[2]);
        for (int i = 1; i < 11; i++) {
            modeloTabla.setValueAt(datosProcesados[i + 2], 0, i);
        }
    }

    public void llenarTablaManual(String area, String fila) {
        String[] datosManual = modelo.codCargaVueloManual(area, fila);
        for (int i = 1; i < 11; i++) {
            modeloTabla.setValueAt(datosManual[i - 1], 1, i);
        }
    }

    public void insertarComparaciones(String[] codCargas, String area, String fila) {
        int[] coincidenciasDiferencias = modelo.comparacionesConArchivoYManual(codCargas, modelo.codCargaVueloManual(area, fila));
        jLabelCoincidencias.setText("Total Coincidencias: " + coincidenciasDiferencias[0]);
        jLabelDiferencias.setText("Total Diferencias: " + coincidenciasDiferencias[1]);
    }

    public void colorearCeldas() {
        for (int i = 1; i <= 10; i++) {
            if (jTable1.getValueAt(0, i).equals(jTable1.getValueAt(1, i))) {
                DefaultTableCellRenderer colorVerde = new DefaultTableCellRenderer();
                colorVerde.setBackground(new java.awt.Color(0, 204, 0));
                colorVerde.setHorizontalAlignment(JLabel.CENTER);
                jTable1.getColumnModel().getColumn(i).setCellRenderer(colorVerde);

            } else {
                DefaultTableCellRenderer colorRojo = new DefaultTableCellRenderer();
                colorRojo.setBackground(new java.awt.Color(255, 102, 102));
                colorRojo.setHorizontalAlignment(JLabel.CENTER);
                jTable1.getColumnModel().getColumn(i).setCellRenderer(colorRojo);
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFileChooser2 = new javax.swing.JFileChooser();
        jLabelArea = new javax.swing.JLabel();
        jLabelFila = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabelCoincidencias = new javax.swing.JLabel();
        jLabelDiferencias = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Registro de Vuelo");
        setResizable(false);

        jFileChooser2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFileChooser2ActionPerformed(evt);
            }
        });

        jLabelArea.setText("Area: ");

        jLabelFila.setText("Fila: ");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "De", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7", "Title 8", "Title 9", "Title 10", "Title 11"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jLabelCoincidencias.setText("Total Coincidencias: 0");

        jLabelDiferencias.setText("Total Diferencias: 0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelCoincidencias)
                                    .addComponent(jLabelDiferencias)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(7, 7, 7)
                                        .addComponent(jLabelArea)
                                        .addGap(49, 49, 49)
                                        .addComponent(jLabelFila))))
                            .addComponent(jFileChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 194, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jFileChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelArea)
                    .addComponent(jLabelFila))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(jLabelCoincidencias)
                .addGap(18, 18, 18)
                .addComponent(jLabelDiferencias)
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jFileChooser2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFileChooser2ActionPerformed
        String[] datosEnBruto = modelo.leerArchivo(jFileChooser2.getSelectedFile().getName());
        String nombreArchivo = jFileChooser2.getSelectedFile().getName();

        if (modelo.archivoEsValido(datosEnBruto)) {
            
            if (modelo.dronExiste(datosEnBruto[0])) {
                
                String[] datosProcesados = modelo.procesarDatos(datosEnBruto);
                
                String id = datosProcesados[0];
                String area = datosProcesados[1];
                String fila = datosProcesados[2];
                String[] codCargas = modelo.arrayCodigosDeCarga(datosProcesados); 
                
                //agregar el vuelo a la lista de vuelos 
                if ( modelo.buscarDron(datosProcesados[0]).vueloEsExitoso(codCargas)) {
                    int[] coincidenciasDiferencias = modelo.comparacionesConArchivoYManual(codCargas, modelo.codCargaVueloManual(area, fila));
                    modelo.buscarDron(datosProcesados[0]).agregarVuelo(new Vuelo(id, area, fila , codCargas, nombreArchivo,
                        String.valueOf(coincidenciasDiferencias[0]), String.valueOf(coincidenciasDiferencias[1])));
                    llenarTablaArchivo(datosProcesados);
                    llenarTablaManual(area, fila);
                    insertarComparaciones(codCargas, area, fila);
                    colorearCeldas();
                } else {
                    modelo.buscarDron(datosProcesados[0]).agregarVuelo(new Vuelo(id, area, fila , codCargas, nombreArchivo, "0", "0"));
                    String cantCodCargas = modelo.cantCodigosDeCarga(codCargas);
                    JOptionPane.showMessageDialog(null, "El vuelo no fue exitoso, el archivo tiene "
                            + cantCodCargas + " lineas de carga");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Dron inexistente",
                        "Advertencia", JOptionPane.WARNING_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Los datos del archivo son incorrectos o se encuentra vacío",
                    "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jFileChooser2ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFileChooser jFileChooser2;
    private javax.swing.JLabel jLabelArea;
    private javax.swing.JLabel jLabelCoincidencias;
    private javax.swing.JLabel jLabelDiferencias;
    private javax.swing.JLabel jLabelFila;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}


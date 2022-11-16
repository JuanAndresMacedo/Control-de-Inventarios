package Interfaz;

import Dominio.*;
import java.util.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Drones extends javax.swing.JFrame implements Observer {

    private Sistema modelo;
    private String[] arrayTabla = new String[3];

    private DefaultTableModel modeloTabla;

    public Drones(Sistema unModelo) {
        initComponents();
        modelo = unModelo;
        modelo.addObserver(this);
        modeloTabla = new DefaultTableModel();
        modeloTabla.addColumn("Identificacion");
        modeloTabla.addColumn("Modelo");
        modeloTabla.addColumn("Camara");
        llenarTabla(arrayTabla);

        //Centrar
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblIdentificacion = new javax.swing.JLabel();
        lblModelo = new javax.swing.JLabel();
        lblCamara = new javax.swing.JLabel();
        txtIdentificacion = new javax.swing.JTextField();
        txtModelo = new javax.swing.JTextField();
        txtCamara = new javax.swing.JTextField();
        btnAgregarD = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Drones");
        setResizable(false);

        lblIdentificacion.setText("Identificacion");

        lblModelo.setText("Modelo");

        lblCamara.setText("Camara");

        btnAgregarD.setText("Agregar");
        btnAgregarD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarDActionPerformed(evt);
            }
        });

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Identificacion", "Modelo", "Camara"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        jLabel1.setFont(new java.awt.Font("Sitka Small", 1, 24)); // NOI18N
        jLabel1.setText("Drones");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblModelo)
                            .addComponent(lblIdentificacion)
                            .addComponent(lblCamara))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtIdentificacion, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                .addComponent(txtModelo))
                            .addComponent(txtCamara, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnAgregarD)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtIdentificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblIdentificacion))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblModelo)
                            .addComponent(txtModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCamara)
                            .addComponent(txtCamara, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addComponent(btnAgregarD)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void llenarTabla(String[] array) {
        modeloTabla.setRowCount(0);
        //Llena array y agrega fila segun los datos
        for (int i = 0; i < modelo.getListaDrones().size(); i++) {
            arrayTabla[0] = modelo.getListaDrones().get(i).getIdentificacion();
            arrayTabla[1] = modelo.getListaDrones().get(i).getModelo();
            arrayTabla[2] = modelo.getListaDrones().get(i).getCamara();
            modeloTabla.addRow(arrayTabla);
            jTable2.setModel(modeloTabla);
        }
    }

    public void reinicioEtiquetas() {
        txtIdentificacion.setText("");
        txtModelo.setText("");
        txtCamara.setText("");
    }

    private void btnAgregarDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarDActionPerformed
        if (!modelo.controlEspacioVacioTresCampos(txtIdentificacion.getText(), txtModelo.getText(), txtCamara.getText())) {
            if (modelo.seIngresoInt(txtCamara.getText())) {
                if (Integer.parseInt(txtCamara.getText()) >= 1 && Integer.parseInt(txtCamara.getText()) <= 6) {
                    if (!modelo.dronRepetido(txtIdentificacion.getText())) {
                        Dron d = new Dron(txtIdentificacion.getText(), txtModelo.getText(), txtCamara.getText());
                        modelo.agregarDron(d);
                        llenarTabla(arrayTabla);

                        reinicioEtiquetas();
                        JOptionPane.showMessageDialog(null, "Ingreso de Dron Correcto", "Informacion", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        reinicioEtiquetas();
                        JOptionPane.showMessageDialog(null, "Error, Dron Existente", "Ingreso Fallido", JOptionPane.INFORMATION_MESSAGE);
                    }
                } else {
                    reinicioEtiquetas();
                    JOptionPane.showMessageDialog(null, "Error, el tipo de Camara es Incorrecto (1 a 6)", "Dato Incorrecto", JOptionPane.INFORMATION_MESSAGE);
                }
            } else {
                reinicioEtiquetas();
                JOptionPane.showMessageDialog(null, "Error, el Tipo de Camara Debe Ser Numerico", "Dato Incorrecto", JOptionPane.INFORMATION_MESSAGE);
            }
        } else {
            reinicioEtiquetas();
            JOptionPane.showMessageDialog(null, "Error, No Se Permiten Campos Vacios", "Dato Incorrecto", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnAgregarDActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarD;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    private javax.swing.JLabel lblCamara;
    private javax.swing.JLabel lblIdentificacion;
    private javax.swing.JLabel lblModelo;
    private javax.swing.JTextField txtCamara;
    private javax.swing.JTextField txtIdentificacion;
    private javax.swing.JTextField txtModelo;
    // End of variables declaration//GEN-END:variables

    @Override
    public void update(Observable o, Object arg) {
        llenarTabla(arrayTabla);
    }
}

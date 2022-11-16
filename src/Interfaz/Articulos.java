package Interfaz;

import Dominio.*;
import java.util.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class Articulos extends javax.swing.JFrame implements Observer {

    private Sistema modelo;
    private String[] arrayTabla = new String[2];
    private DefaultTableModel modeloTabla;

    public Articulos(Sistema unModelo) {
        initComponents();
        modelo = unModelo;
        modelo.addObserver(this);
        modeloTabla = new DefaultTableModel();
        modeloTabla.addColumn("Nombre");
        modeloTabla.addColumn("Descripcion");
        llenarTabla(arrayTabla);

        //Centrar
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblNombreA = new javax.swing.JLabel();
        lblDescripcion = new javax.swing.JLabel();
        txtNombreA = new javax.swing.JTextField();
        txtDescripcion = new javax.swing.JTextField();
        btnAgregarA = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Articulos");
        setResizable(false);

        lblNombreA.setText("Nombre");

        lblDescripcion.setText("Descripcion");

        txtNombreA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreAActionPerformed(evt);
            }
        });

        btnAgregarA.setText("Agregar");
        btnAgregarA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarAActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Descripcion"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setFont(new java.awt.Font("Sitka Small", 1, 24)); // NOI18N
        jLabel1.setText("Articulos");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnAgregarA)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lblNombreA)
                                    .addGap(36, 36, 36)
                                    .addComponent(txtNombreA, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(txtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(lblDescripcion)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNombreA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNombreA))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblDescripcion)
                            .addComponent(txtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addComponent(btnAgregarA))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void llenarTabla(String[] array) {
        modeloTabla.setRowCount(0);
        //Llena array y agrega fila segun los datos
        for (int i = 0; i < modelo.getListaArticulos().size(); i++) {
            arrayTabla[0] = modelo.getListaArticulos().get(i).getNombre();
            arrayTabla[1] = modelo.getListaArticulos().get(i).getDescripcion();
            modeloTabla.addRow(arrayTabla);
            jTable1.setModel(modeloTabla);
        }
    }

    public void reinicioEtiquetas() {
        txtNombreA.setText("");
        txtDescripcion.setText("");
    }
    private void btnAgregarAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarAActionPerformed
        if (!modelo.controlEspacioVacioDosCampos(txtNombreA.getText(), txtDescripcion.getText())) {
            if (!modelo.articuloRepetido(txtNombreA.getText())) {
                Articulo a = new Articulo(txtNombreA.getText(), txtDescripcion.getText());
                modelo.agregarArticulo(a);
                llenarTabla(arrayTabla);

                reinicioEtiquetas();
                JOptionPane.showMessageDialog(null, "Ingreso de Articulo correcto", "Informacion", JOptionPane.INFORMATION_MESSAGE);
            } else {
                reinicioEtiquetas();
                JOptionPane.showMessageDialog(null, "Error, Articulo existente", "Ingreso Fallido", JOptionPane.INFORMATION_MESSAGE);
            }
        } else {
            reinicioEtiquetas();
            JOptionPane.showMessageDialog(null, "Error, no se permiten campos Vacios", "Dato Incorrecto", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnAgregarAActionPerformed

    private void txtNombreAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreAActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarA;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblDescripcion;
    private javax.swing.JLabel lblNombreA;
    private javax.swing.JTextField txtDescripcion;
    private javax.swing.JTextField txtNombreA;
    // End of variables declaration//GEN-END:variables

    @Override
    public void update(Observable o, Object arg) {
        llenarTabla(arrayTabla);
    }
}

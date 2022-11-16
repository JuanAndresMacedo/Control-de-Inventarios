package Interfaz;

import Dominio.*;
import java.util.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Funcionarios extends javax.swing.JFrame implements Observer {

    private Sistema modelo;
    private String[] arrayTabla = new String[3];
    private DefaultTableModel modeloTabla;

    public Funcionarios(Sistema unModelo) {
        initComponents();
        modelo = unModelo;
        modelo.addObserver(this);
        modeloTabla = new DefaultTableModel();
        modeloTabla.addColumn("Nombre");
        modeloTabla.addColumn("Edad");
        modeloTabla.addColumn("Numero");
        llenarTabla(arrayTabla);

        //Centrar
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblNombreF = new javax.swing.JLabel();
        lblEdad = new javax.swing.JLabel();
        lblNumeroF = new javax.swing.JLabel();
        txtNombreF = new javax.swing.JTextField();
        txtEdad = new javax.swing.JTextField();
        txtNumero = new javax.swing.JTextField();
        btnAgregarF = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Funcionarios");
        setResizable(false);

        lblNombreF.setText("Nombre");

        lblEdad.setText("Edad");

        lblNumeroF.setText("Numero");

        btnAgregarF.setText("Agregar");
        btnAgregarF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarFActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Edad", "Numero"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setFont(new java.awt.Font("Sitka Small", 1, 24)); // NOI18N
        jLabel1.setText("Funcionarios");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnAgregarF)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(45, 45, 45))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lblEdad)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(lblNombreF)
                            .addGap(18, 18, 18)
                            .addComponent(txtNombreF, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblNumeroF)
                        .addGap(18, 18, 18)
                        .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNombreF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNombreF))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblEdad))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNumeroF))
                        .addGap(32, 32, 32)
                        .addComponent(btnAgregarF))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void llenarTabla(String[] array) {
        modeloTabla.setRowCount(0);
        //Llena array y agrega fila segun los datos
        for (int i = 0; i < modelo.getListaFuncionarios().size(); i++) {
            arrayTabla[0] = modelo.getListaFuncionarios().get(i).getNombre();
            arrayTabla[1] = modelo.getListaFuncionarios().get(i).getEdad();
            arrayTabla[2] = modelo.getListaFuncionarios().get(i).getNumero();
            modeloTabla.addRow(arrayTabla);
            jTable1.setModel(modeloTabla);
        }
    }

    public void reinicioEtiquetas() {
        txtNombreF.setText("");
        txtEdad.setText("");
        txtNumero.setText("");
    }

    private void btnAgregarFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarFActionPerformed
        if (!modelo.controlEspacioVacioTresCampos(txtNombreF.getText(), txtEdad.getText(), txtNumero.getText())) {

            if (modelo.seIngresoInt(txtEdad.getText()) && modelo.seIngresoInt(txtNumero.getText())) {

                if (modelo.controlRangoNumerico(txtEdad.getText(), 0, 99)) {
                    if (modelo.controlRangoNumerico(txtNumero.getText(), 0, Integer.MAX_VALUE)) {
                        if (!modelo.funcionarioRepetido(txtNumero.getText())) {
                            Funcionario f = new Funcionario(txtNombreF.getText(), txtEdad.getText(), txtNumero.getText());
                            modelo.agregarFuncionario(f);
                            llenarTabla(arrayTabla);

                            reinicioEtiquetas();
                            JOptionPane.showMessageDialog(null, "Ingreso de Funcionario Correcto", "Informacion", JOptionPane.INFORMATION_MESSAGE);
                        } else {
                            reinicioEtiquetas();
                            JOptionPane.showMessageDialog(null, "Error, Funcionario Existente", "Ingreso Fallido", JOptionPane.INFORMATION_MESSAGE);
                        }
                    } else {
                        reinicioEtiquetas();
                        JOptionPane.showMessageDialog(null, "Error, el Numero de Funcionario debe ser Mayor a cero", "Dato Incorrecto", JOptionPane.INFORMATION_MESSAGE);
                    }
                } else {
                    reinicioEtiquetas();
                    JOptionPane.showMessageDialog(null, "Error, la Edad ser Mayor a cero y Menor a noventa y nueve", "Dato Incorrecto", JOptionPane.INFORMATION_MESSAGE);
                }
            } else {
                reinicioEtiquetas();
                JOptionPane.showMessageDialog(null, "Error, la Edad y el N* de Funcionario deben ser Numericos", "Dato Incorrecto", JOptionPane.INFORMATION_MESSAGE);
            }
        } else {
            reinicioEtiquetas();
            JOptionPane.showMessageDialog(null, "Error, No se permiten Campos Vacios", "Dato Incorrecto", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnAgregarFActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblEdad;
    private javax.swing.JLabel lblNombreF;
    private javax.swing.JLabel lblNumeroF;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtNombreF;
    private javax.swing.JTextField txtNumero;
    // End of variables declaration//GEN-END:variables

    @Override
    public void update(Observable o, Object arg) {
        llenarTabla(arrayTabla);
    }
}

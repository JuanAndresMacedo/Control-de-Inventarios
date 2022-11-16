package Interfaz;
//metodo de ingresarCarga iria en area?

import Dominio.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class IngresoEgreso extends javax.swing.JFrame{

    private Sistema modelo;
    private GridLayout layout;
    private int areaActual = 0; //variable para saber en que area estamos
    private int areaAnterior = 0;
    private String coordenadas;
    private JButton btnActual = new JButton();
    private JButton btnAnterior = new JButton();

    //Constructor
    public IngresoEgreso(Sistema unModelo) {
        initComponents();
        modelo = unModelo;
        layout = new GridLayout(12, 10, 2, 2);
        jPanelBotones.setBackground(Color.YELLOW);
        jPanelBotones.setLayout(layout);
        jPanelNumerosVerticlaes.setBackground(Color.white);
        getContentPane().setBackground(Color.white);

        colocarBotones(jPanelBotones);
        apagarBotones();

        jPanelIngresoEgreso.setVisible(true);
        jPanelPrimero.setVisible(true);
        jPanelIngreso.setVisible(false);
        jPanelEgreso.setVisible(false);

        jPanelBotones.setVisible(true);

        jPanelIngresoEgreso.setOpaque(true);
        jPanelIngresoEgreso.setBackground(Color.BLACK);

        jListFuncionarios.setListData(modelo.getListaFuncionarios().toArray());
        jListArticulos.setListData(modelo.getListaArticulos().toArray());

        //Centrar
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelBotones = new javax.swing.JPanel();
        btnDerecha = new javax.swing.JButton();
        btnIzquierda = new javax.swing.JButton();
        lblArea = new javax.swing.JLabel();
        jLabelNumerosHorizontales = new javax.swing.JLabel();
        jPanelNumerosVerticlaes = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jPanelIngresoEgreso = new javax.swing.JPanel();
        jPanelPrimero = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        jPanelIngreso = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListFuncionarios = new javax.swing.JList();
        jScrollPane2 = new javax.swing.JScrollPane();
        jListArticulos = new javax.swing.JList();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButtonIngreso = new javax.swing.JButton();
        jTextFieldCantUnidades = new javax.swing.JTextField();
        jTextFieldCodCarga = new javax.swing.JTextField();
        jPanelEgreso = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabelEgresoCodigo = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabelEgresoArticulo = new javax.swing.JLabel();
        jLabelEgresoCantidad = new javax.swing.JLabel();
        jLabelEgresoFuncionario = new javax.swing.JLabel();
        jButtonEgresar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Ingreso/Egreso de Carga");
        setResizable(false);

        jPanelBotones.setPreferredSize(new java.awt.Dimension(506, 500));

        javax.swing.GroupLayout jPanelBotonesLayout = new javax.swing.GroupLayout(jPanelBotones);
        jPanelBotones.setLayout(jPanelBotonesLayout);
        jPanelBotonesLayout.setHorizontalGroup(
            jPanelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 628, Short.MAX_VALUE)
        );
        jPanelBotonesLayout.setVerticalGroup(
            jPanelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 388, Short.MAX_VALUE)
        );

        btnDerecha.setText(">>");
        btnDerecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDerechaActionPerformed(evt);
            }
        });

        btnIzquierda.setText("<<");
        btnIzquierda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIzquierdaActionPerformed(evt);
            }
        });

        lblArea.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblArea.setText("Area: A");

        jLabelNumerosHorizontales.setText("1                    2                    3                    4                    5                    6                    7                    8                    9                   10");

        jLabel10.setText("1");

        jLabel11.setText("2");

        jLabel12.setText("3");

        jLabel13.setText("4");

        jLabel14.setText("5");

        jLabel15.setText("6");

        jLabel16.setText("7");

        jLabel17.setText("8");

        jLabel18.setText("9");

        jLabel19.setText("10");

        jLabel20.setText("11");

        jLabel21.setText("12");

        javax.swing.GroupLayout jPanelNumerosVerticlaesLayout = new javax.swing.GroupLayout(jPanelNumerosVerticlaes);
        jPanelNumerosVerticlaes.setLayout(jPanelNumerosVerticlaesLayout);
        jPanelNumerosVerticlaesLayout.setHorizontalGroup(
            jPanelNumerosVerticlaesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelNumerosVerticlaesLayout.createSequentialGroup()
                .addGap(0, 24, Short.MAX_VALUE)
                .addGroup(jPanelNumerosVerticlaesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        jPanelNumerosVerticlaesLayout.setVerticalGroup(
            jPanelNumerosVerticlaesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelNumerosVerticlaesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addGap(18, 18, 18)
                .addComponent(jLabel11)
                .addGap(18, 18, 18)
                .addComponent(jLabel12)
                .addGap(18, 18, 18)
                .addComponent(jLabel13)
                .addGap(18, 18, 18)
                .addComponent(jLabel14)
                .addGap(18, 18, 18)
                .addComponent(jLabel15)
                .addGap(18, 18, 18)
                .addComponent(jLabel16)
                .addGap(18, 18, 18)
                .addComponent(jLabel17)
                .addGap(18, 18, 18)
                .addComponent(jLabel18)
                .addGap(18, 18, 18)
                .addComponent(jLabel19)
                .addGap(18, 18, 18)
                .addComponent(jLabel20)
                .addGap(18, 18, 18)
                .addComponent(jLabel21)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelIngresoEgreso.setLayout(new java.awt.CardLayout());

        jLabel27.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel27.setText("Seleccione un boton para mostrar informacion");

        javax.swing.GroupLayout jPanelPrimeroLayout = new javax.swing.GroupLayout(jPanelPrimero);
        jPanelPrimero.setLayout(jPanelPrimeroLayout);
        jPanelPrimeroLayout.setHorizontalGroup(
            jPanelPrimeroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPrimeroLayout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(jLabel27)
                .addContainerGap(70, Short.MAX_VALUE))
        );
        jPanelPrimeroLayout.setVerticalGroup(
            jPanelPrimeroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPrimeroLayout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addComponent(jLabel27)
                .addContainerGap(169, Short.MAX_VALUE))
        );

        jPanelIngresoEgreso.add(jPanelPrimero, "card4");

        jPanelIngreso.setBackground(new java.awt.Color(0, 204, 0));

        jLabel1.setFont(new java.awt.Font("SimSun", 1, 24)); // NOI18N
        jLabel1.setText("Ingreso");

        jLabel2.setText("Funcionarios");

        jLabel3.setText("Articulos");

        jScrollPane1.setViewportView(jListFuncionarios);

        jScrollPane2.setViewportView(jListArticulos);

        jLabel4.setText("Cantidad");

        jLabel5.setText("Codigo");

        jButtonIngreso.setText("Ingreso");
        jButtonIngreso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIngresoActionPerformed(evt);
            }
        });

        jTextFieldCantUnidades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCantUnidadesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelIngresoLayout = new javax.swing.GroupLayout(jPanelIngreso);
        jPanelIngreso.setLayout(jPanelIngresoLayout);
        jPanelIngresoLayout.setHorizontalGroup(
            jPanelIngresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelIngresoLayout.createSequentialGroup()
                .addGroup(jPanelIngresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelIngresoLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanelIngresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanelIngresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelIngresoLayout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelIngresoLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanelIngresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelIngresoLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4)
                                .addGap(48, 48, 48))
                            .addGroup(jPanelIngresoLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanelIngresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldCodCarga, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldCantUnidades, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanelIngresoLayout.createSequentialGroup()
                                .addGap(71, 71, 71)
                                .addComponent(jLabel5))
                            .addGroup(jPanelIngresoLayout.createSequentialGroup()
                                .addGap(57, 57, 57)
                                .addComponent(jButtonIngreso))))
                    .addGroup(jPanelIngresoLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel1)))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jPanelIngresoLayout.setVerticalGroup(
            jPanelIngresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelIngresoLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(23, 23, 23)
                .addGroup(jPanelIngresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelIngresoLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelIngresoLayout.createSequentialGroup()
                        .addGroup(jPanelIngresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelIngresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelIngresoLayout.createSequentialGroup()
                                .addComponent(jTextFieldCantUnidades, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldCodCarga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonIngreso))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        jPanelIngresoEgreso.add(jPanelIngreso, "card3");

        jPanelEgreso.setBackground(new java.awt.Color(0, 153, 255));

        jLabel6.setFont(new java.awt.Font("SimSun", 1, 24)); // NOI18N
        jLabel6.setText("Egreso");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setText("Codigo");

        jLabelEgresoCodigo.setText("---------");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setText("Articulo");

        jLabel22.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel22.setText("Cantidad");

        jLabel23.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel23.setText("Funcionario");

        jLabelEgresoArticulo.setText("---------");

        jLabelEgresoCantidad.setText("---------");

        jLabelEgresoFuncionario.setText("---------");

        jButtonEgresar.setText("Egresar");
        jButtonEgresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEgresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelEgresoLayout = new javax.swing.GroupLayout(jPanelEgreso);
        jPanelEgreso.setLayout(jPanelEgresoLayout);
        jPanelEgresoLayout.setHorizontalGroup(
            jPanelEgresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEgresoLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanelEgresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelEgresoLayout.createSequentialGroup()
                        .addComponent(jLabel22)
                        .addGap(152, 152, 152))
                    .addGroup(jPanelEgresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel7)
                        .addComponent(jLabel23)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelEgresoLayout.createSequentialGroup()
                            .addComponent(jLabel6)
                            .addGap(151, 151, 151))
                        .addComponent(jLabel9)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addGroup(jPanelEgresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelEgresoCodigo)
                    .addComponent(jLabelEgresoArticulo)
                    .addComponent(jLabelEgresoCantidad)
                    .addComponent(jLabelEgresoFuncionario))
                .addGap(181, 181, 181))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelEgresoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonEgresar)
                .addGap(19, 19, 19))
        );
        jPanelEgresoLayout.setVerticalGroup(
            jPanelEgresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEgresoLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel6)
                .addGap(36, 36, 36)
                .addGroup(jPanelEgresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabelEgresoCodigo))
                .addGap(26, 26, 26)
                .addGroup(jPanelEgresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabelEgresoArticulo))
                .addGap(28, 28, 28)
                .addGroup(jPanelEgresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(jLabelEgresoCantidad))
                .addGap(25, 25, 25)
                .addGroup(jPanelEgresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(jLabelEgresoFuncionario))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonEgresar)
                .addGap(19, 19, 19))
        );

        jPanelIngresoEgreso.add(jPanelEgreso, "card2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblArea, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelNumerosHorizontales, javax.swing.GroupLayout.PREFERRED_SIZE, 626, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnDerecha, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanelNumerosVerticlaes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnIzquierda, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jPanelBotones, javax.swing.GroupLayout.PREFERRED_SIZE, 628, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)))
                .addComponent(jPanelIngresoEgreso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblArea, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelNumerosHorizontales, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jPanelIngresoEgreso, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jPanelBotones, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanelNumerosVerticlaes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnDerecha))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(btnIzquierda)))))
                .addGap(13, 13, 13))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void colocarBotones(JPanel panel) {
        for (int i = 1; i < 13; i++) {
            for (int j = 1; j < 11; j++) {
                JButton nuevo = new JButton(" ");
                nuevo.setMargin(new Insets(5, 5, 5, 5));
                nuevo.setLayout(layout);
                nuevo.setBackground(Color.LIGHT_GRAY);
                nuevo.setForeground(Color.white);
                nuevo.setText((i) + ":" + (j));
                nuevo.addActionListener(new EspacioListener());
                nuevo.setVisible(true);
                panel.add(nuevo);
            }
        }
    }

    private class EspacioListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            // este código se ejecutará al presionar el botón, obtengo cuál botón
            btnActual = ((JButton) e.getSource());

            //desmarcar boton anterior
            if (!btnActual.getText().equals(btnAnterior.getText()) || areaActual != areaAnterior) {
                btnAnterior.setBackground(Color.LIGHT_GRAY);
                btnActual.setBackground(Color.red);
            }

            coordenadas = btnActual.getText();

            if (modelo.getListaAreas().get(areaActual).areaVacia(coordenadas, modelo.getListaAreas().get(areaActual).getMatArea())) {
                jPanelPrimero.setVisible(false);
                jPanelEgreso.setVisible(false);
                jPanelIngreso.setVisible(true);
            } else {
                jPanelPrimero.setVisible(false);
                jPanelIngreso.setVisible(false);
                jPanelEgreso.setVisible(true);
                insertarDatosEgreso();
            }

            btnAnterior = btnActual;
        }
    }

    private void mostrarArea() {
        if (areaActual == 0) {
            lblArea.setText("Area: A");
        }
        if (areaActual == 1) {
            lblArea.setText("Area: B");
        }
        if (areaActual == 2) {
            lblArea.setText("Area: C");
        }
        if (areaActual == 3) {
            lblArea.setText("Area: D");
        }
        if (areaActual == 4) {
            lblArea.setText("Area: E");
        }
    }

    private void apagarBotones() {
        if (areaActual == 0) {
            btnIzquierda.setEnabled(false);
        }
        if (areaActual == 4) {
            btnDerecha.setEnabled(false);
        }
    }

    private boolean ingresarCarga() {
        String[] arrayCoord = coordenadas.split(":");
        boolean seIngreso = true;
        if (!modelo.datosDeListaSinSeleccionar(jListArticulos.getSelectedValue(), jListFuncionarios.getSelectedValue())) {

            if (!modelo.controlEspacioVacioDosCampos(jTextFieldCodCarga.getText(), jTextFieldCantUnidades.getText())) {

                if (modelo.seIngresoInt(jTextFieldCodCarga.getText()) && modelo.seIngresoInt(jTextFieldCantUnidades.getText())) {

                    if (modelo.controlRangoNumerico(jTextFieldCodCarga.getText(), -1, Integer.MAX_VALUE)
                            && modelo.controlRangoNumerico(jTextFieldCantUnidades.getText(), 0, Integer.MAX_VALUE)) {

                        //Cod carga
                        modelo.getListaAreas().get(areaActual).getMatArea()[Integer.parseInt(arrayCoord[0])][Integer.parseInt(arrayCoord[1])].
                                setCodCarga(Integer.parseInt(jTextFieldCodCarga.getText()));

                        //Cant unidades
                        modelo.getListaAreas().get(areaActual).getMatArea()[Integer.parseInt(arrayCoord[0])][Integer.parseInt(arrayCoord[1])].
                                setCantUnidades(Integer.parseInt(jTextFieldCantUnidades.getText()));
                    } else {
                        seIngreso = false;
                        JOptionPane.showMessageDialog(null, "Error, Datos numericos fuera de Rango (Cantidad<=0 o Codigo<0)", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                } else {
                    seIngreso = false;
                    JOptionPane.showMessageDialog(null, "Error, la Cantidad y el Codigo deben ser Numericos", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                seIngreso = false;
                JOptionPane.showMessageDialog(null, "Error, No se permiten Campos Vacios", "Error", JOptionPane.ERROR_MESSAGE);
            }

            //Articulo
            modelo.getListaAreas().get(areaActual).getMatArea()[Integer.parseInt(arrayCoord[0])][Integer.parseInt(arrayCoord[1])].
                    setA((Articulo) jListArticulos.getSelectedValue());

            //Funcionario
            modelo.getListaAreas().get(areaActual).getMatArea()[Integer.parseInt(arrayCoord[0])][Integer.parseInt(arrayCoord[1])].
                    setF((Funcionario) jListFuncionarios.getSelectedValue());

        } else {
            seIngreso = false;
            jTextFieldCodCarga.setText("");
            jTextFieldCantUnidades.setText("");
            JOptionPane.showMessageDialog(null, "Advertencia, no se selecciono Articulo o Funcionario de la lista", "Error", JOptionPane.WARNING_MESSAGE);
        }

        return seIngreso;
    }

    private void insertarDatosEgreso() {
        String[] arrayCoord = coordenadas.split(":");
        jLabelEgresoCodigo.setText(String.valueOf(modelo.getListaAreas().get(areaActual).getMatArea()[Integer.parseInt(arrayCoord[0])][Integer.parseInt(arrayCoord[1])].getCodCarga()));
        jLabelEgresoArticulo.setText(modelo.getListaAreas().get(areaActual).getMatArea()[Integer.parseInt(arrayCoord[0])][Integer.parseInt(arrayCoord[1])].getA().toString());
        jLabelEgresoCantidad.setText(String.valueOf(modelo.getListaAreas().get(areaActual).getMatArea()[Integer.parseInt(arrayCoord[0])][Integer.parseInt(arrayCoord[1])].getCantUnidades()));
        jLabelEgresoFuncionario.setText(modelo.getListaAreas().get(areaActual).getMatArea()[Integer.parseInt(arrayCoord[0])][Integer.parseInt(arrayCoord[1])].getF().toString());
    }


    private void btnDerechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDerechaActionPerformed
        btnIzquierda.setEnabled(true);
        areaAnterior = areaActual;
        areaActual++;
        apagarBotones();

        btnActual.setBackground(Color.LIGHT_GRAY);
        mostrarArea();
    }//GEN-LAST:event_btnDerechaActionPerformed

    private void btnIzquierdaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIzquierdaActionPerformed
        btnDerecha.setEnabled(true);
        areaAnterior = areaActual;
        areaActual--;
        apagarBotones();

        btnActual.setBackground(Color.LIGHT_GRAY);
        mostrarArea();
    }//GEN-LAST:event_btnIzquierdaActionPerformed

    private void jButtonEgresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEgresarActionPerformed
        String[] arrayCoord = coordenadas.split(":");
        int coord1 = Integer.parseInt(arrayCoord[0]);
        int coord2 = Integer.parseInt(arrayCoord[1]);
        modelo.getListaAreas().get(areaActual).egresarCarga(coord1, coord2, modelo.getListaAreas().get(areaActual).getMatArea());
        JOptionPane.showMessageDialog(null, "Egreso de Carga Correcto", "Informacion", JOptionPane.INFORMATION_MESSAGE);
        jPanelEgreso.setVisible(false);
        jPanelIngreso.setVisible(true);
    }//GEN-LAST:event_jButtonEgresarActionPerformed

    private void jTextFieldCantUnidadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCantUnidadesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCantUnidadesActionPerformed

    private void jButtonIngresoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIngresoActionPerformed
        if (ingresarCarga()) {
            jTextFieldCodCarga.setText("");
            jTextFieldCantUnidades.setText("");
            JOptionPane.showMessageDialog(null, "Ingreso de Carga Correcto", "Informacion", JOptionPane.INFORMATION_MESSAGE);
            insertarDatosEgreso();
            jPanelIngreso.setVisible(false);
            jPanelEgreso.setVisible(true);
        }
    }//GEN-LAST:event_jButtonIngresoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDerecha;
    private javax.swing.JButton btnIzquierda;
    private javax.swing.JButton jButtonEgresar;
    private javax.swing.JButton jButtonIngreso;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelEgresoArticulo;
    private javax.swing.JLabel jLabelEgresoCantidad;
    private javax.swing.JLabel jLabelEgresoCodigo;
    private javax.swing.JLabel jLabelEgresoFuncionario;
    private javax.swing.JLabel jLabelNumerosHorizontales;
    private javax.swing.JList jListArticulos;
    private javax.swing.JList jListFuncionarios;
    private javax.swing.JPanel jPanelBotones;
    private javax.swing.JPanel jPanelEgreso;
    private javax.swing.JPanel jPanelIngreso;
    private javax.swing.JPanel jPanelIngresoEgreso;
    private javax.swing.JPanel jPanelNumerosVerticlaes;
    private javax.swing.JPanel jPanelPrimero;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextFieldCantUnidades;
    private javax.swing.JTextField jTextFieldCodCarga;
    private javax.swing.JLabel lblArea;
    // End of variables declaration//GEN-END:variables
}

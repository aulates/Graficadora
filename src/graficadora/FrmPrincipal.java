/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graficadora;

import java.awt.Image;
import javax.swing.ImageIcon;
import graficadora.Grafica;
import graficadora.plano;
import static graficadora.Graficadora.plano;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
* @author Karla ----- Fernanda---- Josue----Ana
*/
public class FrmPrincipal extends javax.swing.JFrame {

    Grafica ga = new Grafica();

    /**
     * Creates new form Visual
     */
    public FrmPrincipal() {
        initComponents();
    }

    public void calcular() {
        // imagenes concava o convexa
        
        
        if (Integer.parseInt(tfA.getText()) + Integer.parseInt(tfB.getText()) +
                Integer.parseInt(tfC.getText()) == 0){
                   JOptionPane.showMessageDialog(this, "Ingrese números distintos a 0", "Error", JOptionPane.ERROR_MESSAGE);
        }
        else{
            if (!ga.concavidad(Integer.parseInt(tfA.getText()))) {
                tfConcavidad.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass()
                        .getResource("/Iconos/Concava.png")).getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH)));

            } else {
                tfConcavidad.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass()
                        .getResource("/Iconos/Convexa.png")).getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH)));
            }

            taEjeSimetria.setText("-( " + tfB.getText() + " ) / ( 2*" + tfA.getText() + " )\n" + "Resultado: "
                    + ga.ejeSimetria(Integer.parseInt(tfA.getText()), Integer.parseInt(tfB.getText())));

    //(ga.b * ga.b) - 4 * ga.a * ga.c;

            taDiscriminante.setText("(" + tfB.getText() + ") * " + tfB.getText() + " - 4 * " + tfA.getText() + " * " 
                + tfC.getText() + "\n" + "Resultado: " + ga.discriminante(Integer.parseInt(tfA.getText()),
                    Integer.parseInt(tfB.getText()), Integer.parseInt(tfC.getText())));
            tfRango.setText(ga.rango(Integer.parseInt(tfC.getText()), Integer.parseInt(tfA.getText()),
                    Integer.parseInt(tfB.getText())));

    // Interseccion Y 

            tfInterY.setText("( 0 , " + tfC.getText() + " )");

            //interseccion X

            if (Float.parseFloat(ga.discriminante(Integer.parseInt(tfA.getText()), 
                    Integer.parseInt(tfB.getText()), Integer.parseInt(tfC.getText()))) > 0) {

                // tiene dos -b +- raiz discriminante divido en 2 * a

                int raiz = (int) Math.sqrt(Double.valueOf(ga.discriminante(Integer.parseInt(tfA.getText()), 
                        Integer.parseInt(tfB.getText()), Integer.parseInt(tfC.getText()))));

                tfX1.setText(String.valueOf(((-Integer.parseInt(tfB.getText())) + (-raiz))
                        / (2 * Integer.parseInt(tfA.getText()))));

                tfX2.setText(String.valueOf(((-Integer.parseInt(tfB.getText())) + (raiz))
                        / (2 * Integer.parseInt(tfA.getText()))));


            } else if (Float.parseFloat(ga.discriminante(Integer.parseInt(tfA.getText()), 
                    Integer.parseInt(tfB.getText()), Integer.parseInt(tfC.getText()))) == 0) {


                // vertice
                tfX1.setText(String.valueOf(ga.vertice(Integer.parseInt(tfA.getText()), 
                        Integer.parseInt(tfB.getText()), Integer.parseInt(tfC.getText()))));
                tfX2.setText(String.valueOf(ga.vertice(Integer.parseInt(tfA.getText()),
                        Integer.parseInt(tfB.getText()), Integer.parseInt(tfC.getText()))));


            } else {
                // no tiene
                tfX1.setText("0");
                tfX2.setText("0");
            }

            // vertice
            taVertice.setText(String.valueOf(ga.vertice(Integer.parseInt(tfA.getText()),
                    Integer.parseInt(tfB.getText()), Integer.parseInt(tfC.getText()))));

            // crece
            // -(b) / (2 * a);


            if (Integer.parseInt(tfA.getText()) > 0) {
                tfCrece.setText("( " + ga.ejeSimetria(Integer.parseInt(tfA.getText()), Integer.parseInt(tfB.getText())) + " , + ∞ )");
                tfDecrece.setText(" ( - ∞ ," + ga.ejeSimetria(Integer.parseInt(tfA.getText()), Integer.parseInt(tfB.getText())) + " )");

            } else {
                tfCrece.setText(" ( - ∞ ," + ga.ejeSimetria(Integer.parseInt(tfA.getText()), Integer.parseInt(tfB.getText())) + " )");
                tfDecrece.setText("( " + ga.ejeSimetria(Integer.parseInt(tfA.getText()), Integer.parseInt(tfB.getText())) + " , + ∞ )");
            }

        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tfA = new javax.swing.JTextField();
        tfB = new javax.swing.JTextField();
        tfC = new javax.swing.JTextField();
        btCalcular = new javax.swing.JButton();
        lbConcavidad = new javax.swing.JLabel();
        lbEjeSimetria = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        taEjeSimetria = new javax.swing.JTextArea();
        lbDiscriminante = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        taDiscriminante = new javax.swing.JTextArea();
        lbDecrece = new javax.swing.JLabel();
        lbCrece = new javax.swing.JLabel();
        tfDecrece = new javax.swing.JTextField();
        tfCrece = new javax.swing.JTextField();
        lbRango = new javax.swing.JLabel();
        tfRango = new javax.swing.JTextField();
        lbInterX = new javax.swing.JLabel();
        lbInterY = new javax.swing.JLabel();
        tfX1 = new javax.swing.JTextField();
        tfX2 = new javax.swing.JTextField();
        lbX1 = new javax.swing.JLabel();
        lbX2 = new javax.swing.JLabel();
        tfInterY = new javax.swing.JTextField();
        btGrafica = new javax.swing.JButton();
        tfConcavidad = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        taVertice = new javax.swing.JTextArea();

        jScrollPane1.setViewportView(jEditorPane1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(14, 22, 20));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("A");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("B");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("C");

        tfA.setBackground(new java.awt.Color(51, 51, 51));
        tfA.setForeground(new java.awt.Color(255, 255, 255));

        tfB.setBackground(new java.awt.Color(51, 51, 51));
        tfB.setForeground(new java.awt.Color(255, 255, 255));

        tfC.setBackground(new java.awt.Color(51, 51, 51));
        tfC.setForeground(new java.awt.Color(255, 255, 255));

        btCalcular.setBackground(new java.awt.Color(51, 51, 51));
        btCalcular.setForeground(new java.awt.Color(255, 255, 255));
        btCalcular.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/reglas-de-diseno-tijeras-de-medicion-triangulo-icono-4790-32 (1).png"))); // NOI18N
        btCalcular.setText("Calcular");
        btCalcular.setFocusable(false);
        btCalcular.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btCalcular.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCalcularActionPerformed(evt);
            }
        });

        lbConcavidad.setForeground(new java.awt.Color(255, 255, 255));
        lbConcavidad.setText("Concavidad:");

        lbEjeSimetria.setForeground(new java.awt.Color(255, 255, 255));
        lbEjeSimetria.setText("Eje Simetria:");

        taEjeSimetria.setBackground(new java.awt.Color(51, 51, 51));
        taEjeSimetria.setColumns(20);
        taEjeSimetria.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        taEjeSimetria.setForeground(new java.awt.Color(255, 255, 255));
        taEjeSimetria.setRows(5);
        taEjeSimetria.setText("\n");
        jScrollPane2.setViewportView(taEjeSimetria);

        lbDiscriminante.setForeground(new java.awt.Color(255, 255, 255));
        lbDiscriminante.setText("Discriminante:");

        taDiscriminante.setBackground(new java.awt.Color(51, 51, 51));
        taDiscriminante.setColumns(20);
        taDiscriminante.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        taDiscriminante.setForeground(new java.awt.Color(255, 255, 255));
        taDiscriminante.setRows(5);
        jScrollPane3.setViewportView(taDiscriminante);

        lbDecrece.setForeground(new java.awt.Color(255, 255, 255));
        lbDecrece.setText("Decrece: ");

        lbCrece.setForeground(new java.awt.Color(255, 255, 255));
        lbCrece.setText("Crece:");

        tfDecrece.setBackground(new java.awt.Color(51, 51, 51));
        tfDecrece.setForeground(new java.awt.Color(255, 255, 255));

        tfCrece.setBackground(new java.awt.Color(51, 51, 51));
        tfCrece.setForeground(new java.awt.Color(255, 255, 255));

        lbRango.setForeground(new java.awt.Color(255, 255, 255));
        lbRango.setText("Rango: ");

        tfRango.setBackground(new java.awt.Color(51, 51, 51));
        tfRango.setForeground(new java.awt.Color(255, 255, 255));

        lbInterX.setForeground(new java.awt.Color(255, 255, 255));
        lbInterX.setText("Intersección X:");

        lbInterY.setForeground(new java.awt.Color(255, 255, 255));
        lbInterY.setText("Intersección Y: ");

        tfX1.setBackground(new java.awt.Color(51, 51, 51));
        tfX1.setForeground(new java.awt.Color(255, 255, 255));

        tfX2.setBackground(new java.awt.Color(51, 51, 51));
        tfX2.setForeground(new java.awt.Color(255, 255, 255));

        lbX1.setForeground(new java.awt.Color(255, 255, 255));
        lbX1.setText("X1: ");

        lbX2.setForeground(new java.awt.Color(255, 255, 255));
        lbX2.setText("X2:");

        tfInterY.setBackground(new java.awt.Color(51, 51, 51));
        tfInterY.setForeground(new java.awt.Color(255, 255, 255));

        btGrafica.setBackground(new java.awt.Color(51, 51, 51));
        btGrafica.setForeground(new java.awt.Color(255, 255, 255));
        btGrafica.setText("Gráfica");
        btGrafica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btGraficaActionPerformed(evt);
            }
        });

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Vértice:");

        taVertice.setEditable(false);
        taVertice.setBackground(new java.awt.Color(51, 51, 51));
        taVertice.setColumns(20);
        taVertice.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        taVertice.setForeground(new java.awt.Color(255, 255, 255));
        taVertice.setRows(5);
        jScrollPane4.setViewportView(taVertice);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addComponent(jLabel1)
                                .addGap(42, 42, 42)
                                .addComponent(jLabel2)
                                .addGap(44, 44, 44)
                                .addComponent(jLabel3))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lbEjeSimetria, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(tfA, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tfB, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tfC, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(29, 29, 29)
                        .addComponent(btCalcular))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lbCrece, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(lbDecrece, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(27, 27, 27)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(57, 57, 57)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lbX1)
                                        .addComponent(lbRango)
                                        .addComponent(lbX2))))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(7, 7, 7)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(tfRango, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(tfCrece, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(tfDecrece, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btGrafica)
                                    .addGap(8, 8, 8))))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addGap(42, 42, 42)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfConcavidad, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbConcavidad))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(lbDiscriminante)
                                            .addGap(278, 278, 278))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lbInterX)
                                        .addComponent(tfX1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(tfX2, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lbInterY)
                                        .addComponent(tfInterY, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfB, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(tfA, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(tfC, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(lbConcavidad)
                        .addGap(9, 9, 9)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfConcavidad, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbDecrece)
                            .addComponent(tfDecrece, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbEjeSimetria, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbCrece)
                            .addComponent(tfCrece, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(146, 146, 146)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbRango)
                            .addComponent(tfRango, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(lbDiscriminante)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbInterX)
                        .addGap(29, 29, 29)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbX1)
                            .addComponent(tfX1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbX2)
                            .addComponent(tfX2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addComponent(lbInterY)))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfInterY, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btGrafica))
                .addContainerGap(56, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCalcularActionPerformed
        calcular();
    }//GEN-LAST:event_btCalcularActionPerformed

    private void btGraficaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btGraficaActionPerformed

//Creando la ventana y el plano de dibujo

        Ventana frame = new Ventana();
        frame.setBackground(Color.YELLOW);
        frame.setDefaultCloseOperation(Ventana.EXIT_ON_CLOSE);
        frame.setBounds(212, 150, 490, 520);
        frame.setLayout(new BorderLayout());
        plano = new plano();

        //Configuración del Boton
        JButton start = new JButton("Graficar");
        start.addActionListener(frame);
        start.setBackground(Color.DARK_GRAY);
        start.setForeground(Color.WHITE);
        start.setText("Graficar");

        //Bordes al panel
        frame.setBackground(Color.DARK_GRAY);
        frame.add(plano, BorderLayout.CENTER);
        frame.add(start, BorderLayout.SOUTH);
        
        frame.a = Double.valueOf(tfA.getText());
        frame.b = Double.valueOf(tfB.getText());
        frame.c = Double.valueOf(tfC.getText());
        frame.x1 = Double.valueOf(tfX1.getText());
        frame.x2 = Double.valueOf(tfX2.getText());
        
        frame.setVisible(true);

    }//GEN-LAST:event_btGraficaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmPrincipal().setVisible(true);
            }
        });
    }
//        public void actionPerformed(ActionEvent e) {
//        
//        
//
//       Graficadora.plano.paintSQRFunc(Graficadora.plano.getGraphics(),a,b,c,-200,200);
////       -0.2,5,-25,-200,200
//    }
//    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCalcular;
    private javax.swing.JButton btGrafica;
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel lbConcavidad;
    private javax.swing.JLabel lbCrece;
    private javax.swing.JLabel lbDecrece;
    private javax.swing.JLabel lbDiscriminante;
    private javax.swing.JLabel lbEjeSimetria;
    private javax.swing.JLabel lbInterX;
    private javax.swing.JLabel lbInterY;
    private javax.swing.JLabel lbRango;
    private javax.swing.JLabel lbX1;
    private javax.swing.JLabel lbX2;
    private javax.swing.JTextArea taDiscriminante;
    private javax.swing.JTextArea taEjeSimetria;
    private javax.swing.JTextArea taVertice;
    private javax.swing.JTextField tfA;
    private javax.swing.JTextField tfB;
    private javax.swing.JTextField tfC;
    private javax.swing.JLabel tfConcavidad;
    private javax.swing.JTextField tfCrece;
    private javax.swing.JTextField tfDecrece;
    private javax.swing.JTextField tfInterY;
    private javax.swing.JTextField tfRango;
    private javax.swing.JTextField tfX1;
    private javax.swing.JTextField tfX2;
    // End of variables declaration//GEN-END:variables
}

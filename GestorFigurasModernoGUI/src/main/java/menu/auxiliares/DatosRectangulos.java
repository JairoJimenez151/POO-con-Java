package menu.auxiliares;

import Funcionalidades.Creacion;
import javax.swing.JTextField;

public class DatosRectangulos extends javax.swing.JFrame {

    public DatosRectangulos() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelFondo = new javax.swing.JPanel();
        Bienvenida = new javax.swing.JLabel();
        longitudLado1 = new javax.swing.JTextField();
        longitudLado2 = new javax.swing.JTextField();
        colorDato = new javax.swing.JTextField();
        IDnuevo = new javax.swing.JTextField();
        botonConfirmacion = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        panelFondo.setBackground(new java.awt.Color(0, 255, 255));
        panelFondo.setToolTipText("");

        Bienvenida.setFont(new java.awt.Font("URW Gothic", 1, 36)); // NOI18N
        Bienvenida.setForeground(new java.awt.Color(0, 51, 153));
        Bienvenida.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Bienvenida.setText("Digite los datos");

        longitudLado1.setBackground(new java.awt.Color(255, 255, 255));
        longitudLado1.setFont(new java.awt.Font("Liberation Mono", 1, 14)); // NOI18N
        longitudLado1.setForeground(new java.awt.Color(0, 0, 0));
        longitudLado1.setText("LADO 1");
        longitudLado1.setPreferredSize(new java.awt.Dimension(150, 30));

        longitudLado2.setBackground(new java.awt.Color(255, 255, 255));
        longitudLado2.setFont(new java.awt.Font("Liberation Mono", 1, 14)); // NOI18N
        longitudLado2.setForeground(new java.awt.Color(0, 0, 0));
        longitudLado2.setText("LADO 2");
        longitudLado2.setPreferredSize(new java.awt.Dimension(150, 30));

        colorDato.setBackground(new java.awt.Color(255, 255, 255));
        colorDato.setFont(new java.awt.Font("Liberation Mono", 1, 14)); // NOI18N
        colorDato.setForeground(new java.awt.Color(0, 0, 0));
        colorDato.setText("COLOR");
        colorDato.setPreferredSize(new java.awt.Dimension(150, 30));

        IDnuevo.setBackground(new java.awt.Color(255, 255, 255));
        IDnuevo.setFont(new java.awt.Font("Liberation Mono", 1, 14)); // NOI18N
        IDnuevo.setForeground(new java.awt.Color(0, 0, 0));
        IDnuevo.setText("ID AUTOMATICO");
        IDnuevo.setPreferredSize(new java.awt.Dimension(150, 30));

        botonConfirmacion.setBackground(new java.awt.Color(0, 0, 0));
        botonConfirmacion.setFont(new java.awt.Font("Liberation Mono", 1, 14)); // NOI18N
        botonConfirmacion.setForeground(new java.awt.Color(255, 255, 0));
        botonConfirmacion.setText("CONFIRMAR");
        botonConfirmacion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonConfirmacion.setPreferredSize(new java.awt.Dimension(150, 30));
        botonConfirmacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botonConfirmacionMousePressed(evt);
            }
        });

        javax.swing.GroupLayout panelFondoLayout = new javax.swing.GroupLayout(panelFondo);
        panelFondo.setLayout(panelFondoLayout);
        panelFondoLayout.setHorizontalGroup(
            panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFondoLayout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(longitudLado2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(longitudLado1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(colorDato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(IDnuevo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonConfirmacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(75, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelFondoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Bienvenida)
                .addGap(15, 15, 15))
        );
        panelFondoLayout.setVerticalGroup(
            panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFondoLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(Bienvenida)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(longitudLado1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(longitudLado2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(colorDato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(IDnuevo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botonConfirmacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelFondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botonConfirmacionMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonConfirmacionMousePressed
       if(this.IDnuevo.equals("ID AUTOMATICO")){
           this.IDnuevo.setText(Creacion.doCrearIDAleatorio());
        }
       String[] str = new String[6];
       str[0] ="Rectagulo";
       str[1] = this.IDnuevo.getText();
       str[2] =this.colorDato.getText();
       str[3] =this.longitudLado1.getText();
       str[4] =this.longitudLado2.getText();
       Creacion.doCrearRectangulo(str);
    }//GEN-LAST:event_botonConfirmacionMousePressed

    public JTextField getIDnuevo() {
        return IDnuevo;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Bienvenida;
    private javax.swing.JTextField IDnuevo;
    private javax.swing.JButton botonConfirmacion;
    private javax.swing.JTextField colorDato;
    private javax.swing.JTextField longitudLado1;
    private javax.swing.JTextField longitudLado2;
    private javax.swing.JPanel panelFondo;
    // End of variables declaration//GEN-END:variables
}

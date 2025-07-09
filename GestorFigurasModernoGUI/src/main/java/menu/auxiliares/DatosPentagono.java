package menu.auxiliares;

import Funcionalidades.Creacion;
import javax.swing.JTextField;

public class DatosPentagono extends javax.swing.JFrame {

    public DatosPentagono() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelFondo = new javax.swing.JPanel();
        Bienvenida = new javax.swing.JLabel();
        colorDato = new javax.swing.JTextField();
        confirmacionButton = new javax.swing.JButton();
        longitudLados = new javax.swing.JTextField();
        IDnuevo = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        panelFondo.setBackground(new java.awt.Color(0, 255, 255));

        Bienvenida.setFont(new java.awt.Font("URW Gothic", 1, 36)); // NOI18N
        Bienvenida.setForeground(new java.awt.Color(0, 51, 153));
        Bienvenida.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Bienvenida.setText("Digite los datos");

        colorDato.setBackground(new java.awt.Color(255, 255, 255));
        colorDato.setFont(new java.awt.Font("Liberation Mono", 1, 14)); // NOI18N
        colorDato.setForeground(new java.awt.Color(0, 0, 0));
        colorDato.setText("Color");
        colorDato.setToolTipText("");
        colorDato.setPreferredSize(new java.awt.Dimension(150, 30));

        confirmacionButton.setBackground(new java.awt.Color(0, 0, 0));
        confirmacionButton.setFont(new java.awt.Font("Liberation Mono", 1, 14)); // NOI18N
        confirmacionButton.setForeground(new java.awt.Color(255, 255, 0));
        confirmacionButton.setText("CONFIRMAR");
        confirmacionButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        confirmacionButton.setPreferredSize(new java.awt.Dimension(150, 30));
        confirmacionButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                confirmacionButtonMousePressed(evt);
            }
        });

        longitudLados.setBackground(new java.awt.Color(255, 255, 255));
        longitudLados.setFont(new java.awt.Font("Liberation Mono", 1, 14)); // NOI18N
        longitudLados.setForeground(new java.awt.Color(0, 0, 0));
        longitudLados.setText("Lado 1");
        longitudLados.setPreferredSize(new java.awt.Dimension(150, 30));

        IDnuevo.setBackground(new java.awt.Color(255, 255, 255));
        IDnuevo.setFont(new java.awt.Font("Liberation Mono", 1, 14)); // NOI18N
        IDnuevo.setForeground(new java.awt.Color(0, 0, 0));
        IDnuevo.setText("ID AUTOMATICO");
        IDnuevo.setPreferredSize(new java.awt.Dimension(150, 30));

        javax.swing.GroupLayout panelFondoLayout = new javax.swing.GroupLayout(panelFondo);
        panelFondo.setLayout(panelFondoLayout);
        panelFondoLayout.setHorizontalGroup(
            panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFondoLayout.createSequentialGroup()
                .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelFondoLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(Bienvenida))
                    .addGroup(panelFondoLayout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(longitudLados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(colorDato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(confirmacionButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(IDnuevo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        panelFondoLayout.setVerticalGroup(
            panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFondoLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(Bienvenida)
                .addGap(35, 35, 35)
                .addComponent(longitudLados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(colorDato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(IDnuevo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(confirmacionButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
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

    private void confirmacionButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_confirmacionButtonMousePressed
       if(this.IDnuevo.equals("ID AUTOMATICO")){
           this.IDnuevo.setText(Creacion.doCrearIDAleatorio());
        }
       String[] str = new String[6];
       str[0] ="Pentagono";
       str[1] = this.IDnuevo.getText();
       str[2] =this.colorDato.getText();
       str[3] =this.longitudLados.getText();
       Creacion.doCrearPentagono(str);
    }//GEN-LAST:event_confirmacionButtonMousePressed

    public JTextField getIDnuevo() {
        return IDnuevo;
    }

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Bienvenida;
    private javax.swing.JTextField IDnuevo;
    private javax.swing.JTextField colorDato;
    private javax.swing.JButton confirmacionButton;
    private javax.swing.JTextField longitudLados;
    private javax.swing.JPanel panelFondo;
    // End of variables declaration//GEN-END:variables
}

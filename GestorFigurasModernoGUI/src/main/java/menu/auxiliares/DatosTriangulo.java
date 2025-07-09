package menu.auxiliares;

import Funcionalidades.Creacion;
import javax.swing.JTextField;

public class DatosTriangulo extends javax.swing.JFrame {

    public DatosTriangulo() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelFondo = new javax.swing.JPanel();
        Bienvenida = new javax.swing.JLabel();
        longitudLado1 = new javax.swing.JTextField();
        longitudLado3 = new javax.swing.JTextField();
        colorDato = new javax.swing.JTextField();
        IDnuevo = new javax.swing.JTextField();
        longitudLado2 = new javax.swing.JTextField();
        confirmacionButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Crear Triangulo");
        setResizable(false);

        panelFondo.setBackground(new java.awt.Color(0, 255, 255));

        Bienvenida.setFont(new java.awt.Font("URW Gothic", 1, 36)); // NOI18N
        Bienvenida.setForeground(new java.awt.Color(0, 51, 153));
        Bienvenida.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Bienvenida.setText("Digite los datos");
        Bienvenida.setPreferredSize(new java.awt.Dimension(335, 44));

        longitudLado1.setBackground(new java.awt.Color(255, 255, 255));
        longitudLado1.setFont(new java.awt.Font("Liberation Mono", 1, 14)); // NOI18N
        longitudLado1.setForeground(new java.awt.Color(0, 0, 0));
        longitudLado1.setText("lADO 1");
        longitudLado1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        longitudLado1.setPreferredSize(new java.awt.Dimension(150, 30));

        longitudLado3.setBackground(new java.awt.Color(255, 255, 255));
        longitudLado3.setFont(new java.awt.Font("Liberation Mono", 1, 14)); // NOI18N
        longitudLado3.setForeground(new java.awt.Color(0, 0, 0));
        longitudLado3.setText("lADO 3");
        longitudLado3.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        longitudLado3.setPreferredSize(new java.awt.Dimension(150, 30));

        colorDato.setBackground(new java.awt.Color(255, 255, 255));
        colorDato.setFont(new java.awt.Font("Liberation Mono", 1, 14)); // NOI18N
        colorDato.setForeground(new java.awt.Color(0, 0, 0));
        colorDato.setText("COLOR");
        colorDato.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        colorDato.setPreferredSize(new java.awt.Dimension(150, 30));

        IDnuevo.setBackground(new java.awt.Color(255, 255, 255));
        IDnuevo.setFont(new java.awt.Font("Liberation Mono", 1, 14)); // NOI18N
        IDnuevo.setForeground(new java.awt.Color(0, 0, 0));
        IDnuevo.setText("IDAUTOMATICO");
        IDnuevo.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        IDnuevo.setPreferredSize(new java.awt.Dimension(150, 30));

        longitudLado2.setBackground(new java.awt.Color(255, 255, 255));
        longitudLado2.setFont(new java.awt.Font("Liberation Mono", 1, 14)); // NOI18N
        longitudLado2.setForeground(new java.awt.Color(0, 0, 0));
        longitudLado2.setText("lADO 2");
        longitudLado2.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        longitudLado2.setPreferredSize(new java.awt.Dimension(150, 30));

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

        javax.swing.GroupLayout panelFondoLayout = new javax.swing.GroupLayout(panelFondo);
        panelFondo.setLayout(panelFondoLayout);
        panelFondoLayout.setHorizontalGroup(
            panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFondoLayout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(longitudLado1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(longitudLado3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(IDnuevo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(longitudLado2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(colorDato, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(confirmacionButton, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(78, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelFondoLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Bienvenida, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panelFondoLayout.setVerticalGroup(
            panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFondoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Bienvenida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(longitudLado1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(longitudLado2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(longitudLado3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(colorDato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(IDnuevo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(confirmacionButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
       str[0] = "Triangulo";
       str[1] = this.IDnuevo.getText();
       str[2] = this.colorDato.getText();
       str[3] = this.longitudLado1.getText();
       str[4] = this.longitudLado2.getText();
       str[5] = this.longitudLado3.getText();
       Creacion.doCrearTriangulo(str);
    }//GEN-LAST:event_confirmacionButtonMousePressed

    public JTextField getIDnuevo() {
        return IDnuevo;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Bienvenida;
    private javax.swing.JTextField IDnuevo;
    private javax.swing.JTextField colorDato;
    private javax.swing.JButton confirmacionButton;
    private javax.swing.JTextField longitudLado1;
    private javax.swing.JTextField longitudLado2;
    private javax.swing.JTextField longitudLado3;
    private javax.swing.JPanel panelFondo;
    // End of variables declaration//GEN-END:variables
}

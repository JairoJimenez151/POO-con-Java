
package menu;
import menu.auxiliares.*;
public class MenuCreacion extends javax.swing.JFrame {

    public MenuCreacion() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelFondo = new javax.swing.JPanel();
        Bienvenida = new javax.swing.JLabel();
        trianguloButton = new javax.swing.JButton();
        rectanguloButton = new javax.swing.JButton();
        circuloButton = new javax.swing.JButton();
        pentagonoButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Crear Figura");
        setName("menuCreacion"); // NOI18N
        setResizable(false);

        panelFondo.setBackground(new java.awt.Color(0, 255, 255));
        panelFondo.setPreferredSize(new java.awt.Dimension(400, 400));

        Bienvenida.setFont(new java.awt.Font("URW Gothic", 1, 36)); // NOI18N
        Bienvenida.setForeground(new java.awt.Color(0, 51, 153));
        Bienvenida.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Bienvenida.setText("Escoga una Figura ");
        Bienvenida.setToolTipText("");
        Bienvenida.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Bienvenida.setName("Bienvenida"); // NOI18N

        trianguloButton.setBackground(new java.awt.Color(0, 0, 0));
        trianguloButton.setFont(new java.awt.Font("Liberation Mono", 1, 14)); // NOI18N
        trianguloButton.setForeground(new java.awt.Color(255, 255, 0));
        trianguloButton.setText("Triangulo");
        trianguloButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        trianguloButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        trianguloButton.setPreferredSize(new java.awt.Dimension(160, 30));
        trianguloButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                trianguloButtonMousePressed(evt);
            }
        });

        rectanguloButton.setBackground(new java.awt.Color(0, 0, 0));
        rectanguloButton.setFont(new java.awt.Font("Liberation Mono", 1, 14)); // NOI18N
        rectanguloButton.setForeground(new java.awt.Color(255, 255, 0));
        rectanguloButton.setText("Rectangulo");
        rectanguloButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        rectanguloButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        rectanguloButton.setPreferredSize(new java.awt.Dimension(160, 30));
        rectanguloButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                rectanguloButtonMousePressed(evt);
            }
        });

        circuloButton.setBackground(new java.awt.Color(0, 0, 0));
        circuloButton.setFont(new java.awt.Font("Liberation Mono", 1, 14)); // NOI18N
        circuloButton.setForeground(new java.awt.Color(255, 255, 0));
        circuloButton.setText("Circulo");
        circuloButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        circuloButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        circuloButton.setPreferredSize(new java.awt.Dimension(160, 30));
        circuloButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                circuloButtonMousePressed(evt);
            }
        });

        pentagonoButton.setBackground(new java.awt.Color(0, 0, 0));
        pentagonoButton.setFont(new java.awt.Font("Liberation Mono", 1, 14)); // NOI18N
        pentagonoButton.setForeground(new java.awt.Color(255, 255, 0));
        pentagonoButton.setText("Pentagono");
        pentagonoButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pentagonoButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        pentagonoButton.setPreferredSize(new java.awt.Dimension(160, 30));
        pentagonoButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pentagonoButtonMousePressed(evt);
            }
        });

        javax.swing.GroupLayout panelFondoLayout = new javax.swing.GroupLayout(panelFondo);
        panelFondo.setLayout(panelFondoLayout);
        panelFondoLayout.setHorizontalGroup(
            panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFondoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Bienvenida, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(panelFondoLayout.createSequentialGroup()
                .addGap(116, 116, 116)
                .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(pentagonoButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rectanguloButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(trianguloButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(circuloButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelFondoLayout.setVerticalGroup(
            panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFondoLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(Bienvenida)
                .addGap(56, 56, 56)
                .addComponent(trianguloButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(rectanguloButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(circuloButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pentagonoButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(105, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelFondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void trianguloButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_trianguloButtonMousePressed
        DatosTriangulo dt = new DatosTriangulo();
        dt.setVisible(true);
    }//GEN-LAST:event_trianguloButtonMousePressed

    private void rectanguloButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rectanguloButtonMousePressed
        DatosRectangulos dr = new DatosRectangulos();
        dr.setVisible(true);
    }//GEN-LAST:event_rectanguloButtonMousePressed

    private void circuloButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_circuloButtonMousePressed
        DatosCirculos dc = new DatosCirculos();
        dc.setVisible(true);
    }//GEN-LAST:event_circuloButtonMousePressed

    private void pentagonoButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pentagonoButtonMousePressed
        DatosPentagono dp = new DatosPentagono();
        dp.setVisible(true);
    }//GEN-LAST:event_pentagonoButtonMousePressed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(MenuCreacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(MenuCreacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(MenuCreacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(MenuCreacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new MenuCreacion().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Bienvenida;
    private javax.swing.JButton circuloButton;
    private javax.swing.JPanel panelFondo;
    private javax.swing.JButton pentagonoButton;
    private javax.swing.JButton rectanguloButton;
    private javax.swing.JButton trianguloButton;
    // End of variables declaration//GEN-END:variables
}

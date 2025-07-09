package menu;

import Figura.Figura;
import Funcionalidades.Creacion;
import java.awt.Image;
import javax.swing.ImageIcon;
import java.io.File;

public class MenuPrincipal extends javax.swing.JFrame {
    
    private MenuCreacion mc;
    private MenuModificacion mm;
    private MenuBusqueda mb;
    private MenuVisualizacion mv;
    private MenuEliminacion me;
   
    public MenuPrincipal() {
        this.mc = new MenuCreacion();
        this.mm = new MenuModificacion();
        this.mb = new MenuBusqueda();
        this.mv = new MenuVisualizacion();
        this.me = new MenuEliminacion();
         Creacion.doCrearFiguras();
        initComponents();       
      }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelFondo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        textoBienvenida = new javax.swing.JLabel();
        ModificarFiguraButton = new javax.swing.JButton();
        buscarFiguraButton = new javax.swing.JButton();
        verFiguraButton = new javax.swing.JButton();
        salirButton = new javax.swing.JButton();
        removerFiguraButton = new javax.swing.JButton();
        crearFiguraButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu");
        setBackground(new java.awt.Color(51, 51, 255));
        setName("Menu"); // NOI18N
        setResizable(false);

        PanelFondo.setBackground(new java.awt.Color(0, 255, 255));
        PanelFondo.setForeground(new java.awt.Color(204, 255, 255));
        PanelFondo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        PanelFondo.setPreferredSize(new java.awt.Dimension(600, 600));

        ImageIcon imagenMoldelLabel = new ImageIcon("imagen"+File.separator+"ModeloFigura.png");
        jLabel1.setIcon(new ImageIcon(imagenMoldelLabel.getImage().getScaledInstance(309, 240, Image.SCALE_SMOOTH)));
        // property value not set

        jLabel2.setIcon(new ImageIcon(imagenMoldelLabel.getImage().getScaledInstance(309, 239, Image.SCALE_SMOOTH)));

        textoBienvenida.setFont(new java.awt.Font("URW Gothic", 1, 48)); // NOI18N
        textoBienvenida.setForeground(new java.awt.Color(0, 51, 153));
        textoBienvenida.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textoBienvenida.setText("Gestor De Figuras ");

        ModificarFiguraButton.setBackground(new java.awt.Color(0, 0, 0));
        ModificarFiguraButton.setFont(new java.awt.Font("Liberation Mono", 1, 14)); // NOI18N
        ModificarFiguraButton.setForeground(new java.awt.Color(255, 255, 0));
        ModificarFiguraButton.setText("Modificar Figura");
        ModificarFiguraButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ModificarFiguraButton.setPreferredSize(new java.awt.Dimension(160, 30));
        ModificarFiguraButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ModificarFiguraButtonMousePressed(evt);
            }
        });

        buscarFiguraButton.setBackground(new java.awt.Color(0, 0, 0));
        buscarFiguraButton.setFont(new java.awt.Font("Liberation Mono", 1, 14)); // NOI18N
        buscarFiguraButton.setForeground(new java.awt.Color(255, 255, 0));
        buscarFiguraButton.setText("Buscar Figura");
        buscarFiguraButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buscarFiguraButton.setPreferredSize(new java.awt.Dimension(160, 30));
        buscarFiguraButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                buscarFiguraButtonMousePressed(evt);
            }
        });

        verFiguraButton.setBackground(new java.awt.Color(0, 0, 0));
        verFiguraButton.setFont(new java.awt.Font("Liberation Mono", 1, 14)); // NOI18N
        verFiguraButton.setForeground(new java.awt.Color(255, 255, 0));
        verFiguraButton.setText("Ver Figuras");
        verFiguraButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        verFiguraButton.setPreferredSize(new java.awt.Dimension(160, 30));
        verFiguraButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                verFiguraButtonMousePressed(evt);
            }
        });

        salirButton.setBackground(new java.awt.Color(0, 0, 0));
        salirButton.setFont(new java.awt.Font("Liberation Mono", 1, 14)); // NOI18N
        salirButton.setForeground(new java.awt.Color(255, 255, 0));
        salirButton.setText("Salir");
        salirButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        salirButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        salirButton.setPreferredSize(new java.awt.Dimension(160, 30));
        salirButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                salirButtonMousePressed(evt);
            }
        });

        removerFiguraButton.setBackground(new java.awt.Color(0, 0, 0));
        removerFiguraButton.setFont(new java.awt.Font("Liberation Mono", 1, 14)); // NOI18N
        removerFiguraButton.setForeground(new java.awt.Color(255, 255, 0));
        removerFiguraButton.setText("Remover Figura");
        removerFiguraButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        removerFiguraButton.setPreferredSize(new java.awt.Dimension(160, 30));
        removerFiguraButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                removerFiguraButtonMousePressed(evt);
            }
        });

        crearFiguraButton.setBackground(new java.awt.Color(0, 0, 0));
        crearFiguraButton.setFont(new java.awt.Font("Liberation Mono", 1, 14)); // NOI18N
        crearFiguraButton.setForeground(new java.awt.Color(255, 255, 0));
        crearFiguraButton.setText("Crear Figura");
        crearFiguraButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        crearFiguraButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        crearFiguraButton.setPreferredSize(new java.awt.Dimension(160, 30));
        crearFiguraButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                crearFiguraButtonMousePressed(evt);
            }
        });

        javax.swing.GroupLayout PanelFondoLayout = new javax.swing.GroupLayout(PanelFondo);
        PanelFondo.setLayout(PanelFondoLayout);
        PanelFondoLayout.setHorizontalGroup(
            PanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelFondoLayout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(textoBienvenida, javax.swing.GroupLayout.PREFERRED_SIZE, 466, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(77, Short.MAX_VALUE))
            .addGroup(PanelFondoLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(PanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ModificarFiguraButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buscarFiguraButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(verFiguraButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(salirButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(removerFiguraButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(crearFiguraButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(PanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 309, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(15, 15, 15))
        );
        PanelFondoLayout.setVerticalGroup(
            PanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelFondoLayout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addComponent(textoBienvenida)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelFondoLayout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelFondoLayout.createSequentialGroup()
                        .addComponent(crearFiguraButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(ModificarFiguraButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(buscarFiguraButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(verFiguraButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)))
                .addGroup(PanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PanelFondoLayout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(removerFiguraButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)
                        .addComponent(salirButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelFondo, javax.swing.GroupLayout.DEFAULT_SIZE, 601, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void salirButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salirButtonMousePressed
        System.exit(0);
    }//GEN-LAST:event_salirButtonMousePressed

    private void crearFiguraButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_crearFiguraButtonMousePressed

       this.mc.setVisible(true);
    }//GEN-LAST:event_crearFiguraButtonMousePressed

    private void ModificarFiguraButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ModificarFiguraButtonMousePressed

        this.mm.setVisible(true);               
    }//GEN-LAST:event_ModificarFiguraButtonMousePressed

    private void buscarFiguraButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buscarFiguraButtonMousePressed
  
        this.mb.setVisible(true);
    }//GEN-LAST:event_buscarFiguraButtonMousePressed

    private void verFiguraButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_verFiguraButtonMousePressed
        int i = 1;
        for (Figura fig : Creacion.figuras) {
            this.mv.getBarraContenidoTextArea().append(i+"."+fig.toString()+"\n\n");
            i++;
        }        
        this.mv.getBarraContenidoTextArea().setCaretPosition(0);
        this.mv.setVisible(true);
    }//GEN-LAST:event_verFiguraButtonMousePressed

    private void removerFiguraButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_removerFiguraButtonMousePressed

        this.me.setVisible(true);
    }//GEN-LAST:event_removerFiguraButtonMousePressed

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
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
        //Creacion de figuras
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ModificarFiguraButton;
    private javax.swing.JPanel PanelFondo;
    private javax.swing.JButton buscarFiguraButton;
    private javax.swing.JButton crearFiguraButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton removerFiguraButton;
    private javax.swing.JButton salirButton;
    private javax.swing.JLabel textoBienvenida;
    private javax.swing.JButton verFiguraButton;
    // End of variables declaration//GEN-END:variables
}

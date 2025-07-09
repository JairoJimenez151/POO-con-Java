package menu;

import Funcionalidades.Creacion;
import Funcionalidades.Obtencion;
import Funcionalidades.Visualizacion;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class MenuEliminacion extends javax.swing.JFrame {

private static String IDSolicitado;
    public MenuEliminacion() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Bienvenida = new javax.swing.JLabel();
        panelFondo = new javax.swing.JPanel();
        Bienvenida1 = new javax.swing.JLabel();
        barraBusquedaTextField = new javax.swing.JTextField();
        buscadorBotton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        barraContenidoTextArea = new javax.swing.JTextArea();
        eliminarButton = new javax.swing.JButton();

        Bienvenida.setFont(new java.awt.Font("URW Gothic", 1, 30)); // NOI18N
        Bienvenida.setForeground(new java.awt.Color(0, 51, 153));
        Bienvenida.setText("Digite el ID de la figura");
        Bienvenida.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Eliminacion");
        setResizable(false);

        panelFondo.setBackground(new java.awt.Color(0, 255, 255));

        Bienvenida1.setFont(new java.awt.Font("URW Gothic", 1, 30)); // NOI18N
        Bienvenida1.setForeground(new java.awt.Color(0, 51, 153));
        Bienvenida1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Bienvenida1.setText("Digite el ID de la figura");
        Bienvenida1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        barraBusquedaTextField.setBackground(new java.awt.Color(255, 255, 255));
        barraBusquedaTextField.setFont(new java.awt.Font("Liberation Mono", 1, 20)); // NOI18N
        barraBusquedaTextField.setForeground(new java.awt.Color(0, 0, 0));
        barraBusquedaTextField.setToolTipText("");
        barraBusquedaTextField.setOpaque(true);
        barraBusquedaTextField.setPreferredSize(new java.awt.Dimension(300, 40));

        buscadorBotton.setBackground(new java.awt.Color(0, 0, 0));
        buscadorBotton.setFont(new java.awt.Font("Liberation Mono", 1, 18)); // NOI18N
        buscadorBotton.setForeground(new java.awt.Color(255, 255, 0));
        buscadorBotton.setText("BUSCAR");
        buscadorBotton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buscadorBotton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                buscadorBottonMousePressed(evt);
            }
        });

        barraContenidoTextArea.setBackground(new java.awt.Color(0, 153, 153));
        barraContenidoTextArea.setColumns(20);
        barraContenidoTextArea.setFont(new java.awt.Font("Liberation Mono", 0, 18)); // NOI18N
        barraContenidoTextArea.setForeground(new java.awt.Color(0, 0, 0));
        barraContenidoTextArea.setRows(30);
        barraContenidoTextArea.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        barraContenidoTextArea.setFocusable(false);
        barraContenidoTextArea.setMinimumSize(new java.awt.Dimension(13, 25));
        jScrollPane1.setViewportView(barraContenidoTextArea);
        barraContenidoTextArea.setEditable(false);
        barraContenidoTextArea.setLineWrap(true); // Opcional: permite que el texto se ajuste al ancho
        barraContenidoTextArea.setWrapStyleWord(true); // Opcional: que corte solo en palabras

        eliminarButton.setBackground(new java.awt.Color(0, 0, 0));
        eliminarButton.setFont(new java.awt.Font("Liberation Mono", 1, 18)); // NOI18N
        eliminarButton.setForeground(new java.awt.Color(255, 255, 0));
        eliminarButton.setText("ELIMINAR");
        eliminarButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        eliminarButton.setPreferredSize(new java.awt.Dimension(96, 27));
        eliminarButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                eliminarButtonMousePressed(evt);
            }
        });

        javax.swing.GroupLayout panelFondoLayout = new javax.swing.GroupLayout(panelFondo);
        panelFondo.setLayout(panelFondoLayout);
        panelFondoLayout.setHorizontalGroup(
            panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFondoLayout.createSequentialGroup()
                .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelFondoLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(Bienvenida1, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelFondoLayout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(buscadorBotton)
                            .addComponent(barraBusquedaTextField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(eliminarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1))))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        panelFondoLayout.setVerticalGroup(
            panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFondoLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(Bienvenida1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(barraBusquedaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(buscadorBotton)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(eliminarButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
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

    private void buscadorBottonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buscadorBottonMousePressed
       IDSolicitado=Obtencion.doObtenerPOS(this.barraBusquedaTextField.getText());
       this.barraContenidoTextArea.setText(Visualizacion.doMostrarInfo(IDSolicitado));
    }//GEN-LAST:event_buscadorBottonMousePressed

    private void eliminarButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eliminarButtonMousePressed
        if(!IDSolicitado.equals("Figura no encontrada")){
            Creacion.figuras.remove(Integer.parseInt(IDSolicitado));
            this.barraContenidoTextArea.setText("Figura Eliminada con exito");
        }
    }//GEN-LAST:event_eliminarButtonMousePressed

    public JTextField getBarraBusquedaTextField() {
        return barraBusquedaTextField;
    }

    public JTextArea getBarraContenidoTextArea() {
        return barraContenidoTextArea;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Bienvenida;
    private javax.swing.JLabel Bienvenida1;
    private javax.swing.JTextField barraBusquedaTextField;
    private javax.swing.JTextArea barraContenidoTextArea;
    private javax.swing.JButton buscadorBotton;
    private javax.swing.JButton eliminarButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panelFondo;
    // End of variables declaration//GEN-END:variables
}

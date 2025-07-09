package menu;
import Funcionalidades.Obtencion;
import Funcionalidades.Visualizacion;

public class MenuBusqueda extends javax.swing.JFrame {

    public MenuBusqueda() {
        initComponents();
        this.barraBusquedaTextField.setText("");
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelFondo = new javax.swing.JPanel();
        Bienvenida = new javax.swing.JLabel();
        buscadorBotton = new javax.swing.JButton();
        barraBusquedaTextField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        barraContenidoTextArea = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Busqueda ");
        setResizable(false);

        panelFondo.setBackground(new java.awt.Color(0, 255, 255));
        panelFondo.setPreferredSize(new java.awt.Dimension(400, 400));

        Bienvenida.setFont(new java.awt.Font("URW Gothic", 1, 30)); // NOI18N
        Bienvenida.setForeground(new java.awt.Color(0, 51, 153));
        Bienvenida.setText("Digite el ID de la figura");
        Bienvenida.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        Bienvenida.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

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

        barraBusquedaTextField.setBackground(new java.awt.Color(255, 255, 255));
        barraBusquedaTextField.setFont(new java.awt.Font("Liberation Mono", 1, 20)); // NOI18N
        barraBusquedaTextField.setForeground(new java.awt.Color(0, 0, 0));
        barraBusquedaTextField.setOpaque(true);
        barraBusquedaTextField.setPreferredSize(new java.awt.Dimension(300, 40));

        barraContenidoTextArea.setBackground(new java.awt.Color(0, 153, 153));
        barraContenidoTextArea.setColumns(20);
        barraContenidoTextArea.setFont(new java.awt.Font("Liberation Mono", 1, 18)); // NOI18N
        barraContenidoTextArea.setForeground(new java.awt.Color(0, 0, 0));
        barraContenidoTextArea.setRows(5);
        barraContenidoTextArea.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        barraContenidoTextArea.setFocusable(false);
        jScrollPane1.setViewportView(barraContenidoTextArea);
        barraContenidoTextArea.setEditable(false);
        barraContenidoTextArea.setLineWrap(true); // Opcional: permite que el texto se ajuste al ancho
        barraContenidoTextArea.setWrapStyleWord(true); // Opcional: que corte solo en palabras

        javax.swing.GroupLayout panelFondoLayout = new javax.swing.GroupLayout(panelFondo);
        panelFondo.setLayout(panelFondoLayout);
        panelFondoLayout.setHorizontalGroup(
            panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFondoLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(buscadorBotton, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Bienvenida, javax.swing.GroupLayout.DEFAULT_SIZE, 330, Short.MAX_VALUE)
                    .addComponent(barraBusquedaTextField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        panelFondoLayout.setVerticalGroup(
            panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFondoLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(Bienvenida)
                .addGap(28, 28, 28)
                .addComponent(barraBusquedaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(buscadorBotton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
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

    private void buscadorBottonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buscadorBottonMousePressed
        this.barraContenidoTextArea.setText(Visualizacion.doMostrarInfo(Obtencion.doObtenerPOS(this.barraBusquedaTextField.getText()))); 
    }//GEN-LAST:event_buscadorBottonMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Bienvenida;
    private javax.swing.JTextField barraBusquedaTextField;
    private javax.swing.JTextArea barraContenidoTextArea;
    private javax.swing.JButton buscadorBotton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panelFondo;
    // End of variables declaration//GEN-END:variables
}

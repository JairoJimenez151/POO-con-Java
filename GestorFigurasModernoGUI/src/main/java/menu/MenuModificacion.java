package menu;
import Funcionalidades.*;
import Modificaciones.Modificacion;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
public class MenuModificacion extends javax.swing.JFrame {
    private static String posicionFigura;
    public MenuModificacion() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelFondo = new javax.swing.JPanel();
        Bienvenida = new javax.swing.JLabel();
        buscadorBotton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        barraContenidoTextArea = new javax.swing.JTextArea();
        modificadorBotton = new javax.swing.JButton();
        barraBusquedaTextField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Modificacion");
        setResizable(false);

        panelFondo.setBackground(new java.awt.Color(0, 255, 255));

        Bienvenida.setFont(new java.awt.Font("URW Gothic", 1, 30)); // NOI18N
        Bienvenida.setForeground(new java.awt.Color(0, 51, 153));
        Bienvenida.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Bienvenida.setText("Digite el ID de la figura");

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
        barraContenidoTextArea.setFont(new java.awt.Font("Liberation Mono", 1, 20)); // NOI18N
        barraContenidoTextArea.setForeground(new java.awt.Color(0, 0, 0));
        barraContenidoTextArea.setRows(5);
        barraContenidoTextArea.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        barraContenidoTextArea.setPreferredSize(new java.awt.Dimension(250, 100));
        jScrollPane1.setViewportView(barraContenidoTextArea);
        barraContenidoTextArea.setEditable(false);
        barraContenidoTextArea.setFocusable(false);
        barraContenidoTextArea.setLineWrap(true); // Opcional: permite que el texto se ajuste al ancho
        barraContenidoTextArea.setWrapStyleWord(true); // Opcional: que corte solo en palabras

        modificadorBotton.setBackground(new java.awt.Color(0, 0, 0));
        modificadorBotton.setFont(new java.awt.Font("Liberation Mono", 1, 18)); // NOI18N
        modificadorBotton.setForeground(new java.awt.Color(255, 255, 0));
        modificadorBotton.setText("Modificar");
        modificadorBotton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        modificadorBotton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                modificadorBottonMousePressed(evt);
            }
        });

        barraBusquedaTextField.setBackground(new java.awt.Color(255, 255, 255));
        barraBusquedaTextField.setFont(new java.awt.Font("Liberation Mono", 1, 20)); // NOI18N
        barraBusquedaTextField.setForeground(new java.awt.Color(0, 0, 0));
        barraBusquedaTextField.setName(""); // NOI18N
        barraBusquedaTextField.setOpaque(true);
        barraBusquedaTextField.setPreferredSize(new java.awt.Dimension(300, 40));
        barraBusquedaTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                barraBusquedaTextFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelFondoLayout = new javax.swing.GroupLayout(panelFondo);
        panelFondo.setLayout(panelFondoLayout);
        panelFondoLayout.setHorizontalGroup(
            panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelFondoLayout.createSequentialGroup()
                .addGap(0, 22, Short.MAX_VALUE)
                .addComponent(Bienvenida, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
            .addGroup(panelFondoLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(modificadorBotton)
                    .addComponent(buscadorBotton)
                    .addComponent(barraBusquedaTextField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelFondoLayout.setVerticalGroup(
            panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFondoLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(Bienvenida)
                .addGap(31, 31, 31)
                .addComponent(barraBusquedaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(buscadorBotton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(modificadorBotton)
                .addContainerGap())
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
        posicionFigura = Obtencion.doObtenerPOS(this.barraBusquedaTextField.getText());
        this.barraContenidoTextArea.setText(Visualizacion.doMostrarInfo(posicionFigura));  
    }//GEN-LAST:event_buscadorBottonMousePressed

    private void barraBusquedaTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_barraBusquedaTextFieldActionPerformed
//Aqui nada, ESTO FUE UN ERROR
     }//GEN-LAST:event_barraBusquedaTextFieldActionPerformed

    private void modificadorBottonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modificadorBottonMousePressed
        if(!this.barraContenidoTextArea.getText().equals("Figura no encontrada")){
            Modificacion.doModificarDatosFigura(Integer.parseInt(posicionFigura));           
            posicionFigura = Obtencion.doObtenerPOS(this.barraBusquedaTextField.getText());
            this.barraContenidoTextArea.setText(Visualizacion.doMostrarInfo(posicionFigura)); 
        }
    }//GEN-LAST:event_modificadorBottonMousePressed

    public JTextField getBarraBusquedaTextField() {
        return barraBusquedaTextField;
    }

    public JTextArea getBarraContenidoTextArea() {
        return barraContenidoTextArea;
    }

    public JButton getModificadorBotton() {
        return modificadorBotton;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Bienvenida;
    private javax.swing.JTextField barraBusquedaTextField;
    private javax.swing.JTextArea barraContenidoTextArea;
    private javax.swing.JButton buscadorBotton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton modificadorBotton;
    private javax.swing.JPanel panelFondo;
    // End of variables declaration//GEN-END:variables
}


package Componentes;

import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.event.*;
import java.util.concurrent.CyclicBarrier;

public class Boton extends javax.swing.JButton{

    public Boton(String nombre, Dimension dimension) {
        setText(nombre);
        setSize(dimension);
      
        addMouseListener(new MouseAdapter() {
        @Override
           public void mouseEntered(MouseEvent e) {
               if(isEnabled()){
                    setCursor(new Cursor(Cursor.HAND_CURSOR));
               }
           }
            @Override
            public void mouseExited(MouseEvent e) {
                setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
            }
        });
    
    }
    
}

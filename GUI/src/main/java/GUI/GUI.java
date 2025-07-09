package GUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GUI extends JFrame{
    
        public GUI() {
        this.setSize(500, 500);
        this.setLocationRelativeTo(null);
       
        this.setTitle("Ventana");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(new BorderLayout());
        iniciarComponentes();
    }

    private void iniciarComponentes(){
        JPanel panel = new JPanel(new GridBagLayout());
        panel.setSize(500,500);
        JPanel panelX = new JPanel();
        panelX.setPreferredSize(new Dimension(200, 150));

        panelX.setBackground(Color.red);
        panel.add(panelX);
        this.getContentPane().add(panel);
    }
    
//public GUI() {
        /*this.setSize(500, 500);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setTitle("Ventana roja con panel azul");

        // Establece el fondo rojo usando un panel principal
        JPanel panelFondo = new JPanel(new GridBagLayout()); // Este centra el panel azul
        panelFondo.setBackground(Color.RED);

        // Panel azul centrado
        JPanel panelAzul = new JPanel();
        panelAzul.setPreferredSize(new Dimension(200, 150)); // Más pequeño que la ventana
        panelAzul.setBackground(Color.BLUE);

        // Añadir el panel azul al centro del panel rojo
        panelFondo.add(panelAzul);

        // Establecer el panel rojo como contenido de la ventana
        this.setContentPane(panelFondo);
    }*/ // AGREGAR UN PANEL SOBRE OTRO

    
}

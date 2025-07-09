
package App;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class ContadorConHilos extends JFrame {
    private Contador[] contadores = new Contador[10];
    private JButton botonInicio;
    private JButton botonReinicio;
    public ContadorConHilos() {
        // Configuración de la ventana
        setTitle("Contadores con Hilos");
        setSize(1100, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null); // Dos filas, una para cada label
        setLocationRelativeTo(null);
        // Crear labels
        for (int i = 0; i < contadores.length; i++) {
            if(i%2==0)
                contadores[i] = new Contador(500);
            else
                contadores[i] = new Contador(1000);
        }
        for (int i = 0; i <contadores.length; i++) {
            contadores[i].setBounds(i*100+20,0,80,300);
        }
        ////////////////HILOS
     
        botonInicio = new JButton("Iniciar");
        botonInicio.setFont(new Font("Arial", Font.BOLD, 30));
        botonInicio.setBounds(500, 400, 100, 100);
        botonInicio.addMouseListener(new MouseAdapter(){
            @Override
            public void mousePressed(MouseEvent e){
                // Iniciar los hilos
            for (int i = 0; i <contadores.length; i++) {
                contadores[i].iniciar();
            }
            }
        });
        botonReinicio = new JButton("Reiniciar");
        botonReinicio.setBounds(500, 520, 100, 100);
        botonReinicio.setFont(new Font("Arial", Font.BOLD, 30));
        botonReinicio.addMouseListener(new MouseAdapter(){
            @Override
            public void mousePressed(MouseEvent e){
                for (int i = 0; i <contadores.length; i++) {
                contadores[i].reiniciar();
            }
            }
        });
    // Agregar labels al frame
        for (int i = 0; i <contadores.length; i++) {
            add(contadores[i]);
        }

        add(botonInicio);
        add(botonReinicio);
        // Mostrar la ventana
        setVisible(true);

        
    }

    // Clase interna que implementa el contador


}
package Funcionalidades;

import FormasGeometricas.*;
import static Funcionalidades.Creacion.*;
import static Funcionalidades.Medidas.USP;
import java.awt.Dimension;
import Componentes.Boton;
import java.awt.event.*;
import javax.swing.*;

public class Modificacion {
    private Modificacion() {
    }

    public static void doModificarDatosFigura(int posicionObjeto, JPanel panel,JTextArea pag) {
        
        int celdas = 0;
        if (figuras.get(posicionObjeto) instanceof Circulo) {
            celdas = 2;
        } else if (figuras.get(posicionObjeto) instanceof Triangulo) {
            celdas = 4;
        } else if (figuras.get(posicionObjeto) instanceof Rectangulo) {
            celdas = 3;
        } else if(figuras.get(posicionObjeto) instanceof Pentagono){ //Se sobre entiende que es pentagono
            celdas = 2;
        }

        String nombre[] = {"Color", "Lado 1", "Lado 2", "Lado 3","Lado 4"};
        JLabel[] label = new JLabel[4];
        JTextField[] sendas = new JTextField[4];
        for (int i = 0; i<celdas;i++) {
            label[i] = new JLabel(nombre[i]);
            label[i].setBounds(2*USP, (12+i*2)*USP, 4*USP, USP); 
            sendas[i] = new JTextField();
            sendas[i].setBounds(8*USP,(12+i*2)*USP , 6*USP, USP);
            panel.add(label[i]);
            panel.add(sendas[i]);
        } 
        Boton Guardar = new Boton("Guardar",new Dimension(8*USP,2*USP));
        Guardar.setLocation(4*USP, 19*USP);
        Guardar.addMouseListener(new MouseAdapter(){
            public void mousePressed(MouseEvent e){
                doModificarDatosFigura(posicionObjeto, sendas);
                pag.setText(figuras.get(figuras.size()-1).toString());
            }
        });
        panel.add(Guardar);
        panel.revalidate();
        panel.repaint();
        
    }
    private static void doModificarDatosFigura(int posicionObjeto, JTextField[] sendas){
        String[] datos = new String[6];//La dimenson maxima del puede tener el arreglo
        datos[1] = figuras.get(posicionObjeto).getID();
        datos[2] = sendas[0].getText();
        ///El ID No cambia
        
        if (figuras.get(posicionObjeto) instanceof Circulo) {
            datos[0] = "Circulo";
            datos[3] = sendas[1].getText();

            doCrearCirculo(datos);
        } else if (figuras.get(posicionObjeto) instanceof Triangulo) {
            datos[0] = "Triangulo";
            datos[3] = sendas[1].getText();
            datos[4] = sendas[2].getText();
            datos[5] = sendas[3].getText();

            doCrearTriangulo(datos);
        } else if (figuras.get(posicionObjeto) instanceof Rectangulo) {
            datos[0] = "Rectangulo";
            datos[3] = sendas[1].getText();
            datos[4] = sendas[2].getText();

            doCrearRectangulo(datos);
        } else { //Se sobre entiende que es pentagono
            datos[0] ="Pentagono";
            datos[3] = sendas[1].getText();
            doCrearPentagono(datos);
        }
figuras.remove(posicionObjeto);
    }

}

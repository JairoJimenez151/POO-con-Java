package Modificaciones;


import FormasGeometricas.*;
import static Funcionalidades.Creacion.figuras;
import java.util.InputMismatchException;
import java.util.Scanner;
import menu.auxiliares.*;
public class Modificacion {
    private static Scanner sc = new Scanner(System.in);
     
    private Modificacion() {
    }

    /*
    Se van a crear nuevos objetos con los datos que el usuario digite(Excepto el ID) y se removeran el antiguo objeto del Array
    Esto por motivo a que las clases padres no pueden acceder a los metodos propios de sus hijas.
    */
    public static void doModificarDatosFigura(int posicionObjeto) {
        String dato = figuras.get(posicionObjeto).getID();
        ///El ID No cambia
        ///Pasa que la ubicacion sigue siendo la misa, y luego del segundo clic todo falla
        if (figuras.get(posicionObjeto) instanceof Circulo) {
            DatosCirculos m = new DatosCirculos();
            m.getIDnuevo().setText(dato);
            m.setVisible(true);
            figuras.remove(posicionObjeto);
            m.setVisible(false);
        } else if (figuras.get(posicionObjeto) instanceof Triangulo) {
            DatosTriangulo m = new DatosTriangulo();
            m.getIDnuevo().setText(dato);
            m.setVisible(true);
            figuras.remove(posicionObjeto);
            m.setVisible(false);
        } else if (figuras.get(posicionObjeto) instanceof Rectangulo) {
            DatosRectangulos m = new DatosRectangulos();
            m.getIDnuevo().setText(dato);
            m.setVisible(true);
            figuras.remove(posicionObjeto);
            m.setVisible(false);
        } else { //Se sobre entiende que es pentagono
            DatosPentagono m = new DatosPentagono();
            m.getIDnuevo().setText(dato);
            m.setVisible(true);
            figuras.remove(posicionObjeto);
            m.setVisible(false);
        }

        
    }

    private static String doValidarLongitud(String longitudString) {
        double longitudDouble = 0;
        boolean validezDeDato = false; //Se partira de la idea de que el usuario lo pone mal
        while (!validezDeDato) {
            try {  //Imaginese que el usario ponga una letra, un espacio o un simbolo que provocara una excepcion de tipo IllegalArgumentException
                longitudDouble = Double.parseDouble(longitudString);

                if (longitudDouble < 0) {
                    System.out.println("Una longitud no puede ser negativa");
                    longitudString = sc.nextLine();
                }else{
                    validezDeDato=true;
                }
            } catch (NumberFormatException e) {
//                longitud=null;               
                System.out.println("Error: " + e.getMessage() + "\n verifique bien los datos que pone ");
                System.out.println("Digite nuevamente la longitud");
                longitudString = sc.nextLine();
            }catch(InputMismatchException ex){        
                System.out.println("ERROR: "+ex.getMessage());
                System.out.println("POR FAVOR, DIGITE UN NUMERO");
                longitudString = sc.nextLine();
            }           
        }

        return String.valueOf(longitudDouble);
    }
    
    private static String doValidarColor(String colorString){
        int colorInt = 0;
        boolean validezDeDato = false; //Se partira de la idea de que el usuario lo pone mal
        
        while (!validezDeDato) {
            try {  //Imaginese que el usario ponga una letra, un espacio o un simbolo que provocara una excepcion de tipo IllegalArgumentException
                colorInt = Integer.parseInt(colorString);

                if (colorInt < 1 || colorInt>3) {
                    System.out.println("Fuera de rango, el numero debe ser entero entre 1 y 3 ");
                    colorString = sc.nextLine();
                }else{
                    validezDeDato=true;
                }
            } catch (NumberFormatException e) {
//                longitud=null;
                System.out.println("Error: " + e.getMessage() + "\n verifique bien los datos que pone ");
                System.out.println("Digite nuevamente el color (Valor entero entre 1 y 3)");
                colorString = sc.nextLine();
            }catch(InputMismatchException ex){               
                System.out.println("ERROR: "+ex.getMessage());
                System.out.println("POR FAVOR, DIGITE UN NUMERO ENTERO ENTRE 1 Y 3");
                colorString = sc.nextLine();
            }           
        }
        return String.valueOf(colorInt); 
    }
}

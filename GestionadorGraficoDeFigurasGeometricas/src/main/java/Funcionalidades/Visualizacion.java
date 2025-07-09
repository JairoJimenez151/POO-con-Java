package Funcionalidades;

import static Funcionalidades.Creacion.figuras;

/*
Esta es una clase utilitaria, una clase diseñada para auxiliar a la clase App es su labor de gestion.
Esto debido a que solo posee metodos esaticos publicos y no posee la cpacidad de crear objetos.
Esta fue hecha para no sobrecargar la clase principal.Este concepto fue sacado del libro:
Java : Curso práctico de formación para la preparación del examen de certificación Java SE Programmer I: IZ-808 
Autor Martín Sierra, Antonio J 
*/
public class Visualizacion {
    private Visualizacion() {}//Para evitar la creacion de objetos con esta clase.
//MENU, en estas clases estaran los menus e infromacion que se mostraran en la App

    public static String doMostrarInfo(String ID){
        for(int i=0;i<figuras.size();i++){
            if(ID.equals(figuras.get(i).getID()))     
                return figuras.get(i).toString();
        }                      
        
        return "Figura no encontrada";
    }   
    public static int getPosicionFigura(String ID){
        int pos =0;
        for(int i = 0;i<figuras.size();i++){
            if(ID.equals(figuras.get(i).getID()))     
                pos= i;
        }                      
        
        return pos;
    }   
}
    

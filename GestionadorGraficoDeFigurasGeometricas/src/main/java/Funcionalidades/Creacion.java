package Funcionalidades;

import FormasGeometricas.*;
import Figura.Figura;
import java.awt.Color;
import java.io.*;
import java.util.ArrayList;

public class Creacion {
    private Creacion() {} 
    
    public static ArrayList<Figura> figuras = new ArrayList<>();
    public static void doCrearFiguras(String ruta){
         try {                                                                       
            BufferedReader br = new BufferedReader(new FileReader(new File(ruta)));//File.separator, es para que las rutas sean efectivas en Linux, Mac y Windowns (Uso el primero)
            String line;
            while((line = br.readLine())!=null){
               String[] str = line.split(";");//Se invocan los metodos para la creacion de objetos (Asi se invocan metodos estaticos)
               doCrearCirculo(str);
               doCrearTriangulo(str);
               doCrearPentagono(str);
               doCrearRectangulo(str);
            }
        }catch (IOException ex) {
            System.out.println("EROOR: "+ex.getMessage());
        }
    }
    public static void doCrearCirculo(String[] str){
        if(str[0].equals("Circulo")){
            String id = str[1];
            Color ColorFigura = new Color(Integer.parseInt(str[2]));
            double diametro = Double.parseDouble(str[3]);
            figuras.add(new Circulo(diametro, id, ColorFigura));
        }
    }
    public static void doCrearTriangulo(String[] str){
        if(str[0].equals("Triangulo")){
            String id = str[1];
            Color ColorFigura = new Color(Integer.parseInt(str[2]));
            double lado1 = Double.parseDouble(str[3]);
            double lado2 = Double.parseDouble(str[4]);
            double lado3 = Double.parseDouble(str[5]);
            figuras.add(new Triangulo(lado1,lado2,lado3, id, ColorFigura));
        }
    }
    public static void doCrearPentagono(String[] str){
        if(str[0].equals("Pentagono")){
            String id = str[1];
            Color ColorFigura = new Color(Integer.parseInt(str[2]));
            double lado = Double.parseDouble(str[3]);
            figuras.add(new Pentagono(lado, id, ColorFigura));
        }
    }
    public static void doCrearRectangulo(String[] str){
        if(str[0].equals("Rectangulo") || str[0].equals("Cuadrado")){
            String id = str[1];
            Color ColorFigura = new Color(Integer.parseInt(str[2]));
            double lado1 = Double.parseDouble(str[3]);
            double lado2 = Double.parseDouble(str[4]);
            figuras.add(new Rectangulo(lado1, lado2, id, ColorFigura));
        }
    }
}

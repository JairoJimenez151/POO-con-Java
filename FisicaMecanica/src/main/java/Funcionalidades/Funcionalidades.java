package Funcionalidades;

import FisicaMecanica.FisicaMecanica;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Funcionalidades {
    private Funcionalidades(){}
    //Calular aceleracion promedio vehiculos
    public static void doMostrarAceleracionPromedio(FisicaMecanica[] V){
        int j=0;
        double promedio=0.0;
        for (FisicaMecanica V1 : V) {
            if(V1!=null){
                promedio += V1.doCalcularAcerelacion();
            }else{j++;}
        }
        promedio/=(V.length-j);
        System.out.print(promedio);
    }
    ///Determinar si el vehiculo acerela, desacerela o esta quiet
    /// @param V
     public static void doMostrarVehiculosAcelerados(FisicaMecanica[] V){
         int k = 0;
        for (FisicaMecanica V1 : V) {
            if (V1!=null && V1.doCalcularAcerelacion() > 0 ) {
                k++;
            }
        }
        System.out.println("Total vehiculos con Aceleracion: "+k);
    }
    public static void doMostrarVehiculosDesacelerados(FisicaMecanica[] V){
        int k = 0;
        for (FisicaMecanica V1 : V) {
            if (V1!=null && V1.doCalcularAcerelacion() < 0 ) {
                k++;
            }
        }
        System.out.println("Total vehiculos con Desaceleracion: "+k);
    }
     public static void doMostrarVehiculosQuietos(FisicaMecanica[] V){
           int k = 0;
        for (FisicaMecanica V1 : V) {
            if (V1!=null && V1.doCalcularAcerelacion() == 0) {
                k++;
            }
        }
        System.out.println("Total vehiculos con Quietos: "+k);
    }
    //Calcular numero de vehiculos para saber cual sera la dimension del arreglo 
    public static int doCalcularNumVehiculos(){
        int i =0;
        
        try{
            File file = new File("data"+File.separator+"data.txt");
            BufferedReader br = new BufferedReader(new FileReader(file));
            //String line;
            while(br.readLine()!=null){
                i++;
            }
        }catch(IOException e){
            System.out.println("ERROR:"+e.getMessage());
        }
         return i;
    }
}

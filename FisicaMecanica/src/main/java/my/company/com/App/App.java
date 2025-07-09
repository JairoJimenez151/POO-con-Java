/*
    Jairo Daniel Jimenez Arzuza 0222410011
*/
package my.company.com.App;

import FisicaMecanica.FisicaMecanica;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import Funcionalidades.Funcionalidades;

public class App {
    public static void main(String[] args) {
        System.out.println(Funcionalidades.doCalcularNumVehiculos());
        FisicaMecanica[] vehiculos = new FisicaMecanica[Funcionalidades.doCalcularNumVehiculos()];
        //Crear vehiculos
        int i=0;
        try{
            File file = new File("data"+File.separator+"data.txt");
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line;
            while((line = br.readLine()) != null){
                String[] str = line.split(";");
                double vi= Double.parseDouble(str[0]);
                double vf= Double.parseDouble(str[1]);
                double d= Double.parseDouble(str[2]);
                try{
                    vehiculos[i] = new FisicaMecanica(vi,vf,d);
                }catch(Exception e){
                    vehiculos[i]=null;
                }
                i++;
            }
        }catch(IOException e){
            System.out.println("ERROR:"+e.getMessage());
        }
        //Mostrar vehiculos acelerando
        Funcionalidades.doMostrarVehiculosAcelerados(vehiculos);
        //Mostrar vehiculos desacelerando
        Funcionalidades.doMostrarVehiculosDesacelerados(vehiculos); 
        //Mostrar vehiculos quieto
        Funcionalidades.doMostrarVehiculosQuietos(vehiculos);

        System.out.print("Aceleracion promedio: ");
        Funcionalidades.doMostrarAceleracionPromedio(vehiculos);
        
    }
}

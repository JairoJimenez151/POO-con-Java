package Funcionalidades;

import Finanzas.Cliente;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Funcionalidades { 
    private Funcionalidades(){}
    public static int doCalcularNumClientes(){
        int i =0;
        
        try{
            File file = new File("data"+File.separator+"datos.txt");
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
    public static int doCalcularNumClientes(Cliente[] c){
        int i=0;
        for(Cliente Cl : c){
            if(Cl == null)
                i++;
        }    
        
        return doCalcularNumClientes()-i;
    }
    
    public static double doCalcularCapitalDepositado(Cliente[] c){
        double total = 0.0;   
        for(Cliente Cl : c){
            if(Cl != null)
                total += Cl.getCapital();
        }    
        return total;
    }
    
    public static double doCalcularInteresesPagados(Cliente[] c){
        double total = 0.0;   
        for(Cliente Cl : c){
            if(Cl != null)
                total += Cl.doCalcularInteres();
        }    
        return total;
    }
}

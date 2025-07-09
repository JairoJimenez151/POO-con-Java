/*
    Jairo Daniel Jimenez Arzuza 0222410011
*/
package com.mycompany.app;

import Finanzas.Cliente;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import Funcionalidades.Funcionalidades;
        
public class APP {
    public static void main(String[] args) {
        //Crear clientes
        Cliente[] clientes = new Cliente[Funcionalidades.doCalcularNumClientes()];
        int i=0;
        try{
            File file = new File("data"+File.separator+"datos.txt");
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line;
            while((line = br.readLine()) != null){
                String[] str = line.split(";");
                String cedula= str[0];
                double capital = Double.parseDouble(str[1]);
                int diaCalendario= Integer.parseInt(str[2]);
                double interes = Double.parseDouble(str[3]);
                try{
                    clientes[i] = new Cliente(cedula,capital,diaCalendario,interes);
                }catch(IllegalArgumentException e){
                    clientes[i] = null;
                }
                i++;
            }
        }catch(IOException e){
            System.out.println("ERROR:"+e.getMessage());
        }
        
        System.out.println("Numero de clientes del banco: ");
        System.out.println(Funcionalidades.doCalcularNumClientes(clientes)+"\n");
        System.out.println("Total capital depositado");
        System.out.println(Funcionalidades.doCalcularCapitalDepositado(clientes)+" millones\n");
        System.out.println("Total interes pagado");
        System.out.println(Funcionalidades.doCalcularInteresesPagados(clientes)+" millones");
    }

}

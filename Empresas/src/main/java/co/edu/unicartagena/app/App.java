package co.edu.unicartagena.app;

import co.edu.unicartagena.empresas.Empresas;
import co.edu.unicartagena.empresas.Trabajador;


public class App {
    
public static void main(String[] args) {
    Trabajador t1 = new Trabajador(1, "X", "Señor");
    Trabajador t2 = new Trabajador(2, "Y", "zen");
    
    Empresas e1 = new Empresas(123, "ZpaceW", 1000000);
    e1.doContratarTrabajador(t1);
    e1.doContratarTrabajador(t2);
    
    System.out.println(e1.toString());
    e1.doListarDepartamento();
    e1.doListarTrabajadores();
}
}

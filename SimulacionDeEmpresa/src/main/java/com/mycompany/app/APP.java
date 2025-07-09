/*
    Jairo Daniel Jimenez Arzuza 0222410011
    Pedro Eli Diaz Olarte 0222410068
    Daniel David Gonzalez Marmol 0222410023
*/
package com.mycompany.app;
import organizacion.*;
public class APP {
    public static void main(String[] args) {
        ///Roles
        Rol r1 = new Rol("111","Gerente de proyectos",3);
        Rol r2 = new Rol("222","Desarrollador de software",2);
        Rol r3 = new Rol("333","Analista de datos",2);
        Rol r4 = new Rol("444","Recursos Humanos",1);
        Rol r5 = new Rol("555","Economista",1);
        //EMPLEADOS
        Empleado E1 =new Empleado("Pedro","0222410068",r1);
        Empleado E2 = new Empleado("Daniel","0222410023", r2);
        Empleado E3 = new Empleado("Jairo","0222410011",r3);
        Empleado E4 = new Empleado("Sara", "022241008",r4);
        Empleado E5 = new Empleado("Monica", "022241002",r5);
        
        Tarea[] t1 = {
            new Tarea("Implementar nuevas medidas de seguridad","001",false),
            new Tarea("Preparar informe financiero trimestral","002",false),
            new Tarea("Capacitacion de empleados en nuevas herramientas","004",false)
        };
        Tarea[] t2 = {
            new Tarea("Preparar informe financiero trimestral","002",false),
            new Tarea("Capacitacion de empleados en nuevas herramientas","004",false)
        };
        Tarea[] t3 = {
            new Tarea("Preparar informe financiero trimestral","002",false),
            new Tarea("Implementar nuevas medidas de seguridad","001",false)
        };
        Tarea[] t4 = {
            new Tarea("Lanzar Campaña publicitaria en redes sociales","003",false),
            new Tarea("Capacitacion de empleados en nuevas herramientas","004",false)
        };
        Tarea[] t5 = {
            new Tarea("Capacitacion de empleados en nuevas herramientas","004",false),
            new Tarea("Aumentar el numero de empleados en la oficina","005",true)
        };
        /////Oficinas
        Oficina f1 = new Oficina("A1","Departamento de Tecnología",t1);
        Oficina f2 = new Oficina("A2","Recursos Humanos",t2);
        Oficina f3 = new Oficina("A3","Finanzas y Contabilidad",t3);
        Oficina f4 = new Oficina("B1","Marketing y Publicidad",t4);
        Oficina f5 = new Oficina("B2","Atención al Cliente",t5);
        ///F1
        f1.doContractarEmpleado(E1);
        f1.doContractarEmpleado(E3);
        //F2
        f2.doContractarEmpleado(E2);
        f2.doContractarEmpleado(E4);
        //F3
        f3.doContractarEmpleado(E2);
        f3.doContractarEmpleado(E3);
        //F4
        f4.doContractarEmpleado(E5);
        f4.doContractarEmpleado(E3);
        //F5
        f5.doContractarEmpleado(E4);
        f5.doContractarEmpleado(E3);
        ////////////////////////////Mostra oficinas//////////
        System.out.println(f1.toString()+"\n");
        System.out.println(f2.toString()+"\n");
        System.out.println(f3.toString()+"\n");
        System.out.println(f4.toString()+"\n");
        System.out.println(f5.toString());
    }
}    

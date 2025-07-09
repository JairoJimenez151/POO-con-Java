/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package co.edu.unicartagena.empresas;

public class Empresas {

   int nit;
   String razon_social;
   int capital;
   
   Departamento [] dpto = new Departamento[3];
   
   Trabajador [] tbjdr = new Trabajador[2];

   int j=0;
   
    public Empresas(int nit, String razon_social, int capital) {
        this.nit = nit;
        this.razon_social = razon_social;
        this.capital = capital;
        this.setDepartamentos();
                
   }
   
    //método composición
    private void setDepartamentos (){
        dpto[0] = new Departamento(1,"RRHH");
        dpto[1] = new Departamento(2,"FF");
        dpto[2] = new Departamento(3,"CC");
    }
    
    public void doListarDepartamento(){
        for(Departamento d:dpto){
            System.out.println(d.toString());
        }
    }
   
    //método agregación
    public void doContratarTrabajador(Trabajador tbjdr){
        this.tbjdr[j++]=tbjdr;
    }
    
    public void doListarTrabajadores (){
        for(int i=0; i<tbjdr.length;++i){
            System.out.println(tbjdr[i].toString());
        }
    }

    public int getNit() {
        return nit;
    }

    public void setNit(int nit) {
        this.nit = nit;
    }

    public String getRazon_social() {
        return razon_social;
    }

    public void setRazon_social(String razon_social) {
        this.razon_social = razon_social;
    }

    public int getCapital() {
        return capital;
    }

    public void setCapital(int capital) {
        this.capital = capital;
    }

    @Override
    public String toString() {
        return "Empresas{" + "nit=" + nit + ", razon_social=" + razon_social + ", capital=" + capital + '}';
    }
    
}

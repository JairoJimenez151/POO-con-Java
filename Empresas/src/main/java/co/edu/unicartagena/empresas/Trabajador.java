/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.unicartagena.empresas;

public class Trabajador {
    
    int id; 
    String Apellido;
    String Nombre;

    public Trabajador(int id, String Apellido, String Nombre) {
        this.id = id;
        this.Apellido = Apellido;
        this.Nombre = Nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    @Override
    public String toString() {
        return "Trabajador{" + "id=" + id + ", Apellido=" + Apellido + ", Nombre=" + Nombre + '}';
    }
    
    
}

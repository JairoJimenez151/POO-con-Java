package organizacion;

import java.util.Arrays;

public class Oficina {
    private String ID;
    private String Nombre;
    
    Empleado[] empl = new Empleado[2];
    Tarea[] tareas = new Tarea[2];
    ////
    private int j = 0;
    private int i = 0;
    
    public Oficina(String ID, String Nombre,Tarea[] tareas) {
        this.ID = ID;
        this.Nombre = Nombre;
        this.tareas = tareas;
        this.setTareas();
    }
    ///////////Metodo Composicion/////////////////////
    /// @return /
    private void setTareas() {
        if (i < this.tareas.length) {
            this.tareas = tareas;
        } else {
            System.out.println("No se agregar mas tareas.");
        }
    }  
    
    @Override
    public String toString() {
        return "Oficina: "+Nombre+"\nEmpleados: "+doMostrarEmpleados()+"\nTareas: "+getTareas()+"\n";
    }
    ////////////Metodo De Agregacion//////////////////////////
    /// @param empl/
    public void doContractarEmpleado(Empleado empl){
        if (j < this.empl.length) {
            this.empl[j++] = empl;
        } else {
            System.out.println("No se pueden contratar más empleados.");
        }
    }
    public String doMostrarEmpleados(){
        return Arrays.toString(empl)+" ";
    }
    public String getTareas(){
        return Arrays.toString(tareas);
    }
   
    /////////////////////
    /// @return /
    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getNombre() {
        return Nombre;
    }
    
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }  
}

package organizacion;

public class Tarea {
    private String Nombre;
    private String ID;
    private boolean Estado; //false es finalizada; true es en proceso

    public Tarea(String Nombre, String ID, boolean Estado) {
        this.Nombre = Nombre;
        this.ID = ID;
        this.Estado = Estado;
    }

    @Override
    public String toString() {
        String lema = "Finalizada";//Se comienza suponiendo que esta terminada, osea false
        if(!Estado) lema = "En desarrollo";
        
        return "Tarea: " +Nombre + " - Estado: " +lema+"\n";
    } 
////////////////////////////////////////////////
    /// @return /
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public boolean getEstado() {
        return Estado;
    }

    public void setEstado(boolean Estado) {
        this.Estado = Estado;
    } 
}

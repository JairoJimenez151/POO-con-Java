package organizacion;

public class Rol {
   private String ID;
   private String Nombre;
   private int nivelJerarquia;

    public Rol(String ID, String Nombre, int nivelJerarquia) {
        this.ID = ID;
        this.Nombre = Nombre;
        this.nivelJerarquia = nivelJerarquia;
    }

    @Override
    public String toString() {
        return "Rol: "+ Nombre + " (Nivel "+nivelJerarquia+")";
    }
//////////////////////////////////////GET Y SETTER////////////////////
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

    public int getNivelJerarquia() {
        return nivelJerarquia;
    }

    public void setNivelJerarquia(int nivelJerarquia) {
        this.nivelJerarquia = nivelJerarquia;
    }
}

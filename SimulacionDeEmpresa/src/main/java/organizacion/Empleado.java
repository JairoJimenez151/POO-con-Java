package organizacion;

public class Empleado {
    private String Nombre;
    private String ID;
    Rol rol;
    Oficina[] office = new Oficina[2];

    public Empleado(String Nombre, String ID, Rol rol) {
        this.Nombre = Nombre;
        this.ID = ID;
        this.rol = rol;
    }

    @Override
    public String toString() {
        return "["+Nombre + " - "+rol.toString()+"]";
    }
       ////////////Metodo De Agregacion//////////////////////////
    /// @param office/
    public void doAsignarOficina(Oficina office){
        int j=0;
        this.office[j++] = office;
    }
//////////////////////////////////////////////////////////////
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

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    } 

}

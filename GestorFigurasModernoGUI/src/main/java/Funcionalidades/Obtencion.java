
package Funcionalidades;


public class Obtencion {
    private Obtencion(){}  
    
    public static String doObtenerPOS(String IDSolicitado){
        for(int i=0; i<Creacion.figuras.size();i++){
            if(Creacion.figuras.get(i).getID().equals(IDSolicitado)){
                return String.valueOf(i);
            }
        }
        return "Figura no encontrada";
    }
}

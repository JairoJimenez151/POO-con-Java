package Funcionalidades;

public class Visualizacion {
    private Visualizacion() {}
    
    public static String doMostrarInfo(String posicionFiguraString){                  
        if(posicionFiguraString.equals("Figura no encontrada")){
            return "Figura no encontrada"; 
        }        
        return Creacion.figuras.get(Integer.parseInt(posicionFiguraString)).toString();
    }

//    public static void doCambiarInfoFigura(String IDsolicitado){
//        
//        for(int i = 0; i<Creacion.figuras.size();i++){
//            if(Creacion.figuras.get(i).getID().equals(IDsolicitado)){
//                //Solucion, crear un objeto dependiendo del tipo que sea, modificarlo y cambiarlo donde estaba
//                Modificacion.doModificarDatosFigura(i,Creacion.figuras); 
//                i=Creacion.figuras.size();//Para que deje de buscar 
//            }       
//        }
//    }
    
    private static int doValidarOpcion(String opcionString) {
        int opcionInt = 0;
        boolean validezDeDato = false; //Se partira de la idea de que el usuario lo pone mal
        while (!validezDeDato) {
            try {  //Imaginese que el usario ponga una letra, un espacio o un simbolo que provocara una excepcion de tipo IllegalArgumentException
                opcionInt = Integer.parseInt(opcionString);

                if (opcionInt >= 1 && opcionInt <= 4) {
                    validezDeDato=true;
                }else{
                    System.out.println("Rango invalido");
                 //   opcionString= e.nextLine();

                }
            }catch(Exception ex){        
                System.out.println("ERROR: "+ex.getMessage());
                System.out.println("Digite una opcion valida");
                //opcionString = e.nextLine();
            }           
        }

        return opcionInt;
    }
}

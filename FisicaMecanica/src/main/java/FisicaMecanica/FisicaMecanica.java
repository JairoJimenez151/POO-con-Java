package FisicaMecanica;

public class FisicaMecanica {
    private double vi;
    private double vf;
    private double d;

    public FisicaMecanica(double vi, double vf, double d) {
       if(d<=0){
           throw new IllegalArgumentException();
       }
        this.vi = vi;
        this.vf = vf;
        this.d = d;
    }

    public double getVi() {
        return vi;
    }

    public void setVi(double vi) {
        this.vi = vi;
    }

    public double getVf() {
        return vf;
    }

    public void setVf(double vf) {
        this.vf = vf;
    }

    public double getD() {
        return d;
    }

    public void setD(double d) {
         if(d<=0){
            throw new IllegalArgumentException();
        }
        this.d = d;
    }
    
    public double doCalcularAcerelacion(){
        return (vf*vf - vi*vi)/(2*d);
    }
    
    @Override
    public String toString() {
        return "\nVelocidad inicial: " + vi + "\nVelocidad Final: " + vf + "\nDistancia recorrida: " + d  + "\nAceleracion: "+doCalcularAcerelacion();
    }
    
}

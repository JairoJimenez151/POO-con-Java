
package Finanzas;

public class Cliente {
    private String Cedula;
    private double Capital;
    private int diaCalendario;
    private double Interes;

    public Cliente(String Cedula, double Capital, int diaCalendario, double Interes) {
        if(Capital<=0 || diaCalendario<=0 || Interes>1 || Interes<0){
            throw new IllegalArgumentException();
        }
        this.Cedula = Cedula;
        this.Capital = Capital;
        this.diaCalendario = diaCalendario;
        this.Interes = Interes;
    }

    public String getCedula() {
        return Cedula;
    }

    public void setCedula(String Cedula) {
        this.Cedula = Cedula;
    }

    public double getCapital() {
        return Capital;
    }

    public void setCapital(double Capital) {
        if(Capital<=0){
            throw new IllegalArgumentException();
        }
        this.Capital = Capital;
    }

    public int getDiaCalendario() {
        return diaCalendario;
    }

    public void setDiaCalendario(int diaCalendario) {
        if(diaCalendario<=0){
            throw new IllegalArgumentException();
        }
        this.diaCalendario = diaCalendario;
    }

    public double getInteres() {
        return Interes;
    }

    public void setInteres(double Interes) {
        if(Interes>1 || Interes<0){
            throw new IllegalArgumentException();
        }
        this.Interes = Interes;
    }
    
    public double doCalcularInteres(){
        return ((Capital*Interes)/100) + ((360 - diaCalendario)/360);
    }
}

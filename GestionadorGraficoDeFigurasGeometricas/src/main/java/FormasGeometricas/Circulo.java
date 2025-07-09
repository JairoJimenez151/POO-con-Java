package FormasGeometricas;

import Figura.Figura;

public class Circulo extends Figura{
    
    protected double LongitudDiametro;
    protected final double PI;

    public Circulo(double LongitudDiametro, String ID, java.awt.Color Color) {
        super(ID, Color);///En la App se explica el porque aqui el numero de lados debe ser uno (1)
        this.LongitudDiametro = LongitudDiametro;
        this.PI = Math.PI;
    }   
    
    @Override
    public double doCalcularPerimetro() {      
        return Math.round(2*PI*(LongitudDiametro/2)*100)/100;
    }

    @Override
    public double doCalcularArea() {
        return Math.round(PI*(LongitudDiametro/2)*(LongitudDiametro/2)*100)/100;
    }
    
    //Esto esta en todos los metodos toString() de todas las clases
    //El super.toString() es para llamar al metodo toString de la clase Java (Lo aprendi en un short de YouTube del cual no tengo enlace)
    @Override
    public String toString() { 
        
        return "Circulo"+super.toString();
    }
//////////////////////////////////////////////////////////////
    /// @return /
    public double getLongitudDiametro() {
        return LongitudDiametro;
    }

    public void setLongitudDiametro(double LongitudDiametro) {
        this.LongitudDiametro = LongitudDiametro;
    }

    public double getPI() {
        return PI;
    }    
}

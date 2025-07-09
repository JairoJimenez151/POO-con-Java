
package FormasGeometricas;

import Figura.Figura;

public class Rectangulo extends Figura{
     
    protected double Lado1;
    protected double Lado2;
    protected double Lado3;
    protected double Lado4;

    public Rectangulo(double Lado1, double Lado2, String ID, java.awt.Color Color) {
        super(ID, Color);
        this.Lado1 = Lado1;
        this.Lado2 = Lado2;
        this.Lado3 = this.Lado1;
        this.Lado4 = this.Lado2;
    }
    @Override
    public double doCalcularPerimetro() {
        return 2*(Lado1+Lado2);
    }
    @Override
    public double doCalcularArea() {
        return Math.round(Lado1*Lado2);
    }
    //Esto esta en todos los metodos toString() de todas las clases
    //El super.toString() es para llamar al metodo toString de la clase Java (Lo aprendi en un short de YouTube del cual no tengo enlace)

    @Override
    public String toString() {
        return "Rectangulo"+super.toString();
    }
///////////////////////////////////////////////////////////////////
    /// @return /
    public double getLado1() {
        return Lado1;
    }

    public void setLado1(double Lado1) {
        this.Lado1 = Lado1;
    }

    public double getLado2() {
        return Lado2;
    }

    public void setLado2(double Lado2) {
        this.Lado2 = Lado2;
    }

    public void setLado3(double Lado3) {
        this.Lado3 = Lado3;
    }

    public void setLado4(double Lado4) {
        this.Lado4 = Lado4;
    }
    
}

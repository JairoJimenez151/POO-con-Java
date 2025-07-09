package FormasGeometricas;

import Figura.Figura;

public class Pentagono extends Figura{
    
    protected double Lado1;
    protected double Lado2;
    protected double Lado3;
    protected double Lado4;
    protected double Lado5;
    /*
    public Pentagono(double Lado1, double Lado2, double Lado3, double Lado4, double Lado5, String ID, java.awt.Color Color) {
        super(5, ID, Color);
        this.Lado1 = Lado1;
        this.Lado2 = Lado2;
        this.Lado3 = Lado3;
        this.Lado4 = Lado4;
        this.Lado5 = Lado5;// este constuctor no se usa, pero se tiene aqui por si en algun momento fuera necesario (En algun futuro proyecto)
    }*/
    
    public Pentagono(double Lado1, String ID, java.awt.Color Color) {
        super(ID, Color);//Pentagonos regulares
        this.Lado1 = Lado1;
        this.Lado2 = this.Lado1;
        this.Lado3 = this.Lado1;//Todos los lados son iguales
        this.Lado4 = this.Lado1;
        this.Lado5 = this.Lado1;
    }
    @Override
    public double doCalcularPerimetro() {
        return 5*Lado1;
    }
    @Override
    public double doCalcularArea() {
        double apotema = Lado1/(2*Math.tan(Math.toRadians(36.0)));
        return doCalcularPerimetro()*apotema*0.5d;
    }
    
    //Esto esta en todos los metodos toString() de todas las clases
    //El super.toString() es para llamar al metodo toString de la clase Java (Lo aprendi en un short de YouTube del cual no tengo enlace)

    @Override
    public String toString() {
        return "Pentagono"+super.toString();
    }
    /////////////////////////////////////////////////////////////////////////////////////
    /// @return 
    ///
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

    public double getLado3() {
        return Lado3;
    }

    public void setLado3(double Lado3) {
        this.Lado3 = Lado3;
    }

    public double getLado4() {
        return Lado4;
    }

    public void setLado4(double Lado4) {
        this.Lado4 = Lado4;
    }

    public double getLado5() {
        return Lado5;
    }

    public void setLado5(double Lado5) {
        this.Lado5 = Lado5;
    } 
}

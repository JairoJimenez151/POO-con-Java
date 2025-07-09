package FormasGeometricas;

import Figura.Figura;

public class Triangulo extends Figura{
     
    protected double Lado1;
    protected double Lado2;
    protected double Lado3;

    public Triangulo(double Lado1, double Lado2, double Lado3, String ID, java.awt.Color Color) {
        super(ID, Color);
        this.Lado1 = Lado1;
        this.Lado2 = Lado2;
        this.Lado3 = Lado3;
    }
    @Override
    public double doCalcularArea(){
        double S=doCalcularPerimetro()/2; //Semiperimetro       
        return Math.sqrt(S*(S-Lado1)*(S-Lado2)*(S-Lado3));
    }
    @Override
    public double doCalcularPerimetro(){
        return Lado1+Lado2+Lado3;
    }
    //Esto esta en todos los metodos toString() de todas las clases
    //El super.toString() es para llamar al metodo toString de la clase Java (Lo aprendi en un short de YouTube del cual no tengo enlace)

    @Override
    public String toString() {
        return "Triangulo"+super.toString();
    }
    //////////////Metodos propios de la clase triangulo
    /// @return  
    public boolean doVerificarTriangulo() {
        return Lado1+Lado2>Lado3 && Lado2+Lado3>Lado1 && Lado1+Lado3>Lado2;
    }
    ///////////////////////////////////////
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

    public double getLado3() {
        return Lado3;
    }

    public void setLado3(double Lado3) {
        this.Lado3 = Lado3;
    }

}

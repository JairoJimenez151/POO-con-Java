package Figura;

import java.awt.Color;

public abstract class Figura {
    
    protected final String ID;
    private java.awt.Color Color;

    public Figura(String ID, Color Color) {
        this.ID = ID;
        this.Color = Color;
    }
 
    public abstract double doCalcularPerimetro();
    public abstract double doCalcularArea();
    @Override
    public String toString(){
        String color; //Esto se hace, porque el valor del componente azul del color, nos indica que color es. 
        switch (Color.getBlue()) {
            case 1:
                color = "Rojo";
                break;
            case 2:
                color = "Azul";
                break;
            default:
                color = "Amarillo";
                break;
        }
        return "("+ID+") Color:"+color+" Area: "+doCalcularArea()+" Perimetro: "+doCalcularPerimetro();
    }
    //////////////////////////////////////////////////aaa///////////////////////////////
    /// @return /
    public Color getColor() {
        return Color;
    }

    public void setColor(Color Color) {
        this.Color = Color;
    }

    public String getID() {
        return ID;
    }
}

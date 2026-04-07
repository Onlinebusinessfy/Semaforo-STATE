package models;

import processing.core.PApplet;

public class Elipse extends Figura{
    public Elipse(Posicion posicion, Dimension dimension, Borde borde, int color){
        super(posicion, dimension, borde, color);
    }
    
    @Override
    public void dibujar(PApplet p){

        configurarPropiedades(p);

        // 🔥 Dibujar elipse centrada correctamente
        p.ellipse(
            posicion.getX() + dimension.getHorizontal() / 2,
            posicion.getY() + dimension.getVertical() / 2,
            dimension.getHorizontal(),
            dimension.getVertical()
        );
    }
}

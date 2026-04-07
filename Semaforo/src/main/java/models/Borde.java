package models;

public class Borde {

    private int color;
    private float ancho;

    // Constructor vacío
    public Borde() {
        this.color = 0;
        this.ancho = 1;
    }

    // Constructor con parámetros
    public Borde(int color, float ancho) {
        this.color = color;
        this.ancho = ancho;
    }

    // Getters
    public int getColor() {
        return color;
    }

    public float getAncho() {
        return ancho;
    }

    // Setters
    public void setColor(int color) {
        this.color = color;
    }

    public void setAncho(float ancho) {
        this.ancho = ancho;
    }
}
package nuevopoo;

import processing.core.PApplet;
import models.*;
import state.*;

public class NuevoPoo extends PApplet {

    Semaforo semaforo = new Semaforo();
    int contador = 0;

    public static void main(String[] args) {
        PApplet.main("nuevopoo.NuevoPoo");
    }

    public void settings() {
        size(Config.ANCHO_VENTANA, Config.ALTO_VENTANA);
    }

    public void setup() {
        frameRate(60);
        ellipseMode(CENTER);
    }

    public void draw() {

        background(200);

        // ⏱ cambiar estado cada 60 frames (~1 segundo)
        contador++;
        if (contador >= 60) {
            semaforo.cambiar();
            contador = 0;
        }

        String estado = semaforo.getColor();

        // 🔹 Centrar la caja dentro de la ventana
        int xCaja = (Config.ANCHO_VENTANA - Config.ANCHO_CAJA) / 2;
        int yCaja = (Config.ALTO_VENTANA - Config.ALTO_CAJA) / 2;

        Caja caja = new Caja(
            new Posicion(xCaja, yCaja),
            new Dimension(Config.ANCHO_CAJA, Config.ALTO_CAJA),
            null,
            color(0)
        );
        caja.dibujar(this);

        // 🔹 Calcular posiciones verticales de las luces para que queden centradas
        int totalLuces = 3;
        int espacioDisponible = Config.ALTO_CAJA - totalLuces * Config.TAM_LUZ;
        int espacioEntreLuces = espacioDisponible / (totalLuces + 1);

        int yRojo = yCaja + espacioEntreLuces;
        int yAmarillo = yRojo + Config.TAM_LUZ + espacioEntreLuces;
        int yVerde = yAmarillo + Config.TAM_LUZ + espacioEntreLuces;

        int xLuz = xCaja + (Config.ANCHO_CAJA - Config.TAM_LUZ) / 2;

        // 🔴 Rojo
        Elipse rojo = new Elipse(
            new Posicion(xLuz, yRojo),
            new Dimension(Config.TAM_LUZ, Config.TAM_LUZ),
            null,
            estado.equals("Rojo") ? color(255, 0, 0) : color(100)
        );
        rojo.dibujar(this);

        // 🟡 Amarillo
        Elipse amarillo = new Elipse(
            new Posicion(xLuz, yAmarillo),
            new Dimension(Config.TAM_LUZ, Config.TAM_LUZ),
            null,
            estado.equals("Amarillo") ? color(255, 255, 0) : color(100)
        );
        amarillo.dibujar(this);

        // 🟢 Verde
        Elipse verde = new Elipse(
            new Posicion(xLuz, yVerde),
            new Dimension(Config.TAM_LUZ, Config.TAM_LUZ),
            null,
            estado.equals("Verde") ? color(0, 255, 0) : color(100)
        );
        verde.dibujar(this);
    }
}
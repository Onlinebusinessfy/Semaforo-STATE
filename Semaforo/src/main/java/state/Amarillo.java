package state;

import nuevopoo.Semaforo;

public class Amarillo implements EstadoSemaforo {

    @Override
    public void cambiar(Semaforo semaforo) {
        semaforo.setEstado(new Rojo());
    }

    @Override
    public String getColor() {
        return "Amarillo";
    }
}
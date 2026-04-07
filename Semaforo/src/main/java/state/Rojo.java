package state;

import nuevopoo.Semaforo;

public class Rojo implements EstadoSemaforo {

    @Override
    public void cambiar(Semaforo semaforo) {
        semaforo.setEstado(new Verde());
    }

    @Override
    public String getColor() {
        return "Rojo";
    }
}
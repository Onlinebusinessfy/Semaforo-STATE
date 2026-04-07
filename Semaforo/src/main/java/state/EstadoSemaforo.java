package state;

import nuevopoo.Semaforo;

public interface EstadoSemaforo {
    void cambiar(Semaforo semaforo);
    String getColor();
}
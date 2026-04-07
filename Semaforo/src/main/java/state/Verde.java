package state;

import nuevopoo.Semaforo;

public class Verde implements EstadoSemaforo {

    @Override
    public void cambiar(Semaforo semaforo) {
        semaforo.setEstado(new Amarillo());
    }

    @Override
    public String getColor() {
        return "Verde";
    }
}
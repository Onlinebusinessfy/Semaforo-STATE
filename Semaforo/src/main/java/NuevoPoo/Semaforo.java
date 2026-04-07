package nuevopoo;

import state.*;

public class Semaforo {
    private EstadoSemaforo estado;

    public Semaforo() {
        estado = new Rojo();
    }

    public void cambiar() {
        estado.cambiar(this);
    }

    public void setEstado(EstadoSemaforo estado) {
        this.estado = estado;
    }

    public String getColor() {
        return estado.getColor();
    }
}
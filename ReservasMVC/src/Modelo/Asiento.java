package Modelo;

public class Asiento {
    private boolean reservado;

    public Asiento() {
        this.reservado = false;
    }

    public boolean isReservado() {
        return reservado;
    }

    public void reservar() {
        this.reservado = true;
    }
}
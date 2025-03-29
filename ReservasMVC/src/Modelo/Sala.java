package Modelo;

public class Sala {
    private Asiento[] asientos;
    private int capacidad;

    public Sala(int capacidad) {
        this.capacidad = capacidad;
        asientos = new Asiento[capacidad];
        for (int i = 0; i < capacidad; i++) {
            asientos[i] = new Asiento();
        }
    }

    public Asiento[] getAsientos() {
        return asientos;
    }

    public int getCapacidad() {
        return capacidad;
    }
}
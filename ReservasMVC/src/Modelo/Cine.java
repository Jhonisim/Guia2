package Modelo;

public class Cine {
    private Sala[] salas;

    public Cine(int numSalas, int capacidadPorSala) {
        salas = new Sala[numSalas];
        for (int i = 0; i < numSalas; i++) {
            salas[i] = new Sala(capacidadPorSala);
        }
    }

    public Sala[] getSalas() {
        return salas;
    }
}
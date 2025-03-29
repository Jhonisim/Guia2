package Modelo;
import java.util.ArrayList;
import java.util.Random;

public class Modelo {
 
    private ArrayList<Double> lecturas;

    public Modelo() {
        lecturas = new ArrayList<>();
    }

    public double leerTemperatura() {
        Random random = new Random();
        double temperatura = 5 + (35 - 5) * random.nextDouble();
        lecturas.add(temperatura);
        return temperatura;
    }

    public ArrayList<Double> getLecturas() {
        return lecturas;
    }
}
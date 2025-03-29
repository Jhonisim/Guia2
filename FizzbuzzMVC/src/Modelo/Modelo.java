package Modelo;
import java.util.ArrayList;

public class Modelo {
     private ArrayList<String> resultados;

    public Modelo() {
        resultados = new ArrayList<>();
    }

    public void generarFizzBuzz() {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                resultados.add("FizzBuzz");
            } else if (i % 3 == 0) {
                resultados.add("Fizz");
            } else if (i % 5 == 0) {
                resultados.add("Buzz");
            } else {
                resultados.add(String.valueOf(i));
            }
        }
    }

    public ArrayList<String> getResultados() {
        return resultados;
    }
}
package Vista;
import java.util.ArrayList;

public class Vista {
     public void mostrarEstado(String estado) {
        System.out.println("Estado del sistema: " + estado);
    }

    public void mostrarLecturas(ArrayList<Double> lecturas) {
        System.out.println("Lecturas de temperatura:");
        for (int i = 0; i < lecturas.size(); i++) {
            System.out.println((i + 1) + ". " + lecturas.get(i) + " °C");
        }
    }
}
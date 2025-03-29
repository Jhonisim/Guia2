package Vista;
import java.util.ArrayList;

public class Vista {
    public void mostrarEstado(String estado) {
        System.out.println("Estado de acceso: " + estado);
    }

    public void mostrarRegistros(ArrayList<String> registros) {
        System.out.println("Historial de accesos:");
        for (int i = 0; i < registros.size(); i++) {
            System.out.println((i + 1) + ". " + registros.get(i));
        }
    }
}
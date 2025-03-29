package Vista;
import java.util.ArrayList;

public class Vista {
      public void mostrarResultados(ArrayList<String> resultados) {
        for (String resultado : resultados) {
            System.out.println(resultado);
        }
    }

    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }
}
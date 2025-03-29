package Vista;
import java.util.ArrayList;
import java.util.Scanner;

public class VistaCalculadora {
     private Scanner scanner = new Scanner(System.in);

    public double solicitarNumero(String mensaje) {
        System.out.print(mensaje);
        return scanner.nextDouble();
    }

    public String solicitarOperacion() {
        System.out.print("Ingrese la operación (+, -, *, /): ");
        return scanner.next();
    }

    public void mostrarResultado(double resultado) {
        System.out.println("Resultado: " + resultado);
    }

    public void mostrarResultados(ArrayList<Double> resultados) {
        System.out.println("Resultados anteriores:");
        for (int i = 0; i < resultados.size(); i++) {
            System.out.println((i + 1) + ". " + resultados.get(i));
        }
    }

    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }
    public String solicitarContinuar() {
        System.out.print("¿Desea realizar otra operación? (s/n): ");
        return scanner.next();
    }
}
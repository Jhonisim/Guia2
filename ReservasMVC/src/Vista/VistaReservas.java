package Vista;
import java.util.Scanner;

public class VistaReservas {
      private Scanner scanner = new Scanner(System.in);

    public int mostrarMenu() {
        System.out.println("\n--- Sistema de Reservas de Cine ---");
        System.out.println("1. Realizar reserva");
        System.out.println("2. Ver reservas registradas");
        System.out.println("3. Salir");
        System.out.print("Seleccione una opción: ");
        return scanner.nextInt();
    }

    public int solicitarNumeroSala() {
        System.out.print("Ingrese el número de sala (0 a 2): ");
        return scanner.nextInt();
    }

    public int solicitarNumeroAsiento() {
        System.out.print("Ingrese el número de asiento (0 a 9): ");
        return scanner.nextInt();
    }

    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }
}
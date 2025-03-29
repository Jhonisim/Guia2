package Controlador;
import Modelo.Modelo;
import Vista.Vista;
import java.util.Scanner;

public class Controlador {
      private Modelo sensor;
    private Vista vista;

    public Controlador() {
        sensor = new Modelo();
        vista = new Vista();
    }

    public void iniciar() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            double temperatura = sensor.leerTemperatura();
            String estado;

            if (temperatura < 10) {
                estado = "Calefactor activado";
            } else if (temperatura > 25) {
                estado = "Ventilador activado";
            } else {
                estado = "Sistema inactivo";
            }

            vista.mostrarEstado(estado);
            vista.mostrarLecturas(sensor.getLecturas());

            System.out.print("¿Continuar monitoreando? (s/n): ");
            String continuar = scanner.next();
            if (!continuar.equalsIgnoreCase("s")) {
                break;
            }

            try {
                Thread.sleep(5000); // usado para esperar 5 segundos para la siguiente lectura
                
            } catch (InterruptedException e) {
                System.err.println("Error en la espera: " + e.getMessage());
            }
        }
        scanner.close();
    }
}
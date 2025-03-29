package Controlador;
import Modelo.Modelo;
import Vista.Vista;
import java.util.Random;
import java.util.Scanner;

public class Controlador {
    private Modelo luces;
    private Vista vista;
    private boolean esNoche;

    public Controlador() {
        luces = new Modelo();
        vista = new Vista();
        esNoche = true;
    }

    public void iniciar() {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("\nMenu de Control de Luces:");
            System.out.println("1. Cambiar a día/noche");
            System.out.println("2. Simular detección de movimiento");
            System.out.println("3. Ver historial de luces");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1 : 
                    cambiarTiempo();
                    break;
                case 2 : 
                    simularMovimiento();
                    break;
                case 3 : 
                    vista.mostrarRegistros(luces.getRegistros() );
                    break;
                case 4 : 
                    System.out.println("Saliendo...");
                    break;
                default :
                    System.out.println("Opción inválida.");
                    break;
            }
        } while (opcion != 4);
        scanner.close();
    }

    private void cambiarTiempo() {
        esNoche = !esNoche;
        String tiempo = esNoche ? "Noche" : "Día";
        System.out.println("Tiempo cambiado a: " + tiempo);
    }

    private void simularMovimiento() {
        Random random = new Random();
        boolean hayMovimiento = random.nextBoolean();

        if (esNoche && hayMovimiento) {
            luces.encender();
             String movimiento="Moviemiento detectado";
            vista.mostrarEstado("Encendidas");
        } else {
            luces.apagar();
             String movimiento="Sin detectar movimiento";
            vista.mostrarEstado("Apagadas");
        }
    }
}
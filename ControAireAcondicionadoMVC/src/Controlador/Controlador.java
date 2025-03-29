package Controlador;
import Modelo.Modelo;
import Vista.Vista;
import java.util.Random;
import java.util.Scanner;

public class Controlador {
    private Modelo aire;
    private Vista vista;

    public Controlador() {
        aire = new Modelo();
        vista = new Vista();
    }

    public void iniciar() {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("\nMenu de Control de Aire Acondicionado:");
            System.out.println("1. Simular lectura de sensores");
            System.out.println("2. Ver historial de encendido/apagado");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1 : 
                    simularLectura();
                    break;
                case 2 : 
                    vista.mostrarRegistros(aire.getRegistros());
                    break;
                case 3 : 
                    System.out.println("Saliendo...");
                    break;
                default : 
                    System.out.println("Opción inválida.");
                    break;
            }
        } while (opcion != 3);
        scanner.close();
    }

    private void simularLectura() {
        Random random = new Random();
        int temperatura = random.nextInt(41);  
        
        int humedad = random.nextInt(101);     

        System.out.println("Temperatura: " + temperatura + "°C");
        System.out.println("Humedad: " + humedad + "%");

        if ((temperatura > 28 && humedad > 60) || temperatura > 30) {
            aire.encender();
            vista.mostrarEstado("Encendido");
        } else {
            aire.apagar();
            vista.mostrarEstado("Apagado");
        }
    }
}
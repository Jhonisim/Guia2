package Controlador;
import Modelo.SensorMovimientoModelo;
import Vista.Vista;
import java.util.Scanner;

public class Controlador {
    private SensorMovimientoModelo sensor1;
    private SensorMovimientoModelo sensor2;
    private SensorMovimientoModelo sensor3;
    private Vista vista;
    private boolean esNoche;

    public Controlador() {
        sensor1 = new SensorMovimientoModelo();
        sensor2 = new SensorMovimientoModelo();
        sensor3 = new SensorMovimientoModelo();
        vista = new Vista();
        esNoche = true;
    }

    public void iniciar() {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("\nMenu de Alarma de Intrusos:");
            System.out.println("1. Activar alarma");
            System.out.println("2. Desactivar alarma");
            System.out.println("3. Ver registros");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1 : 
                    activarAlarma();
                    break;
                case 2 : 
                    desactivarAlarma();
                    break;
                case 3 : 
                    vista.mostrarRegistros(sensor1.getRegistros());
                    break;
                case 4 : 
                    System.out.println("Saliendo...");
                    break;
                default : 
                    System.out.println("Opción inválida");
                    break;
            }
        } while (opcion != 4);
        scanner.close();
    }

    private void activarAlarma() {
        sensor1.activar();
        sensor2.activar();
        sensor3.activar();
        verificarMovimiento();
    }

    private void desactivarAlarma() {
        sensor1.desactivar();
        sensor2.desactivar();
        sensor3.desactivar();
        vista.mostrarEstado("Alarma desactivada");
    }

    private void verificarMovimiento() {
        int movimientosDetectados = 0;
        if (sensor1.detectarMovimiento()) movimientosDetectados++;
        if (sensor2.detectarMovimiento()) movimientosDetectados++;
        if (sensor3.detectarMovimiento()) movimientosDetectados++;

        if (movimientosDetectados >= 2 && esNoche) {
            vista.mostrarEstado("Alarma activada");
            registrarMovimiento("Intruso detectado (" + movimientosDetectados + " sensores activados)");
        } else {
            vista.mostrarEstado("Sin intrusiones detectadas");
        }
    }

    private void registrarMovimiento(String mensaje) {
        sensor1.registrar(mensaje);
    } 
}
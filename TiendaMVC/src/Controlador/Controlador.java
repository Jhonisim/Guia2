package Controlador;
import Modelo.Modelo;
import Vista.Vista;
import java.util.Scanner;

public class Controlador {

    private Modelo acceso;
    private Vista vista;

    public Controlador() {
        acceso = new Modelo();
        vista = new Vista();
    }
    
    private void verificarAcceso() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("¿Tiene membresía válida? (true/false): ");
        boolean tieneMembresia = scanner.nextBoolean();
        System.out.print("¿Está dentro del horario de atención? (true/false): ");
        boolean horarioValido = scanner.nextBoolean();
        System.out.print("¿Es empleado? (true/false): ");
        boolean esEmpleado = scanner.nextBoolean();

        if ((tieneMembresia && horarioValido) || esEmpleado) {
            acceso.permitirAcceso();
            vista.mostrarEstado("Acceso permitido");
        } else {
            acceso.denegarAcceso();
            vista.mostrarEstado("Acceso denegado");
        }
    }
    
    public void iniciar() {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("\nMenu de Control de Acceso:");
            System.out.println("1. Verificar acceso");
            System.out.println("2. Ver historial de accesos");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1 -> verificarAcceso();
                case 2 -> vista.mostrarRegistros(acceso.getRegistros());
                case 3 -> System.out.println("Saliendo...");
                default -> System.out.println("Opción inválida.");
            }
        } while (opcion != 3);
        scanner.close();
    }   
}
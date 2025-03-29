package Controlador;
import Modelo.Asiento;
import Modelo.Cine;
import Modelo.Sala;
import Vista.VistaReservas;
import java.util.ArrayList;
import java.util.Scanner;

public class ControladorReservas {
    private Cine cine;
    private ArrayList<String> reservas;
    private VistaReservas vista;

    public ControladorReservas(int numSalas, int capacidadPorSala) {
        cine = new Cine(numSalas, capacidadPorSala);
        reservas = new ArrayList<>();
        vista = new VistaReservas();
    }

    public void realizarReserva(int numSala, int numAsiento) {
        Sala sala = cine.getSalas()[numSala];
        Asiento asiento = sala.getAsientos()[numAsiento];

        if (asiento.isReservado()) {
            System.out.println("El asiento ya está reservado");
        } else {
            asiento.reservar();
            String reserva = "Sala " + numSala + " - Asiento " + numAsiento;
            reservas.add(reserva);
            System.out.println("Reserva realizada exitosamente");
        }
    }

    public void mostrarReservas() {
        if (reservas.isEmpty()) {
            System.out.println("No hay reservas registradas");
        } else {
            System.out.println("Reservas registradas:");
            for (String reserva : reservas) {
                System.out.println(reserva);
            }
        }
    }
    
    public void menu(){
          while (true) {
            int opcion = vista.mostrarMenu();
            switch (opcion) {
                case 1:
                    int numSala = vista.solicitarNumeroSala();
                    int numAsiento = vista.solicitarNumeroAsiento();
                    realizarReserva(numSala, numAsiento);
                    break;
                case 2:
                    mostrarReservas();
                    break;
                case 3:
                    vista.mostrarMensaje("Gracias por usar el sistema de reservas, ¡Hasta luego!");
                    return;
                default:
                    vista.mostrarMensaje("Opción no válida");
                    break;
            }
        }
    }
}
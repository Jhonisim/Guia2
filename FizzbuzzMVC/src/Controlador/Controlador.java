package Controlador;
import Modelo.Modelo;
import Vista.Vista;

public class Controlador {
    private Modelo modelo;
    private Vista vista;

    public Controlador() {
        modelo = new Modelo();
        vista = new Vista();
    }

    public void ejecutar() {
        modelo.generarFizzBuzz();
        vista.mostrarMensaje("Resultados de FizzBuzz:");
        vista.mostrarResultados(modelo.getResultados());
    }
}
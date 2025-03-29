package Modelo;
import java.util.ArrayList;

public class Modelo {
    private boolean encendidas;
    private ArrayList<String> registros;

    public Modelo() {
        encendidas = false;
        registros = new ArrayList<>();
    }

    public void encender() {
        encendidas = true;
        registrar("Luces encendidas");
    }

    public void apagar() {
        encendidas = false;
        registrar("Luces apagadas");
    }

    public boolean isEncendidas() {
        return encendidas;
    }

    private void registrar(String mensaje) {
        registros.add(mensaje);
    }

    public ArrayList<String> getRegistros() {
        return registros;
    }
}
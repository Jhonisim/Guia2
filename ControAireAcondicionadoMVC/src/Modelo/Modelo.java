package Modelo;
import java.util.ArrayList;

public class Modelo {
    private boolean encendido;
    private ArrayList<String> registros;

    public Modelo() {
        encendido = false;
        registros = new ArrayList<>();
    }

    public void encender() {
        encendido = true;
        registrar("Aire acondicionado encendido");
    }

    public void apagar() {
        encendido = false;
        registrar("Aire acondicionado apagado");
    }

    public boolean isEncendido() {
        return encendido;
    }

    private void registrar(String mensaje) {
        registros.add(mensaje);
    }

    public ArrayList<String> getRegistros() {
        return registros;
    }
}
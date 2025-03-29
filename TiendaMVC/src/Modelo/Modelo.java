package Modelo;
import java.util.ArrayList;

public class Modelo {
     private boolean accesoPermitido;
    private ArrayList<String> registros;

    public Modelo() {
        accesoPermitido = false;
        registros = new ArrayList<>();
    }

    public void permitirAcceso() {
        accesoPermitido = true;
        registrar("Acceso permitido");
    }

    public void denegarAcceso() {
        accesoPermitido = false;
        registrar("Acceso denegado");
    }

    public boolean isAccesoPermitido() {
        return accesoPermitido;
    }

    private void registrar(String mensaje) {
        registros.add(mensaje);
    }

    public ArrayList<String> getRegistros() {
        return registros;
    }
}
package Modelo;
import java.util.ArrayList;
import java.util.Random;

public class SensorMovimientoModelo {
    private boolean activo;
    private ArrayList<String> registros;

    public SensorMovimientoModelo() {
        activo = false;
        registros = new ArrayList<>();
    }

    public boolean detectarMovimiento() {
        Random random = new Random();
        return random.nextBoolean();
    }

    public void registrar(String mensaje) {
        registros.add(mensaje);
    }

    public ArrayList<String> getRegistros() {
        return registros;
    }

    public void activar() {
        activo = true;
    }

    public void desactivar() {
        activo = false;
    }

    public boolean isActivo() {
        return activo;
    }  
}
package reservasmvc;
import Controlador.ControladorReservas;
import Vista.VistaReservas;

public class ReservasMVC {

    public static void main(String[] args) {
        ControladorReservas controlador = new ControladorReservas(3, 10);
        VistaReservas vista = new VistaReservas();

       controlador.menu();
    }
}
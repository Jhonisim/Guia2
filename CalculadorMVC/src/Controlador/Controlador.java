package Controlador;
import Modelo.Calculadora;
import Vista.VistaCalculadora;

public class Controlador {
    private Calculadora calculadora;
    private VistaCalculadora vista;

    public Controlador() {
        calculadora = new Calculadora();
        vista = new VistaCalculadora();
    }

    public void iniciar() {
        while (true) {
            try {
                double num1 = vista.solicitarNumero("Ingrese el primer número: ");
                double num2 = vista.solicitarNumero("Ingrese el segundo número: ");
                String operacion = vista.solicitarOperacion();
                double resultado;

                switch (operacion) {
                    case "+":
                        resultado = calculadora.sumar(num1, num2);
                        break;
                    case "-":
                        resultado = calculadora.restar(num1, num2);
                        break;
                    case "*":
                        resultado = calculadora.multiplicar(num1, num2);
                        break;
                    case "/":
                        resultado = calculadora.dividir(num1, num2);
                        break;
                    default:
                        vista.mostrarMensaje("Operación no válida.");
                        continue;
                }

                vista.mostrarResultado(resultado);
                vista.mostrarResultados(calculadora.getResultados());

                String continuar = vista.solicitarContinuar();
                if (!continuar.equalsIgnoreCase("s")) {//Si el usuario ingresa "S" o "s", el método devuelve true, pero la negación lo convierte en false, y el bloque if no se eyecuta
                    break;
                }
            } catch (Exception e) {
                vista.mostrarMensaje("Error: " + e.getMessage());
            }
        }}
}
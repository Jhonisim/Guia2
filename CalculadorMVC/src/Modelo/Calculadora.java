package Modelo;
import java.util.ArrayList;

public class Calculadora {
     private ArrayList<Double> resultados;

    public Calculadora() {
        resultados = new ArrayList<>();
    }

    public double sumar(double a, double b) {
        double resultado = a + b;
        resultados.add(resultado);
        return resultado;
    }

    public double restar(double a, double b) {
        double resultado = a - b;
        resultados.add(resultado);
        return resultado;
    }

    public double multiplicar(double a, double b) {
        double resultado = a * b;
        resultados.add(resultado);
        return resultado;
    }

    public double dividir(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("División por cero no permitida");//Lanzado cuando se ha producido una condición aritmética excepcional. Para ejemplo, un número entero "dividido por cero" lanza un instancia de esta clase.
            // osea sirve para manejar la excepcion de la division por cero.
        }
        double resultado = a / b;
        resultados.add(resultado);
        return resultado;
    }

    public ArrayList<Double> getResultados() {
        return resultados;
    }
}
package org.ua;

public class Calculadora {


    private double valor;

    public double getValor(int valor) {
        return valor;
    }

    public int somar (double a, double b) {

        return (int) (a + b);
    }

    public int subtrair (double a, double b) {

        return (int) (a - b);
    }

    public int multiplicar (double a, double b) {

        return (int) (a * b);
    }

    public int dividir (double a, double b) {

        return (int) (a / b);
    }

}

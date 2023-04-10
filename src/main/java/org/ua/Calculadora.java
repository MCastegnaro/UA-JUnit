package org.ua;

public class Calculadora {

    public double somar (double value1, double value2) {
        return value1 + value2;
    }

    public double subtrair (double value1, double value2) {
        return value1 - value2;
    }

    public double dividir (double value1, double value2) {
        if(value2 == 0) {
            throw new RuntimeException("Chave nao pode ser zero");
        } else {
            return value1 / value2;
        }

    }

    public double multiplicar (double value1, double value2) {
        return value1 * value2;
    }


}

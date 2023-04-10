package org.ua;

public class Main {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        calculadora.somar(-50.23, -30.51);
        System.out.println("Resultado da soma -> "  + calculadora.getResultado());

        calculadora.subtrair(10, -30.51);
        System.out.println("Resultado da subtraçao -> " + calculadora.getResultado());

        calculadora.dividir(10, 2);
        System.out.println("Resultado da diviçao -> " + calculadora.getResultado());

        calculadora.multiplicar(-10, 10);
        System.out.println("Resultado da mulriplicaçao -> " + calculadora.getResultado());

    }
}

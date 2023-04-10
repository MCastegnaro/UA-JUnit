package org.ua;

/*
*
* Criar uma classe chamada calculadora, com os seguintes métodos:
* - Somar
* - Subtrair
* - Dividir
* - Multiplicar
*
* Em seguida criar uma classe de teste chamada CalculadoraTest para cobrir
* as funcionalidades da classe.
*
* Entrega: Criar uma branch seguindo o padrão "ua-seunome-seusobrenome". Criar um pull request para branch "entrega-01"
*
* */
public class Calculadora {
    private double resultado;

    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }

    public double somar(double a, double b) {
        return this.resultado = a + b;
    }

    public double subtrair(double a, double b) {
        return this.resultado = a - b;
    }

    public double dividir(double a, double b) {
        return this.resultado = a / b;
    }

    public double multiplicar(double a, double b) {
        return this.resultado = a * b;
    }
}

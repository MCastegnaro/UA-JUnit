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

    public double getValor(double valor) {
        return valor;
    }
    public int soma(double valueA, double valueB) {
        return (int) (valueA + valueB);
    }

    public int subtracao(double valueA, double valueB) {
        return (int) (valueA - valueB);
    }

    public int divisao(double valueA, double valueB) {
        return (int) (valueA / valueB);
    }

    public int multiplicacao(double valueA, double valueB) {
        return (int) (valueA * valueB);
    }

}
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
    public int somar(int num1, int num2) {
        return num1 + num2;
    }

    public int subtrair(int num1, int num2) {
        return num1 - num2;
    }

    public int dividir(int num1, int num2) {
        if (num2 == 0) {
            throw new ArithmeticException("Não é possível dividir por zero.");
        }
        return num1 / num2;
    }

    public int multiplicar(int num1, int num2) {
        return num1 * num2;
    }
}

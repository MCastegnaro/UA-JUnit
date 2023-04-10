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

    public double soma(double a, double b){
        return a + b;
    }

    public double subtracao(double a, double b){
        return a - b;
    }

    public double divisao(double a, double b){
        if(b == 0)
            throw new ArithmeticException("Can not divide by zero");
        return a / b;
    }

    public double multiplicacao(double a, double b){
        return a * b;
    }
}

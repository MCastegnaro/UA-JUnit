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
* oi
* */
public class Calculadora {

    public double somar(double numero1, double numero2){
        return numero1 + numero2;
    }

    public int divisao(int numero1, int numero2){
        return numero1 / numero2;
    }

    public double subtracao(double numero1, double numero2){
        return numero1 - numero2;
    }

    public double multiplicacao(double numero1, double numero2){
        return numero1 * numero2;
    }
}

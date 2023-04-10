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
    public double Somar(double n1, double n2){
        return n1+n2;
    }

    public double Subtrair(double n1, double n2){
        return n1-n2;
    }

    public double Multiplicar(double n1, double n2){
        return n1*n2;
    }

    public double Dividir(double n1, double n2){
        if(n2 == 0){
            throw new ArithmeticException("Cannot divide by zero!");
        }
        return n1/n2;
    }
}

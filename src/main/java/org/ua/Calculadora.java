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
    private double numero1;
    private double numero2;
    private double resultado;

    public double getResultado(){
        return  this.resultado;
    }

    public double somar(double numero1, double numero2){
        resultado = numero1 + numero2;
        return resultado;

    }

    public double subtrair(double numero1, double numero2){
        resultado = numero1 - numero2;
        return resultado;
    }

    public double dividir(double numero1, double numero2){
        resultado = numero1 / numero2;
        return resultado;
    }

    public double multiplicar(double numero1, double numero2){
        resultado = numero1 * numero2;
        return resultado;
    }

}

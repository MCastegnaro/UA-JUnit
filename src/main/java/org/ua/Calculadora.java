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
    public double soma;

    public double subtracao;

    public double divisao;

    public double multiplicacao;

    public void somar(double valor1, double valor2){
        if(valor1 < 0 || valor2 < 0){
            throw new RuntimeException("Não da pra somar número negativo");
        }else{
            this.soma = valor1 + valor2;
        }}

    public void multiplicar(double valor1, double valor2){
        if(valor1 < 0 || valor2 < 0){
            throw new RuntimeException("Não da pra multiplicar com número negativo");
        }else {
            this.multiplicacao = valor1 * valor2;
        }
    }


    public void dividir(double valor1, double valor2){
        if(valor1 < 0 || valor2 < 0) {
            throw new RuntimeException("Não da para dividir números negativos");
        }else{
            this.divisao = valor1 / valor2;
        }

    }


    public void subtrair(double valor1, double valor2){
        if(valor1 < 0 || valor2 < 0){
            throw new RuntimeException("Não da para subtrair números negativos");
        }else{
            this.subtracao = valor1 - valor2;
        }
    }


}
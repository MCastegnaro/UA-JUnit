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
    private double soma;

    private double subtracao;

    private double divisao;

    private double multiplicacao;

    public double somar(double valor1, double valor2){

        this.soma = valor1 + valor2;
        return  this.soma;
    }

    public double multiplicar(double valor1, double valor2){

        this.multiplicacao = valor1 * valor2;
        return multiplicacao;
    }


    public double  dividir(double valor1, double valor2){
        if (valor2 == 0) {
            throw new RuntimeException("Não é possível dividir por 0");
        }else{
            this.divisao = valor1 / valor2;
            return this.divisao;
        }
    }


    public double subtrair(double valor1, double valor2){

        this.subtracao = valor1 - valor2;
        return this.subtracao;
    }


}


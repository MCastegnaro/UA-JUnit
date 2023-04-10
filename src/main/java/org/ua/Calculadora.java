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
    private double subtrai;
    private double divide;
    private double multiplica;

    public double somar(double valorUm, double valorDois){
        this.soma = valorUm + valorDois;
        return this.soma;
    }

    public double subtrair(double valorUm, double valorDois){
        this.subtrai = valorUm - valorDois;
        return this.subtrai;
    }

    public double dividir(double valorUm, double valorDois){
        if (valorDois != 0){
            this.divide = valorUm / valorDois;
            return this.divide;
        } else {
            throw new RuntimeException("Não é possível dividir por zero");
        }
    }

    public double multiplicar(double valorUm, double valorDois){
        this.multiplica = valorUm * valorDois;
        return this.multiplica;
    }

}

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


    public double dividir(double num1, double num2){
        if(num2==0){
            // operação aritmética é inválida
            throw new ArithmeticException("Nunhum numero pode ser divisivel por zero");
        }

        return num1/num2;
    }

    public  double somar(double num1, double num2){
        return num1+num2;
    }

    public  double subtracao(double num1, double num2){
        return num1-num2;
    }

    public  double multiplicacao(double num1, double num2){
                return num1*num2;
    }






}

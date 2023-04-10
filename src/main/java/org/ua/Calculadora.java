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
    private double resultado;

    public double getResultado() {
        return resultado;
    }

    public void Somar(double valorPrimario, double valorSegundario){

        resultado = valorPrimario + valorSegundario;
        if (valorPrimario < 0 || valorSegundario < 0 || valorPrimario >=+10){
            throw new RuntimeException("Formato númerico invalido, insira os parênteses para realizar esta conta");
        }

    }

    public void Subtrair(double valorPrimario, double valorSegundario){
        resultado = valorPrimario - valorSegundario;
        if (valorPrimario < valorSegundario){
            if(resultado <=0){
                System.out.println("Valor subtraido com sucesso, resultado da conta: " + resultado);
            }else {
                throw new RuntimeException("Erro no calculo de subtração com valorPrimario menor que Segundario");
            }
        }

        if (valorPrimario < 0 || valorSegundario < 0){
            throw new RuntimeException("Formato númerico invalido, insira os parênteses para realizar esta conta");
        }

    }

    public  void Dividir(double valorPrimario, double valorSegundario){
        resultado = valorPrimario / valorSegundario;
    }

    public void Multiplicar(double valorPrimario, double valorSegundario){
        resultado = valorPrimario * valorSegundario;
    }


}

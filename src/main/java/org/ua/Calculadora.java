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

    private double resultadoSomar;
    private double resultadoSubtrair;
    private double resultadoMultiplicar;
    private double resultadoDividir;
    public void somar(double valor1, double valor2){
        resultadoSomar = valor1 + valor2;
    }

    public void subtrair(double valor1, double valor2){
        resultadoSubtrair = valor1 - valor2;
    }

    public void multiplicar(double valor1, double valor2){
        resultadoMultiplicar = valor1 * valor2;
    }

    public void dividir(double valor1, double valor2){
        resultadoDividir = valor1 / valor2;
    }

    public double getResultadoSoma() {
        return resultadoSomar;
    }

    public double getResultadoSubtrair(){
        return resultadoSubtrair;
    }

    public double getResultadoMultiplicar(){
        return resultadoMultiplicar;
    }

    public double getResultadoDividir(){
        return resultadoDividir;
    }
}

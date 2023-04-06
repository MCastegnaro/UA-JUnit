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
    public double resultado;
    public double getResultado() {
        return resultado;
    }

    public void somar (double var1, double var2){
        resultado = var1 + var2;
    }

    public void subtrair (double var1, double var2){
        resultado = var1 - var2;
    }

    public void dividir (double var1, double var2){
        resultado = var1 / var2;
    }

    public void multiplicar (double var1, double var2){
        resultado = var1 * var2;
    }
}

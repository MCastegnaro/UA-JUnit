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
    public double soma(double n1, double n2){
        return n1+n2;
    }
    public double subtracao(double n1, double n2){
        return n1-n2;
    }
    public double divisao(double n1, double n2){
        if(n2 != 0) {
            return n1/n2;
        }else{
            throw new ArithmeticException("divisão por zero não é possivel");
        }
    }
    public double produto(double n1, double n2){
        return n1 * n2;
    }

}

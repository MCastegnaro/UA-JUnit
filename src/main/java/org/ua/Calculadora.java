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

    public double somar(double n1, double n2) { return (n1 + n2);}

    public double subtrair(double n1, double n2){
        return (n1 - n2);
    }

    public double multiplicar(double n1, double n2){
        return (n1 * n2);
    }

    public double dividir(double n1, double n2) {
            if (n2 != 0) {
                return (n1 / n2);
            } else {
                throw new RuntimeException("Não pode ser feita divisão por zero");
            }
    }

    public double raizQuadrada(double n1){return Math.sqrt(n1);}
    public double potencia(double n1, double n2){return Math.pow(n1,n2);}

}




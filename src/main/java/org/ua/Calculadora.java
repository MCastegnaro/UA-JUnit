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
    public int Somar(int numero1, int numero2){
        if (numero1 + numero2 < 2147483647) {
            return numero1 + numero2;
        }
        else throw new RuntimeException("Passou do limite maximo da variavel int");
    }


    public int Subtrair(int numero1, int numero2){
        return numero1-numero2;
    }
    public int Dividir(int numero1, int numero2){
        if(numero2!=0) {
            return numero1 / numero2;
        }
        else  {
            throw new RuntimeException("Não pode dividir por zero");
        }
    }

    public int Multiplicar(int numero1, int numero2){
        return numero1*numero2;
    }

}

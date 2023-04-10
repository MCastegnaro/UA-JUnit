package org.ua;
import java.io.*;
import java.util.*;
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

    public double somar(LinkedList<Double> numbers){
        double result;
        result = numbers.remove(0);
        for (double number: numbers){
            result += number;
        }

        return result;
    }

    public double subtrair(LinkedList<Double> numbers){
        double result;
        result = numbers.remove(0);
        for (double number: numbers){
            result -= number;
        }

        return result;
    }

    public double multiplicar(LinkedList<Double> numbers){
        double result;
        result = numbers.remove(0);
        for (double number: numbers){
            result *= number;
        }

        return result;
    }

    public double dividir(LinkedList<Double> numbers){
        double result;
        result = numbers.remove(0);
        for (double number: numbers){
            result /= number;
        }

        return result;
    }


}

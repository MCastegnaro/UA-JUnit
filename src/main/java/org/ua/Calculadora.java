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

    public double somar(double a, double b) {
        return a + b;
    }
    public double subtrair(double a, double b) {
        return a - b;
    }
    public double multiplicar(double a, double b) {
        if (a < 0 || b < 0){
            return a * b;
        }else{
            throw new RuntimeException("Ambos os valores devem ser negativos");
        }
    }
    public double dividir(double a, double b) {
        if (b != 0){
            return a / b;
        }else {
            throw new RuntimeException("Não pode dividir por 0");
        }
    }
}

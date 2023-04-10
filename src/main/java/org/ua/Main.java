package org.ua;

public class Main {
    public static void main(String[] args) {
        /*Conta conta = new Conta();

        conta.ativar();
        conta.depositar(100.0);
        System.out.println("Valor atual da conta: " + conta.getSaldo());

        conta.sacar(70);

        conta.inativar();
        conta.depositar(50.0);
        System.out.println("Valor atual da conta: " + conta.getSaldo());
        */

        Calculadora calculadora = new Calculadora();
        calculadora.somar(5,5);
        System.out.println("A soma eh:  " + calculadora.getResultadoSoma());
        calculadora.subtrair(10,5);
        System.out.println("A substracao eh: " + calculadora.getResultadoSubtrair());
        calculadora.multiplicar(5,5);
        System.out.println("A multiplicacao eh: " + calculadora.getResultadoMultiplicar());
        calculadora.dividir(10,2);
        System.out.println("A divisao eh: " + calculadora.getResultadoDividir());
    }
}

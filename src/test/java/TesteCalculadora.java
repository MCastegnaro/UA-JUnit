import org.junit.jupiter.api.*;
import org.ua.Calculadora;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TesteCalculadora {
    private final Calculadora calculadora = new Calculadora();

    private static double valorA;
    private static double valorB;

    //Soma
    //------------------------------------------------------------------------------------------------------------------
    @Test
    @DisplayName("Soma de zero e zero")
    @Tag("Soma")
    public void zeroPlusZero(){
        valorA = 0;
        valorB = 0;

        assertEquals((valorA + valorB), this.calculadora.soma(valorA, valorB));
    }

    @Test
    @DisplayName("Soma de um numero inteiro positivo e zero")
    @Tag("Soma")
    public void naturalNumberPlusZero(){
        valorA = 10;
        valorB = 0;

        assertEquals((valorA + valorB), this.calculadora.soma(valorA, valorB));
    }

    @Test
    @DisplayName("Soma de zero e um numero inteiro positivo")
    @Tag("Soma")
    public void zeroPlusNaturalNumber(){
        valorA = 0;
        valorB = 10;

        assertEquals((valorA + valorB), this.calculadora.soma(valorA, valorB));
    }

    @Test
    @DisplayName("Soma de um numero inteiro negativo e zero")
    @Tag("Soma")
    public void negativeNumberPlusZero(){
        valorA = -10;
        valorB = 0;

        assertEquals((valorA + valorB), this.calculadora.soma(valorA, valorB));
    }

    @Test
    @DisplayName("Soma de zero e um numero inteiro negativo")
    @Tag("Soma")
    public void zeroPlusNegativeNumber(){
        valorA = 0;
        valorB = -10;

        assertEquals((valorA + valorB), this.calculadora.soma(valorA, valorB));
    }

    @Test
    @DisplayName("Soma de dois numeros inteiros positivos")
    @Tag("Soma")
    public void naturalNumberPlusNaturalNumber(){
        valorA = 10;
        valorB = 400;

        assertEquals((valorA + valorB), this.calculadora.soma(valorA, valorB));
    }

    @Test
    @DisplayName("Soma de um numero inteiro negativo e um positivo ")
    @Tag("Soma")
    public void positiveNumberPlusNegativeNumber(){
        valorA = -30;
        valorB = 90;

        assertEquals((valorA + valorB), this.calculadora.soma(valorA, valorB));
    }

    @Test
    @DisplayName("Soma de um numero inteiro positivo e um negativo")
    @Tag("Soma")
    public void negativeNumberPlusPositiveNumber(){
        valorA = 30;
        valorB = -90;

        assertEquals((valorA + valorB), this.calculadora.soma(valorA, valorB));
    }

    @Test
    @DisplayName("Soma de dois numeros inteiros negativos")
    @Tag("Soma")
    public void negativeNumberPlusNegativeNumber(){
        valorA = -30;
        valorB = -90;

        assertEquals((valorA + valorB), this.calculadora.soma(valorA, valorB));
    }

    @Test
    @DisplayName("Soma de dois numeros decimais negativos")
    @Tag("Soma")
    public void decimalNegativeNumberPlusDecimalNegativeNumber(){
        valorA = -30.8;
        valorB = -90.423;

        assertEquals((valorA + valorB), this.calculadora.soma(valorA, valorB));
    }

    @Test
    @DisplayName("Soma de dois numeros decimais positivos")
    @Tag("Soma")
    public void decimalPositiveNumberPlusDecimalPositiveNumber(){
        valorA = 30.8;
        valorB = 90.423;

        assertEquals((valorA + valorB), this.calculadora.soma(valorA, valorB));
    }

    @Test
    @DisplayName("Soma de um numero decimal positivo e um numero decimal negativo")
    @Tag("Soma")
    public void decimalPositiveNumberPlusDecimalNegativeNumber(){
        valorA = 30.8;
        valorB = -90.423;

        assertEquals((valorA + valorB), this.calculadora.soma(valorA, valorB));
    }

    @Test
    @DisplayName("Soma de um numero decimal negativo e um numero decimal positivo")
    @Tag("Soma")
    public void decimalNegativeNumberPlusDecimalPositiveNumber(){
        valorA = -30.8;
        valorB = 90.423;

        assertEquals((valorA + valorB), this.calculadora.soma(valorA, valorB));
    }

    //Subtracao
    //------------------------------------------------------------------------------------------------------------------

    @Test
    @DisplayName("Subtracao de zero e zero")
    @Tag("Subtracao")
    public void zeroMinusZero(){
        valorA = 0;
        valorB = 0;

        assertEquals((valorA - valorB), this.calculadora.subtracao(valorA, valorB));
    }

    @Test
    @DisplayName("Subtracao de um numero inteiro positivo e zero")
    @Tag("Subtracao")
    public void naturalNumberMinusZero(){
        valorA = 10;
        valorB = 0;

        assertEquals((valorA - valorB), this.calculadora.subtracao(valorA, valorB));
    }

    @Test
    @DisplayName("subtracao de zero e um numero inteiro positivo")
    @Tag("Subtracao")
    public void zeroMinusNaturalNumber(){
        valorA = 0;
        valorB = 10;

        assertEquals((valorA - valorB), this.calculadora.subtracao(valorA, valorB));
    }

    @Test
    @DisplayName("subtracao de um numero inteiro negativo e zero")
    @Tag("Subtracao")
    public void negativeNumberMinusZero(){
        valorA = -10;
        valorB = 0;

        assertEquals((valorA - valorB), this.calculadora.subtracao(valorA, valorB));
    }

    @Test
    @DisplayName("subtracao de zero e um numero inteiro negativo")
    @Tag("Subtracao")
    public void zeroMinusNegativeNumber(){
        valorA = 0;
        valorB = -10;

        assertEquals((valorA - valorB), this.calculadora.subtracao(valorA, valorB));
    }

    @Test
    @DisplayName("subtracao de dois numeros inteiros positivos")
    @Tag("Subtracao")
    public void naturalNumberMinusNaturalNumber(){
        valorA = 10;
        valorB = 400;

        assertEquals((valorA - valorB), this.calculadora.subtracao(valorA, valorB));
    }

    @Test
    @DisplayName("subtracao de um numero inteiro negativo e um positivo ")
    @Tag("Subtracao")
    public void positiveNumberMinusNegativeNumber(){
        valorA = -30;
        valorB = 90;

        assertEquals((valorA - valorB), this.calculadora.subtracao(valorA, valorB));
    }

    @Test
    @DisplayName("subtracao de um numero inteiro positivo e um negativo")
    @Tag("Subtracao")
    public void negativeNumberMinusPositiveNumber(){
        valorA = 30;
        valorB = -90;

        assertEquals((valorA - valorB), this.calculadora.subtracao(valorA, valorB));
    }

    @Test
    @DisplayName("subtracao de dois numeros inteiros negativos")
    @Tag("Subtracao")
    public void negativeNumberMinusNegativeNumber(){
        valorA = -30;
        valorB = -90;

        assertEquals((valorA - valorB), this.calculadora.subtracao(valorA, valorB));
    }

    @Test
    @DisplayName("subtracao de dois numeros decimais negativos")
    @Tag("Subtracao")
    public void decimalNegativeNumberMinusDecimalNegativeNumber(){
        valorA = -30.8;
        valorB = -90.423;

        assertEquals((valorA - valorB), this.calculadora.subtracao(valorA, valorB));
    }

    @Test
    @DisplayName("subtracao de dois numeros decimais positivos")
    @Tag("Subtracao")
    public void decimalPositiveNumberMinusDecimalPositiveNumber(){
        valorA = 30.8;
        valorB = 90.423;

        assertEquals((valorA - valorB), this.calculadora.subtracao(valorA, valorB));
    }

    @Test
    @DisplayName("subtracao de um numero decimal positivo e um numero decimal negativo")
    @Tag("Subtracao")
    public void decimalPositiveNumberMinusDecimalNegativeNumber(){
        valorA = 30.8;
        valorB = -90.423;

        assertEquals((valorA - valorB), this.calculadora.subtracao(valorA, valorB));
    }

    @Test
    @DisplayName("subtracao de um numero decimal negativo e um numero decimal positivo")
    @Tag("Subtracao")
    public void decimalNegativeNumberMinusDecimalPositiveNumber(){
        valorA = -30.8;
        valorB = 90.423;

        assertEquals((valorA - valorB), this.calculadora.subtracao(valorA, valorB));
    }

    //Divisao
    //------------------------------------------------------------------------------------------------------------------

    @Test
    @DisplayName("divisao de zero e zero")
    @Tag("divisao")
    public void zeroDividedZero(){
        valorA = 0;
        valorB = 0;

        Throwable exception = assertThrows(ArithmeticException.class, () -> this.calculadora.divisao(valorA, valorB));
        assertEquals("Can not divide by zero", exception.getMessage());
    }

    @Test
    @DisplayName("divisao de um numero inteiro positivo e zero")
    @Tag("divisao")
    public void naturalNumberDividedZero(){
        valorA = 10;
        valorB = 0;

        Throwable exception = assertThrows(ArithmeticException.class, () -> this.calculadora.divisao(valorA, valorB));
        assertEquals("Can not divide by zero", exception.getMessage());
    }

    @Test
    @DisplayName("divisao de zero e um numero inteiro positivo")
    @Tag("divisao")
    public void zeroDividedNaturalNumber(){
        valorA = 0;
        valorB = 10;

        assertEquals((valorA / valorB), this.calculadora.divisao(valorA, valorB));
    }

    @Test
    @DisplayName("divisao de um numero inteiro negativo e zero")
    @Tag("divisao")
    public void negativeNumberDividedZero(){
        valorA = -10;
        valorB = 0;

        Throwable exception = assertThrows(ArithmeticException.class, () -> this.calculadora.divisao(valorA, valorB));
        assertEquals("Can not divide by zero", exception.getMessage());
    }

    @Test
    @DisplayName("divisao de zero e um numero inteiro negativo")
    @Tag("divisao")
    public void zeroDividedNegativeNumber(){
        valorA = 0;
        valorB = -10;

        assertEquals((valorA / valorB), this.calculadora.divisao(valorA, valorB));
    }

    @Test
    @DisplayName("divisao de dois numeros inteiros positivos")
    @Tag("divisao")
    public void naturalNumberDividedNaturalNumber(){
        valorA = 10;
        valorB = 400;

        assertEquals((valorA / valorB), this.calculadora.divisao(valorA, valorB));
    }

    @Test
    @DisplayName("divisao de um numero inteiro negativo e um positivo ")
    @Tag("divisao")
    public void positiveNumberDividedNegativeNumber(){
        valorA = -30;
        valorB = 90;

        assertEquals((valorA / valorB), this.calculadora.divisao(valorA, valorB));
    }

    @Test
    @DisplayName("divisao de um numero inteiro positivo e um negativo")
    @Tag("divisao")
    public void negativeNumberDividedPositiveNumber(){
        valorA = 30;
        valorB = -90;

        assertEquals((valorA / valorB), this.calculadora.divisao(valorA, valorB));
    }

    @Test
    @DisplayName("divisao de dois numeros inteiros negativos")
    @Tag("divisao")
    public void negativeNumberDividedNegativeNumber(){
        valorA = -30;
        valorB = -90;

        assertEquals((valorA / valorB), this.calculadora.divisao(valorA, valorB));
    }

    @Test
    @DisplayName("divisao de dois numeros decimais negativos")
    @Tag("divisao")
    public void decimalNegativeNumberDividedDecimalNegativeNumber(){
        valorA = -30.8;
        valorB = -90.423;

        assertEquals((valorA / valorB), this.calculadora.divisao(valorA, valorB));
    }

    @Test
    @DisplayName("divisao de dois numeros decimais positivos")
    @Tag("divisao")
    public void decimalPositiveNumberDividedDecimalPositiveNumber(){
        valorA = 30.8;
        valorB = 90.423;

        assertEquals((valorA / valorB), this.calculadora.divisao(valorA, valorB));
    }

    @Test
    @DisplayName("divisao de um numero decimal positivo e um numero decimal negativo")
    @Tag("divisao")
    public void decimalPositiveNumberDividedDecimalNegativeNumber(){
        valorA = 30.8;
        valorB = -90.423;

        assertEquals((valorA / valorB), this.calculadora.divisao(valorA, valorB));
    }

    @Test
    @DisplayName("divisao de um numero decimal negativo e um numero decimal positivo")
    @Tag("divisao")
    public void decimalNegativeNumberDividedDecimalPositiveNumber(){
        valorA = -30.8;
        valorB = 90.423;

        assertEquals((valorA / valorB), this.calculadora.divisao(valorA, valorB));
    }

    //Multiplicacao
    //------------------------------------------------------------------------------------------------------------------

    @Test
    @DisplayName("multiplicacao de zero e zero")
    @Tag("multiplicacao")
    public void zeroTimesZero(){
        valorA = 0;
        valorB = 0;

        assertEquals((valorA * valorB), this.calculadora.multiplicacao(valorA, valorB));
    }

    @Test
    @DisplayName("multiplicacao de um numero inteiro positivo e zero")
    @Tag("multiplicacao")
    public void naturalNumberTimesZero(){
        valorA = 10;
        valorB = 0;

        assertEquals((valorA * valorB), this.calculadora.multiplicacao(valorA, valorB));
    }

    @Test
    @DisplayName("multiplicacao de zero e um numero inteiro positivo")
    @Tag("multiplicacao")
    public void zeroTimesNaturalNumber(){
        valorA = 0;
        valorB = 10;

        assertEquals((valorA * valorB), this.calculadora.multiplicacao(valorA, valorB));
    }

    @Test
    @DisplayName("multiplicacao de um numero inteiro negativo e zero")
    @Tag("multiplicacao")
    public void negativeNumberTimesZero(){
        valorA = -10;
        valorB = 0;

        assertEquals((valorA * valorB), this.calculadora.multiplicacao(valorA, valorB));
    }

    @Test
    @DisplayName("multiplicacao de zero e um numero inteiro negativo")
    @Tag("multiplicacao")
    public void zeroTimesNegativeNumber(){
        valorA = 0;
        valorB = -10;

        assertEquals((valorA * valorB), this.calculadora.multiplicacao(valorA, valorB));
    }

    @Test
    @DisplayName("multiplicacao de dois numeros inteiros positivos")
    @Tag("multiplicacao")
    public void naturalNumberTimesNaturalNumber(){
        valorA = 10;
        valorB = 400;

        assertEquals((valorA * valorB), this.calculadora.multiplicacao(valorA, valorB));
    }

    @Test
    @DisplayName("multiplicacao de um numero inteiro negativo e um positivo ")
    @Tag("multiplicacao")
    public void positiveNumberTimesNegativeNumber(){
        valorA = -30;
        valorB = 90;

        assertEquals((valorA * valorB), this.calculadora.multiplicacao(valorA, valorB));
    }

    @Test
    @DisplayName("multiplicacao de um numero inteiro positivo e um negativo")
    @Tag("multiplicacao")
    public void negativeNumberTimesPositiveNumber(){
        valorA = 30;
        valorB = -90;

        assertEquals((valorA * valorB), this.calculadora.multiplicacao(valorA, valorB));
    }

    @Test
    @DisplayName("multiplicacao de dois numeros inteiros negativos")
    @Tag("multiplicacao")
    public void negativeNumberTimesNegativeNumber(){
        valorA = -30;
        valorB = -90;

        assertEquals((valorA * valorB), this.calculadora.multiplicacao(valorA, valorB));
    }

    @Test
    @DisplayName("multiplicacao de dois numeros decimais negativos")
    @Tag("multiplicacao")
    public void decimalNegativeNumberTimesDecimalNegativeNumber(){
        valorA = -30.8;
        valorB = -90.423;

        assertEquals((valorA * valorB), this.calculadora.multiplicacao(valorA, valorB));
    }

    @Test
    @DisplayName("multiplicacao de dois numeros decimais positivos")
    @Tag("multiplicacao")
    public void decimalPositiveNumberTimesDecimalPositiveNumber(){
        valorA = 30.8;
        valorB = 90.423;

        assertEquals((valorA * valorB), this.calculadora.multiplicacao(valorA, valorB));
    }

    @Test
    @DisplayName("multiplicacao de um numero decimal positivo e um numero decimal negativo")
    @Tag("multiplicacao")
    public void decimalPositiveNumberTimesDecimalNegativeNumber(){
        valorA = 30.8;
        valorB = -90.423;

        assertEquals((valorA * valorB), this.calculadora.multiplicacao(valorA, valorB));
    }

    @Test
    @DisplayName("multiplicacao de um numero decimal negativo e um numero decimal positivo")
    @Tag("multiplicacao")
    public void decimalNegativeNumberTimesDecimalPositiveNumber(){
        valorA = -30.8;
        valorB = 90.423;

        assertEquals((valorA * valorB), this.calculadora.multiplicacao(valorA, valorB));
    }
}
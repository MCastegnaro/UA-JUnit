import org.junit.jupiter.api.*;
import org.ua.Calculadora;
import org.ua.Conta;

import java.util.Arrays;
import java.util.LinkedList;

public class CalculadoraTest {
    private Calculadora calculadora;


    private static LinkedList<Double> zeros;

    private static LinkedList<Double> positiveNumbers;
    private static Double sumOfPositiveNumbers;
    private static Double subtractionOfPositiveNumbers;
    private static Double divisionOfPositiveNumbers;
    private static Double multiplicationOfPositiveNumbers;
    private static LinkedList<Double> negativeNumbers;
    private static Double sumOfNegativeNumbers;
    private static Double subtractionOfNegativeNumbers;
    private static Double divisionOfNegativeNumbers;
    private static Double multiplicationOfNegativeNumbers;


    @BeforeAll
    public static void definirValoresPadrao(){

        sumOfPositiveNumbers = 500.00;
        subtractionOfPositiveNumbers = -300.00;
        divisionOfPositiveNumbers = 0.0033115850614119707;
        multiplicationOfPositiveNumbers = 3019701.9899999998;

        sumOfNegativeNumbers = -500.00;
        subtractionOfNegativeNumbers = 296.03999999999996;
        divisionOfNegativeNumbers = -0.003421917992081069;
        multiplicationOfNegativeNumbers = -3039207.96;

    }

    @BeforeEach
    public void inicializarCalculadora(){
        calculadora = new Calculadora();
        negativeNumbers = new LinkedList<Double>(Arrays.asList(-101.98,-100.00,-298.02));
        positiveNumbers = new LinkedList<Double>(Arrays.asList(100.00,100.99,299.01));
        zeros = new LinkedList<Double>(Arrays.asList(0.0,0.0,0.0,0.0));

    }


    // SOMA
    @Test
    @DisplayName("deve somar numeros positivos corretamente")
    public void deveSomarNumerosPositivos(){
        double result = calculadora.somar(positiveNumbers);

        Assertions.assertEquals(result,sumOfPositiveNumbers);
    }

    @Test
    @DisplayName("deve somar numeros negativos corretamente")
    public void deveSomarNumerosNegativos(){
        double result = calculadora.somar(negativeNumbers);

        Assertions.assertEquals(result,sumOfNegativeNumbers);
    }

    @Test
    @DisplayName("deve somar zeros")
    public void deveSomarZeros(){
        double result = calculadora.somar(zeros);

        Assertions.assertEquals(result,0.0);
    }


    // SUBTRACAO
    @Test
    @DisplayName("deve subtrair numeros positivos corretamente")
    public void deveSubtrairNumerosPositivos(){
        double result = calculadora.subtrair(positiveNumbers);

        Assertions.assertEquals(result,subtractionOfPositiveNumbers);
    }

    @Test
    @DisplayName("deve subtrair numeros negativos corretamente")
    public void deveSubtrairNumerosNegativos(){
        double result = calculadora.subtrair(negativeNumbers);

        Assertions.assertEquals(result,subtractionOfNegativeNumbers);
    }

    @Test
    @DisplayName("deve subtrair zeros")
    public void deveSubtrairZeros(){
        double result = calculadora.subtrair(zeros);

        Assertions.assertEquals(result,0.0);
    }


    // DIVIDIR
    @Test
    @DisplayName("deve dividir numeros positivos corretamente")
    public void deveDividirNumerosPositivos(){
        double result = calculadora.dividir(positiveNumbers);

        Assertions.assertEquals(result,divisionOfPositiveNumbers);
    }

    @Test
    @DisplayName("deve dividir numeros negativos corretamente")
    public void deveDividirNumerosNegativos(){
        double result = calculadora.dividir(negativeNumbers);

        Assertions.assertEquals(result,divisionOfNegativeNumbers);
    }

    @Test
    @DisplayName("nao deve dividir por zeros")
    public void deveRetornarErroAoDividirZeros(){
        double result = calculadora.dividir(zeros);

        Assertions.assertTrue(Double.isNaN(result));
    }


    // MULTIPLICAR
    @Test
    @DisplayName("deve multiplicar numeros positivos corretamente")
    public void deveMultiplicarNumerosPositivos(){
        double result = calculadora.multiplicar(positiveNumbers);

        Assertions.assertEquals(result,multiplicationOfPositiveNumbers);
    }

    @Test
    @DisplayName("deve multiplicar numeros negativos corretamente")
    public void deveMultiplicarNumerosNegativos(){
        double result = calculadora.multiplicar(negativeNumbers);

        Assertions.assertEquals(result,multiplicationOfNegativeNumbers);
    }

    @Test
    @DisplayName("deve somar zeros")
    public void deveMultiplicarZeros(){
        double result = calculadora.multiplicar(zeros);

        Assertions.assertEquals(result,0.0);
    }


}

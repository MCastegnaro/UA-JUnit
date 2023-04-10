import org.junit.jupiter.api.*;
import org.ua.Calculadora;
import org.ua.Conta;

public class CalculadoraTest {

    private static Calculadora calculadora;
    private static double numberA;
    private static double numberB;

    @BeforeAll
    public static void definirValoresPadrao(){
        numberA = 110.0;
        numberB = 10.1;
    }

    @BeforeEach
    public void inicializarConta(){
        calculadora = new Calculadora();
    }

    @Test
    @DisplayName("Deve somar os números")
    public void deveSomarNumeros(){
        Assertions.assertEquals(numberA + numberB, calculadora.somar(numberA, numberB));
    }

    @Test
    @DisplayName("Deve subtrair os números")
    public void deveSubtrairNumeros(){
        Assertions.assertEquals(numberA - numberB, calculadora.subtrair(numberA, numberB));
    }

    @Test
    @DisplayName("Deve multiplicar os números")
    public void deveMultiplicarNumeros(){
        Assertions.assertEquals(numberA * numberB, calculadora.multiplicar(numberA, numberB));
    }

    @Test
    @DisplayName("Deve dividir os números")
    public void deveDividirNumeros(){
        Assertions.assertEquals(numberA / numberB, calculadora.dividir(numberA, numberB));
    }

    @Test
    @DisplayName("Deve somar e subtrair")
    public void deveSomarESubtrairNumeros(){
        double firstResult = calculadora.subtrair(numberA, numberB);
        double secondResult = calculadora.somar(firstResult, numberB);

        Assertions.assertEquals(numberA, secondResult);
    }


    @Test
    @DisplayName("Deve multiplicar e dividir")
    public void deveMultiplicarEDividirOsNumeros(){
        double firstResult = calculadora.dividir(numberA, numberB);
        double secondResult = calculadora.multiplicar(firstResult, numberB);

        Assertions.assertEquals(numberA, secondResult);
    }
}

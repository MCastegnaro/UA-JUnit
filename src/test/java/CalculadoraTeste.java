import org.junit.jupiter.api.*;
import org.ua.Calculadora;


public class CalculadoraTeste {

    private Calculadora calculadora;

    private static double value1;
    private static double value2;
    private static double minValue = 0;
    private static double maxValue = 100;


    @BeforeEach
    public void inicializarCalculadora(){
        calculadora = new Calculadora();
    }

    @BeforeAll
    public static void inicializarValores(){
        value1 = Math.floor(Math.random() * (maxValue - minValue + 1) + minValue);
        value2 = Math.floor(Math.random() * (maxValue - minValue + 1) + minValue);

    }

    @Test
    @DisplayName("Testar soma da calculadora")
    public void testeDeSoma (){
        inicializarCalculadora();

        Assertions.assertEquals(value1 + value2, calculadora.somar(value1, value2));
    }

    @Test
    @DisplayName("Testar subtracao da calculadora")
    public void testeDeSubtracao (){
        inicializarCalculadora();

        Assertions.assertEquals(value1 - value2, calculadora.subtrair(value1, value2));
    }

    @Test
    @DisplayName("Testar multiplicacao da calculadora")
    public void testeDeMultiplicacao (){
        inicializarCalculadora();

        Assertions.assertEquals(value1 * value2, calculadora.multiplicar(value1, value2));
    }

    @Test
    @DisplayName("Testar divisao da calculadora")
    public void testeDeDivisao (){
        inicializarCalculadora();

        Assertions.assertEquals(value1 / value2, calculadora.dividir(value1, value2));
    }

    @Test
    @DisplayName("Testar divisao da calculadora zero")
    public void testeDeDivisaoZero (){
        inicializarCalculadora();
        Assertions.assertThrows(RuntimeException.class, () -> calculadora.dividir(value1, 0));
    }
}

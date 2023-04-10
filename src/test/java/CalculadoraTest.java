import org.junit.jupiter.api.*;
import org.ua.Calculadora;

public class CalculadoraTest {
    public Calculadora calculadora;

    public static double valorA;
    public static double valorB;
    public static double valorC;
    public static double valorD;
    public static double valorE;
    public static double valorF;
    public static double resultadoSoma = 20.00;
    public static double resultadoSubtracao = 00.00;
    public static double resultadoMultiplicacao = 100.00;
    public static double resultadoMultiplicacaoDoisValoresNegativos = 100.00;
    public static double resultadoDivisao = 1.0;

    @BeforeAll
    public static void definirValoresPadrao(){
        valorA = 10.00;
        valorB = 10.00;
        valorC = 0.0;
        valorD = 10.00;
        valorE = -10.00;
        valorF = -10.00;
    }

    @BeforeEach
    public void inicializarCalculadora(){
        calculadora = new Calculadora();
    }

    @Test
    @DisplayName("A operação soma deve ser bem sucedida")
    public void deveSomar(){
        Assertions.assertEquals(resultadoSoma, calculadora.somar(valorA, valorB));
    }
    @Test
    @DisplayName("A operação subtrair deve ser bem sucedida")
    public void deveSubtrair(){
        Assertions.assertEquals(resultadoSubtracao, calculadora.subtrair(valorA, valorB));
    }

    @Test
    @DisplayName("A operação multiplicar deve ser bem sucedida")
    public void deveMultiplicar(){
        Assertions.assertEquals(resultadoMultiplicacao, calculadora.multiplicar(valorA, valorB));
    }

    @Test
    @DisplayName("Deve multiplicar dois valores negativos")
    public void deveMultiplicarDoisValoresNegativos(){
        Assertions.assertEquals(resultadoMultiplicacaoDoisValoresNegativos, calculadora.multiplicar(valorE, valorF));
    }

    @Test
    @DisplayName("A operação dividir deve ser bem sucedida")
    public void deveDividir(){
        Assertions.assertEquals(resultadoDivisao, calculadora.dividir(valorA, valorB));
    }

    @Test
    @DisplayName("Não pode dividir por zero")
    public void NaoDeveDividirPorZero(){
        Assertions.assertThrows(RuntimeException.class, () -> calculadora.dividir(valorA, valorC));
    }

}


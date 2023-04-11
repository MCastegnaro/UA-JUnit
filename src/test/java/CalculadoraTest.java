import org.junit.jupiter.api.*;
import org.ua.Calculadora;

public class CalculadoraTest {

    private static Calculadora calculadora;

    private static double valorA;

    private static double valorB;

    public static double valorC;

    @BeforeAll
    public static void definirValoresPadrao() {
        valorA = 10;
        valorB = 10;
        valorC = 10;
    }

    @BeforeEach
    public void inicializarCalculadora() {
        calculadora = new Calculadora();
    }

    @Test
    @DisplayName("Somar os valores")
    public void somarValores() {

        Assertions.assertEquals(20, calculadora.somar(valorA, valorB));
    }

    @Test
    @DisplayName("Subtrair os valores")
    public void subtrairValores() {

        Assertions.assertEquals(0, calculadora.subtrair(valorA, valorB));
    }

    @Test
    @DisplayName("Dividir os valores")
    public void dividirValores() {

        Assertions.assertEquals(1, calculadora.dividir(valorA, valorB));
    }

    @Test
    @DisplayName("Multiplicar os valores")
    public void multiplicarValores() {

        Assertions.assertEquals(100, calculadora.multiplicar(valorA, valorB));
    }

    @Test
    @DisplayName("Primeiro valor negativo somando com número positivo")
    public void valorNegativoSomandoComValorPositivo() {

        Assertions.assertEquals(0, calculadora.somar(-valorA, valorB));
    }

    @Test
    @DisplayName("Primeiro valor negativo somando com valor positivo")
    public void valorPositivoSomandoComValorNegativo() {

        Assertions.assertEquals(0, calculadora.somar(valorA, -valorB));
    }

    @Test
    @DisplayName("Primeiro valor positivo subtraindo com número negativo")
    public void valorPositivoSubtraindoComValorNegativo() {

        Assertions.assertEquals(20, calculadora.subtrair(valorA, -valorB));
    }

    @Test
    @DisplayName("Primeiro valor negativo subtraindo com número positivo")
    public void valorNegativoSubtraindoComValorPositivo() {

        Assertions.assertEquals(-20, calculadora.subtrair(-valorA, valorB));
    }

    @Test
    @DisplayName("Primeiro valor positivo multiplicando com número negativo")
    public void valorPositivoMultiplicandoComValorNegativo() {

        Assertions.assertEquals(-100, calculadora.multiplicar(valorA, -valorB));
    }

    @Test
    @DisplayName("Primeiro valor negativo multiplicando com número positivo")
    public void valorNegativoMultiplicandoComValorPositivo() {

        Assertions.assertEquals(-100, calculadora.multiplicar(-valorA, valorB));
    }

    @Test
    @DisplayName("Primeiro valor positivo dividindo com número negativo")
    public void valorPositivoDividindoComValorNegativo() {

        Assertions.assertEquals(-1, calculadora.dividir(valorA, -valorB));
    }

    @Test
    @DisplayName("Primeiro valor positivo dividindo com número negativo")
    public void valorNegativoDividindoComValorPositivo() {

        Assertions.assertEquals(-1, calculadora.dividir(-valorA, valorB));
    }

    @Test
    @DisplayName("Somar e subtrair os valores")
    public void somarESubtrairValores() {

        Assertions.assertEquals(10, calculadora.somarESubtrair(valorA, valorB, valorC));
    }

    @Test
    @DisplayName("Subtrair e somar os valores")
    public void subtrairESomarValores() {

        Assertions.assertEquals(10, calculadora.subtrairESomar(valorA, valorB, valorC));
    }

    @Test
    @DisplayName("Dividir valores por zero")
    public void dividirPorZero() {

        Assertions.assertThrows(RuntimeException.class, () -> calculadora.dividirPorZero(valorA, 0));
    }
}
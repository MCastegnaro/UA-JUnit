

import org.junit.jupiter.api.*;
import org.ua.Calculadora;

public class CalculadoraTest {

    private Calculadora calculadora;

    private static double valorValido;

    private static double numeroInvalido;

    @BeforeAll
    public static void definirValoresPadrao() {
        valorValido = 10.00;
        numeroInvalido = -10.00;
    }

    @BeforeEach
    public void inicializarCalculadora(){
        calculadora = new Calculadora();

    }

    @Test
    @DisplayName("Deve somar valores positivos!")
    public void deveSomarValoresPositivos() {
        calculadora.somar(valorValido, valorValido);

        Assertions.assertEquals(calculadora.soma, valorValido + valorValido);
    }

    @Test
    @DisplayName("Deve dividir valores positivos!")
    public void deveDividirValoresPositivos() {
        calculadora.dividir(valorValido, valorValido);

        Assertions.assertEquals(calculadora.divisao,valorValido / valorValido);
    }

    @Test
    @DisplayName("Deve multiplicar valores positivos!")
    public void deveMultiplicarValoresPositivos() {
        calculadora.multiplicar(valorValido, valorValido);

        Assertions.assertEquals(calculadora.multiplicacao,valorValido * valorValido);
    }

    @Test
    @DisplayName("Deve subtrair valores positivos!")
    public void deveSubtrairValoresPositivos() {
        calculadora.subtrair(valorValido, valorValido);

        Assertions.assertEquals(calculadora.divisao, valorValido - valorValido);
    }
}
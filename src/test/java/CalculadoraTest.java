import org.junit.jupiter.api.*;
import org.ua.Calculadora;

public class CalculadoraTest {
    private Calculadora calc;
    private static double valorPadraoDeTeste;
    private static double valorIndivisivel;
    private static double valorDivisivel;
    private static double esperado;
    private static double naoEsperado;
    private static double valorNegativo;
    private static double valorPosterior;
    private static double valorNeutro;
    private static boolean negativo;




    @BeforeAll
    public static void definirValoresPadrao(){
        valorPadraoDeTeste = 200.00;
        valorIndivisivel = 0.00;
        valorDivisivel = 2.00;
        esperado = 0.00;
        naoEsperado = 0.00;
        valorNegativo = -100.00;
        valorPosterior = 100.00;
        valorNeutro = 1.00;
        negativo = false;
    }

    @BeforeEach
    public void inicializarCalculadora(){
        calc = new Calculadora();
    }

    @Test
    @DisplayName("A calculadora nao deve deixar realizar a divisao caso o divisor seja igual a zero")
    public void naoDeveDividirPorZero(){
        Assertions.assertThrows(ArithmeticException.class, () -> calc.divisao(valorPadraoDeTeste,valorIndivisivel));
    }

    @Test
    @DisplayName("Deve realizar a divisao com sucesso caso o numero do divisor seja diferente de zero")
    public void deveDividirPorValorDiferenteDeZero(){
        esperado = valorPadraoDeTeste/valorDivisivel;

        Assertions.assertEquals(esperado, calc.divisao(valorPadraoDeTeste,valorDivisivel));
    }

    @Test
    @DisplayName("Deve realizar a divisao levando em conta que o primeiro valor inserido é o dividendo e o segundo é o divisor")
    public void deveDividirOPrimeiroValorPeloSegundo(){
        naoEsperado = valorPadraoDeTeste/valorDivisivel;

        Assertions.assertEquals(naoEsperado, calc.divisao(valorPadraoDeTeste,valorDivisivel));
    }

    @Test
    @DisplayName("Nao Deve realizar a divisao assumindo que o primeiro valor inserido seja o divisor e o segundo o dividendo")
    public void naoDeveDividirOSegundoValorPeloPrimeiro(){
        esperado = valorDivisivel/valorPadraoDeTeste;

        Assertions.assertNotEquals(esperado, calc.divisao(valorPadraoDeTeste,valorDivisivel));
    }

    @Test
    @DisplayName("Deve realizar a soma  com sucesso quando inseridos dois valores positivos")
    public void deveSomarOPrimeiroValorAoSegundo(){
        esperado = valorPadraoDeTeste+valorPosterior;

        Assertions.assertEquals(esperado, calc.soma(valorPadraoDeTeste,valorPosterior));
    }
    @Test
    @DisplayName("Na subtracao, caso o segundo valor seja negativo, ele deve ser somado ao primeiro como um positivo")
    public void naSubtracaoDeveSomarOSegundoValorCasoSejaNegativo(){
        esperado = valorPadraoDeTeste+Math.abs(valorNegativo);

        Assertions.assertEquals(esperado, calc.subtracao(valorPadraoDeTeste,valorNegativo));
    }

    @Test
    @DisplayName("Na multiplicacao, o valor do primeiro numero multiplicado pelo segundo, deve ser igual ao segundo numero multiplicado pelo primeiro")
    public void ordemDosFatoresNaoAlteraOProduto(){
        esperado = valorPadraoDeTeste*valorPosterior;

        Assertions.assertEquals(esperado, calc.produto(valorPosterior,valorPadraoDeTeste));
    }

    @Test
    @DisplayName("Na multiplicacao, caso qualquer um dos numeros inseridos seja neutro (1), a resposta deve ser igual ao outro numero inserido")
    public void multiplicarElementoNeutro(){
        Assertions.assertEquals(valorPadraoDeTeste, calc.produto(valorNeutro,valorPadraoDeTeste));
    }

    @Test
    @DisplayName("na multiplicacao entre dois numeros com sinais diferentes, independente da ordem de inserçao, deve resultar um numero negativo")
    public void multiplicarNumerosComSinaisDiferentesResultaEmNumeroNegativo(){
        if(calc.produto(valorPadraoDeTeste,valorNegativo) < 0 && calc.produto(valorNegativo,valorPadraoDeTeste) < 0){
            negativo = true;
        }
        Assertions.assertTrue(negativo);
    }

    @Test
    @DisplayName("na multiplicacao entre dois numeros com sinais iguais, independente da ordem de inserçao, deve resultar um numero positivo")
    public void multiplicarNumerosComSinaisIguaisResultaEmNumeroPositivo(){
        if(calc.produto(valorPadraoDeTeste,valorPosterior) > 0 && calc.produto(valorPosterior,valorPadraoDeTeste) > 0){
            negativo = false;
        }
        Assertions.assertFalse(negativo);
    }


}

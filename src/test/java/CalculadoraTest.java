import org.junit.jupiter.api.*;
import org.ua.Calculadora;

public class CalculadoraTest {

    private Calculadora calculadora;
    private static double valorA;
    private static double valorB;

    @BeforeAll
    public static void definirValoresPadrao(){
        valorA = 20;
        valorB = 4;
    }

    @BeforeEach
    public void inicializarCalculadora(){
        calculadora = new Calculadora();
    }

    @Test
    @DisplayName("Deve somar os dois valores pré-escritos")

    public void deveSomar(){
        calculadora.somar(valorA,valorB);

        Assertions.assertEquals(24 ,calculadora.somar(valorA, valorB));
    }
    @Test
    @DisplayName("Retornar um número negativo em soma, quando o maior numero é negativo")
    public void deveRetornarValorNegativoNaSoma(){
        calculadora.somar(-valorA, valorB);

        Assertions.assertEquals(-16 ,calculadora.somar(-valorA, valorB));
    }
    @Test
    @DisplayName("Retornar um número positivo em soma, quando o menor numero é negativo")
    public void DeveRetornarPositivoNaSoma(){
        calculadora.somar(valorA,-valorB);

        Assertions.assertEquals(16,calculadora.somar(valorA,-valorB));
    }
    @Test
    @DisplayName("Retornar um número negativo em soma, quando os dois numeros são negativos")
    public void DeveRetornarNegativoNaSoma(){
        calculadora.somar(-valorA,-valorB);

        Assertions.assertEquals(-24,calculadora.somar(-valorA,-valorB));
    }
    @Test
    @DisplayName("Qualquer Valor somado a 0, é o próprio valor")
    public void DeveRetornarValorUnicoSoma(){
        calculadora.somar(valorA, 0);

        Assertions.assertEquals(valorA,calculadora.somar(valorA,0));
    }
    @Test
    @DisplayName("Deve subtrair os dois valores pré-escritos")
    public void deveSubtrair(){
        calculadora.subtrair(valorA, valorB);

        Assertions.assertEquals(16,calculadora.subtrair(valorA, valorB));
    }
    @Test
    @DisplayName("Em uma subtracao, quando o valor maior for negativo, mantém o sinal e soma os numeros")
    public void retornarValorNegativoNaSubtracao(){
        calculadora.subtrair(-valorA,valorB);

        Assertions.assertEquals(-24,calculadora.subtrair(-valorA, valorB));
    }
    @Test
    @DisplayName("Em uma subtracao, quando o valor menor for negativo, inverte o sinal do menor e soma os numeros")
    public void retornarValorPositivoNaSubtracao(){
        calculadora.subtrair(valorA, -valorB);

        Assertions.assertEquals(24, calculadora.subtrair(valorA,-valorB));
    }
    @Test
    @DisplayName("Em uma subtracao, quando dois valores são negativos, será subtraido os valores, e retornara uma valor negativo")
    public void retornarValorPositivoEmSubtracao(){
        calculadora.subtrair(-valorA, -valorB);

        Assertions.assertEquals(-16, calculadora.subtrair(-valorA,-valorB));
    }
    @Test
    @DisplayName("ualquer Valor somado a 0, é o próprio valor")
    public void retornarValorUnicoSubtração(){
        calculadora.subtrair(valorA, 0);

        Assertions.assertEquals(valorA,calculadora.subtrair(valorA,0));
    }
    @Test
    @DisplayName("Deve multiplicar os dois valores pré-escritos")
    public void deveMultiplicar(){
        calculadora.multiplicar(valorA, valorB);

        Assertions.assertEquals(80 ,calculadora.multiplicar(valorA, valorB));
    }
    @Test
    @DisplayName("Multiplicação com um dos valores negativos, retorna valor negativo")
    public void deveRetornarValorNegativoMenor(){
        calculadora.multiplicar(valorA, -valorB);

        Assertions.assertEquals(-80 ,calculadora.multiplicar(valorA, -valorB));
    }
    @Test
    @DisplayName("Multiplicação com um dos valores negativos, retorna valor negativo")
    public void deveRetornarValorNegativoMaior(){
        calculadora.multiplicar(-valorA, valorB);

        Assertions.assertEquals(-80 ,calculadora.multiplicar(valorA, -valorB));
    }
    @Test
    @DisplayName("Multiplicação com os dois valores negativos, retorna valor positivo")
    public void deveRetornarValorPositivo(){
        calculadora.multiplicar(-valorA, -valorB);

        Assertions.assertEquals(80 ,calculadora.multiplicar(-valorA, -valorB));
    }
    @Test
    @DisplayName("Retornar 0 quando em uma multiplicação tiver 0")
    public void retornarZeroNaMultiplicacao(){
        calculadora.multiplicar(0,valorB);

        Assertions.assertEquals(0, calculadora.multiplicar(0,valorB));
    }
    @Test
    @DisplayName("Deve dividir os dois valores pré-escritos")
    public void deveDividir(){
        calculadora.divisao(valorA, valorB);

        Assertions.assertEquals(5, calculadora.divisao(valorA, valorB));
    }
    @Test
    @DisplayName("Divisão com um dos valores negativos, retorna valor negativo")
    public void deveDividirNegativoMaior(){
        calculadora.divisao(-valorA, valorB);

        Assertions.assertEquals(-5, calculadora.divisao(-valorA, valorB));
    }
    @Test
    @DisplayName("Divisão com um dos valores negativos, retorna valor negativo")
    public void deveDividirNegativoMenor(){
        calculadora.divisao(valorA, -valorB);

        Assertions.assertEquals(-5, calculadora.divisao(-valorA, valorB));
    }
    @Test
    @DisplayName("Divisão com os dois valores negativos, retorna valor positivo")
    public void deveDividirNegativos(){
        calculadora.divisao(-valorA, -valorB);

        Assertions.assertEquals(5, calculadora.divisao(valorA, valorB));
    }
    @Test
    @DisplayName("0 dividido por qualquer número é 0")
    public void deveRetornar0(){
        calculadora.divisao(0, valorB);

        Assertions.assertEquals(0, calculadora.divisao(0, valorB));
    }
    @Test
    @DisplayName("Qualquer numero dividido por 0, nao retorna nada")
    public void NaoDeveRetornarNada(){


        Assertions.assertThrows(RuntimeException.class, ()-> calculadora.divisao(valorA,0));
    }

}

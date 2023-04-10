import org.junit.jupiter.api.*;
import org.ua.Calculadora;

public class CalculadoraTest {

    private Calculadora calculadora;
    private static double valorInicial;
    private static double valorSegundaria;
    private static double valorNegadoSubtracao;
    private static double valorNegadoAdcao;

    @BeforeAll
    public static void definirValoresPadrao(){
        valorInicial = 5;
        valorSegundaria = 10;
        valorNegadoSubtracao = -5;
        valorNegadoAdcao = +10;
    }


    @BeforeEach
    public void inicializarCalculadora(){
        calculadora = new Calculadora();
    }

    @Test
    @DisplayName("Função de somar valores")
    public void TestSomaCalculadora(){
        calculadora.Somar(valorInicial,valorSegundaria);
        Assertions.assertEquals(valorInicial+valorSegundaria, calculadora.getResultado());
    }

    @Test
    @DisplayName("Função de formatar valores de adção")
    public void TestFormatacaoValoresSomaCalculadora(){
        Assertions.assertThrows(RuntimeException.class, () -> calculadora.Somar(valorNegadoAdcao,valorSegundaria));
        //calculadora não deve aceitar sinais antes dos numeros "+5" apenas se estiverem em parênteses "(+5)"
    }

    @Test
    @DisplayName("Função de subtrair valores")
    public void TestSubtrairCalculadora(){
        calculadora.Subtrair(valorInicial,valorSegundaria);
        Assertions.assertEquals(valorInicial-valorSegundaria, calculadora.getResultado());
    }

    @Test
    @DisplayName("Função de subtrair valorPrimario menor que o Segundario")
    public void TestSubtrairValorPrimarioMenorQueSegundarioCalculadora(){
        calculadora.Subtrair(valorInicial,valorSegundaria);
        Assertions.assertEquals(valorInicial-valorSegundaria, calculadora.getResultado());

    }

    @Test
    @DisplayName("Função de formatação de numero negativo em subtração")
    public void TestFormatoNumeroNegativoSubtrairCalculadora(){
        Assertions.assertThrows(RuntimeException.class, () -> calculadora.Subtrair(valorNegadoSubtracao,valorSegundaria));
        //calculadora não deve aceitar sinais antes dos numeros "-5" apenas se estiverem em parênteses "(-5)"
    }

    @Test
    @DisplayName("Função de dividir valores")
    public void TestDividirCalculadora(){
        calculadora.Dividir(valorInicial,valorSegundaria);
        Assertions.assertEquals(valorInicial/valorSegundaria, calculadora.getResultado());
    }

    @Test
    @DisplayName("Função de multiplicar valores")
    public void TestMultiplicaCalculadora(){
        calculadora.Multiplicar(valorInicial,valorSegundaria);
        Assertions.assertEquals(valorInicial*valorSegundaria, calculadora.getResultado());
    }

}

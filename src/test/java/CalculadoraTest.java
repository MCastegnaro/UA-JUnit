import org.junit.jupiter.api.*;
import org.ua.Calculadora;

public class CalculadoraTest {

    private Calculadora calculadora;
    private static double num1;
    private static double num2;

    private static double num3;
    private static double num4;


    public double valorfinal;


    @BeforeAll
    public static void definindoValoresDeTestes(){
        num1 = 100.0;
        num2 = 50.0;
        num4 = -3;
        num3 = -6;
        System.out.println(" -- BeforeAll --");
    }

    @BeforeEach
    public void instanciandoCalculadora(){
        calculadora = new Calculadora();
        System.out.println(" -- BeforeEach --");
    }


    /*
     * Testes
     */
    @Test
    @DisplayName("Cálculo de Soma")
    public void calculosoma(){
        valorfinal = calculadora.somar(num1, num2);
        Assertions.assertEquals(num1 + num2, valorfinal);
    }

    @Test
    @DisplayName("Cálculo de Subtração")
    public void calculoSubtracao(){
        valorfinal = calculadora.subtracao(num1, num2);
        Assertions.assertEquals(num1-num2, valorfinal);
    }

    @Test
    @DisplayName("Cálculo de Divisão de valores válidos")
    public void calculoDivisaoDeValoresValidos(){
        valorfinal = calculadora.dividir(num1, num2);
        Assertions.assertEquals(num1/num2, valorfinal);

    }

    @Test
    @DisplayName("Não pode ser divisível por zero/Calculo com valor inválido")
    public void naoPodeDividirPorZero(){
        Assertions.assertThrows(ArithmeticException.class,  ()-> calculadora.dividir(num1, 0));

    }

    @Test
    @DisplayName("Cálculo de Multiplicação")
    public void calculoMultiplicacao(){
        valorfinal = calculadora.multiplicacao(num1, num2);
        Assertions.assertEquals(num1*num2, valorfinal);
    }


    @Test
    @DisplayName("Calculo de Soma com numeros Negativos")
    public void calculoSomaComNumerosNegativos(){
        valorfinal = calculadora.somar(num3, num4);

        Assertions.assertEquals(num3+num4, valorfinal);
    }

    @Test
    @DisplayName("Calculo de Subtração com numeros Negativos ")

    public void calculoSubtracaoNumerosNegativos(){
        valorfinal = calculadora.subtracao(num3, num4);
        Assertions.assertEquals(num3-num4, valorfinal);
    }

    @Test
    @DisplayName("Calculo de Multiplicação com numeros Negativos ")

    public void calculoMultiplicacaoNumerosNegativos(){
        valorfinal = calculadora.multiplicacao(num3, num4);
        Assertions.assertEquals(num3*num4, valorfinal);
    }

    @Test
    @DisplayName("Calculo de Divisão com numeros Negativos")
    public void calculoDivisaoNumerosNegativos(){
        valorfinal = calculadora.dividir(num3, num4);
        Assertions.assertEquals(num3/num4, valorfinal);
    }







}

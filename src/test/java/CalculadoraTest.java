import org.junit.jupiter.api.*;
import org.ua.Calculadora;
import org.ua.Conta;

public class CalculadoraTest {
    private Calculadora calculadora;
    private static int numero1;
    private static int numero2;
    private static int numero0;
    private static int resultadoSoma;
    private static int resultadoSubtracao;
    private static int resultadoDivisao;
    private static int resultadoMultiplicacao;

    @BeforeAll
    public static void definirValoresPadrao(){
        numero0 = 0;
        numero1 = 4;
        numero2 = 2;

        resultadoSoma = 6;
        resultadoSubtracao = 2;
        resultadoDivisao = 2;
        resultadoMultiplicacao = 8;
    }
    @BeforeEach
    public void inicializarCalculadora(){
        calculadora = new Calculadora();
    }

    @Test
    @DisplayName("Funcão somar deve obter a soma dos dois valores")
    public void deveSomarOsDoisNumerosDados() {

        Assertions.assertEquals(resultadoSoma, calculadora.Somar(numero1, numero2));
    }
    @Test
    @DisplayName("Funcão subtrair deve obter a diferenca entre dois valores")
    public void deveSubtrairOSegundoNumeroDadoDoPrimeiro(){

        Assertions.assertEquals(resultadoSubtracao, calculadora.Subtrair(numero1,numero2));
    }
    @Test
    @DisplayName("Funcão dividir deve dividir o primeiro numero pelo segundo")
    public void deveDividirOPrimeiroNumeroPeloSegundo(){

        Assertions.assertEquals(resultadoDivisao, calculadora.Dividir(numero1,numero2));
    }

    @Test
    @DisplayName("Funcão dividir não deve funcionar com o segundo numero sendo zero")
    public void naoDeveDividirOPrimeiroNumeroPeloSegundo(){


        Assertions.assertThrows(RuntimeException.class, () -> calculadora.Dividir(numero1,numero0));
    }

    @Test
    @DisplayName("Funcão multiplicar deve multiplicar o primeiro numero pelo segundo")
    public void deveMultiplicarOPrimeiroNumeroPeloSegundo(){

        Assertions.assertEquals(resultadoMultiplicacao, calculadora.Multiplicar(numero1,numero2));
    }
}

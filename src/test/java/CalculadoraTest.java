import org.junit.jupiter.api.*;
import org.ua.Calculadora;

public class CalculadoraTest {

    private Calculadora calculadora;

    private static double n1;
    private static double n2;


    @BeforeAll
    public static void definirValoresPadrao(){
        n1 = 10.0;
        n2 = 10.0;
    }

    @BeforeEach
    public void inicializarCalculadora(){
        calculadora = new Calculadora();
    }

    @Test
    @DisplayName("Deve retornar a soma correta!")
    public void deveRetornarSomaCorreta(){
        double soma = calculadora.Somar(n1, n2);

        Assertions.assertEquals(n1+n2, soma);
    }

    @Test
    @DisplayName("Deve retornar a subtração correta!")
    public void deveRetornarSubtraçãoCorreta(){
        double subtracao = calculadora.Subtrair(n1, n2);

        Assertions.assertEquals(n1-n2, subtracao);
    }

    @Test
    @DisplayName("Deve retornar a multiplicação correta!")
    public void deveRetornarMultiplicaçãoCorreta(){
        double mult = calculadora.Multiplicar(n1, n2);

        Assertions.assertEquals(n1*n2, mult);
    }

    @Test
    @DisplayName("Deve retornar a divisão correta!")
    public void deveRetornarDivisaoCorreta(){
        double divisao = calculadora.Dividir(n1, n2);

        Assertions.assertEquals(n1/n2, divisao);
    }

    @Test
    @DisplayName("Deve jogar uma excessão caso tente dividir por 0!")
    public void deveJogarExcessaoDivisaoPorZero(){
        Assertions.assertThrows(ArithmeticException.class, () -> calculadora.Dividir(n1, 0));
    }
}

import org.junit.jupiter.api.*;
import org.ua.Calculadora;

public class CalculadoraTest {

    private Calculadora calculadora;

    private static double valorPadrao1;
    private static double valorPadrao2;

    private static double valorRep4;

    private static double valorRep3;

    private static double valorRep2;

    private static double valorRep1;
    @BeforeAll
    public static void definirValoresPadrao(){
        valorPadrao1 = 10;
        valorPadrao2 = 5;
        valorRep1 = 20;
        valorRep2 = 0;
        valorRep3 = 100;
        valorRep4 = 2;
    }

    @BeforeEach
    public void iniciarCalculadora(){
        calculadora = new Calculadora();
    }

    @Test
    @DisplayName("Soma funcional")
    public void Somar(){
        calculadora.somar(valorPadrao1, valorPadrao1);
        Assertions.assertEquals(valorRep1, calculadora.getResultado());
    }

    @Test
    @DisplayName("Subtração funcional")
    public void Subtrair(){
        calculadora.subtrair(valorPadrao1, valorPadrao1);
        Assertions.assertEquals(valorRep2, calculadora.getResultado());
    }

    @Test
    @DisplayName("multiplicação funcional")
    public void Multiplicar(){
        calculadora.multiplicar(valorPadrao1, valorPadrao1);
        Assertions.assertEquals(valorRep3, calculadora.getResultado());
    }

    @Test
    @DisplayName("divisão funcional")
    public void dividir(){
        calculadora.dividir(valorPadrao1, valorPadrao2);
        Assertions.assertEquals(valorRep4, calculadora.getResultado());
    }
}

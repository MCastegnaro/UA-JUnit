import org.junit.jupiter.api.*;
import org.ua.Calculadora;

public class CalculadoraTest {

    private Calculadora calculadora;
    private static double valor1;
    private static double valor2;

    private static double valorZero;
    @BeforeAll
    public static void definirValoresPadrao(){
        valor1 = 100.00;
        valor2 = 2.00;
        valorZero = 0.00;
    }

    @BeforeEach
    public void inicializarCalculadora(){
        calculadora = new Calculadora();

    }

    @Test
    @DisplayName("Não é possível dividir por zero")
    public void naoPodeDividirPorZero(){

        Assertions.assertThrows(RuntimeException.class, () -> calculadora.dividir(valor1, valorZero));

    }


    @Test
    @DisplayName("Soma está funcionando")
    public void estaSomando(){

        Assertions.assertEquals(102.00, calculadora.somar(valor1 , valor2));

    }

    @Test
    @DisplayName("Subtração está funcionando")
    public void estaSubtraindo(){

        Assertions.assertEquals(98.00, calculadora.subtrair(valor1 , valor2));

    }

    @Test
    @DisplayName("Multiplicação está funcionando")
    public void estaMultiplicando(){

        Assertions.assertEquals(200.00, calculadora.multiplicar(valor1 , valor2));

    }

    @Test
    @DisplayName("Divisão está funcionando")
    public void estaDividindo(){

        Assertions.assertEquals(50.00, calculadora.dividir(valor1 , valor2));

    }


}

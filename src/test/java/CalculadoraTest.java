import org.junit.jupiter.api.*;
import org.ua.Calculadora;


public class CalculadoraTest {
    private Calculadora calculadora;

    private static double valor1;
    private static double valor2;


    @BeforeAll
    public static void definirValoresPadrao(){
        valor1 = 5.00;
        valor2 = 5.00;
    }

    @BeforeEach
    public void inicializarCalculadora(){
        calculadora = new Calculadora();
    }

    @Test
    @DisplayName("Deve somar o valor1 com o valor2")
    public void deveSomarValor1EValor2(){
        calculadora.somar(valor1, valor2);

        Assertions.assertEquals(valor1,valor2, calculadora.getResultadoSoma());
    }

    @Test
    @DisplayName("Deve subtrair o valor1 pelo o valor2")
    public void deveSubtrairOValor1PeloValor2(){
        calculadora.subtrair(valor1, valor2);

        Assertions.assertEquals(valor1, valor2, calculadora.getResultadoSubtrair());
    }

    @Test
    @DisplayName("Deve multiplicar o valor1 pelo valor2")
    public void deveMultiplicarOValor1PeloValor2(){
        calculadora.multiplicar(valor1, valor2);

        Assertions.assertEquals(valor1*valor2, calculadora.getResultadoMultiplicar());
    }

    @Test
    @DisplayName("Deve dividir o valor1 pelo valor2")
    public void deveDividirOValor1PeloValor2(){
        calculadora.somar(valor1, valor2);

        Assertions.assertEquals(valor1, valor2, calculadora.getResultadoSoma());
    }

}

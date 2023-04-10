import com.sun.tools.jconsole.JConsoleContext;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.ua.Calculadora;

public class CalculadoraTest {

    private Calculadora calculadora = new Calculadora();//instanciando calculadora

    private static double numero1;
    private static double numero2;




    @Test
    @DisplayName("Teste de soma")
    public void testeDeSoma(){
        double resultado = calculadora.somar(10, 4);

        Assertions.assertEquals(14, resultado);
    }

    @Test
    @DisplayName("Teste de divisao")
    public void testeDeDivisao(){
        double resultado = calculadora.divisao(10, 2);

        Assertions.assertEquals(5, resultado);
    }

    @Test
    @DisplayName("Teste de subtracao")
    public void testeDeSubtracao(){
        double resultado = calculadora.subtracao(10,5);

        Assertions.assertEquals(5, resultado);
    }

    @Test
    @DisplayName("Teste de multiplicacao")
    public void testeDeMultiplicacao(){
        double resultado = calculadora.multiplicacao(10, 2);

        Assertions.assertEquals(20, resultado);
    }

    @Test
    @DisplayName("Nao pode fazer divisao por 0")
    public void divisaoPorZero(){
        var erro =
                Assertions.assertThrows(ArithmeticException.class, () ->
                        calculadora.divisao(10, 0));

                Assertions.assertEquals("/ by zero", erro.getMessage());

    }
}

import org.junit.jupiter.api.*;
import org.ua.Calculadora;

public class CalculadoraTest {

    private Calculadora calculadora;

    @BeforeEach
    public void iniciarCalculadora(){
        calculadora = new Calculadora();
    }

    @Test
    @DisplayName("Soma funcional")
    public void Somar(){
        calculadora.somar(10, 10);
        Assertions.assertEquals(20, calculadora.getResultado());
    }

    @Test
    @DisplayName("Subtração funcional")
    public void Subtrair(){
        calculadora.subtrair(10, 10);
        Assertions.assertEquals(0, calculadora.getResultado());
    }

    @Test
    @DisplayName("multiplicação funcional")
    public void Multiplicar(){
        calculadora.multiplicar(10, 10);
        Assertions.assertEquals(100, calculadora.getResultado());
    }

    @Test
    @DisplayName("divisão funcional")
    public void dividir(){
        calculadora.dividir(10, 5);
        Assertions.assertEquals(2, calculadora.getResultado());
    }
}

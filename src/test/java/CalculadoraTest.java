import org.junit.Assert;
import org.junit.Test;
import org.ua.Calculadora;

public class CalculadoraTest {
    @Test
    public void testSomar() {
        Calculadora calc = new Calculadora();
        int resultado = calc.somar(2, 3);
        Assert.assertEquals(5, resultado);
    }

    @Test
    public void testSubtrair() {
        Calculadora calc = new Calculadora();
        int resultado = calc.subtrair(5, 3);
        Assert.assertEquals(2, resultado);
    }

    @Test
    public void testDividir() {
        Calculadora calc = new Calculadora();
        int resultado = calc.dividir(10, 2);
        Assert.assertEquals(5, resultado);
    }

    @Test(expected = ArithmeticException.class)
    public void testDividirPorZero() {
        Calculadora calc = new Calculadora();
        calc.dividir(10, 0);
    }

    @Test
    public void testMultiplicar() {
        Calculadora calc = new Calculadora();
        int resultado = calc.multiplicar(2, 3);
        Assert.assertEquals(6, resultado);
    }
}
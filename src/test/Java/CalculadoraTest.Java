import org.ua.Calculadora;
import org.junit.Test;
import static org.junit.Assert.*;

public class CalculadoraTeste {

    @Test
    public void testAdicao() {
        double num1 = 5;
        double num2 = 3;
        char operador = '+';
        double resultadoEsperado = 8;

        double resultadoReal = Calculadora.calcular(num1, num2, operador);

        assertEquals(resultadoEsperado, resultadoReal, 0.001);
    }

    @Test
    public void testSubtracao() {
        double num1 = 10;
        double num2 = 7;
        char operador = '-';
        double resultadoEsperado = 3;

        double resultadoReal = Calculadora.calcular(num1, num2, operador);

        assertEquals(resultadoEsperado, resultadoReal, 0.001);
    }

    @Test
    public void testMultiplicacao() {
        double num1 = 4;
        double num2 = 6;
        char operador = '*';
        double resultadoEsperado = 24;

        double resultadoReal = Calculadora.calcular(num1, num2, operador);

        assertEquals(resultadoEsperado, resultadoReal, 0.001);
    }

    @Test
    public void testDivisao() {
        double num1 = 20;
        double num2 = 5;
        char operador = '/';
        double resultadoEsperado = 4;

        double resultadoReal = Calculadora.calcular(num1, num2, operador);

        assertEquals(resultadoEsperado, resultadoReal, 0.001);
    }

    @Test
    public void testOperadorInvalido() {
        double num1 = 8;
        double num2 = 2;
        char operador = '%';
        double resultadoEsperado = 0;

        try {
            double resultadoReal = Calculadora.calcular(num1, num2, operador);
            fail("Deveria ter lançado uma exceção de operador inválido.");
        } catch (IllegalArgumentException e) {
        }
    }

}
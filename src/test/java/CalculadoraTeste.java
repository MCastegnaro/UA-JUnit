import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.ua.Calculadora;

public class CalculadoraTeste {
    Calculadora calculadora = new Calculadora();

    private static double valorUm;
    private static double valorDois;
    private static double valorZero;

    @BeforeAll
    public static void definirValoresPadrao(){
        valorUm = 3.00;
        valorDois = 3.00;
        valorZero = 0;
    }

    @Test
    @DisplayName("Teste de soma")
    public void somar(){
        Assertions.assertEquals(6.00, calculadora.somar(valorUm,valorDois));
    }

    @Test
    @DisplayName("Teste de subtração")
    public void subtrair(){
        Assertions.assertEquals(0, calculadora.subtrair(valorUm,valorDois));
    }

    @Test
    @DisplayName("Teste de divisão por zero")
    public void dividirPorZero(){
        Assertions.assertThrows(RuntimeException.class, () ->calculadora.dividir(valorUm,valorZero));
    }

    @Test
    @DisplayName("Teste de multiplicação")
    public void multiplica(){
        Assertions.assertEquals(9.00, calculadora.multiplicar(valorUm,valorDois));
    }

    @Test
    @DisplayName("Teste de divisão")
    public void dividir(){
        Assertions.assertEquals(1.00, calculadora.dividir(valorUm,valorDois));
    }
}

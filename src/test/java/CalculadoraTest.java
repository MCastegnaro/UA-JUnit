import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.ua.Calculadora;

public class CalculadoraTest {

    private Calculadora calculadora;
    private static double valorSoma1;
    private static double valorSoma2;
    private static double valorSub1;
    private static double valorSub2;
    private static double valorMult1;
    private static double valorMult2;
    private static double valorDiv1;
    private static double valorDiv2;

    @BeforeAll
    public static void definirValoresPadrao(){
        valorSoma1 = 10.0;
        valorSoma2 = 10.0;
        valorSub1 = 15.0;
        valorSub2  = 10.0;
        valorMult1 = 5.0;
        valorMult2 = 5.0;
        valorDiv1 = 15.0;
        valorDiv2 = 3.0;
    }

    @Test
    @DisplayName("Devera somar dois numeros positivos")
    public void shouldBeAbleToSomarDoisNumerosPositivos(){

        Calculadora calculadora = new Calculadora();
        int valor = calculadora.somar(valorSoma1, valorSoma2);

        Assertions.assertEquals(20,calculadora.getValor(valor));
    }

    @Test
    @DisplayName("Devera subtrair dois numeros")
    public void shouldBeAbleToSubtrairDoisNumerosPositivos(){

        Calculadora calculadora = new Calculadora();
        int valor = calculadora.subtrair(valorSub1, valorSub2);

        Assertions.assertEquals(5,calculadora.getValor(valor));
    }

    @Test
    @DisplayName("Devera multiplicar dois numeros positivos")
    public void shouldBeAbleToMultiplicarDoisNumerosPositivos(){

        Calculadora calculadora = new Calculadora();
        int valor = calculadora.multiplicar(valorMult1, valorMult2);

        Assertions.assertEquals(25,calculadora.getValor(valor));
    }

    @Test
    @DisplayName("Devera dividir dois numeros positivos")
    public void shouldBeAbleToDividirDoisNumerosPositivos(){

        Calculadora calculadora = new Calculadora();
        int valor = calculadora.dividir(valorDiv1, valorDiv2);

        Assertions.assertEquals(5,calculadora.getValor(valor));
    }
}

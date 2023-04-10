import org.junit.jupiter.api.*;
import org.ua.Calculadora;

public class CalculadoraTest {
    private Calculadora calculadora = new Calculadora();
    private static double valorPositivoA;
    private static double valorPositivoB;
    private static double valorNegativoA;
    private static double valorNegativoB;
    private static double valorZerado;
    private static double valorQuebrado;

    @BeforeAll
    public static void definirValoresCalculadora(){
        valorPositivoA = 5.00;
        valorPositivoB = 5.00;
        valorNegativoA = -2.00;
        valorNegativoB = -2.00;
        valorZerado = 0.00;
        valorQuebrado = 3.44;
    }

    @Test
    @DisplayName("Verifica se a variavel resultado esta recebendo um número como valor")
    public void verificaValorVariavelResultado() {
        calculadora.setResultado(10.00);
        Assertions.assertEquals(10.00, calculadora.getResultado());
    }

    @Test
    @DisplayName("Deve realizar a soma de 2 valores positivos!")
    public void deveSomarValorPositivo(){
        calculadora.somar(valorPositivoA, valorPositivoB);
        Assertions.assertEquals(valorPositivoA + valorPositivoB, calculadora.getResultado());
    }

    @Test
    @DisplayName("Deve realizar a soma de 2 valores negativos!")
    public void deveSomarValoresNegativos(){
        calculadora.somar(valorNegativoA, valorNegativoB);
        Assertions.assertEquals(valorNegativoA + valorNegativoB, calculadora.getResultado());
    }

    @Test
    @DisplayName("Deve realizar a soma de 2 valores zerados!")
    public void deveSomarValoresZerados(){
        calculadora.somar(valorZerado, valorZerado);
        Assertions.assertEquals(valorZerado + valorZerado, calculadora.getResultado());
    }

    @Test
    @DisplayName("Deve realizar a soma de 2 valores quebrados!")
    public void deveSomarValoresQuebrados(){
        calculadora.somar(valorQuebrado, valorQuebrado);
        Assertions.assertEquals(valorQuebrado + valorQuebrado, calculadora.getResultado());
    }

    @Test
    @DisplayName("Deve realizar a subtracao de 2 valores positivos!")
    public void deveSubtrairValorPositivo(){
        calculadora.subtrair(valorPositivoA, valorPositivoB);
        Assertions.assertEquals(valorPositivoA - valorPositivoB, calculadora.getResultado());
    }

    @Test
    @DisplayName("Deve realizar a subtracao de 2 valores negativos!")
    public void deveSubtrairValoresNegativos(){
        calculadora.subtrair(valorNegativoA, valorNegativoB);
        Assertions.assertEquals(valorNegativoA - valorNegativoB, calculadora.getResultado());
    }

    @Test
    @DisplayName("Deve realizar a subtracao de 2 valores zerados!")
    public void deveSubtrairValoresZerados(){
        calculadora.subtrair(valorZerado, valorZerado);
        Assertions.assertEquals(valorZerado - valorZerado, calculadora.getResultado());
    }

    @Test
    @DisplayName("Deve realizar a subtracao de 2 valores quebrados!")
    public void deveSubtrairValoresQuebrados(){
        calculadora.subtrair(valorQuebrado, valorQuebrado);
        Assertions.assertEquals(valorQuebrado - valorQuebrado, calculadora.getResultado());
    }

    @Test
    @DisplayName("Deve realizar a divisao de 2 valores positivos!")
    public void deveDividirValorPositivo(){
        calculadora.dividir(valorPositivoA, valorPositivoB);
        Assertions.assertEquals(valorPositivoA / valorPositivoB, calculadora.getResultado());
    }

    @Test
    @DisplayName("Deve realizar a divisao de 2 valores negativos!")
    public void deveDividirValoresNegativos(){
        calculadora.dividir(valorNegativoA, valorNegativoB);
        Assertions.assertEquals(valorNegativoA / valorNegativoB, calculadora.getResultado());
    }

    @Test
    @DisplayName("Deve realizar a divisao de 2 valores zerados!")
    public void deveDividirValoresZerados(){
        calculadora.dividir(valorZerado, valorZerado);
        Assertions.assertEquals(valorZerado / valorZerado, calculadora.getResultado());
    }

    @Test
    @DisplayName("Deve realizar a divisao de 2 valores quebrados!")
    public void deveDividirValoresQuebrados(){
        calculadora.dividir(valorQuebrado, valorQuebrado);
        Assertions.assertEquals(valorQuebrado / valorQuebrado, calculadora.getResultado());
    }

    @Test
    @DisplayName("Deve realizar a multiplicacao de 2 valores positivos!")
    public void deveMultiplicarValorPositivo(){
        calculadora.multiplicar(valorPositivoA, valorPositivoB);
        Assertions.assertEquals(valorPositivoA * valorPositivoB, calculadora.getResultado());
    }

    @Test
    @DisplayName("Deve realizar a multiplicacao de 2 valores negativos!")
    public void deveMultiplicarValoresNegativos(){
        calculadora.multiplicar(valorNegativoA, valorNegativoB);
        Assertions.assertEquals(valorNegativoA * valorNegativoB, calculadora.getResultado());
    }

    @Test
    @DisplayName("Deve realizar a multiplicacao de 2 valores zerados!")
    public void deveMultiplicarValoresZerados(){
        calculadora.multiplicar(valorZerado, valorZerado);
        Assertions.assertEquals(valorZerado * valorZerado, calculadora.getResultado());
    }

    @Test
    @DisplayName("Deve realizar a multiplicacao de 2 valores quebrados!")
    public void deveMultiplicarValoresQuebrados(){
        calculadora.multiplicar(valorQuebrado, valorQuebrado);
        Assertions.assertEquals(valorQuebrado * valorQuebrado, calculadora.getResultado());
    }
}

import org.junit.jupiter.api.*;
import org.ua.Calculadora;

public class CalculadoraTest {

    private static Calculadora calculadora;

    private static double somaNumero1;

    private static double somaNumero2;

    private static double somaResultado;
    private static double negativoSomaSubtrairNegatResultado;

    private static double subtrairNumero1;

    private static double subtrairNumero2;

    private static double subtrairResultado;

    private static double dividirNumero1;

    private static double dividirNumero2;

    private static double dividirResultado;

    private static double multiplicarNumero1;

    private static double multiplicarNumero2;

    private static double multiplicarResultado;

    private static double negativoNumero1;

    private static double negativoNumero2;

    private static double decimalNumero1;

    private static double decimalNumero2;

    private static double resultadoDecimaisENegativo;
    private static double resultadoDividirDecimaisENegativo;

    private static double resultadoMultiplicarDecimaisENegativo;
    private static double resultadoMultiplicarDecimaisNegativo;

    private static double decimalNegativoNumero1;

    private static double decimalNegativoNumero2;


    @BeforeAll
    public static void valoresPadrao(){
        negativoNumero1 = -10;
        negativoNumero2 = -10;

        decimalNumero1 = 50.23;
        decimalNumero2 = 30.51;

        decimalNegativoNumero1 = -50.23;
        decimalNegativoNumero2 = -30.51;

        somaNumero1 = 10;
        somaNumero2 = 30;
        somaResultado = 40;

        negativoSomaSubtrairNegatResultado = 20;

        subtrairNumero1 = 10;
        subtrairNumero2 = 5;
        subtrairResultado = 5;

        dividirNumero1 = 10;
        dividirNumero2 = 2;
        dividirResultado = 5;

        resultadoDecimaisENegativo = 1.6463454605047523;
        resultadoDividirDecimaisENegativo = -1.6463454605047523;

        multiplicarNumero1 = 10;
        multiplicarNumero2 = 5;
        multiplicarResultado = 50;

        resultadoMultiplicarDecimaisENegativo = 1532.5173;
        resultadoMultiplicarDecimaisNegativo = -1532.5173;

        System.out.println(" -- BeforeAll --");
    }

    @BeforeEach
    public void inicializarCalculadora(){
        calculadora = new Calculadora();

        System.out.println(" -- BeforeEach --");
    }

    @Test
    @DisplayName("Deve somar os dois numeros, como soma correta")
    public void deveSomarDoisNumeros(){
        calculadora.somar(somaNumero1, somaNumero2);
        Assertions.assertEquals(somaResultado, calculadora.getResultado());
    }

    @Test
    @DisplayName("Deve somar os dois numeros o numero1 sera negativo e o numero2 positvo")
    public void deveSomarDoisNumerosOPrimeiroNegativoEoSegundoPositivo(){
        calculadora.somar(negativoNumero1, somaNumero2);
        Assertions.assertEquals(negativoSomaSubtrairNegatResultado, calculadora.getResultado());
    }

    @Test
    @DisplayName("Deve somar, dois numeros e os eles serao negativos")
    public void deveSomarDoisNumerosEOsDoisSeraoNegativos(){
        calculadora.somar(negativoNumero1, negativoNumero2);
        Assertions.assertEquals(-20, calculadora.getResultado());
    }

    @Test
    @DisplayName("Deve somar, dois numeros com decimais")
    public void deveSomarDoisNumerosComDecimais(){
        calculadora.somar(decimalNumero1, decimalNumero2);
        Assertions.assertEquals(80.74, calculadora.getResultado());
    }

    @Test
    @DisplayName("Deve somar, dois numeros com decimais negativos")
    public void deveSomarDoisNumerosComDecimaisNegativos(){
        calculadora.somar(decimalNegativoNumero1, decimalNegativoNumero2);
        Assertions.assertEquals(-80.74, calculadora.getResultado());
    }

    @Test
    @DisplayName("Deve somar, dois numeros com um decimal negativo e outro decimal positivo")
    public void deveSomarDoisNumerosUmDecimalNegativoEOutroDecimalPositivo(){
        calculadora.somar(decimalNegativoNumero1, decimalNumero2);
        Assertions.assertEquals(-19.719999999999995, calculadora.getResultado());
    }

    @Test
    @DisplayName("Deve somar, dois numeros com um somaNumero e outro decimal positivo")
    public void deveSomarDoisNumerosUmSomaNumeroEOutroDecimalPositivo(){
        calculadora.somar(somaNumero1, decimalNumero2);
        Assertions.assertEquals(40.510000000000005, calculadora.getResultado());
    }

    @Test
    @DisplayName("Deve somar, dois numeros com um somaNumero e outro decimal negativo")
    public void deveSomarDoisNumerosUmSomaNumeroEOutroDecimalNegativo(){
        calculadora.somar(somaNumero1, decimalNegativoNumero2);
        Assertions.assertEquals(-20.51, calculadora.getResultado());
    }

    @Test
    @DisplayName("Deve subtrair os dois numeros, com subtração correta")
    public void deveSubtrairDoisNumeros(){
        calculadora.subtrair(subtrairNumero1, subtrairNumero2);
        Assertions.assertEquals(subtrairResultado, calculadora.getResultado());
    }

    @Test
    @DisplayName("Deve subtrair os dois numeros o numero1 sera negativo e o numero2 positvo")
    public void deveSubtrairDoisNumerosOPrimeiroNegativoEoSegundoPositivo(){
        calculadora.subtrair(negativoNumero1, subtrairNumero2);
        Assertions.assertEquals(-15, calculadora.getResultado());
    }

    @Test
    @DisplayName("Deve subtrair os dois numeros o numero1 sera positivo e o numero2 negativo")
    public void deveSubtrairDoisNumerosOPrimeiroPositivoEoSegundoNegativo(){
        calculadora.subtrair(subtrairNumero1, negativoNumero2);
        Assertions.assertEquals(negativoSomaSubtrairNegatResultado, calculadora.getResultado());
    }

    @Test
    @DisplayName("Deve subtrair, dois numeros e os eles serao negativos")
    public void deveSubtrairDoisNumerosEOsDoisSeraoNegativos(){
        calculadora.subtrair(negativoNumero1, negativoNumero2);
        Assertions.assertEquals(0, calculadora.getResultado());
    }

    @Test
    @DisplayName("Deve subtrair, dois numeros com decimais")
    public void deveSubtrairDoisNumerosComDecimais(){
        calculadora.subtrair(decimalNumero1, decimalNumero2);
        Assertions.assertEquals(19.719999999999995, calculadora.getResultado());
    }

    @Test
    @DisplayName("Deve subtrair, dois numeros com decimais negativos")
    public void deveSubtrairDoisNumerosComDecimaisNegativos(){
        calculadora.subtrair(decimalNegativoNumero1, decimalNegativoNumero2);
        Assertions.assertEquals(-19.719999999999995, calculadora.getResultado());
    }

    @Test
    @DisplayName("Deve subtrair, dois numeros com um decimal negativo e outro decimal positivo")
    public void deveSubtrairDoisNumerosUmDecimalNegativoEOutroDecimalPositivo(){
        calculadora.subtrair(decimalNegativoNumero1, decimalNumero2);
        Assertions.assertEquals(-80.74, calculadora.getResultado());
    }

    @Test
    @DisplayName("Deve subtrair, dois numeros com um decimal positivo e outro decimal negativo")
    public void deveSubtrairDoisNumerosUmDecimalPositivoEOutroDecimalNegativo(){
        calculadora.subtrair(decimalNumero1, decimalNegativoNumero2);
        Assertions.assertEquals(80.74, calculadora.getResultado());
    }


    @Test
    @DisplayName("Deve subtrair, dois numeros com um subtrairNumero e outro decimal positivo")
    public void deveSubtrairDoisNumerosUmSubtrairNumeroEOutroDecimalPositivo(){
        calculadora.subtrair(subtrairNumero1, decimalNumero2);
        Assertions.assertEquals(-20.51, calculadora.getResultado());
    }

    @Test
    @DisplayName("Deve subtrair, dois numeros com um subtrairNumero e outro decimal negativo")
    public void deveSubtrairDoisNumerosUmSubtrairNumeroEOutroDecimalNegativo(){
        calculadora.subtrair(subtrairNumero1, decimalNegativoNumero2);
        Assertions.assertEquals(40.510000000000005, calculadora.getResultado());
    }

    @Test
    @DisplayName("Deve dividir os dois numeros, com divição correta")
    public void deveDividirDoisNumeros(){
        calculadora.dividir(dividirNumero1, dividirNumero2);
        Assertions.assertEquals(dividirResultado, calculadora.getResultado());
    }

    @Test
    @DisplayName("Deve dividir os dois numeros o numero1 sera negativo e o numero2 positvo")
    public void deveDividirDoisNumerosOPrimeiroNegativoEoSegundoPositivo(){
        calculadora.dividir(negativoNumero1, dividirNumero2);
        Assertions.assertEquals(-5, calculadora.getResultado());
    }

    @Test
    @DisplayName("Deve dividir os dois numeros o numero1 sera positivo e o numero2 negativo")
    public void deveDividirDoisNumerosOPrimeiroPositivoEoSegundoNegativo(){
        calculadora.dividir(dividirNumero1, negativoNumero2);
        Assertions.assertEquals(-1, calculadora.getResultado());
    }

    @Test
    @DisplayName("Deve dividir, dois numeros e os eles serao negativos")
    public void deveDividirDoisNumerosEOsDoisSeraoNegativos(){
        calculadora.dividir(negativoNumero1, negativoNumero2);
        Assertions.assertEquals(1, calculadora.getResultado());
    }

    @Test
    @DisplayName("Deve dividir, dois numeros com decimais")
    public void deveDividirDoisNumerosComDecimais(){
        calculadora.dividir(decimalNumero1, decimalNumero2);
        Assertions.assertEquals(resultadoDecimaisENegativo, calculadora.getResultado());
    }

    @Test
    @DisplayName("Deve dividir, dois numeros com decimais negativos")
    public void deveDividirDoisNumerosComDecimaisNegativos(){
        calculadora.dividir(decimalNegativoNumero1, decimalNegativoNumero2);
        Assertions.assertEquals(resultadoDecimaisENegativo, calculadora.getResultado());
    }

    @Test
    @DisplayName("Deve dividir, dois numeros com um decimal negativo e outro decimal positivo")
    public void deveDividirDoisNumerosUmDecimalNegativoEOutroDecimalPositivo(){
        calculadora.dividir(decimalNegativoNumero1, decimalNumero2);
        Assertions.assertEquals(resultadoDividirDecimaisENegativo, calculadora.getResultado());
    }

    @Test
    @DisplayName("Deve dividir, dois numeros com um decimal positivo e outro decimal negativo")
    public void deveDividirDoisNumerosUmDecimalPositivoEOutroDecimalNegativo(){
        calculadora.dividir(decimalNumero1, decimalNegativoNumero2);
        Assertions.assertEquals(resultadoDividirDecimaisENegativo, calculadora.getResultado());
    }

    @Test
    @DisplayName("Deve dividir, dois numeros com um dividirNumero e outro decimal positivo")
    public void deveDividirDoisNumerosUmDividirNumeroEOutroDecimalPositivo(){
        calculadora.dividir(dividirNumero1, decimalNumero2);
        Assertions.assertEquals(0.32776138970829233, calculadora.getResultado());
    }

    @Test
    @DisplayName("Deve dividir, dois numeros com um dividirNumero e outro decimal negativo")
    public void deveDividirDoisNumerosUmDividirNumeroEOutroDecimalNegativo(){
        calculadora.dividir(dividirNumero1, decimalNegativoNumero2);
        Assertions.assertEquals(-0.32776138970829233, calculadora.getResultado());
    }

    @Test
    @DisplayName("Deve multiplicar os dois numeros, com multiplicação correta")
    public void deveMultiplicarDoisNumeros(){
        calculadora.multiplicar(multiplicarNumero1, multiplicarNumero2);
        Assertions.assertEquals(multiplicarResultado, calculadora.getResultado());
    }

    @Test
    @DisplayName("Deve multiplicar os dois numeros o numero1 sera negativo e o numero2 positvo")
    public void deveMultiplicarDoisNumerosOPrimeiroNegativoEoSegundoPositivo(){
        calculadora.multiplicar(negativoNumero1, multiplicarNumero2);
        Assertions.assertEquals(-50, calculadora.getResultado());
    }

    @Test
    @DisplayName("Deve multiplicar os dois numeros o numero1 sera positivo e o numero2 negativo")
    public void deveMultiplicarDoisNumerosOPrimeiroPositivoEoSegundoNegativo(){
        calculadora.multiplicar(multiplicarNumero1, negativoNumero2);
        Assertions.assertEquals(-100, calculadora.getResultado());
    }

    @Test
    @DisplayName("Deve multiplicar, dois numeros e os eles serao negativos")
    public void deveMultiplicarDoisNumerosEOsDoisSeraoNegativos(){
        calculadora.multiplicar(negativoNumero1, negativoNumero2);
        Assertions.assertEquals(100, calculadora.getResultado());
    }

    @Test
    @DisplayName("Deve multiplicar, dois numeros com decimais")
    public void deveMultiplicarDoisNumerosComDecimais(){
        calculadora.multiplicar(decimalNumero1, decimalNumero2);
        Assertions.assertEquals(resultadoMultiplicarDecimaisENegativo, calculadora.getResultado());
    }

    @Test
    @DisplayName("Deve multiplicar, dois numeros com decimais negativos")
    public void deveMultiplicarDoisNumerosComDecimaisNegativos(){
        calculadora.multiplicar(decimalNegativoNumero1, decimalNegativoNumero2);
        Assertions.assertEquals(resultadoMultiplicarDecimaisENegativo, calculadora.getResultado());
    }

    @Test
    @DisplayName("Deve multiplicar, dois numeros com um decimal negativo e outro decimal positivo")
    public void deveMultiplicarDoisNumerosUmDecimalNegativoEOutroDecimalPositivo(){
        calculadora.multiplicar(decimalNegativoNumero1, decimalNumero2);
        Assertions.assertEquals(resultadoMultiplicarDecimaisNegativo, calculadora.getResultado());
    }

    @Test
    @DisplayName("Deve multiplicar, dois numeros com um decimal positivo e outro decimal negativo")
    public void deveMultiplicarDoisNumerosUmDecimalPositivoEOutroDecimalNegativo(){
        calculadora.multiplicar(decimalNumero1, decimalNegativoNumero2);
        Assertions.assertEquals(resultadoMultiplicarDecimaisNegativo, calculadora.getResultado());
    }

    @Test
    @DisplayName("Deve multiplicar, dois numeros com um multiplicarNumero e outro decimal positivo")
    public void deveMultiplicarDoisNumerosUmMultiplicarNumeroEOutroDecimalPositivo(){
        calculadora.multiplicar(multiplicarNumero1, decimalNumero2);
        Assertions.assertEquals(305.1, calculadora.getResultado());
    }

    @Test
    @DisplayName("Deve multiplicar, dois numeros com um multiplicarNumero e outro decimal negativo")
    public void deveMultiplicarDoisNumerosUmMultiplicarNumeroEOutroDecimalNegativo(){
        calculadora.multiplicar(multiplicarNumero1, decimalNegativoNumero2);
        Assertions.assertEquals(-305.1, calculadora.getResultado());
    }
}

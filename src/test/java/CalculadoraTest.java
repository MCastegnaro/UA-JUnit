import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.ua.Calculadora;


public class CalculadoraTest {

    Calculadora calculadora = new Calculadora();
    public static double n1;
    public static double n2;
    public static double zero;
    public static double fracao1;
    public static double fracao2;

    public static double n1Negativo;
    public static double n2Negativo;


    public static double nsoma;
    public static double nsubtrair;
    public static double nmultiplicar;
    public static double ndividir;
    public static double nfracao;

    public static double nSomaNegativo;
    public static double nSubtracaoNegativo;
    public static double nMultiplicacaoNegativo;
    public static double nDividirNegativo;


    @BeforeAll
    public static void definirValoresPadrao(){
        n1 = 2.00;
        n2 = 2.00;
        zero = 0;

        fracao1 = 0.5;
        fracao2 = 0.7;

        n1Negativo = -1;
        n2Negativo = -2;

        nsoma = 4.00;
        nsubtrair = 0.00;
        nmultiplicar = 4.00;
        ndividir = 1.00;
        nfracao = 0.35;

        nSomaNegativo = -3;
        nSubtracaoNegativo = 1;
        nMultiplicacaoNegativo = 2;
        nDividirNegativo = 0.5;

    }

    @Test
    @DisplayName("Deve somar dois valores")
    public void deveSomarDoisValores(){

        Assertions.assertEquals(calculadora.somar(n1,n2), nsoma);
    }

    @Test
    @DisplayName("Deve subtrair dois valores")
    public void deveSubtrairDoisValores(){

        Assertions.assertEquals(calculadora.subtrair(n1,n2), nsubtrair);
    }

    @Test
    @DisplayName("Deve multiplicar dois valores")
    public void deveMultiplicarDoisValores(){

        Assertions.assertEquals(calculadora.multiplicar(n1,n2), nmultiplicar);
    }

    @Test
    @DisplayName("Deve dividir dois valores")
    public void deveSomarDividirValores(){
        Assertions.assertEquals(calculadora.dividir(n1,n2), ndividir);
    }

    ///// Divisão por Zero ///////
    @Test
    @DisplayName("Não deve dividir por zero")
    public void naoDeveDividirPorZero(){
        Assertions.assertThrows(RuntimeException.class, () -> calculadora.dividir(n1,zero));
    }

    ///// Fracao /////////
    @Test
    @DisplayName("Deve multiplicar por fracoes")
    public void deveMultiplicarPorFracao(){
        Assertions.assertEquals(calculadora.multiplicar(fracao1,fracao2), nfracao);
    }


    ///// Numeros Negativos ////////////
    @Test
    @DisplayName("Deve Somar Numeros Negativos")
    public void deveSomarNumerosNegativos(){
        Assertions.assertEquals(calculadora.somar(n1Negativo,n2Negativo), nSomaNegativo);
    }

    @Test
    @DisplayName("Deve Subtrair Numeros Negativos")
    public void deveSubtarirNumerosNegativos(){
        Assertions.assertEquals(calculadora.subtrair(n1Negativo,n2Negativo), nSubtracaoNegativo);
    }

    @Test
    @DisplayName("Deve Multiplicar Numeros Negativos")
    public void deveMultiplicarNumerosNegativos(){
        Assertions.assertEquals(calculadora.multiplicar(n1Negativo,n2Negativo), nMultiplicacaoNegativo);
    }

    @Test
    @DisplayName("Deve dividir Numeros Negativos")
    public void deveDividirNumerosNegativos(){
        Assertions.assertEquals(calculadora.dividir(n1Negativo,n2Negativo), nDividirNegativo);
    }

}





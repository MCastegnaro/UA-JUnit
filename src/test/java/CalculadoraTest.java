import org.junit.jupiter.api.*;
import org.ua.Calculadora;

public class CalculadoraTest {

    private static double valorSoma1;
    private static double valorsoma2;
    private static double valorSub1;
    private static double valorSub2;
    private static double valorDiv1;
    private static double valorDiv2;
    private static double valorMult1;
    private static double valorMult2;
    private static double valor;

    @BeforeAll
    public static void definirValoresPadrao(){
        valorSoma1 = 10.0;
        valorsoma2 = 5.0;
        valorSub1 = 50.0;
        valorSub2 = 30.0;
        valorDiv1 = 100.0;
        valorDiv2 = 2.0;
        valorMult1 = 10.0;
        valorMult2 = 7.0;
        valor = 0;

    }

    @Test
    @DisplayName("Teste para ver se o metodo de soma está correto!")
    public void TestDovalorDaSoma(){

        Calculadora calculadora = new Calculadora();
        int valor = calculadora.soma(valorSoma1, valorsoma2);

        Assertions.assertEquals(15.0, calculadora.getValor(valor));

    }

    @Test
    @DisplayName("Teste para ver se o metodo de subtracao está correto!")
    public void TestDovalorDasubtracao() throws Exception{

        Calculadora calculadora = new Calculadora();
        int valor = calculadora.subtracao(valorSub1, valorSub2);

        Assertions.assertEquals(20.0, calculadora.getValor(valor));

    }

    @Test
    @DisplayName("Teste para ver se o metodo de divisao está correto!")
    public void TestDovalorDadivisao() throws Exception{

        Calculadora calculadora = new Calculadora();
        int valor = calculadora.divisao(valorDiv1, valorDiv2);

        Assertions.assertEquals(50.0, calculadora.getValor(valor));

    }

    @Test
    @DisplayName("Teste para ver se o metodo de multiplicacao está correto!")
    public void TestDovalorDamultiplicacao() throws Exception{

        Calculadora calculadora = new Calculadora();
        int valor = calculadora.multiplicacao(valorMult1, valorMult2);

        Assertions.assertEquals(70.0, calculadora.getValor(valor));

    }

}
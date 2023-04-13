import org.junit.jupiter.api.*;
import org.ua.Conta;
import org.ua.Pessoa;
public class PessoaTest {

    private Pessoa pessoa;
    private static Double nomeUsuario;
    private static double saqueValido;
    private static double saqueInvalido;
    private static double saldoZero;

    @BeforeAll
    public static void definirValoresPadrao(){
        nomeUsuario = ;
        saqueValido = 70.00;
        saqueInvalido = 110.0;
        saldoZero = 0;
    }

    @BeforeEach
    public void inicializarConta(){
        conta = new Conta();
        conta.ativar();
    }

}

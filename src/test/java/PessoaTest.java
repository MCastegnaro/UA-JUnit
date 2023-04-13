import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.ua.Pessoa;

public class PessoaTest {

    private Pessoa pessoa;
    private static String nome;

    private static int idade;

    private static String endereco;

    private static String genero;

    private static String telefone;

    private static int tempoDeTrabalho;

    @BeforeAll
    public static void definirValoresPadrao() {
        nome = "Allyson";
        idade = 20;
        endereco = "Foz do Iguaçu";
        genero = "Masculino";
        telefone = "4512345678";
        tempoDeTrabalho = 1;
    }

    @BeforeEach
    public void inicializarPessoa() {
        pessoa = new Pessoa(nome, idade, endereco, genero, telefone, tempoDeTrabalho);
    }
}

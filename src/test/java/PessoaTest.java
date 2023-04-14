import org.junit.jupiter.api.*;
import org.ua.Pessoa;

public class PessoaTest {

    private Pessoa pessoaFeminina;
    private Pessoa pessoaMasculino;
    private static String nomeMasculino;
    private static String nomeFeminina;
    private static Integer idade;
    private static String endereco;
    private static String telefone;
    private static String generoMasculino;
    private static String generoFeminino;
    private static Integer anosTrabalhados;
    private static Integer tempoAposentarMasculino;
    private static Integer tempoAposentarFeminino;

    @BeforeEach
    public void instanciandoPessoa() {
        pessoaFeminina = new Pessoa(nomeFeminina, idade, endereco, generoFeminino, telefone, anosTrabalhados);
        pessoaMasculino = new Pessoa(nomeMasculino, idade, endereco, generoMasculino, telefone, anosTrabalhados);
    }

    @BeforeAll
    public static void definindoValores() {
        nomeFeminina = "Ana Julia";
        nomeMasculino = "Marcos Low";

        idade = 13;
        endereco = "Foz do Iguaçu";
        telefone = "45 9 9146 2994";

        generoMasculino = "MASCULINO";
        generoFeminino = "FEMININO";
        anosTrabalhados = 20;

        tempoAposentarFeminino = 60;
        tempoAposentarMasculino = 65;
    }

    @Test
    @DisplayName("Deve retornar o Nome")
    public void deveRetornarNome() {
        Assertions.assertEquals(nomeFeminina, pessoaFeminina.getNome());
    }

    @Test
    @DisplayName("Teste para retornar a Idade")
    public void deveRetornarAIdade() {
        Assertions.assertEquals(idade, pessoaFeminina.getIdade());
    }

    @Test
    @DisplayName("Deve retornar o endereco")
    public void deveRetornarEndereco() {
        Assertions.assertEquals(endereco, pessoaFeminina.getEndereco());
    }

    @Test
    @DisplayName("Deve retornar dados pessoais completos")
    public void deveRetonarDadosPessoaisCompletos() {
        Assertions.assertEquals(
                String.format("%s , %d , %s, %s, %d", nomeFeminina, idade, generoFeminino, telefone, anosTrabalhados),
                pessoaFeminina.getDadospessoaiscompletos());
    }

    @Test
    @DisplayName("Deve retornar nome e telefone")
    public void deveRetornarNomeETelefone() {
        Assertions.assertEquals(String.format("%s, %s", nomeFeminina, telefone), pessoaFeminina.getNomeETelefone());
    }

    @Test
    @DisplayName("Teste para retornar Telefone")
    public void deveRetornarTelefone() {
        Assertions.assertEquals(telefone, pessoaFeminina.getTelfone());
    }

    @Test
    @DisplayName("Deve retornar anos trabalhados")
    public void deveRetornarAnosTrabalhados() {
        Assertions.assertEquals(anosTrabalhados, pessoaFeminina.getAnosTrabalhados());
    }

    @Test
    @DisplayName("Deve retornar o tempo para se aposentar feminino")
    public void deveRetornarTempoParaSeAposentarFeminino() {
        Assertions.assertEquals(tempoAposentarFeminino - anosTrabalhados, pessoaFeminina.tempoDeSeAposentar());
    }

    @Test
    @DisplayName("Deve retornar o tempo para se aposentar masculino")
    public void deveRetornarTempoParaSeAposentarMasculino() {
        Assertions.assertEquals(tempoAposentarMasculino - anosTrabalhados, pessoaMasculino.tempoDeSeAposentar());
    }

}

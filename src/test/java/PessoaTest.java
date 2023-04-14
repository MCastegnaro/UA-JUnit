import org.junit.jupiter.api.*;
import org.ua.Genero;
import org.ua.Pessoa;

public class PessoaTest {

    private Pessoa pessoa;
    private static String nome;
    private static String nomeNullo;
    private static int idade;
    private static int idadeMasculinoNaoAposenta;
    private static int idadeFemininoNaoAposenta;
    private static int idadeMasculinoAposentada;
    private static String endereco;
    private static String enderecoNullo;
    private static Genero genero;
    private static Genero generoMasculino;
    private static Genero generoFeminino;

    private static String telefone;
    private static String telefoneNullo;
    private static String tempoDeTrabalho;
    private static String tempoDeTrabalhoNullo;

    @BeforeAll
    public static void definirValoresPadrao(){
        nome = "Maria Eduarda";
        nomeNullo = null;
        idadeMasculinoNaoAposenta = 30;
        idadeFemininoNaoAposenta = 30;
        idadeMasculinoAposentada = 65;
        enderecoNullo = null;
        generoMasculino = genero.MASCULINO;
        generoFeminino = genero.FEMININO;
        telefoneNullo = null;
        telefone = "451111111";
        endereco = "Rua recife numero 26";
        tempoDeTrabalho = "10";
        tempoDeTrabalhoNullo = null;
    }


    @BeforeEach
    public void inicializarPessoa(){
        pessoa = new Pessoa(nome, idade, endereco, genero, telefone,tempoDeTrabalho);
    }


    @Test
    @DisplayName("Usuario masculino com idade insuficiente para se aposentar!")
    public void deveIdadeMasculinoInsuficienteAposentar(){

        Assertions.assertThrows(RuntimeException.class, () -> pessoa.cadastro(nome,idadeMasculinoNaoAposenta, endereco,generoMasculino,telefone, tempoDeTrabalho));

    }


    @Test
    @DisplayName("Usuaria feminino com idade insufuciente para se aposentar")
    public void deveIdadeFemininaInsuficienteAposentar(){
        Assertions.assertThrows(RuntimeException.class, () -> pessoa.cadastro(nome,idadeFemininoNaoAposenta, endereco,generoFeminino,telefone, tempoDeTrabalho));

    }

    @Test
    @DisplayName("Usuario(a) com nome nullo não deve cadastrar")
    public void deveNegarCadastroComNomeNullo(){
        Assertions.assertThrows(RuntimeException.class, () -> pessoa.cadastro(nomeNullo,idade, endereco,generoFeminino,telefone, tempoDeTrabalho));

    }

    @Test
    @DisplayName("Usuario(a) com endereco nullo não deve cadastrar")
    public void deveNegarCadastroComEnderecoNullo(){
        Assertions.assertThrows(RuntimeException.class, () -> pessoa.cadastro(nome,idade, enderecoNullo,generoFeminino,telefone, tempoDeTrabalho));

    }


    @Test
    @DisplayName("Usuario(a) com telefone nullo não deve cadastrar")
    public void deveNegarCadastroComTelefoneNullo(){
        Assertions.assertThrows(RuntimeException.class, () -> pessoa.cadastro(nome,idade, endereco,generoFeminino,telefoneNullo, tempoDeTrabalho));

    }

    @Test
    @DisplayName("Usuario(a) com tempo de trabalho nullo não deve cadastrar")
    public void deveNegarCadastroComTempoDeTrabalhoNullo(){
        Assertions.assertThrows(RuntimeException.class, () -> pessoa.cadastro(nome,idade, endereco,generoFeminino,telefone, tempoDeTrabalhoNullo));

    }

    @Test
    @DisplayName("Usuario(a) com campos não preenchidos não pode cadastrar")
    public void deveNegarCadastroComCamposNullos(){
        Assertions.assertThrows(RuntimeException.class, () -> pessoa.cadastro(nomeNullo,idade, enderecoNullo,generoFeminino,telefoneNullo, tempoDeTrabalhoNullo));

    }


    @Test
    @DisplayName("Deve retornar o nome do usuario(a)")
    public void deveRetornarNomeUsuario(){
        Assertions.assertEquals( "Maria Eduarda", pessoa.getNome());

    }

    @Test
    @DisplayName("Deve retornar o endereco do usuario(a)")
    public void deveRetornarEnderecoUsuario(){
        Assertions.assertEquals( "Rua recife numero 26", pessoa.getEndereco());

    }

    @Test
    @DisplayName("Deve retornar o telefone do usuario(a)")
    public void deveRetornarTelefoneUsuario(){
        Assertions.assertEquals( "451111111", pessoa.getTelefone());

    }

    @Test
    @DisplayName("Deve retornar o tempo de trabalho do usuario(a)")
    public void deveRetornarTempoDeTrabalhoUsuario(){
        Assertions.assertEquals( "10", pessoa.getTempoDeTrabalho());

    }

}

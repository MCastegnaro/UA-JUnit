import org.junit.jupiter.api.*;
import org.ua.Pessoa;

public class PessoaTest {

    private Pessoa pessoa;
    private static String nome;

    private static Integer idade;

    private static String endereco;

    private static String genero;

    private static String telefone;

    private static int tempoDeTrabalho;

    private static String nomeETelefone;

    private static String dadosCompletos;

    @BeforeAll
    public static void definirValoresPadrao() {
        nome = "Allyson";
        idade = 50;
        endereco = "Foz do Iguaçu";
        genero = "Masculino";
        telefone = "(45)12345-6789";
        tempoDeTrabalho = 20;
        nomeETelefone = nome + telefone;
        dadosCompletos = nome + idade + endereco + genero + telefone + tempoDeTrabalho;
    }

    @BeforeEach
    public void inicializarPessoa() {
        pessoa = new Pessoa(nome, idade, endereco, genero, telefone, tempoDeTrabalho);
    }

    @Test
    @DisplayName("Deve retornar o nome")
    public void deveRetornarONome() {
        Assertions.assertEquals(nome, pessoa.getNome());
    }

    @Test
    @DisplayName("Não deve receber valor de nome nulo")
    public void naoDeveReceberNomeNulo() {
        Assertions.assertThrows(RuntimeException.class, () -> pessoa.setNome(null));
    }

    @Test
    @DisplayName("Não deve receber valor de nome vazio")
    public void naoDeveReceberNomeVazio() {
        Assertions.assertThrows(RuntimeException.class, () -> pessoa.setNome(""));
    }

    @Test
    @DisplayName("Não deve receber valor de nome com menos de 3 letras")
    public void naoDeveReceberNomeComMenosDeTresLetras() {
        Assertions.assertThrows(RuntimeException.class, () -> pessoa.setNome("Al"));
    }

    @Test
    @DisplayName("Deve retornar a idade")
    public void deveRetornaraIdade() {
        Assertions.assertEquals(idade, pessoa.getIdade());
    }

    @Test
    @DisplayName("Não deve receber valor de idade nulo")
    public void naoDeveReceberIdadeNulo() {
        Assertions.assertThrows(RuntimeException.class, () -> pessoa.setIdade(null));
    }

    @Test
    @DisplayName("Não deve receber valor de idade maior que 120 anos")
    public void naoDeveReceberIdadeMaiorQueLimite() {
        Assertions.assertThrows(RuntimeException.class, () -> pessoa.setIdade(121));
    }

    @Test
    @DisplayName("Não deve receber valor de idade menor que 0")
    public void naoDeveReceberIdadeMenorQueZero() {
        Assertions.assertThrows(RuntimeException.class, () -> pessoa.setIdade(-1));
    }

    @Test
    @DisplayName("Deve retornar o endereço")
    public void deveRetornarOEndereco() {
        Assertions.assertEquals(endereco, pessoa.getEndereco());
    }

    @Test
    @DisplayName("Não deve receber valor de endereço nulo")
    public void naoDeveReceberEnderecoNulo() {
        Assertions.assertThrows(RuntimeException.class, () -> pessoa.setEndereco(null));
    }

    @Test
    @DisplayName("Não deve receber valor de endereço vazio")
    public void naoDeveReceberEnderecoVazio() {
        Assertions.assertThrows(RuntimeException.class, () -> pessoa.setEndereco(""));
    }

    @Test
    @DisplayName("Não deve receber valor de endereço menor que 5 caracteres")
    public void naoDeveReceberEnderecoMenorQueCinco() {
        Assertions.assertThrows(RuntimeException.class, () -> pessoa.setEndereco(null));
    }

    @Test
    @DisplayName("Deve retornar o gênero")
    public void deveRetornarOGenero() {
        Assertions.assertEquals(genero, pessoa.getGenero());
    }

    @Test
    @DisplayName("Não deve receber valor de gênero nulo")
    public void naoDeveReceberGeneroNulo() {
        Assertions.assertThrows(RuntimeException.class, () -> pessoa.setGenero(null));
    }

    @Test
    @DisplayName("Não deve receber valor de gênero vazio")
    public void naoDeveReceberGeneroVazio() {
        Assertions.assertThrows(RuntimeException.class, () -> pessoa.setGenero(""));
    }

    @Test
    @DisplayName("Deve retornar o telefone")
    public void deveRetornarOTelefone() {
        Assertions.assertEquals(telefone, pessoa.getTelefone());
    }

    @Test
    @DisplayName("Não deve receber valor de telefone nulo")
    public void naoDeveReceberTelefoneNulo() {
        Assertions.assertThrows(RuntimeException.class, () -> pessoa.setTelefone(null));
    }

    @Test
    @DisplayName("Não deve receber valor de telefone vazio")
    public void naoDeveReceberTelefoneVazio() {
        Assertions.assertThrows(RuntimeException.class, () -> pessoa.setTelefone(""));
    }

    @Test
    @DisplayName("Não deve receber valor de telefone menor que 12 caracteres")
    public void naoDeveReceberTelefoneMenorQueDezCaracteres() {
        Assertions.assertThrows(RuntimeException.class, () -> pessoa.setTelefone(""));
    }

    @Test
    @DisplayName("Deve retornar o tempo de trabalho")
    public void deveRetornarOTempoDeTrabalho() {
        Assertions.assertEquals(tempoDeTrabalho, pessoa.getTempoDeTrabalho());
    }

    @Test
    @DisplayName("Não deve receber o valor de tempo de trabalho nulo")
    public void naoDeveReceberOTempoDeTrabalhoNulo() {
        Assertions.assertThrows(RuntimeException.class, () -> pessoa.setTempoDeTrabalho(null));
    }

    @Test
    @DisplayName("Não deve receber o valor de tempo de trabalho menor que 0")
    public void naoDeveReceberOTempoDeTrabalhoMenorQueZero() {
        Assertions.assertThrows(RuntimeException.class, () -> pessoa.setTempoDeTrabalho(-1));
    }

    @Test
    @DisplayName("Deve retornar o nome e telefone")
    public void deveRetornarONomeETelefone() {
        Assertions.assertEquals(nomeETelefone, pessoa.getNomeETelefone());
    }

    @Test
    @DisplayName("Não deve receber o valor de nome e telefone nulo")
    public void naoDeveReceberONomeETelefoneNulo() {
        Assertions.assertThrows(RuntimeException.class, () -> pessoa.setNomeETelefone(null, null));
    }

    @Test
    @DisplayName("Não deve receber o valor de nome e telefone vazio")
    public void naoDeveReceberONomeETelefoneVazio() {
        Assertions.assertThrows(RuntimeException.class, () -> pessoa.setNomeETelefone("", ""));
    }

    @Test
    @DisplayName("Deve retornar os dados completos")
    public void deveRetornarOsDadosCompletos() {
        Assertions.assertEquals(dadosCompletos, pessoa.getDadosCompletos());
    }

    @Test
    @DisplayName("Não deve receber um dos campos dos dados completos nulo")
    public void naoDeveReceberDadosCompletosNulo() {
        Assertions.assertThrows(RuntimeException.class, () -> pessoa.setDadosCompletos(null, null, null, null, null));
    }

    @Test
    @DisplayName("Não deve receber um dos campos dos dados completos vazio")
    public void naoDeveReceberDadosCompletosVazio() {
        Assertions.assertThrows(RuntimeException.class, () -> pessoa.setDadosCompletos("", -1, "", "", -1));
    }

    @Test
    @DisplayName("Deve retornar o tempo para se aposentar")
    public void deveRetornarOTempoParaSeAposentar() {
        Assertions.assertEquals(15, pessoa.getTempoParaSeAposentar());
    }

    @Test
    @DisplayName("Não deve receber tempo de trabalho maior que 65 (Masculino)")
    public void naoDeveReceberIdadeMaiorQueAposentarMasculino() {
        Assertions.assertThrows(RuntimeException.class, () -> pessoa.setTempoParaSeAposentar("Masculino", 70));
    }

    @Test
    @DisplayName("Não deve receber tempo de trabalho maior que 60 (Feminino)")
    public void naoDeveReceberIdadeMaiorQueAposentarFeminino() {
        Assertions.assertThrows(RuntimeException.class, () -> pessoa.setTempoParaSeAposentar("Feminino", 65));
    }
}
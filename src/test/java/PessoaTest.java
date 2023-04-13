import org.junit.jupiter.api.*;
import org.ua.Pessoa;

public class PessoaTest {

    private Pessoa pessoa;
    private static String nome;
    private static String telefone;
    private static String genero;
    private static String endereco;
    private static int idade;
    private static int tempoDeTrabalho;

    private static int tempoParaAposentarMasculino;
    private static int tempoParaAposentarFeminino;


    @BeforeAll
    public static void definirValoresPadrao(){

        nome = "joao";
        telefone = "34567890";
        genero = "Masculino";
        endereco = "Rua Qualquer, numero tambem";
        idade = 40;
        tempoDeTrabalho = 20;
        tempoParaAposentarMasculino = 25;
        tempoParaAposentarFeminino = 20;
    }

    @BeforeEach
    public void inicializarPessoa(){
        pessoa = new Pessoa();
        pessoa.setNome(nome);
        pessoa.setTelefone(telefone);
        pessoa.setGenero(genero);
        pessoa.setEndereco(endereco);
        pessoa.setIdade(idade);
        pessoa.setTempoDeTrabalho(tempoDeTrabalho);


    }

    @Test
    @DisplayName("Deve pegar o nome da pessoa")
    public void devePegarONomeDaPessoa(){


        Assertions.assertEquals(nome,pessoa.getNome());
    }

    @Test
    @DisplayName("Nao deve pegar nome nulo")
    public void naoDevePegarONomeNulo(){
        Assertions.assertThrows(RuntimeException.class, () -> pessoa.setNome(null));

    }

    @Test
    @DisplayName("Deve pegar a idade da pessoa")
    public void devePegarAIdadeDaPessoa(){
        Assertions.assertEquals(idade,pessoa.getIdade());
    }

    @Test
    @DisplayName("Deve pegar o telefone da pessoa")
    public void devePegarOTelefoneDaPessoa(){

        Assertions.assertEquals(telefone,pessoa.getTelefone());
    }



    @Test
    @DisplayName("Deve pegar o genero da pessoa")
    public void devePegarOGeneroDaPessoa(){

        Assertions.assertEquals(genero,pessoa.getGenero());
    }

    @Test
    @DisplayName("Deve pegar o endereco da pessoa")
    public void devePegarOEnderecoDaPessoa(){

        Assertions.assertEquals(endereco,pessoa.getEndereco());
    }

    @Test
    @DisplayName("Nao deve pegar endereço nulo")
    public void naoDevePegarOEnderecoNulo() {
        Assertions.assertThrows(RuntimeException.class, () -> pessoa.setEndereco(null));
    }

    @Test
    @DisplayName("Deve pegar o tempo de trabalho da pessoa")
    public void devePegarOTempoDeTrabalhoDaPessoa(){

        Assertions.assertEquals(tempoDeTrabalho,pessoa.getTempoDeTrabalho());
    }

    @Test
    @DisplayName("Deve pegar o nome e o telefone da pessoa")
    public void devePegarONomeETelefoneDaPessoa(){

        Assertions.assertEquals(nome+telefone,pessoa.getNomeETelefone());
    }

    @Test
    @DisplayName("Nao deve pegar o telefone nulo")
    public void naoDevePegarOTelefoneNulo() {
        Assertions.assertThrows(RuntimeException.class, () -> pessoa.setTelefone(null));
    }

    @Test
    @DisplayName("Deve pegar todos os dados da pessoa")
    public void devePegarTodosOsDadosDaPessoa(){

        Assertions.assertEquals(nome + idade + endereco + genero +
                telefone + tempoDeTrabalho,pessoa.getDadosCompletos());
    }

    @Test
    @DisplayName("Deve pegar o tempo que falta para a pessoa poder se aposentar")
    public void devePegarOTempoQueFaltaParaAposentadoria(){

        Assertions.assertEquals(tempoParaAposentarMasculino,pessoa.getTempoParaSeAposentar());
    }

}
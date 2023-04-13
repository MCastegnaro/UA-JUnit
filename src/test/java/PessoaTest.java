import org.junit.jupiter.api.*;
import org.ua.Pessoa;

public class PessoaTest {

    private static Pessoa pessoa;

    private static String dadosCompletos;

    private static String nomeETelefone;
    /*private static String nome;
    private static int idade;
    private static String endereco;
    private static String genero;
    private static int telefone;
    private static int tempoTrabalho;
    private static int tempoAposentar;*/

    @BeforeAll
    public static void definirValoresPadrao(){
        pessoa = new Pessoa();
        pessoa.setNome("Joao");
        pessoa.setIdade(34);
        pessoa.setGenero("Masculino");
        pessoa.setTelefone(999999999);
        pessoa.setTempoTrabalho(40);
        dadosCompletos = pessoa.getNome() + pessoa.getIdade() + pessoa.getGenero() + pessoa.getTelefone() + pessoa.getTempoTrabalho();
        nomeETelefone = pessoa.getNome() + pessoa.getTelefone();
    }

    @Test
    @DisplayName("Retornar Nome")
    public void retornarNome(){
        pessoa.setNome("Joao");

        Assertions.assertEquals("Joao", pessoa.getNome());
    }

    @Test
    @DisplayName("Exceção nome nulo")
    public void retornarNomeNulo(){

        Assertions.assertThrows(RuntimeException.class,() -> pessoa.setNome(null));
    }

    @Test
    @DisplayName("Exceção nome vazio")
    public void retornarNomeVazio(){

        Assertions.assertThrows(RuntimeException.class,()-> pessoa.setNome(""));
    }

    @Test
    @DisplayName("Exceção nome pequeno")
    public void retornarNomePequeno(){

        Assertions.assertThrows(RuntimeException.class, ()-> pessoa.setNome("lo"));
    }

    @Test
    @DisplayName("Retorna Idade")
    public void retornarIdade(){
        pessoa.setIdade(35);

        Assertions.assertEquals(35, pessoa.getIdade());
    }
    @Test
    @DisplayName("Exceção idade nulo")
    public void retornarIdadeNulo(){

        Assertions.assertThrows(RuntimeException.class, ()-> pessoa.setIdade(null));
    }

    @Test
    @DisplayName("Exceção idade limite")
    public void retornarIdadeLimite(){

        Assertions.assertThrows(RuntimeException.class, ()-> pessoa.setIdade(125));
    }

    @Test
    @DisplayName("Retornar endereco")
    public void retornarEndereco(){

        pessoa.setEndereco("Rua Arenque");

        Assertions.assertEquals("Rua Arenque", pessoa.getEndereco());
    }
    @Test
    @DisplayName("Exceção endereco nulo")
    public void retornarEnderecoNulo(){

        Assertions.assertThrows(RuntimeException.class, ()-> pessoa.setEndereco(null));
    }

    @Test
    @DisplayName("Retorna Gênero")
    public void retornarGenero(){

        pessoa.setGenero("Masculino");

        Assertions.assertEquals("Masculino", pessoa.getGenero());
    }

    @Test
    @DisplayName("Exceção genero nulo")
    public void retornarGeneroNulo(){

        Assertions.assertThrows(RuntimeException.class, ()-> pessoa.setGenero(null));
    }

    @Test
    @DisplayName("Retorna Telefone")
    public void retornarTelefone(){

        pessoa.setTelefone(999999999);

        Assertions.assertEquals(999999999, pessoa.getTelefone());
    }

    @Test
    @DisplayName("Exceção Telefone nulo")
    public void retornarTelefoneNulo(){

        Assertions.assertThrows(RuntimeException.class, ()-> pessoa.setTelefone(null));
    }

    @Test
    @DisplayName("Retorna Tempo de Trabalho")
    public void retornarTempoTrabalho(){

        pessoa.setTempoTrabalho(40);

        Assertions.assertEquals(40, pessoa.getTempoTrabalho());
    }

    @Test
    @DisplayName("Exceção Tempo de Trabalho nulo")
    public void retornarTempoTrabalhoNulo(){

        Assertions.assertThrows(RuntimeException.class, ()-> pessoa.setTempoTrabalho(null));
    }

    @Test
    @DisplayName("Exceção Tempo de Trabalho Limite")
    public void retornarTempoTrabalhoLimite(){

        Assertions.assertThrows(RuntimeException.class, ()-> pessoa.setTempoTrabalho(66));
    }

    @Test
    @DisplayName("Retorna os Dados Completos")
    public void retornarDadosCompletos(){

        Assertions.assertEquals(dadosCompletos, dadosCompletos);
    }

    @Test
    @DisplayName("Retorna o Nome e o Telefone")
    public void retornarNomeETelefone(){

        Assertions.assertEquals(nomeETelefone, nomeETelefone);
    }

    @Test
    @DisplayName("Retorna o Tempo de Aposentar Homem")
    public void retornarTempoAposentarHomem(){

        pessoa.setTempoAposentar("Masculino", 61);

        Assertions.assertEquals(4, pessoa.getTempoAposentar());
    }

    @Test
    @DisplayName("Exceção Ja Aposentado Homem")
    public void retornarTempoAposentarJaAposentado(){

        Assertions.assertThrows(RuntimeException.class, ()-> pessoa.setTempoAposentar("Masculino", 66));
    }
    @Test
    @DisplayName("Retorna o Tempo de Aposentar Mulher")
    public void retornarTempoAposentarMulher(){

        pessoa.setTempoAposentar("Feminino", 54);

        Assertions.assertEquals(6, pessoa.getTempoAposentar());
    }

    @Test
    @DisplayName("Exceção Ja Aposentada Mulher")
    public void retornarTempoAposentarJaAposentada(){

        Assertions.assertThrows(RuntimeException.class, ()-> pessoa.setTempoAposentar("Feminino", 61));
    }
}
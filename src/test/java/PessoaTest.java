import org.junit.jupiter.api.*;
import org.ua.Pessoa;

public class PessoaTest {
    private static Pessoa pessoa;

    private static String dadosCompletos;

    private static String nomeEtelefone;

    @BeforeAll
    public static void definirValoresPadrao(){
        pessoa = new Pessoa();
        pessoa.setNome("Lucas");
        pessoa.setIdade(55);
        pessoa.setEndereco("Av. das Cataratas, 1118 - Vila Yolanda");
        pessoa.setGenero("masculino");
        pessoa.setTelefone("45988884444");
        pessoa.setTempoDeTrabalho(42);
        dadosCompletos = pessoa.getNome() + pessoa.getIdade() + pessoa.getEndereco() + pessoa.getGenero() +
                pessoa.getTelefone() + pessoa.getTempoDeTrabalho();
        nomeEtelefone = pessoa.getNome() + pessoa.getTelefone();
    }

    @Test
    @DisplayName("Variavel nome NÃO deve receber valor nulo")
    public void verificaVarivelNomeValorNulo() {
        Assertions.assertThrows(RuntimeException.class, () -> pessoa.setNome(null));
    }

    @Test
    @DisplayName("Variavel nome NÃO deve receber string com espaço em branco para completar o número de caracteres " +
            "mínimo exigido")
    public void verificaVarivelNomeValorComEspacosEmBrancoParaCompletarTamanhoMinimo() {
        Assertions.assertThrows(RuntimeException.class, () -> pessoa.setNome("   L"));
    }

    @Test
    @DisplayName("Variavel nome NÃO deve receber uma string com menos de 3 caracteres")
    public void verificaTamanhoVariavelNomeMenorQueTresCaracteres() {
        Assertions.assertThrows(RuntimeException.class, () -> pessoa.setNome("Le"));
    }

    @Test
    @DisplayName("Variavel nome DEVE receber uma string com valor e tamanho atribuidos conforme o exigido")
    public void verificaVarivelNomeValorAtribuidoConformeExigido() {
        Assertions.assertEquals("Lucas", pessoa.getNome());
    }

    @Test
    @DisplayName("Variavel idade NÃO deve receber valor nulo")
    public void verificaVarivelIdadeValorNulo() {
        Assertions.assertThrows(RuntimeException.class, () -> pessoa.setIdade(null));
    }

    @Test
    @DisplayName("Variavel idade NÃO deve receber o valor 0")
    public void verificaVarivelIdadeValorZero() {
        Assertions.assertThrows(RuntimeException.class, () -> pessoa.setIdade(0));
    }

    @Test
    @DisplayName("Variavel idade NÃO deve receber o valor maior que 130")
    public void verificaVarivelIdadeValorMaiorQueLimiteMaximo() {
        Assertions.assertThrows(RuntimeException.class, () -> pessoa.setIdade(131));
    }

    @Test
    @DisplayName("Variavel idade DEVE receber um inteiro conforme o valor atribuido")
    public void verificaVarivelIdadeComOvalorInteiroAtribuido() {
        Assertions.assertEquals(55, pessoa.getIdade());
    }

    @Test
    @DisplayName("Variavel endereço NÃO deve receber valor nulo")
    public void verificaVarivelEnderecoValorNulo() {
        Assertions.assertThrows(RuntimeException.class, () -> pessoa.setEndereco(null));
    }

    @Test
    @DisplayName("Variavel endereço NÃO deve receber um valor vazio")
    public void verificaVarivelEnderecoValorVazio() {
        Assertions.assertThrows(RuntimeException.class, () -> pessoa.setEndereco(""));
    }

    @Test
    @DisplayName("Variavel endereço NÃO deve receber um valor com o tamanho menor que 5 letras")
    public void verificaVarivelEnderecoTamanhoMenorQueCinco() {
        Assertions.assertThrows(RuntimeException.class, () -> pessoa.setEndereco("abcd"));
    }

    @Test
    @DisplayName("Variavel endereço DEVE receber uma string com o valor e tamanho atribuidos corretamente")
    public void verificaVarivelEnderecoValorEtamanhoCorretamente() {
        Assertions.assertEquals("Av. das Cataratas, 1118 - Vila Yolanda", pessoa.getEndereco());
    }

    @Test
    @DisplayName("Variavel gênero NÃO deve receber valor nulo")
    public void verificaVarivelGeneroValorNulo() {
        Assertions.assertThrows(RuntimeException.class, () -> pessoa.setGenero(null));
    }

    @Test
    @DisplayName("Variavel gênero NÃO deve receber um valor vazio")
    public void verificaVarivelGeneroValorVazio() {
        Assertions.assertThrows(RuntimeException.class, () -> pessoa.setGenero(""));
    }

    @Test
    @DisplayName("Variavel gênero DEVE receber uma string com o valor atribuido corretamente")
    public void verificaVarivelGeneroValorAtribuidoCorretamente() {
        Assertions.assertEquals("masculino", pessoa.getGenero());
    }

    @Test
    @DisplayName("Classe Pessoa DEVE conter a apresentar os atributos com seus valores" +
            " conforme o que lhe foram atribuidos")
    public void verificaConstrutorDadosCompletosComValoresDefinidos() {
        Assertions.assertEquals(dadosCompletos, pessoa.getNome() + pessoa.getIdade() + pessoa.getEndereco() +
                pessoa.getGenero() + pessoa.getTelefone() + pessoa.getTempoDeTrabalho());
    }

    @Test
    @DisplayName("Variavel telefone NÃO deve receber valor nulo")
    public void verificaVarivelTelefoneValorNulo() {
        Assertions.assertThrows(RuntimeException.class, () -> pessoa.setTelefone(null));
    }

    @Test
    @DisplayName("Variavel telefone NÃO deve receber um valor vazio")
    public void verificaVarivelTelefoneValorVazio() {
        Assertions.assertThrows(RuntimeException.class, () -> pessoa.setTelefone(""));
    }

    @Test
    @DisplayName("Variavel telefone NÃO deve receber um valor com o tamanho menor que 11 números")
    public void verificaVarivelTelefoneTamanhoMenorQueOnze() {
        Assertions.assertThrows(RuntimeException.class, () -> pessoa.setTelefone("4599999999"));
    }

    @Test
    @DisplayName("Variavel telefone DEVE receber uma string com o valor e tamanho atribuidos corretamente")
    public void verificaVarivelTelefoneValorEtamanhoCorretamente() {
        Assertions.assertEquals("45988884444", pessoa.getTelefone());
    }

    @Test
    @DisplayName("DEVE retornar nome e telefone conforme os valores atribuidos nos atributos da classe Pessoa")
    public void verificaNomeEtelefoneComValoresDefinidos() {
        Assertions.assertEquals(nomeEtelefone, pessoa.getNome() + pessoa.getTelefone());
    }

    @Test
    @DisplayName("Variavel tempoDeTrabalho NÃO deve receber valor nulo")
    public void verificaVarivelTempoDeTrabalhoValorNulo() {
        Assertions.assertThrows(RuntimeException.class, () -> pessoa.setTempoDeTrabalho(null));
    }

    @Test
    @DisplayName("Variavel tempoDeTrabalho NÃO deve receber valor menor que 0")
    public void verificaVarivelTempoDeTrabalhoValorMenorQueZero() {
        Assertions.assertThrows(RuntimeException.class, () -> pessoa.setTempoDeTrabalho(-1));
    }

    @Test
    @DisplayName("Variavel tempoDeTrabalho NÃO deve receber o valor maior que 100")
    public void verificaVarivelTempoDeTrabalhoValorMaiorQueLimiteMaximo() {
        Assertions.assertThrows(RuntimeException.class, () -> pessoa.setTempoDeTrabalho(101));
    }

}

import org.junit.jupiter.api.*;
import org.ua.Pessoa;

public class PessoaTest {
    private static Pessoa pessoa;

    @BeforeAll
    public static void definirValoresPadrao(){
        pessoa = new Pessoa();
        pessoa.setNome("Lucas");
        pessoa.setIdade(55);
        pessoa.setEndereco("Av. das Cataratas, 1118 - Vila Yolanda");
        pessoa.setGenero("Masculino");
        pessoa.setTelefone("45 9 9999-9999");
        pessoa.setTempoDeTrabalho(42);
    }

    @Test
    @DisplayName("Variavel nome NÃO deve receber uma string com menos de 3 caracteres")
    public void verificaTamanhoVariavelNomeMenorQueTresCaracteres() {
        Assertions.assertThrows(RuntimeException.class, () -> pessoa.setNome("Le"));
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
    @DisplayName("Variavel nome DEVE receber uma string com o valor e tamanho maior que 2 caracteres")
    public void verificaVarivelNomeValorMaiorQueDoisCaracteres() {
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
    public void verificaVarivelIdadeValorMaiorQue130() {
        Assertions.assertThrows(RuntimeException.class, () -> pessoa.setIdade(131));
    }

    @Test
    @DisplayName("Variavel idade DEVE receber um inteiro com o valor definido")
    public void verificaVarivelIdadeComOvalorInteiroAtribuido() {
        Assertions.assertEquals(55, pessoa.getIdade());
    }

}

import org.junit.jupiter.api.*;
import org.ua.Pessoa;

import java.time.LocalTime;

public class PessoaTest {

    private Pessoa pessoa;
    private Pessoa pessoa1;

    private Pessoa pessoa2;

    private Pessoa pessoa3;

    private Pessoa pessoa4;

    private static String nome;

    private static int idade;

    private static String endereco;
    private static String genero;
    private static int telefone;
    private static LocalTime tempoDetrabalho;

    @BeforeAll
    public static void definicaoDeValoresPadroes(){
        nome = "Evandro";
        idade = 65;
        endereco = "rua6";
        genero = "Masculino";
        telefone = 99999699;
        tempoDetrabalho = LocalTime.of(5,6);
    }

    @BeforeEach
    public void inicializarPessoa(){
        pessoa = new Pessoa("Katia", -1, "rua1", "Feminino", 99969999, LocalTime.of(5,6));
        pessoa1 = new Pessoa("Valdemar", 64, "rua1", "Masculino", 99969999, LocalTime.of(5,6));
        pessoa2 = new Pessoa("Evandro", 65, "rua6", "Masculino", 99999699, LocalTime.of(5,6));

        pessoa3 = new Pessoa("Giovana", 59, "rua2", "Feminino", 88888888, LocalTime.of(5,6));
        pessoa4 = new Pessoa("Amanda", 60, "rua2", "Feminino", 88888888, LocalTime.of(5,6));
    }

    @Test
    @DisplayName("deve Retornar O nome, de pessoa1")
    public void deveRetornarONomeDePessoa1(){

        Assertions.assertEquals("Valdemar", pessoa1.getNome());
    }
    @Test
    @DisplayName("deve Retornar O nome, de pessoa2")
    public void deveRetornarONomeDePessoa2(){

        Assertions.assertEquals(nome, pessoa2.getNome());
    }

    @Test
    @DisplayName("deve Retornar O nome, de pessoa3")
    public void deveRetornarONomeDePessoa3(){

        Assertions.assertEquals("Giovana", pessoa3.getNome());
    }

    @Test
    @DisplayName("deve Retornar O nome, de pessoa4")
    public void deveRetornarONomeDePessoa4(){

        Assertions.assertEquals("Amanda", pessoa4.getNome());
    }

    @Test
    @DisplayName("não deve poder retornar A idade, de Pessoa menor que 0")
    public void naoDeveRetornarAIdadeDePessoaMenorDoQue0(){

        Assertions.assertThrows(RuntimeException.class, () -> pessoa.getIdade());

    }

    @Test
    @DisplayName("deve Retornar A idade, de Pessoa1")
    public void deveRetornarAIdadeDePessoa1(){

        Assertions.assertEquals(64, pessoa1.getIdade());

    }

    @Test
    @DisplayName("deve Retornar A idade, de Pessoa2")
    public void deveRetornarAIdadeDePessoa2(){

        Assertions.assertEquals(idade, pessoa2.getIdade());
    }

    @Test
    @DisplayName("deve Retornar A idade, de Pessoa3")
    public void deveRetornarAIdadeDePessoa3(){

        Assertions.assertEquals(59, pessoa3.getIdade());
    }

    @Test
    @DisplayName("deve Retornar A idade, de Pessoa4")
    public void deveRetornarAIdadeDePessoa4(){

        Assertions.assertEquals(60, pessoa4.getIdade());
    }

    @Test
    @DisplayName("deve Retornar O endereço, de Pessoa1")
    public void deveRetornarOEnderecoDePessoa1(){

        Assertions.assertEquals("rua1", pessoa1.getEndereco());
    }

    @Test
    @DisplayName("deve Retornar O endereço, de Pessoa2")
    public void deveRetornarOEnderecoDePessoa2(){

        Assertions.assertEquals(endereco, pessoa2.getEndereco());
    }

    @Test
    @DisplayName("deve Retornar O endereço, de Pessoa3")
    public void deveRetornarOEnderecoDePessoa3(){

        Assertions.assertEquals("rua2", pessoa3.getEndereco());
    }

    @Test
    @DisplayName("deve Retornar O endereço, de Pessoa4")
    public void deveRetornarOEnderecoDePessoa4(){

        Assertions.assertEquals("rua2", pessoa4.getEndereco());
    }

    @Test
    @DisplayName("Dever ter os dados compledos, de Pessoa1")
    public void deveTerOsDadosCompletosDePessoa1(){
        Assertions.assertEquals("Nome-> " + "Valdemar" + " " + "Idade-> " + 64 + " " + "Endereço-> " + "rua1" + " " + "Genero-> " + "Masculino" + " " +
                "Telefone-> " + 99969999 + " " + "Tempo De Trabalho-> " + tempoDetrabalho, pessoa1.getDadosCompletos());
    }

    @Test
    @DisplayName("Dever ter os dados compledos, de Pessoa2")
    public void deveTerOsDadosCompletosDePessoa2(){
        Assertions.assertEquals("Nome-> " + nome + " " + "Idade-> " + idade + " " + "Endereço-> " + endereco + " " + "Genero-> " + genero + " " +
                "Telefone-> " + telefone + " " + "Tempo De Trabalho-> " + tempoDetrabalho, pessoa2.getDadosCompletos());
    }

    @Test
    @DisplayName("Dever ter os dados compledos, de Pessoa3")
    public void deveTerOsDadosCompletosDePessoa3(){
        Assertions.assertEquals("Nome-> " + "Giovana" + " " + "Idade-> " + 59 + " " + "Endereço-> " + "rua2" + " " + "Genero-> " + "Feminino" + " " +
                "Telefone-> " + 88888888 + " " + "Tempo De Trabalho-> " + tempoDetrabalho, pessoa3.getDadosCompletos());
    }

    @Test
    @DisplayName("Dever ter os dados compledos, de Pessoa4")
    public void deveTerOsDadosCompletosDePessoa4(){
        Assertions.assertEquals("Nome-> " + "Amanda" + " " + "Idade-> " + 60 + " " + "Endereço-> " + "rua2" + " " + "Genero-> " + "Feminino" + " " +
                "Telefone-> " + 88888888 + " " + "Tempo De Trabalho-> " + tempoDetrabalho, pessoa4.getDadosCompletos());
    }

    @Test
    @DisplayName("Deve ter o nome e o telefone, de Pessoa1")
    public void deveTerNomeETelefoneDePessoa1(){
        Assertions.assertEquals("Nome-> " + "Valdemar" + " " + "Telefone-> " + 99969999, pessoa1.getNomeETelefone());
    }

    @Test
    @DisplayName("Deve ter o nome e o telefone, de Pessoa2")
    public void deveTerNomeETelefoneDePessoa2(){
        Assertions.assertEquals("Nome-> " + nome + " " + "Telefone-> " + telefone, pessoa2.getNomeETelefone());
    }

    @Test
    @DisplayName("Deve ter o nome e o telefone, de Pessoa3")
    public void deveTerNomeETelefoneDePessoa3(){
        Assertions.assertEquals("Nome-> " + "Giovana" + " " + "Telefone-> " + 88888888, pessoa3.getNomeETelefone());
    }

    @Test
    @DisplayName("Deve ter o nome e o telefone, de Pessoa4")
    public void deveTerNomeETelefoneDePessoa4(){
        Assertions.assertEquals("Nome-> " + "Amanda" + " " + "Telefone-> " + 88888888, pessoa4.getNomeETelefone());
    }

    @Test
    @DisplayName("Deve ter o tempo de trabalho, de Pessoa1")
    public void deveTerTempoDeTrabalhoDePessoa1(){
        Assertions.assertEquals(tempoDetrabalho, pessoa1.getTempoDetrabalho());
    }

    @Test
    @DisplayName("Deve ter o tempo de trabalho, de Pessoa2")
    public void deveTerTempoDeTrabalhoDePessoa2(){
        Assertions.assertEquals(tempoDetrabalho, pessoa2.getTempoDetrabalho());
    }

    @Test
    @DisplayName("Deve ter o tempo de trabalho, de Pessoa3")
    public void deveTerTempoDeTrabalhoDePessoa3(){
        Assertions.assertEquals(tempoDetrabalho, pessoa3.getTempoDetrabalho());
    }

    @Test
    @DisplayName("Deve ter o tempo de trabalho, de Pessoa4")
    public void deveTerTempoDeTrabalhoDePessoa4(){
        Assertions.assertEquals(tempoDetrabalho, pessoa4.getTempoDetrabalho());
    }

    @Test
    @DisplayName("deve Retornar o Tempo Para Se Aposentar")
    public void deveRetornarOTempoParaSeAposentar(){

        Assertions.assertThrows(RuntimeException.class, () -> pessoa2.getTempoParaSeAposentar());
    }

    @Test
    @DisplayName("deve passar no teste de Analise Valor Limite, com o Tempo Para Se Aposentar")
    public void deveComOTempoParaSeAposentarPassarNoTesteDeAnaliseValorLimite(){
        //Masculino
        //64
        Assertions.assertThrows(RuntimeException.class, () -> pessoa1.getTempoParaSeAposentar());

        //Masculino
        //65
        Assertions.assertThrows(RuntimeException.class, () -> pessoa2.getTempoParaSeAposentar());

        //Feminino
        //59;
        Assertions.assertThrows(RuntimeException.class, () -> pessoa3.getTempoParaSeAposentar());

        //Feminino
        //60
        Assertions.assertThrows(RuntimeException.class, () -> pessoa4.getTempoParaSeAposentar());
    }

    @Test
    @DisplayName("deve Retornar o telefone, de Pessoa1")
    public void deveRetornarOTelefoneDePessoa1(){

        Assertions.assertEquals(99969999, pessoa1.getTelefone());
    }

    @Test
    @DisplayName("deve Retornar o telefone, de Pessoa2")
    public void deveRetornarOTelefoneDePessoa2(){

        Assertions.assertEquals(telefone, pessoa2.getTelefone());
    }

    @Test
    @DisplayName("deve Retornar o telefone, de Pessoa3")
    public void deveRetornarOTelefoneDePessoa3(){

        Assertions.assertEquals(88888888, pessoa3.getTelefone());
    }

    @Test
    @DisplayName("deve Retornar o telefone, de Pessoa4")
    public void deveRetornarOTelefoneDePessoa4(){

        Assertions.assertEquals(88888888, pessoa3.getTelefone());
    }

    @Test
    @DisplayName("deve Retornar O genero,de Pessoa1")
    public void deveRetornarOGeneroDePessoa(){

        Assertions.assertEquals("Masculino", pessoa1.getGenero());
    }

    @Test
    @DisplayName("deve Retornar O genero, de Pessoa2")
    public void deveRetornarOGeneroDePessoa2(){

        Assertions.assertEquals(genero, pessoa2.getGenero());
    }

    @Test
    @DisplayName("deve Retornar O genero, de Pessoa3")
    public void deveRetornarOGeneroDePessoa3(){

        Assertions.assertEquals("Feminino", pessoa3.getGenero());
    }

    @Test
    @DisplayName("deve Retornar O genero, de Pessoa4")
    public void deveRetornarOGeneroDePessoa4(){

        Assertions.assertEquals("Feminino", pessoa4.getGenero());
    }


}

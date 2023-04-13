import java.time.LocalTime;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.ua.Pessoa;

public class PessoaTest {


    private Pessoa P1;

    private static String nome;
    private static int idade;
    private static String endereco;
    private static String genero;
    private static int telefone;
    private static LocalTime tempoDetrabalho;

    @BeforeAll
    public static void definirValoraPadrao(){
        nome = "TST";
        idade = 11;
        endereco = "AAAA";
        genero = "Masculino";
        telefone = 999999999;
        tempoDetrabalho = LocalTime.of(0,0);
    }

    @BeforeEach
    public void inicializarPessoa(){
        P1= new Pessoa("Judite", 35, "RUA3", "Feminino", 89999999, LocalTime.of(0,1));
    }

    @Test
    @DisplayName("Retornar idade P1")
    public void deveRetornarAIdadeDePessoa1(){

        Assertions.assertEquals(35, P1.getIdade());

    }

    @Test
    @DisplayName("Retornar Endereco P1")
    public void deveRetornarOEnderecoDePessoa1(){

        Assertions.assertEquals("RUA3", P1.getEndereco());
    }

    @Test
    @DisplayName("Dever ter os dados compledos P1")
    public void deveTerOsDadosCompletosDePessoa1(){
        Assertions.assertEquals("Nome: " + "Judite" + " " + "Idade: " + 35 + " " + "Endereço: " + "RUA3" + " " + "Genero: " + "Feminino" + " " +
                "Telefone: " + 89999999 + " " + "Tempo De Trabalho: " + LocalTime.of(0,1), P1.getDadosCompletos());
    }

    @Test
    @DisplayName("Deve ter o nome e o telefone P1")
    public void deveTerNomeETelefoneDePessoa1(){
        Assertions.assertEquals("Nome:" + "Judite" + " " + "Telefone:" + 89999999, P1.getNomeETelefone());
    }

    @Test
    @DisplayName("Deve ter o tempo de trabalho P1")
    public void deveTerTempoDeTrabalhoDePessoa1(){
        Assertions.assertEquals(LocalTime.of(0,1), P1.getTempoDetrabalho());
    }


    @Test
    @DisplayName("deve Retornar o telefone P1")
    public void deveRetornarOTelefoneDePessoa1(){

        Assertions.assertEquals(89999999, P1.getTelefone());
    }

    @Test
    @DisplayName("deve Retornar O genero P1")
    public void deveRetornarOGeneroDePessoa(){

        Assertions.assertEquals("Feminino", P1.getGenero());
    }

}
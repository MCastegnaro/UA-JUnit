package org.ua.Pessoa;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PessoaTest {

    @Test
    public void testGetNome() {
        Pessoa pessoa = new Pessoa("João", 30, "Rua A, 123", "Masculino", "(11) 1234-5678", 5);
        Assertions.assertEquals("João", pessoa.getNome());
    }

    @Test
    public void testGetIdade() {
        Pessoa pessoa = new Pessoa("João", 30, "Rua A, 123", "Masculino", "(11) 1234-5678", 5);
        Assertions.assertEquals(30, pessoa.getIdade());
    }

    @Test
    public void testGetEndereco() {
        Pessoa pessoa = new Pessoa("João", 30, "Rua A, 123", "Masculino", "(11) 1234-5678", 5);
        Assertions.assertEquals("Rua A, 123", pessoa.getEndereco());
    }

    @Test
    public void testGetGenero() {
        Pessoa pessoa = new Pessoa("João", 30, "Rua A, 123", "Masculino", "(11) 1234-5678", 5);
        Assertions.assertEquals("Masculino", pessoa.getGenero());
    }

    @Test
    public void testGetTelefone() {
        Pessoa pessoa = new Pessoa("João", 30, "Rua A, 123", "Masculino", "(11) 1234-5678", 5);
        Assertions.assertEquals("(11) 1234-5678", pessoa.getTelefone());
    }

    @Test
    public void testGetTempoDeTrabalho() {
        Pessoa pessoa = new Pessoa("João", 30, "Rua A, 123", "Masculino",  "(11) 1234-5678", 5);
        Assertions.assertEquals(5, pessoa.getTempoDeTrabalho)
    }

    @Test
    public void testGetTempoDeTrabalho() {
        Pessoa pessoa = new Pessoa("João", 30, "Rua A, 123", "Masculino",  "(11) 1234-5678", 5);
        Assertions.assertEquals(5, pessoa.getTempoDeTrabalho)
    }

    @Test
    void testGetDadosCompletos() {
        Pessoa pessoa = new Pessoa("Maria", 30, "Rua A", "Feminino", "1111-1111", 5);
        assertEquals("Nome: Maria, Idade: 30, Gênero: Feminino, Telefone: 1111-1111, Tempo de trabalho: 5",
                pessoa.getDadosCompletos());
    }

    @Test
    void testGetNomeETelefone() {
        Pessoa pessoa = new Pessoa("Maria", 30, "Rua A", "Feminino", "1111-1111", 5);
        assertEquals("Nome: Maria, Telefone: 1111-1111", pessoa.getNomeETelefone());
    }

    @Test
    void testGetTempoParaSeAposentarFeminino() {
        Pessoa pessoa = new Pessoa("Maria", 55, "Rua A", "Feminino", "1111-1111", 5);
        assertEquals(5, pessoa.getTempoParaSeAposentar());
    }

    @Test
    void testGetTempoParaSeAposentarMasculino() {
        Pessoa pessoa = new Pessoa("João", 60, "Rua B", "Masculino", "2222-2222", 10);
        assertEquals(5, pessoa.getTempoParaSeAposentar());
    }

    @Test
    void testGetTempoParaSeAposentarAtingidoLimite() {
        Pessoa pessoa = new Pessoa("Pedro", 70, "Rua C", "Masculino", "3333-3333", 20);
        assertEquals(0, pessoa.getTempoParaSeAposentar());
    }
}
package org.ua;

/**
 * Criar uma classe PESSOA e adicionar os seguintes atributos para ela
 * - Nome
 * - Idade
 * - Endereço
 * - Gênero
 * - Telefone
 * - Tempo de trabalho
 * <p>
 * Essa classe deve ter um contrutor publico para instanciar todos os atributos listados acima
 * <p>
 * Os métodos são:
 * -> getNome> Retorna o nome
 * -> getIdade> Retorna a idade
 * -> getEndereço> Retorna o endereço
 * -> getDadosCompletos> Retorna concatenado NOME, IDADE, GENERO, TELEFONE e TEMPO DE TRABALHO
 * -> getNomeETelefone> Retorna nome e telefone.
 * -> getTempoDeTrabalho> Retorna o tempo de trabalho.
 * -> getTempoParaSeAposentar> Assuma que a idade de aposentadoria é 60 anos feminino, 65 masculino.
 * -> getTelefone> Retorna o telefone.
 * <p>
 * Em seguida crie uma classe de teste para PESSOA e cubra as funcionalidades
 * com testes unitários para validar o correto funcionamento da mesma.
 * <p>
 * <p>
 * ENTREGA
 * <p>
 * A partir da branch aula-02 (upstram), deve ser criada uma branch com o seguinte padrão: ua-nome-sobrenome
 * e nela realizar o desenvolvimento da atividade. Após concluída, a ativade, gerar um PR (pull request) apontando para a branch
 * entrega-02 lá do repositório do professor.
 */

public class Pessoa {


    public Pessoa(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }

    public Pessoa(String nome, int idade, String endereco, String genero, String telefone, int tempoDeTrabalho) {
        this.nome = nome;
        this.idade = idade;
        this.endereco = endereco;
        this.genero = genero;
        this.telefone = telefone;
        this.tempoDeTrabalho = tempoDeTrabalho;
    }

    private String nome;

    private int idade;

    private String endereco;

    private String genero;

    private String telefone;

    private int tempoDeTrabalho;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public int getTempoDeTrabalho() {
        return tempoDeTrabalho;
    }

    public void setTempoDeTrabalho(int tempoDeTrabalho) {
        this.tempoDeTrabalho = tempoDeTrabalho;
    }

    public String getNomeETelefone() {
        return nome + telefone;
    }

    public void setNomeETelefone(String nome, String telefone) {
        this.nome = nome;
        this.tempoDeTrabalho = tempoDeTrabalho;
    }

    public String getDadosCompletos() {
        return nome + idade + endereco + genero + telefone + tempoDeTrabalho;
    }

    public void setDadosCompletos(String nome, int idade, String endereco, String telefone, int tempoDeTrabalho) {

    }
}

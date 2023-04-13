package org.ua;

/**
 * Criar uma classe PESSOA e adicionar os seguintes atributos para ela
 * - Nome
 * - Idade
 * - Endereço
 * - Gênero
 * - Telefone
 * - Tempo de trabalho
 *
 * Essa classe deve ter um contrutor publico para instanciar todos os atributos listados acima
 *
 * Os métodos são:
 * -> getNome> Retorna o nome
 * -> getIdade> Retorna a idade
 * -> getEndereço> Retorna o endereço
 * -> getDadosCompletos> Retorna concatenado NOME, IDADE, GENERO, TELEFONE e TEMPO DE TRABALHO
 * -> getNomeETelefone> Retorna nome e telefone.
 * -> getTempoDeTrabalho> Retorna o tempo de trabalho.
 * -> getTempoParaSeAposentar> Assuma que a idade de aposentadoria é 60 anos feminino, 65 masculino.
 * -> getTelefone> Retorna o telefone.
 *
 * Em seguida crie uma classe de teste para PESSOA e cubra as funcionalidades
 * com testes unitários para validar o correto funcionamento da mesma.
 *
 *
 * ENTREGA
 *
 * A partir da branch aula-02 (upstram), deve ser criada uma branch com o seguinte padrão: ua-nome-sobrenome
 * e nela realizar o desenvolvimento da atividade. Após concluída, a ativade, gerar um PR (pull request) apontando para a branch
 * entrega-02 lá do repositório do professor.
 */

public class Pessoa {
    private String nome;
    private int idade;
    private String endereco;
    private String genero;
    private String telefone;
    private int tempoDeTrabalho;

    public String getNome() {
        return nome;
    }

    public Pessoa(String nome, int idade, String endereco, String genero, String telefone, int tempoDeTrabalho) {
        this.nome = nome;
        this.idade = idade;
        this.endereco = endereco;
        this.genero = genero;
        this.telefone = telefone;
        this.tempoDeTrabalho = tempoDeTrabalho;
    }

    public Pessoa() {
    }

    public int getIdade() {
        return idade;
    }

    public void setNome(String nome) {

        if(nome == null){
            throw new RuntimeException("Nome não pode ser nulo");
        }
        else {
            this.nome = nome;
        }
    }

    public void setIdade(int idade) {
            this.idade = idade;

    }

    public void setEndereco(String endereco) {
        if (endereco == null){
            throw new RuntimeException("Endereço não pode ser nulo");
        }
        else {
            this.endereco = endereco;
        }
    }

    public void setGenero(String genero) {
        if (genero == null){
            throw new RuntimeException("não pode ser nulo");
        }
        else {
            this.genero = genero;
        }
    }

    public void setTelefone(String telefone) {
        if (telefone == null){
            throw new RuntimeException("Telefone não pode ser nulo");
        }
        else {
            this.telefone = telefone;
        }
    }

    public void setTempoDeTrabalho(int tempoDeTrabalho) {
        this.tempoDeTrabalho = tempoDeTrabalho;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getGenero() {
        return genero;
    }

    public String getTelefone() {
        return telefone;
    }

    public int getTempoDeTrabalho() {
        return tempoDeTrabalho;
    }

    public String getDadosCompletos(){
        return nome + idade + endereco + genero +
                telefone + tempoDeTrabalho;
    }

    public String getNomeETelefone(){
        return nome + telefone;
    }

    public int getTempoParaSeAposentar(){
        if (getGenero().equals("Masculino") && getIdade()< 65){
            return 65 - getIdade();
        }
        else if (getGenero().equals("Feminino") && getIdade()< 60){
            return 60- getIdade();
        }
        else return 0;
    }
}

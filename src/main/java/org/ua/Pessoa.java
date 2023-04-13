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
    private Integer idade;
    private String endereco;
    private String genero;
    private String telefone;
    private Integer tempoDeTrabalho;
    private Integer tempoParaSeAposentar;

    public Pessoa(String nome, Integer idade, String endereco, String genero, String telefone, Integer tempoDeTrabalho) {
        this.nome = nome;
        this.idade = idade;
        this.endereco = endereco;
        this.genero = genero;
        this.telefone = telefone;
        this.tempoDeTrabalho = tempoDeTrabalho;
    }

    public Pessoa(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }

    public Pessoa() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome == null) {
            throw new RuntimeException("O nome inserido é nulo!");
        }
        else if (nome.isEmpty()) {
            throw new RuntimeException("O nome inserido é vazio");
        }
        else if (nome.trim().length() < 3) {
            throw new RuntimeException("O nome inserido possui menos que 3 letras");
        }
        else {
            this.nome = nome;
        }
    }

    public double getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        if (idade == null) {
            throw new RuntimeException("A idade inserida é nula!");
        }
        else if (idade == 0){
            throw new RuntimeException("A idade inserida possui o valor 0!");
        }
        else if (idade > 130){
            throw new RuntimeException("A idade inserida excede o limite máximo do campo idade (130)!");
        }
        else {
            this.idade = idade;
        }
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        if (endereco == null) {
            throw new RuntimeException("O endereço inserido é nulo!");
        }
        else if (endereco.isEmpty()) {
            throw new RuntimeException("O endereço inserido é vazio");
        }
        else if (endereco.trim().length() < 5) {
            throw new RuntimeException("O endereço inserido possui menos que 5 letras");
        }
        else {
            this.endereco = endereco;
        }
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        if (genero == null) {
            throw new RuntimeException("O gênero inserido é nulo!");
        }
        else if (genero.isEmpty()) {
            throw new RuntimeException("O gênero inserido é vazio");
        }
        else if(genero == "masculino" || genero == "feminino") {
            this.genero = genero;
        }
        else {
            throw new RuntimeException("O gênero inserido não é valido");
        }
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        if (telefone == null) {
            throw new RuntimeException("O telefone inserido é nulo!");
        }
        else if (telefone.isEmpty()) {
            throw new RuntimeException("O telefone inserido é vazio");
        }
        else if (telefone.trim().length() < 11) {
            throw new RuntimeException("O telefone inserido possui menos que 11 números");
        }
        else {
            this.telefone = telefone;
        }
    }

    public double getTempoDeTrabalho() {
        return tempoDeTrabalho;
    }

    public void setTempoDeTrabalho(Integer tempoDeTrabalho) {
        if (tempoDeTrabalho == null) {
            throw new RuntimeException("O tempo de trabalho inserido é nulo!");
        }
        else if (tempoDeTrabalho < 0){
            throw new RuntimeException("O tempo de trabalho inserido possui o valor menor que 0!");
        }
        else if (tempoDeTrabalho > 100){
            throw new RuntimeException("O tempo de trabalho excede o limite máximo do campo (100)!");
        }
        else {
            this.tempoDeTrabalho = tempoDeTrabalho;
        }
    }

    public double getTempoParaSeAposentar() {
        return tempoParaSeAposentar;
    }

    public void setTempoParaSeAposentar(Integer tempoParaSeAposentar) {
        this.tempoParaSeAposentar = tempoParaSeAposentar;
    }
}
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
    private Integer telefone;
    private Integer tempoTrabalho;
    private Integer tempoAposentar;

    public Pessoa(String nome, int idade, String endereco, String genero, int telefone, int tempoTrabalho) {
        this.nome = nome;
        this.idade = idade;
        this.endereco = endereco;
        this.genero = genero;
        this.telefone = telefone;
        this.tempoTrabalho = tempoTrabalho;
    }

    public Pessoa(String nome, int telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }

    public Pessoa() {
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if(nome == null){
            throw new RuntimeException("Nome é nulo");
        } else if(nome.isEmpty()){
            throw new RuntimeException("Nome é vazio");
        } else if(nome.trim().length() < 3){ //leo, ana, noa
            throw new RuntimeException("Nome tem menos que 3 caracteres");
        } else {
            this.nome = nome;
        }
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        if(idade == null){
            throw new RuntimeException("Idade é nulo");
        } else if(idade > 120){
            throw new RuntimeException("Pessoa ja morreu");
        } else {
            this.idade = idade;
        }
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        if(endereco == null){
            throw new RuntimeException("Endereço é nulo");
        } else {
            this.endereco = endereco;
        }
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        if(genero == null){
            throw new RuntimeException("Genero é nulo");
        } else {
            this.genero = genero;
        }
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(Integer telefone) {
        if(telefone == null){
            throw new RuntimeException("Telefone é nulo");
        } else {
            this.telefone = telefone;
        }
    }

    public int getTempoTrabalho() {
        return tempoTrabalho;
    }

    public void setTempoTrabalho(Integer tempoTrabalho) {
        if(tempoTrabalho == null) {
            throw new RuntimeException("Tempo de Trabalho é nulo");
        } else if (tempoTrabalho > 65) {
            throw new RuntimeException("Ta aposentado");
        } else {
            this.tempoTrabalho = tempoTrabalho;
        }
    }

    public int getTempoAposentar() {
        return tempoAposentar;
    }

    public void setTempoAposentar(String genero, Integer idade) {
        if(genero == "Masculino"){
            if(idade >= 65){
                throw new RuntimeException("Ja está aposentado");
            } else if(idade < 65){
                this.tempoAposentar = 65 - idade;
            }
        } else if(genero == "Feminino"){
            if(idade >= 60){
                throw new RuntimeException("Ja está aposentada");
            } else if(idade < 60){
                this.tempoAposentar = 60 - idade;
            }
        }
    }
}

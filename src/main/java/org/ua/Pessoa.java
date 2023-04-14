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
 * Essa classe deve ter um contrutor publico para instanciar todos os atributos
 * listados acima
 *
 * Os métodos são:
 * -> getNome> Retorna o nome
 * -> getIdade> Retorna a idade
 * -> getEndereço> Retorna o endereço
 * -> getDadosCompletos> Retorna concatenado NOME, IDADE, GENERO, TELEFONE e
 * TEMPO DE TRABALHO
 * -> getNomeETelefone> Retorna nome e telefone.
 * -> getTempoDeTrabalho> Retorna o tempo de trabalho.
 * -> getTempoParaSeAposentar> Assuma que a idade de aposentadoria é 60 anos
 * feminino, 65 masculino. 65-30 = 35, 60-30
 * -> getTelefone> Retorna o telefone.
 *
 * Em seguida crie uma classe de teste para PESSOA e cubra as funcionalidades
 * com testes unitários para validar o correto funcionamento da mesma.
 *
 *
 * ENTREGA
 *
 * A partir da branch aula-02 (upstram), deve ser criada uma branch com o
 * seguinte padrão: ua-nome-sobrenome
 * e nela realizar o desenvolvimento da atividade. Após concluída, a ativade,
 * gerar um PR (pull request) apontando para a branch
 * entrega-02 lá do repositório do professor.
 */

public class Pessoa {

    private String nome;
    private Integer idade;
    private String endereco;
    private String genero;
    private String telefone;
    private Integer anosTrabalhado;

    public Pessoa(String nome, Integer idade, String endereco, String genero, String telefone, Integer anosTrabalhado) {
        this.nome = nome;
        this.idade = idade;
        this.endereco = endereco;
        this.genero = genero;
        this.telefone = telefone;
        this.anosTrabalhado = anosTrabalhado;
    }

    public String getNome() {
        return nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public String getGenero() {
        return genero;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getDadospessoaiscompletos() {
        return String.format("%s , %d , %s, %s, %d", this.nome, this.idade, this.genero, this.telefone,
                this.anosTrabalhado);
    }

    public String getNomeETelefone() {
        return String.format("%s, %s", this.nome, this.telefone);
    }

    public Integer getAnosTrabalhados() {
        return this.anosTrabalhado;
    }

    public double tempoDeSeAposentar() {
        if (this.genero == "MASCULINO") {
            return 65 - this.anosTrabalhado;
        } else {
            return 60 - this.anosTrabalhado;
        }

    }

    public String getTelfone() {
        return telefone;
    }

}

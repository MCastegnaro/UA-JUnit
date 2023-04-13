package org.ua;

import java.sql.Time;
import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 * Criar uma classe PESSOA e adicionar os seguintes atributos para ela
 * nome
 * idade
 * endereço
 * genero
 * telefone
 * tempo de trabalho
 *
 * Essa classe deve ter um construtor publico para instanciar todos os atributos
 *
 * Os metodos sao
 * getNome > Retorna o nome
 * getIdade> Retorna a idade
 * getEndereço> Retorna o endereço
 * getDadosCompletos> Retorna concatenado Nome, idade, genero, telefone e tempo de trabalho
 * getNomeETelefone > Retorna nome e telefone
 * getTempoDeTrabalho > Retorna o tempo de trabalho
 * getTempoParaSeAposentar > Assuma que a idade de aposentadoria e 60 anos feminino e 65 masculino
 * getTelefone > Retorna telefone
 *
 * Em seguida crie uma Classe de teste para PESSOA e cubra as funcionalidades
 * com testes unitarios para validar o correto funcionamento da mesma
 *
 * ENTREGA
 * A partir da branch aula-02 (upstram), Deve ser criada um branch com o seguite padra: ua-nome-sobrenome-02
 * e nela realizar o desenvolvimento da atividade. Apos concluida a atividada gerar um pull request a pontando
 * para a branch entrega-02 la do repositorio do professor
 */

public class Pessoa{
    private String nome;
    private int idade;
    private String endereco;
    private String genero;
    private int telefone;
    private LocalTime tempoDetrabalho;

    public Pessoa(String nome, int idade, String endereco, String genero, int telefone, LocalTime tempoDetrabalho){
        this.nome = nome;
        this.idade = idade;
        this.endereco = endereco;
        this.genero = genero;
        this.telefone = telefone;
        this.tempoDetrabalho = tempoDetrabalho;
    }

    public String getNome(){
        return this.nome;
    }

    public int getIdade(){
        if (idade >= 0){
            return this.idade;
        } else {
            throw new RuntimeException("Voce nao pode colocar uma idade menor de Zero");
        }
    }

    public String getEndereco(){
        return this.endereco;
    }

    public String getDadosCompletos(){
        return "Nome-> " + this.nome + " " + "Idade-> " + this.idade + " " + "Endereço-> " + this.endereco + " " + "Genero-> " +this.genero + " " +
                "Telefone-> " + this.telefone + " " + "Tempo De Trabalho-> " +this.tempoDetrabalho;
    }

    public String getNomeETelefone(){
        return "Nome-> " + this.nome + " " + "Telefone-> " +this.telefone;
    }

    public LocalTime getTempoDetrabalho(){
        return this.tempoDetrabalho;
    }

    public void getTempoParaSeAposentar(){

        if(genero.equals("feminino") && idade >=60 || (genero.equals("masculino") && idade >=65 )){
            System.out.println("Voce pode se Aposentar");
        }else {
            throw new RuntimeException("Voce nao pode se Aposentar");
            //System.out.println("Voce nao pode se Aposentar");
        }
    }

    public int getTelefone(){
        return this.telefone;
    }

    public String getGenero(){
        return this.genero;
    }

}
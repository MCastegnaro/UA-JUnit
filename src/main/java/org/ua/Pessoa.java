package org.ua;

import java.time.LocalTime;

public class Pessoa {
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
            throw new RuntimeException("Idade não pode ser igual a 0");
        }
    }

    public String getGenero(){
        return this.genero;
    }

    public String getNomeETelefone(){
        return "Nome:" + this.nome + " " + "Telefone:" +this.telefone;
     }

    public String getEndereco(){
        return this.endereco;
    }

    public LocalTime getTempoDetrabalho(){
        return this.tempoDetrabalho;
    }

    public int getTelefone(){
        return this.telefone;
    }

    public String getDadosCompletos(){
        return "Nome: " + this.nome + " " + "Idade: " + this.idade + " " + "Endereço: " + this.endereco + " " + "Genero: " +this.genero + " " +
                "Telefone: " + this.telefone + " " + "Tempo De Trabalho: " +this.tempoDetrabalho;
    }
}

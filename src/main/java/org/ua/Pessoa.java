package org.ua;

 public class Pessoa {
    private String nome;
    private int idade;
    private String endereco;
    private String genero;
    private String telefone;
    private int tempoDeTrabalho;

    public Pessoa(String nome, int idade, String endereco, String genero, String telefone, int tempoDeTrabalho) {
        this.nome = nome;
        this.idade = idade;
        this.endereco = endereco;
        this.genero = genero;
        this.telefone = telefone;
        this.tempoDeTrabalho = tempoDeTrabalho;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
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

    public String getDadosCompletos() {
        return "Nome: " + nome + ", Idade: " + idade + ", Gênero: " + genero + ", Telefone: " + telefone + ", Tempo de trabalho: " + tempoDeTrabalho + " anos.";
    }

    public String getNomeETelefone() {
        return "Nome: " + nome + ", Telefone: " + telefone;
    }

    public int getTempoParaSeAposentar() {
        int tempoParaAposentadoria = 0;

        if (genero.equals("Masculino")) {
            return 65 - idade;
        } else if (genero.equalsIgnoreCase("Feminimo")){
            return 60 - idade;
        }
        if (tempoParaAposentadoria < 0) {
            return 0;
        } else {
            return tempoParaAposentadoria;
        }
    }
}
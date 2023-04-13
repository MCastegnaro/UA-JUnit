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

    private Integer idade;

    private String endereco;

    private String genero;

    private String telefone;

    private Integer tempoDeTrabalho;

    private Integer tempoParaSeAposentar;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome == null) {
            throw new RuntimeException("O nome inserido é nulo");
        } else if (nome.isEmpty()) {
            throw new RuntimeException("O nome inserido está vazio");
        } else if (nome.trim().length() < 3) {
            throw new RuntimeException("O nome inserido tem menos do que 3 letras");
        } else {
            this.nome = nome;
        }
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        if (idade == null) {
            throw new RuntimeException("O campo de idade está nulo");
        } else if (idade > 120) {
            throw new RuntimeException(("Não existe nenhuma pessoa viva com essa idade"));
        } else if (idade < 0) {
            throw new RuntimeException(("A idade não pode ser menor do que 0"));
        } else {
            this.idade = idade;
        }
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        if (endereco == null) {
            throw new RuntimeException("O campo de endereço está nulo");
        } else if (endereco.isEmpty()) {
            throw new RuntimeException("O campo de endereço está vazio");
        } else if (endereco.trim().length() < 5) {
            throw new RuntimeException("O endereço fornecido é muito curto");
        }
        this.endereco = endereco;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        if (genero == null) {
            throw new RuntimeException("O campo de gênero está nulo");
        } else if (genero.isEmpty()) {
            throw new RuntimeException("O campo de gênero está vazio");
        } else {
            this.genero = genero;
        }
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        if (telefone == null) {
            throw new RuntimeException("O campo de telefone está nulo");
        } else if (telefone.isEmpty()) {
            throw new RuntimeException("O campo de telefone está vazio");
        } else if (telefone.trim().length() < 12) {
            throw new RuntimeException("O telefone dado é inválido");
        } else {
            this.telefone = telefone;
        }
    }

    public Integer getTempoDeTrabalho() {
        return tempoDeTrabalho;
    }

    public void setTempoDeTrabalho(Integer tempoDeTrabalho) {
        if (tempoDeTrabalho == null) {
            throw new RuntimeException("O campo de tempo de trabalho está nulo");
        } else if (tempoDeTrabalho < 0) {
            throw new RuntimeException("O campo tempo de trabalho não pode ser menor que 0");
        } else {
            this.tempoDeTrabalho = tempoDeTrabalho;
        }
    }

    public String getNomeETelefone() {
        return nome + telefone;
    }

    public void setNomeETelefone(String nome, String telefone) {
        if (nome == null || telefone == null) {
            throw new RuntimeException("O campo de nome ou telefone está nulo");
        } else if (nome.isEmpty() || telefone.isEmpty()) {
            throw new RuntimeException("O campo de nome ou telefone está vazio");
        } else {
            this.nome = nome;
            this.telefone = telefone;
        }
    }

    public String getDadosCompletos() {
        return nome + idade + endereco + genero + telefone + tempoDeTrabalho;
    }

    public void setDadosCompletos(String nome, Integer idade, String endereco, String telefone, Integer tempoDeTrabalho) {

        if (nome == null || idade == null || endereco == null || genero == null || telefone == null || tempoDeTrabalho == null) {
            throw new RuntimeException("Um dos campos requeridos está nulo");
        } else if (nome.isEmpty() || idade < 0 || endereco.isEmpty() || telefone.isEmpty() || tempoDeTrabalho < 0) {
            throw new RuntimeException("Um dos campos requeridos está vazio ou com valor inválido");
        } else {
            this.nome = nome;
            this.idade = idade;
            this.endereco = endereco;
            this.telefone = telefone;
            this.tempoDeTrabalho = tempoDeTrabalho;
        }
    }

    public int getTempoParaSeAposentar() {

        if (genero.equals("Masculino")) {
            return 65 - idade;
        } else if (genero.equals("Feminino")) {
            return 60 - idade;
        } else {
            return tempoParaSeAposentar;
        }
    }

    public void setTempoParaSeAposentar(String genero, Integer idade) {

        if (genero == "Masculino") {
            if (idade >= 65) {
                throw new RuntimeException("Um homem com idade maior que 65 já deve está aposentado");
            } else if (idade < 65) {
                this.tempoParaSeAposentar = 65 - idade;
            }
        } else if (genero == "Feminino") {
            if (idade >= 60) {
                throw new RuntimeException("Uma mulher com idade maior que 60 já deve está aposentada");
            } else if (idade < 60) {
                this.tempoParaSeAposentar = 60 - idade;
            }
        }
    }
}

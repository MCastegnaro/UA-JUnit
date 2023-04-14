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
    private Genero genero;
    private String telefone;
    private String tempoDeTrabalho;

    public Pessoa(String nome, int idade, String endereco, Genero genero, String telefone, String tempoDeTrabalho){
        this.nome = nome;
        this.idade = idade;
        this.endereco = endereco;
        this.genero = genero;
        this.telefone = telefone;
        this.tempoDeTrabalho = tempoDeTrabalho;
    }

    public void cadastro(String nome, int idade, String endereco, Genero genero, String telefone, String tempoDeTrabalho){
        if(idade >= 65 && genero == Genero.MASCULINO){
            System.out.println("Idade suficiente para aposentar");

        }else{
            throw new RuntimeException("Para genero masculino sua idade é insufuciente para se aposentar!");
        }

        if(idade >= 60 && genero == genero.FEMININO){
            System.out.println("Idade suficiente para mulher se aponsentar ");
        }else{
            throw new RuntimeException("Para genero feminino sua idade é insufuciente para se aposentar!");
        }

        if (nome == null ){// verifica se nome é nullo para cadastro
            throw new RuntimeException("Cadastro negado, pois o nome está nullo!");
        }else{
            System.out.println("Nome valido para cadastro");
        }

        if (endereco == null){// verifica se endereco é nullo para cadastro
            throw new RuntimeException("Cadastro negado, pois o endereco está nullo!");
        }else{
            System.out.println("Endereco valido para cadastro");
        }

        if (telefone == null){// verifica se telefone é nullo para cadastro
            throw new RuntimeException("Cadastro negado, pois o telefone está nullo!");
        }else{
            System.out.println("Telefone valido para cadastro");
        }

        if (tempoDeTrabalho == null){// verifica se tempo de trabalho é nullo para cadastro
            throw new RuntimeException("Cadastro negado, pois o Tempo de trabalho está nullo!");
        }else{
            System.out.println("Tempo de trabalho valido para cadastro");
        }

        if (nome == null && endereco == null && telefone == null && tempoDeTrabalho == null ){// verifica se os campos em geral estão nullos
            throw new RuntimeException("Cadastro negado, pois os campos estão nullos!");
        }else{
            System.out.println("Cadastro realizado, campos preenchidos com sucesso");
        }



    }



    public String getNome(){
        return nome;
    }

    public int getIdade(){
        return idade;
    }

    public String getEndereco(){
        return endereco;
    }

    public Genero getGenero(){
        return genero;
    }

    public String getTelefone(){
        return telefone;
    }
    public String getTempoDeTrabalho(){
        return tempoDeTrabalho;
    }


    public PessoaDadosCompletos getDadosCompletos(){// metodo get para todos os atributos juntos
        return new PessoaDadosCompletos(nome, idade, endereco, genero,telefone, tempoDeTrabalho);
    }

    public PessoaNomeTelefone getNomeTelefone(){ // metodo get para nome e telefone juntos
        return new PessoaNomeTelefone(nome,telefone);
    }


    public class PessoaDadosCompletos{
        private String nome;
        private int idade;
        private String endereco;
        private Genero genero;
        private String telefone;
        private String tempoDeTrabalho;

        public String getNome(){
            return nome;
        }

        public int getIdade(){
            return idade;
        }

        public String getEndereco(){
            return endereco;
        }

        public Genero getGenero(){
            return genero;
        }

        public String getTelefone(){
            return telefone;
        }

        public String getTempoDeTrabalho(){
            return tempoDeTrabalho;
        }

        public PessoaDadosCompletos(String nome,int idade, String endereco, Genero genero, String telefone, String tempoDeTrabalho){
            this.nome = nome;
            this.idade = idade;
            this.endereco = endereco;
            this.genero = genero;
            this.telefone = telefone;
            this.tempoDeTrabalho = tempoDeTrabalho;

        }
    }

    public class PessoaNomeTelefone{
        private String nome;
        private String telefone;


        public String getNome(){
            return nome;
        }

        public String getTelefone(){
            return telefone;
        }

        public PessoaNomeTelefone(String nome, String telefone){
            this.nome = nome;
            this.telefone = telefone;
        }


    }



}

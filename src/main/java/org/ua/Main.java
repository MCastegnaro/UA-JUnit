package org.ua;

import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("Eduardo", 65, "rua 23", "masculino", 48977897, LocalTime.of(5,6));
        System.out.println( "Nome: " + pessoa1.getNome() + " " + "Idade: " + pessoa1.getIdade() + " " + "Endereço: " + pessoa1.getEndereco() +
                " " + "Genero: " + pessoa1.getGenero() + " " + "Telefone: " + pessoa1.getTelefone() + " " + "Tempo De Trabalho: " + pessoa1.getTempoDetrabalho());

        pessoa1.getTempoParaSeAposentar();
        System.out.println(" ");
        System.out.println(pessoa1.getDadosCompletos());
        System.out.println(" ");
        System.out.println(pessoa1.getNomeETelefone());
        System.out.println(" ");
        System.out.println(pessoa1.getDadosCompletos());

    }
}

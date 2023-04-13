package org.ua;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Loja {
    private List<Cliente> clientes;

    public Loja(){
        this.clientes = new ArrayList<>();
    }

    public void adicionarClientes(Cliente cliente){
        clientes.add(cliente);
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public boolean removerCliente(Cliente cliente){
        return clientes.remove(cliente);
    }

    public Optional<Cliente> buscarClientePorNome(String nome) {
        return clientes.stream().filter(cliente -> cliente.getName().equals(nome)).findFirst();
    }
}

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.ua.Cliente;
import org.ua.Loja;

import java.util.List;
import java.util.Optional;

public class LojaTest {

    private Loja loja;

    @BeforeEach
    public void setUp(){
        loja = new Loja();
    }
    @Test
    @DisplayName("Deve adicionar clientes na lista")
    public void testAdicionarCliente(){
        Cliente cliente1 = new Cliente("Maria");
        Cliente cliente2 = new Cliente("Igor");
        Cliente cliente3 = new Cliente("Gustavo");

        loja.adicionarClientes(cliente1);
        loja.adicionarClientes(cliente2);
        loja.adicionarClientes(cliente3);

        List<Cliente> clientes = loja.getClientes();

        Assertions.assertEquals(3, clientes.size(), "Deve haver 3 clientes na loja.");
        Assertions.assertEquals("Maria", clientes.get(0).getName(), "O primeiro cliente deve ser a maria.");
        Assertions.assertEquals("Igor", clientes.get(1).getName(), "O segundo cliente deve ser o igor.");
    }

    @Test
    @DisplayName("Deve remover clientes da lista")
    public void testRemoverCliente(){
        Cliente cliente1 = new Cliente("Maria");
        Cliente cliente2 = new Cliente("Igor");
        Cliente cliente3 = new Cliente("Gustavo");

        loja.adicionarClientes(cliente1);
        loja.adicionarClientes(cliente2);
        loja.adicionarClientes(cliente3);

        boolean removido = loja.removerCliente(cliente1);
        Assertions.assertTrue(removido, "Deve remover 'Maria' com sucesso");
        Assertions.assertEquals(2, loja.getClientes().size(), "Deve haver apenas 2 clientes na lista.");

        boolean naoRemovido = loja.removerCliente(new Cliente("Luis"));
        Assertions.assertFalse(naoRemovido, "Não deve remover o cliente 'Luis', pois ele não foi inserido na lista.");
        Assertions.assertEquals(2, loja.getClientes().size(), "A quantidade de clientes deve continuar 2");
    }

    @Test
    @DisplayName("Deve buscar cliente pelo nome")
    public void testBuscarClientePorNome(){
        Cliente cliente1 = new Cliente("Maria");
        Cliente cliente2 = new Cliente("Igor");
        Cliente cliente3 = new Cliente("Gustavo");

        loja.adicionarClientes(cliente1);
        loja.adicionarClientes(cliente2);
        loja.adicionarClientes(cliente3);

        Optional<Cliente> clienteEncontrado = loja.buscarClientePorNome("Maria");

        Assertions.assertTrue(clienteEncontrado.isPresent(), "Deve encontrar a cliente Maria na lista.");
        Assertions.assertEquals("Maria", clienteEncontrado.get().getName(), "O cliente encontrado deve ser a Maria");

        Optional<Cliente> clienteNaoEncontrado = loja.buscarClientePorNome("Anderson");
        Assertions.assertFalse(clienteNaoEncontrado.isPresent(), "Não deve encrontrar o 'Anderson' na lista");
    }
}

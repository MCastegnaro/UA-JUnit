import org.ua.Conta

public class ContaTest{
    
    @Test
    @DisplayName("Deve depositar com Conta Ativa!")
    public void depositarContaAtiva(){
        Conta conta = new Conta();
        conta.ativar();
        conta.depositar(150.0);
        Assertions.assertEquals(150.0, conta.getSaldo());        
        
    }

    @Test
    @DisplayName("Nao deve depositar com Conta Ativa!")
    public void naoDepositarContaAtiva(){
        Conta conta = new Conta();
        conta.desativar();
        conta.depositar(700.0);
        Assertions.assertEquals(0, conta.getSaldo());            
    }

    @Test
    @DisplayName("Deve sacar apenas se o valor do saque for menor do que o saldo!")
    public void sacarContaAtiva(){
        Conta conta = new Conta();
        conta.ativar();
        conta.depositar(150.0);
        conta.sacar(50.0);
        conta.sacar(500.0);
        Assertions.assertEquals(100.0, conta.getSaldo());        
    }

    @Test
    @DisplayName("Nao deve sacar com conta inativa!")
    public void sacarContaAtiva(){
        Conta conta = new Conta();
        conta.ativar();
        conta.depositar(150.0);
        conta.desativar();
        conta.sacar(100.0);
        Assertions.assertEquals(150.0, conta.getSaldo());        
    }


}
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import br.com.bancoatm.modelo.Cliente;
import br.com.bancoatm.modelo.Conta;

public class ContaTest {

    @Test
    public void depositarTest() {
        Cliente cliente = new Cliente("Maria Oliveira", "98765432100");
        Conta conta = new Conta(cliente, 1);
        conta.depositar(200.00);
        assertEquals(200.00, conta.getSaldo());
    }

    @Test
    public void sacarTest() {
        Cliente cliente = new Cliente("Carlos Pereira", "12312312312");
        Conta conta = new Conta(cliente, 2);
        conta.depositar(500.00);
        assertTrue(conta.sacar(300.00));
        assertEquals(200.00, conta.getSaldo());
        assertFalse(conta.sacar(300.00)); // Testa tentativa de saque sem saldo suficiente
    }
}

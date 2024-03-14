import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import br.com.bancoatm.modelo.Cliente;

public class ClienteTest {

    @Test
    public void testaCliente() {
        Cliente cliente = new Cliente("João Silva", "12345678909");
        assertEquals("João Silva", cliente.getNome());
        assertEquals("12345678909", cliente.getCpf());
    }
}

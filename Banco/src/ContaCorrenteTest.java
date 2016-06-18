import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ContaCorrenteTest {

    ContaCorrente conta;

    @Before
    public void inicializaConta() {
	conta = new ContaCorrente();
	conta.depositar(200);
    }

    @Test
    public void testSacar() {
	
	int valorSacado = conta.sacar(50);
	assertEquals(150, conta.saldo);
	assertEquals(50, valorSacado);
    }

    @Test
    public void testDepositar() {

	assertEquals(200, conta.saldo);
    }

    @Test
    public void saqueMaiorQueSaldo() {
	int valorSacado = conta.sacar(250);
	assertEquals(200, conta.saldo);
	assertEquals(0, valorSacado);

    }
}

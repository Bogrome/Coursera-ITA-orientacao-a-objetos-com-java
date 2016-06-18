import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class ContaEspecialTest extends ContaCorrenteTest {


    @Before
    public void inicializaConta() {
	conta = new ContaEspecial(100);
	conta.depositar(200);
    }
    
    @Test
    public void saqueMaiorQueSaldo() {
	int valorSacado = conta.sacar(350);
	assertEquals(200, conta.saldo);
	assertEquals(0, valorSacado);

    }
    
    @Test
    public void saqueMaiorQueSaldoDentroDoLimite() {
	int valorSacado = conta.sacar(250);
	assertEquals(-50, conta.saldo);
	assertEquals(250, valorSacado);

    }
 

}

import static org.junit.Assert.*;

import org.junit.Test;

public class CompraParceladaTest {

    @Test
    public void testCompraParcelada() {
	fail("Not yet implemented"); // TODO
    }

    @Test
    public void testTotal() {

	CompraParcelada compra = new CompraParcelada(10000, 5, 5);
	assertEquals(11603.82, compra.total(), 0.1);

    }

}

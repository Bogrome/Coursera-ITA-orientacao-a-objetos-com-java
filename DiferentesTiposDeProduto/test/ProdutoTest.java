
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class ProdutoTest {

    Produto p1;
    Produto p2;
    Produto p3;
    Produto p4;

    @Before
    public void before() {
	p1 = new Produto("P1", 111);
	p2 = new Produto("P2", 111);
	p3 = new Produto("P3", 111);
	p4 = new Produto("P4", 222);
    }

    @Test
    public void testEqualsReflexivo() {
	// propriedade reflexiva
	assertTrue(p1.equals(p1));
    }

    @Test
    public void testEqualsSimetrico() {
	// propriedade sim�trica
	assertTrue(p1.equals(p2) == p2.equals(p1));
    }

    @Test
    public void testEqualsTransitivo() {
	// propriedade transitiva
	if (p1.equals(p2) && p2.equals(p3)) {
	    assertTrue(p1.equals(p3));
	}
    }

    @Test
    public void testEqualsConsistencia() {
	// propriedade da consist�ncia
	assertTrue(p1.equals(p2) == p1.equals(p2));
    }

    @Test
    public void testEqualsNaoNula() {
	// propriedade nao-nula
	assertFalse(p1.equals(null));

    }

    @Test
    public void testEqualsProdutosDiferentes() {
	assertFalse(p1.equals(p4));

    }

    @Test
    public void testHashCode() {
	assertTrue(p1.hashCode() == p2.hashCode());

    }

}

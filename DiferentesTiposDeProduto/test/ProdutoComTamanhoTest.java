
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ProdutoComTamanhoTest extends ProdutoTest {

    ProdutoComTamanho p1;
    ProdutoComTamanho p2;
    ProdutoComTamanho p3;
    ProdutoComTamanho p4;

    @Before
    public void before() {
	p1 = new ProdutoComTamanho("P1", 111, "P");
	p2 = new ProdutoComTamanho("P2", 111, "P");
	p3 = new ProdutoComTamanho("P3", 111, "P");
	p4 = new ProdutoComTamanho("P4", 111, "M");

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

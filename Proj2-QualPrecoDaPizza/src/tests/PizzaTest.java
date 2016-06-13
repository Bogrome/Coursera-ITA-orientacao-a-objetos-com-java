package tests;


import static org.junit.Assert.assertEquals;


import org.junit.Before;
import org.junit.Test;

import main.Pizza;

public class PizzaTest {

    @Before
    public void limpaIngredientesDepoisTeste() {
	Pizza.limpaIngredientes();

    }
    
    
    @Test
    public void valorUmIngrediente() {
	Pizza pizza = new Pizza();
	pizza.adicionaIngrediente("ingrediente 1");

	assertEquals(15, pizza.getPreco());
	assertEquals(1, pizza.quantidadeIngredientes);
	assertEquals(1, Pizza.ingredientes.size());
    }
    
    @Test
    public void testUmIngrediente(){
	Pizza pizza = new Pizza();
	pizza.adicionaIngrediente("ingrediente 1");

	assertEquals(1, Pizza.ingredientes.size());
	
    }

    @Test
    public void valorDoisIngredientes() {
	Pizza pizza = new Pizza();
	pizza.adicionaIngrediente("ingrediente 1");
	pizza.adicionaIngrediente("ingrediente 2");

	assertEquals(15, pizza.getPreco());
	assertEquals(2, pizza.quantidadeIngredientes);
	assertEquals(2, Pizza.ingredientes.size());
    }
    
    @Test
    public void testDoisIngredientes(){
	Pizza pizza = new Pizza();
	pizza.adicionaIngrediente("ingrediente 1");
	pizza.adicionaIngrediente("ingrediente 2");

	assertEquals(2, Pizza.ingredientes.size());
    }

    @Test
    public void valorTresIngredientes() {
	Pizza pizza = new Pizza();
	pizza.adicionaIngrediente("ingrediente 1");
	pizza.adicionaIngrediente("ingrediente 2");
	pizza.adicionaIngrediente("ingrediente 3");

	assertEquals(20, pizza.getPreco());
	assertEquals(3, pizza.quantidadeIngredientes);
	assertEquals(3, Pizza.ingredientes.size());

    }

    @Test
    public void valorQuatroIngredientes() {
	Pizza pizza = new Pizza();
	pizza.adicionaIngrediente("ingrediente 1");
	pizza.adicionaIngrediente("ingrediente 2");
	pizza.adicionaIngrediente("ingrediente 3");
	pizza.adicionaIngrediente("ingrediente 4");

	assertEquals(20, pizza.getPreco());
	assertEquals(4, pizza.quantidadeIngredientes);
	assertEquals(4, Pizza.ingredientes.size());
    }

    @Test
    public void valorCincoIngredientes() {
	Pizza pizza = new Pizza();
	pizza.adicionaIngrediente("ingrediente 1");
	pizza.adicionaIngrediente("ingrediente 2");
	pizza.adicionaIngrediente("ingrediente 3");
	pizza.adicionaIngrediente("ingrediente 4");
	pizza.adicionaIngrediente("ingrediente 5");

	assertEquals(20, pizza.getPreco());
	assertEquals(5, pizza.quantidadeIngredientes);
	assertEquals(5, Pizza.ingredientes.size());
    }

    @Test
    public void valorSeisIngredientes() {
	Pizza pizza = new Pizza();
	pizza.adicionaIngrediente("ingrediente 1");
	pizza.adicionaIngrediente("ingrediente 2");
	pizza.adicionaIngrediente("ingrediente 3");
	pizza.adicionaIngrediente("ingrediente 4");
	pizza.adicionaIngrediente("ingrediente 5");
	pizza.adicionaIngrediente("ingrediente 6");

	assertEquals(23, pizza.getPreco());
	assertEquals(6, pizza.quantidadeIngredientes);
	assertEquals(6, Pizza.ingredientes.size());
    }
    
    @Test
    public void testSeisIngredientes(){
	Pizza pizza = new Pizza();
	pizza.adicionaIngrediente("ingrediente 1");
	pizza.adicionaIngrediente("ingrediente 2");
	pizza.adicionaIngrediente("ingrediente 3");
	pizza.adicionaIngrediente("ingrediente 4");
	pizza.adicionaIngrediente("ingrediente 5");
	pizza.adicionaIngrediente("ingrediente 6");

	assertEquals(6, pizza.quantidadeIngredientes);
	assertEquals(6, Pizza.ingredientes.size());
    }

}

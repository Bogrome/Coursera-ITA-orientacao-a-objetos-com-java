package tests;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import main.CarrinhoDeCompras;
import main.Pizza;

public class CarrinhoDeComprasTest {

    
    @Test
    public void testAdicionaPizzaVazia() {
	Pizza pizzaVazia = new Pizza();

	CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
	carrinho.adicionaPizza(pizzaVazia);

	assertEquals(0, carrinho.valorTotal());
    }

    @Test
    public void testValorUmaPizza() {
	Pizza pizza = new Pizza();
	pizza.adicionaIngrediente("ingrediente 1");
	
	CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
	carrinho.adicionaPizza(pizza);
	
	assertEquals(15, carrinho.valorTotal());
    }
    
    @Test
    public void testValorTresPizzas(){
	Pizza nutellaComBanana = new Pizza();
	nutellaComBanana.adicionaIngrediente("nutella");
	nutellaComBanana.adicionaIngrediente("banana");
	nutellaComBanana.setApelido("Nutella com banana"); 
	
	
	Pizza caipira = new Pizza();
	caipira.adicionaIngrediente("molho");
	caipira.adicionaIngrediente("frango");
	caipira.adicionaIngrediente("catupiry");
	caipira.adicionaIngrediente("milho");
	caipira.adicionaIngrediente("mozarela");
	
	Pizza frangoRequeijao = new Pizza();
	frangoRequeijao.adicionaIngrediente("molho");
	frangoRequeijao.adicionaIngrediente("frango");
	frangoRequeijao.adicionaIngrediente("catupiry");
	frangoRequeijao.adicionaIngrediente("milho");
	frangoRequeijao.adicionaIngrediente("mozarela");
	frangoRequeijao.adicionaIngrediente("requeijao");

	Pizza vazia = new Pizza();
	
	CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
	carrinho.adicionaPizza(nutellaComBanana);
	carrinho.adicionaPizza(caipira);
	carrinho.adicionaPizza(frangoRequeijao);
	carrinho.adicionaPizza(vazia);
	
	assertEquals(58, carrinho.valorTotal());
    }

}

public class Principal {

    public static void main(String[] args) {

	Pizza nutellaComBanana = new Pizza();
	nutellaComBanana.adicionaIngrediente("nutella");
	nutellaComBanana.adicionaIngrediente("banana");
	nutellaComBanana.setApelido("Nutella com banana"); 

	Pizza marguerita = new Pizza();
	marguerita.adicionaIngrediente("molho");
	marguerita.adicionaIngrediente("mozarela");
	marguerita.adicionaIngrediente("manjericao");

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
	vazia.setApelido("vazia");

	CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
	carrinho.adicionaPizza(nutellaComBanana);
	carrinho.adicionaPizza(marguerita);
	carrinho.adicionaPizza(caipira);
	carrinho.adicionaPizza(frangoRequeijao);
	carrinho.adicionaPizza(vazia);

	/* Relatorio */
	carrinho.listaPizzas();
	System.out.printf("\nValor da compra:\n\tR$ %.2f \n", (double) carrinho.valorTotal());

	Pizza.imprimeIngredientesUtilizados();
	
	
	

    }

}

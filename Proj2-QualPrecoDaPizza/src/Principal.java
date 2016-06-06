public class Principal {

    public static void main(String[] args) {

	Pizza nutellaComBanana = new Pizza();
	nutellaComBanana.adicionaIngrediente("nutella");
	nutellaComBanana.adicionaIngrediente("banana");

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

	CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
	carrinho.adicionaPizza(nutellaComBanana);
	carrinho.adicionaPizza(marguerita);
	carrinho.adicionaPizza(caipira);
	carrinho.adicionaPizza(frangoRequeijao);
	carrinho.adicionaPizza(vazia);

	/* Relatorio */
	System.out.printf("Nutella com banana: R$ %.2f \n", (float) nutellaComBanana.getPreco());
	System.out.printf("Marguerita: R$ %.2f \n", (float) marguerita.getPreco());
	System.out.printf("Caipira: R$ %.2f \n", (float) caipira.getPreco());
	System.out.printf("Frango requeijao: R$ %.2f \n", (float) frangoRequeijao.getPreco());
	System.out.printf("Vazia: R$ %.2f \n", (float) vazia.getPreco());

	System.out.printf("\nValor da compra:\n\tR$ %.2f \n", (double) carrinho.valorTotal());

	Pizza.imprimeIngredientesUtilizados();
	

    }

}

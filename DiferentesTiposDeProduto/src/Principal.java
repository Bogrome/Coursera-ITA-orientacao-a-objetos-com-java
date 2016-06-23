
public class Principal {

    public static void main(String[] args) {
	Produto cinto_marrom;
	Produto cinto_preto;
	Produto cinto_azul;
	Produto bone;
	cinto_marrom = new Produto("Cinto Marrom", 111);
	cinto_marrom.setPreco(10);
	cinto_preto = new Produto("Cinto Preto", 111);
	cinto_preto.setPreco(10);
	cinto_azul = new Produto("Cinto Azul", 111);
	cinto_azul.setPreco(10);
	bone = new Produto("Bone", 222);
	bone.setPreco(19);

	ProdutoComTamanho tenis1 = new ProdutoComTamanho("Tenis", 1001, "34");
	tenis1.setPreco(200.0);
	ProdutoComTamanho tenis2 = new ProdutoComTamanho("Tenis", 1001, "35");
	tenis2.setPreco(200.0);
	ProdutoComTamanho tenis3 = new ProdutoComTamanho("Tenis corrida", 1001, "34");
	tenis3.setPreco(300.0);
	ProdutoComTamanho camiseta = new ProdutoComTamanho("Camiseta Branca", 1002, "P");
	camiseta.setPreco(10);

	CarrinhoDeCompras carrinho2 = new CarrinhoDeCompras();
	carrinho2.adicionaProduto(cinto_preto, 1);
	carrinho2.adicionaProduto(tenis1, 1);
	carrinho2.adicionaProduto(tenis2, 1);
	carrinho2.adicionaProduto(tenis3, 1);
	carrinho2.adicionaProduto(camiseta, 2);

	carrinho2.listaCarrinho();

	System.out.println(carrinho2.calculaValor());

    }

}

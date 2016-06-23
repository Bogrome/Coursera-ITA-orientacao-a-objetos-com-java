import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CarrinhoDeComprasTest {

    Produto cinto_marrom;
    Produto cinto_preto;
    Produto cinto_azul;
    Produto bone;
    ProdutoComTamanho tenis1;
    ProdutoComTamanho tenis2;
    ProdutoComTamanho tenis3;
    ProdutoComTamanho camiseta;

    @Before
    public void before() {
	cinto_marrom = new Produto("Cinto Marrom", 111);
	cinto_marrom.setPreco(10);
	cinto_preto = new Produto("Cinto Preto", 111);
	cinto_preto.setPreco(10);
	cinto_azul = new Produto("Cinto Azul", 111);
	cinto_azul.setPreco(10);
	bone = new Produto("Bone", 222);
	bone.setPreco(19);

	tenis1 = new ProdutoComTamanho("Tenis", 1001, "34");
	tenis1.setPreco(200.0);
	tenis2 = new ProdutoComTamanho("Tenis", 1001, "35");
	tenis2.setPreco(200.0);
	tenis3 = new ProdutoComTamanho("Tenis corrida", 1001, "34");
	tenis3.setPreco(300.0);
	camiseta = new ProdutoComTamanho("Camiseta Branca", 1002, "P");
	camiseta.setPreco(10);

    }

    @Test
    public void testAdicionaProdutoProdutoSemTamanho() {
	CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
	carrinho.adicionaProduto(cinto_marrom, 1);
	carrinho.adicionaProduto(cinto_preto, 1);
	carrinho.adicionaProduto(cinto_azul, 1);
	carrinho.adicionaProduto(bone, 5);

	assertEquals(2, carrinho.numeroProdutosDiferentes());

    }

    @Test
    public void testAdicionaProdutoComTamanho() {

	CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
	carrinho.adicionaProduto(tenis1, 1);
	carrinho.adicionaProduto(tenis2, 1);
	carrinho.adicionaProduto(tenis3, 1);
	carrinho.adicionaProduto(camiseta, 1);

	assertEquals(3, carrinho.numeroProdutosDiferentes());

    }

    @Test
    public void testAdicionaProdutoMisto() {
	CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
	carrinho.adicionaProduto(bone, 1);
	carrinho.adicionaProduto(tenis1, 1);
	carrinho.adicionaProduto(tenis2, 1);
	carrinho.adicionaProduto(tenis3, 1);
	carrinho.adicionaProduto(camiseta, 1);

	assertEquals(4, carrinho.numeroProdutosDiferentes());
    }

    @Test
    public void testCalculaValor() {

	CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
	carrinho.adicionaProduto(tenis1, 1);
	carrinho.adicionaProduto(tenis2, 1);
	carrinho.adicionaProduto(tenis3, 1);

	assertEquals(600.0, carrinho.calculaValor(), 0.1);

    }

    @Test
    public void testRemoveProduto() {
	CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
	carrinho.adicionaProduto(tenis1, 2);
	carrinho.adicionaProduto(camiseta, 1);

	assertEquals(410.0, carrinho.calculaValor(), 0.1);
	assertEquals(2, carrinho.numeroProdutosDiferentes());
	carrinho.removeProduto(tenis1, 1);
	assertEquals(210.0, carrinho.calculaValor(), 0.1);

    }

    @Test
    public void testRemoveQuantidadeMaiorDoProduto() {
	CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
	carrinho.adicionaProduto(tenis1, 2);
	carrinho.adicionaProduto(camiseta, 1);

	assertEquals(410.0, carrinho.calculaValor(), 0.1);
	carrinho.removeProduto(tenis1, 3);
    }

}

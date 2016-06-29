
import java.util.Collection;
import java.util.HashMap;

public class CarrinhoDeCompras {

    private HashMap<Produto, Integer> produtoCarrinho = new HashMap<Produto, Integer>();

    public void adicionaProduto(Produto produto, int quantidade) {
	if (produtoCarrinho.containsKey(produto)) {
	    int valor = produtoCarrinho.get(produto);
	    produtoCarrinho.put(produto, valor + quantidade);
	} else
	    produtoCarrinho.put(produto, quantidade);
    }

    public void removeProduto(Produto produto, int quantidade) {
	try {
	    if (produtoCarrinho.containsKey(produto)) {
		int valor = produtoCarrinho.get(produto);
		if (valor >= quantidade) {
		    produtoCarrinho.put(produto, valor - quantidade);
		    if (valor == 0) {
			produtoCarrinho.remove(produto);
		    }
		}
	    }
	} catch (Exception e) {
	    e.printStackTrace();
	}
    }

    public double calculaValor() {

	if (produtoCarrinho.isEmpty())
	    return 0;

	Collection<Produto> itens = produtoCarrinho.keySet();
	double total = 0.0;
	for (Produto item : itens) {
	    double subtotal = item.getPreco() * produtoCarrinho.get(item);
	    total += subtotal;
	}
	return total;
    }

    public int numeroProdutosDiferentes() {
	return produtoCarrinho.size();

    }

    public void listaCarrinho() {

	Collection<Produto> itens = produtoCarrinho.keySet();
	for (Produto item : itens) {
	    System.out.println("NOME: " + item.getNome() + "| CODIGO: " + item.getCodigo() + "| QTDE: "
		    + produtoCarrinho.get(item));
	}

    }
}

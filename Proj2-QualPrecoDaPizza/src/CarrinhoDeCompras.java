
public class CarrinhoDeCompras {

    private int subtotal = 0;

    public void adicionaPizza(Pizza pizza) {

	if (pizza.getPreco() != 0) {
	    // adiciona a pizza somente se o preço for > 0
	    this.subtotal += pizza.getPreco();
	}

    }

    public int valorTotal() {
	return this.subtotal;

    }

}

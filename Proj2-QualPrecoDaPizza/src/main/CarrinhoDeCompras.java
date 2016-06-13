package main;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    private int subtotal = 0;
    private List<Pizza> pizzas = new ArrayList<>();

    public void adicionaPizza(Pizza pizza) {

	if (pizza.quantidadeIngredientes > 0) {
	    pizzas.add(pizza);
	}

    }

    public int valorTotal() {

	for (Pizza pizza : pizzas) {
	    this.subtotal += pizza.getPreco();
	}
	return this.subtotal;

    }

    public void listaPizzas() {
	for (int i = 0; i < pizzas.size(); i++) {
	    System.out.println((i + 1) + ")\t R$ " + pizzas.get(i).getPreco() + " "
		    + ((pizzas.get(i).getApelido()) != null ? pizzas.get(i).getApelido() : " ")); 
	    // imprime o "apelido" da pizza somente se houver
	}
    }

}

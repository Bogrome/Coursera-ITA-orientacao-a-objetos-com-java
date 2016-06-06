import java.util.Collection;
import java.util.HashMap;

public class Pizza {

    private int preco = 0;
    private int quantidadeIngredientes = 0;

    static HashMap<String, Integer> ingredientes = new HashMap<String, Integer>();

    public void adicionaIngrediente(String ingrediente) {

	contabilizaIngrediente(ingrediente);
	quantidadeIngredientes++;
    }

    public int getPreco() {
	/*
	 * 2 ingredientes ou menos custam 15 reais
	 * 
	 * 3 a 5 ingredientes custam 20 reais
	 * 
	 * mais de 5 ingredientes custa 23 reais
	 */
	int quantidade = this.quantidadeIngredientes;
	if (quantidade <= 2 && quantidade > 0) {
	    this.preco = 15;
	} else if (quantidade >= 3 && quantidade <= 5) {
	    this.preco = 20;
	} else if (quantidade > 5) {
	    this.preco = 23;
	}
	return preco;

    }

    public static void contabilizaIngrediente(String ingrediente) {

	if (ingredientes.containsKey(ingrediente)) {
	    int valor = ingredientes.get(ingrediente);
	    ingredientes.put(ingrediente, valor + 1);

	} else {
	    ingredientes.put(ingrediente, 1);
	}

    }

    static void imprimeIngredientesUtilizados() {

	// Get all Keys from the HashMap.
	Collection<String> values = ingredientes.keySet();
	System.out.println("\nIngredientes utilizados:");
	for (String value : values) {
	    System.out.printf("%15s %d\n", value, ingredientes.get(value));
	}
    }

}

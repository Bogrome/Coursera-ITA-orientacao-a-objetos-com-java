import java.util.ArrayList;
import java.util.List;

public class CompraParcelada extends Compra {

    private int numParcelas;
    private double jurosMensal;
    private float valorComJuros;
    private List<Double> parcelas;
    
    public CompraParcelada(double valor, int parcelas, double juros) {
	super(valor);
	this.numParcelas = parcelas;
	this.jurosMensal = juros/100;
    }
    
    
    
    public double total(){
	valorComJuros = (float) (valorCompra * Math.pow(1+ jurosMensal, numParcelas));
	return valorComJuros;
	
    }
    
    public void calculaParcelas(){
	parcelas = new ArrayList<>();
	double parcelaSemJuros = valorCompra/numParcelas;
	
	double parcela = parcelaSemJuros;

	for (int i = 1; i <= numParcelas; i++) {
	    parcela = parcela *(1 + jurosMensal);
	    parcelas.add(parcela);
   	}
   }
    
    public void imprimeParcelas() {
	if (parcelas == null) {
	    calculaParcelas();
	}
	for (double parcela : parcelas) {
	    System.out.println(parcela);
	}
	
	System.out.printf("Total: R$%.2f",total());
    }
    
    
    

}

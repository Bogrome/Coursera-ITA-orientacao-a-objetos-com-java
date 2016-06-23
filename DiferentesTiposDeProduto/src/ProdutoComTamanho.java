
public class ProdutoComTamanho extends Produto {

    private String tamanho;

    public ProdutoComTamanho(String nome, long codigo, String tamanho) {
	super(nome, codigo);
	this.tamanho = tamanho;
    }

    public String getTamanho() {
	return tamanho;
    }

    public void setTamanho(String tamanho) {
	this.tamanho = tamanho;
    }

    @Override
    public int hashCode() {
	final int prime = 31;
	int result = super.hashCode();
	result = prime * result + ((tamanho == null) ? 0 : tamanho.hashCode());
	return result;
    }

    @Override
    public boolean equals(Object obj) {

	if (obj instanceof ProdutoComTamanho) {

	    ProdutoComTamanho other = (ProdutoComTamanho) obj;
	    if (tamanho == null) {
		if (other.tamanho != null) {
		    return false;
		}
	    } else if (!tamanho.equals(other.tamanho)) {
		return false;
	    }
	    return true;
	}
	return false;
    }

}

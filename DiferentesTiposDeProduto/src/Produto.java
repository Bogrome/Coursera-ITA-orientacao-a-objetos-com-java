
public class Produto {

    private String nome;
    private long codigo;
    private double preco;

    public Produto(String nome, long codigo) {
	this.nome = nome;
	this.codigo = codigo;
    }

    public String getNome() {
	return nome;
    }

    public void setNome(String nome) {
	this.nome = nome;
    }

    public double getPreco() {
	return preco;
    }

    public void setPreco(double preco) {
	this.preco = preco;
    }

    public long getCodigo() {
	return codigo;
    }

    public void setCodigo(long codigo) {
	this.codigo = codigo;
    }

    @Override
    public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + (int) (codigo ^ (codigo >>> 32));
	return result;
    }

    @Override
    public boolean equals(Object obj) {
	if (obj instanceof Produto) {
	    Produto prod = (Produto) obj;

	    if (prod.codigo == this.codigo) {
		return true;
	    }
	}
	return false;
    }

}

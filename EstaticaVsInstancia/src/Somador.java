
public class Somador {

	String nome;
	int valorInstancia = 0;
	static int valorStatic = 0;
	
	void somar(){
		valorInstancia ++;
		valorStatic ++;
	}
	
	void imprimir(){
		System.out.println("O somador "+nome+": instancia= "+valorInstancia+" e estatica="+valorStatic);
		
	}
}


public class Principal {

    public static void main(String[] args) {
	Corrida corrida = new Corrida(2000);

	corrida.adicionaCarro(new CarroSoma("Carro A", 10, 110));
	corrida.adicionaCarro(new CarroSoma("Carro B", 8, 140));
	corrida.adicionaCarro(new CarroMult("Carro C", 1.7, 100));
	corrida.adicionaCarro(new CarroMult("Carro D", 1.4, 110));
	
	corrida.umDoisTresEJa();

    }

}

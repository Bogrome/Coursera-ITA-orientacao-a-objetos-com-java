
public class Principal {

	public static void main(String[] args) {
		Paciente paciente1 = new Paciente(37.5, 1.57);
		Paciente paciente2 = new Paciente(60, 1.70);
		Paciente paciente3 = new Paciente(108, 1.75);

		System.out.printf("Paciente 1 possui IMC %.2f, com diagnóstico de: %s! \n", paciente1.calcularIMC(),
				paciente1.diagnostico());
		System.out.printf("Paciente 2 possui IMC %.2f, com diagnóstico de: %s! \n", paciente2.calcularIMC(),
				paciente2.diagnostico());
		System.out.printf("Paciente 3 possui IMC %.2f, com diagnóstico de: %s! \n", paciente3.calcularIMC(),
				paciente3.diagnostico());
	}

}


public class Paciente {

    private double peso;
    private double altura;
    public double imc;

    public Paciente(double peso, double altura) {
	this.peso = peso;
	this.altura = altura;
    }

    public void calcularIMC() {
	this.imc = peso / (altura * altura);
	
    }

    public String diagnostico() {
	calcularIMC();

	if (imc < 16) {
	    // IMC abaixo de 16 kg/m²
	    return "Baixo peso muito grave";
	} else if (imc >= 16 && imc <= 16.99) {
	    // IMC entre 16 e 16,99 kg/m²
	    return "Baixo peso grave";
	} else if (imc >= 17 && imc <= 18.49) {
	    // IMC entre 17 e 18,49 kg/m²
	    return "Baixo peso";
	} else if (imc >= 18.50 && imc <= 24.99) {
	    // IMC entre 18,50 e 24,99 kg/m²
	    return "Peso normal";
	} else if (imc >= 25 && imc <= 29.99) {
	    // IMC entre 25 e 29,99 kg/m²
	    return "Sobrepeso";
	} else if (imc >= 30 && imc <= 34.99) {
	    // IMC entre 30 e 34,99 kg/m²
	    return "Obesidade grau I";
	} else if (imc >= 35 && imc <= 39.99) {
	    // IMC entre 35 e 39,99 kg/m²
	    return "Obesidade grau II";
	} else {
	    // IMC igual ou maior que 40 kg/m²
	    return "Obesidade grau III (obesidade mórbida)";
	}

    }

}

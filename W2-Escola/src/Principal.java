
public class Principal {

	public static void main(String[] args) {
		Aluno aluno = new Aluno();
		aluno.bimestre1 = 70;
		aluno.bimestre2 = 60;
		aluno.bimestre3 = 80;
		aluno.bimestre4 = 70;

		System.out.println(aluno.media());
		System.out.println(aluno.passouDeAno());
	}

}

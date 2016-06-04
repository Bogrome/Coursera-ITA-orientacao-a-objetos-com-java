
public class VerificadoraNotas {

	public static int mediaAluno(Aluno aluno) {
		int total = 0;
		total += aluno.bimestre1;
		total += aluno.bimestre2;
		total += aluno.bimestre3;
		total += aluno.bimestre4;
		return total / 4;
	}

	public static boolean passouDeAno(Aluno aluno) {
		int media = mediaAluno(aluno);

		if (media >= 60) {
			return true;
		}
		return false;
	}

}

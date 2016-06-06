
public class Aluno {

	int bimestre1;
	int bimestre2;
	int bimestre3;
	int bimestre4;

	public int media() {
		int total = 0;
		total += this.bimestre1;
		total += this.bimestre2;
		total += this.bimestre3;
		total += this.bimestre4;
		return total / 4;
	}

	public boolean passouDeAno() {

		if (media() >= 60) {
			return true;
		}
		return false;
	}
}

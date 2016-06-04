
public class RegistroPontos {

	private CalculadoraBonus bonus;

	public RegistroPontos(CalculadoraBonus bonus) {
		this.bonus = bonus;
	}

	public void fazerUmComentario(Usuario usuario) {

		usuario.pontos += 3 * bonus.bonus(usuario);
	}

	public void criarUmTopico(Usuario usuario) {
		usuario.pontos += 5 * bonus.bonus(usuario);
	}

	public void darUmLike(Usuario usuario) {
		usuario.pontos += 1 * bonus.bonus(usuario);
	}

}

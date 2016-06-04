import static org.junit.Assert.*;

import org.junit.Test;

public class RegistroPontosTest {

	@Test
	public void pontosCriarTopico() {
		Usuario usuario = new Usuario();
		usuario.nome = "Daniele";
		CalculadoraBonus bonus = new CalculadoraBonus();
		RegistroPontos pontos= new RegistroPontos(bonus);
		
		pontos.criarUmTopico(usuario);
		assertEquals(usuario.pontos, 5);
	}
	
	@Test
	public void pontosCriarTopicoVIP() {
		Usuario usuario = new Usuario();
		usuario.nome = "Daniele";
		usuario.vip = true;
		CalculadoraBonus bonus = new CalculadoraBonus();
		RegistroPontos pontos= new RegistroPontos(bonus);
		
		pontos.criarUmTopico(usuario);
		assertEquals(usuario.pontos, 25);
	}
	
	@Test
	public void pontosCriarTopicoBonusDoDia() {
		Usuario usuario = new Usuario();
		usuario.nome = "Daniele";
		CalculadoraBonus bonus = new CalculadoraBonus();
		bonus.bonusDoDia = 3;
		RegistroPontos pontos= new RegistroPontos(bonus);
		
		pontos.criarUmTopico(usuario);
		assertEquals(usuario.pontos, 15);
	}
	
	@Test
	public void pontosCriarTopicoBonusDoDiaVIP() {
		Usuario usuario = new Usuario();
		usuario.nome = "Daniele";
		usuario.vip = true;
		CalculadoraBonus bonus = new CalculadoraBonus();
		bonus.bonusDoDia = 2;
		RegistroPontos pontos= new RegistroPontos(bonus);
		
		pontos.criarUmTopico(usuario);
		assertEquals(usuario.pontos, 50);
	}

}

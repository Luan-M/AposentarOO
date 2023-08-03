package user;

import application.Program;

public class Usuario {

	public String nome;
	public Integer dataNascimento;
	public Integer tempoRegistro;
	
	Program program = new Program();
	
	public Integer idadeUsuario() {
		return program.ANO_ATUAL - dataNascimento;
		
	}
	
	public boolean homemAposentar() {
		if(idadeUsuario() >= Program.IDADE_MINIMA_HOMEM && tempoRegistro >= Program.TEMPO_MINIMO_HOMEM) {
			return true;
		}
		return false;
	}
	
	public boolean mulherAposentar() {
		if(idadeUsuario() >=  Program.IDADE_MINIMA_MULHER && tempoRegistro >= Program.TEMPO_MINIMO_MULHER) {
			return true;
		}
		return false;
	}
	
	public String homemPodeAposentar() {
		return nome + ", o senhor pode se aposentar.";
	}
	
	public String homemNaoPodeAposentar() {
		return nome + ", o senhor não pode se aposentar.";
		
	}
	
	public String mulherPodeAposentar() {
		return nome + ", a senhora pode se aposentar.";
		
	}
	
	public String mulherNaoPodeAposentar() {
		return nome + ", a senhora não pode se aposentar.";
		
	}
	
	public String informacaoHomem() {
		return "Para se aposentar é preciso. Homens 65 anos ou superior "
				+ "e 26 anos de registro ou superior";
	} 
	
	public String informacaoMulher() {
		return "Mulheres 63 anos ou superior e 24 anos de registro ou superior";
	}
		
}

package jankenPOO;

import java.util.Random;

public class PartidaComputador {

	private int jogadaJogadorH;
	private int jogadaJogadorC;
	
	public PartidaComputador(int jogadaAJogadorH) {
		this.jogadaJogadorH = jogadaAJogadorH;
	}

	public int getJogadaJogadorH() {
		return jogadaJogadorH;
	}

	public void setJogadaJogadorH(int jogadaJogadorH) {
		this.jogadaJogadorH = jogadaJogadorH;
	}
	
	public int getJogadaJogadorC() {
		return jogadaJogadorC;
	}
	
	public void setJogadaJogadorC() {
		Random geradorJogadaC = new Random();
		int geradorJogadaJogadorC = geradorJogadaC.nextInt(3) + 1;
		this.jogadaJogadorC = geradorJogadaJogadorC;
	}
	
	public String retornoJogada() {
		String jogada = null;
		
		if (jogadaJogadorC == 1) {
			jogada = "Pedra";
		}
		if (jogadaJogadorC == 2) {
			jogada = "Papel";
		}
		if (jogadaJogadorC == 3) {
			jogada = "Tesoura";
		}
		
		return jogada;
	}
	
	public int acaoRodada() {
		int resultado = 0;
		if (jogadaJogadorH == jogadaJogadorC) {
			resultado = 0;
		}
		else if ((jogadaJogadorH - jogadaJogadorC) == -1) {
			resultado = -1;
		}
		else if ((jogadaJogadorH - jogadaJogadorC) == 2) {
			resultado = 2;
		}
		else if ((jogadaJogadorH - jogadaJogadorC) == 1) {
			resultado = 1;
		}
		else if ((jogadaJogadorH - jogadaJogadorC) == -2) {
			resultado = -2;
		}
		return resultado;
	}
	
}

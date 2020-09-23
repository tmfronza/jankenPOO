package jankenPOO;

import java.util.Random;

public class PartidaComputador {

	private int jogadaAJogadorH;
	private int jogadaAJogadorC;
	
	public PartidaComputador(int jogadaAJogadorH, int jogadaAJogadorC) {
		this.jogadaAJogadorH = jogadaAJogadorH;
		this.jogadaAJogadorC = jogadaAJogadorC;
	}

	public int getJogadaAJogadorH() {
		return jogadaAJogadorH;
	}

	public void setJogadaAJogadorH(int jogadaAJogadorH) {
		this.jogadaAJogadorH = jogadaAJogadorH;
	}
	
	public int getJogadaAJogadorC() {
		return jogadaAJogadorC;
	}
	
	public void setJotadaAJogadorC(int jogadaAJogadorC) {
		this.jogadaAJogadorC = jogadaAJogadorC;
	}
	
	public String retornoJogada() {
		String jogada = null;
		
		if (jogadaAJogadorC == 1) {
			jogada = "Pedra";
		}
		if (jogadaAJogadorC == 2) {
			jogada = "Papel";
		}
		if (jogadaAJogadorC == 3) {
			jogada = "Tesoura";
		}
		
		return jogada;
	}
	
	public int acaoRodada() {
		int resultado = 0;
		if (jogadaAJogadorH == jogadaAJogadorC) {
			resultado = 0;
		}
		else if ((jogadaAJogadorH - jogadaAJogadorC) == -1) {
			resultado = -1;
		}
		else if ((jogadaAJogadorH - jogadaAJogadorC) == 2) {
			resultado = 2;
		}
		else if ((jogadaAJogadorH - jogadaAJogadorC) == 1) {
			resultado = 1;
		}
		else if ((jogadaAJogadorH - jogadaAJogadorC) == -2) {
			resultado = -2;
		}
		return resultado;
	}
	
}

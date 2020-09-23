package jankenPOO;

public class PartidaHumana {
	
	private int jogadaAJogador01;
	private int jogadaAJogador02;
	
	public PartidaHumana(int jogadaAJogador01, int jogadaAJogador02) {
		this.jogadaAJogador01 = jogadaAJogador01;
		this.jogadaAJogador02 = jogadaAJogador02;
	}
	
	public int getJogadaAJogador01() {
		return jogadaAJogador01;
	}
	
	public void setJogadaAJogador01(int jogadaAJogador01) {
		this.jogadaAJogador01 = jogadaAJogador01;
	}

	public int getJogadaAJogador02() {
		return jogadaAJogador02;
	}
	
	public void setJogadaAJogador02(int jogadaAJogador02) {
		this.jogadaAJogador02 = jogadaAJogador02;
	}

	public int acaoRodada() {
		int resultado = 0;
		if (jogadaAJogador01 == jogadaAJogador02) {
			resultado = 0;
		}
		else if ((jogadaAJogador01 - jogadaAJogador02) == -1) {
			resultado = -1;
		}
		else if ((jogadaAJogador01 - jogadaAJogador02) == 2) {
			resultado = 2;
		}
		else if ((jogadaAJogador01 - jogadaAJogador02) == 1) {
			resultado = 1;
		}
		else if ((jogadaAJogador01 - jogadaAJogador02) == -2) {
			resultado = -2;
		}
		return resultado;
	}

}

//	Pedra = 1
//  Papel = 2
//  Tesoura = 3
	
//   Jogador01 - Jogador02:
//    	1			2 = -1 vence Jogador02  	
//    	2			3 = -1 vence Jogador02
//    	3			1 = 2 vence Jogador02
//    	3			2 = 1 vence Jogador01
//   	1			3 = -2 vence Jogador01
//	   	2			1 = 1  vence Jogador01

// Jogador01 ganha com = 1, -2
// Jogador02 ganha com = -1 e 2
	
	
	
	



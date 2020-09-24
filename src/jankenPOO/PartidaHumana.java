package jankenPOO;

public class PartidaHumana {
	
	private int jogadaJogador01;
	private int jogadaJogador02;
	
	public PartidaHumana(int jogadaJogador01, int jogadaJogador02) {
		this.jogadaJogador01 = jogadaJogador01;
		this.jogadaJogador02 = jogadaJogador02;
	}
	
	public int getJogadaJogador01() {
		return jogadaJogador01;
	}
	
	public void setJogadaJogador01(int jogadaJogador01) {
		this.jogadaJogador01 = jogadaJogador01;
	}

	public int getJogadaJogador02() {
		return jogadaJogador02;
	}
	
	public void setJogadaJogador02(int jogadaJogador02) {
		this.jogadaJogador02 = jogadaJogador02;
	}

	public int acaoRodada() {
		int resultado = 0;
		if (jogadaJogador01 == jogadaJogador02) {
			resultado = 0;
		}
		else if ((jogadaJogador01 - jogadaJogador02) == -1) {
			resultado = -1;
		}
		else if ((jogadaJogador01 - jogadaJogador02) == 2) {
			resultado = 2;
		}
		else if ((jogadaJogador01 - jogadaJogador02) == 1) {
			resultado = 1;
		}
		else if ((jogadaJogador01 - jogadaJogador02) == -2) {
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
	
	
	
	



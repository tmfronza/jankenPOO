package jankenPOO;

public class Jogador {
	
	private String nome;
	private int[] pontuacao;
	
	public Jogador(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		//return "Jogador [nome=" + nome + "]";
		return nome;
	}	
}

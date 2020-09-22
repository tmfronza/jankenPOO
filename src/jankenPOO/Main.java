package jankenPOO;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int continuarJogo;
		
		System.out.println("======== Bem vindo ao JankenPOO ========");
		System.out.println("Uma criação de Douglas, Gustavo e Thiago");

		System.out.println("[1] Iniciar jogo contra o computador.");
		System.out.println("[0] Sair do jogo.");
		System.out.print("O que deseja fazer? --> ");
		continuarJogo = Integer.valueOf(scanner.nextLine());
		
		while (continuarJogo == 1) {
			
			System.out.print("Insira o nome do jogador: ");
			String nomeJogador01 = (scanner.nextLine());
			Jogador jogador01 = new Jogador(nomeJogador01);
			System.out.println(jogador01.toString());
			
			System.out.print("Deseja jogar uma nova partida? [1 - SIM | 0 - SAIR] --> ");
			continuarJogo = Integer.valueOf(scanner.nextLine());
		}
		 System.out.println("Tchau");
		
		}

}

package jankenPOO;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int selecaoMenu;

		System.out.println("======== Bem vindo ao JankenPOO ========");
		System.out.println(
				"Uma criação de Douglas Henrique Vasconcelos Campos, Gustavo Cainã Branco e Thiago Monteiro Fronza\n");

		System.out.println("[1] Iniciar jogo com dois jogadores.");
		System.out.println("[2] Iniciar jogo contra o computador.");
		System.out.println("[0] Sair do jogo.\n");
		System.out.print("O que deseja fazer? --> ");
		selecaoMenu = Integer.valueOf(scanner.nextLine());

		if (selecaoMenu == 1) {

			System.out.print("\nInsira o nome do jogador 01: ");
			String nomeJogador01 = (scanner.nextLine());
			Jogador jogador01 = new Jogador(nomeJogador01);
			System.out.print("\nInsira o nome do jogador 02: ");
			String nomeJogador02 = (scanner.nextLine());
			Jogador jogador02 = new Jogador(nomeJogador02);

			int novaRodada = 1;

			while (novaRodada == 1) {

				System.out.println("\nEsta será uma partida de " + jogador01.toString() + " contra "
						+ jogador02.toString() + ". Boa sorte!\n");

				System.out.print(jogador01.toString() + " faça sua escolha: [1] PEDRA, [2] PAPEL, [3] TESOURA --> ");
				int jogadaJogador01 = Integer.valueOf(scanner.nextLine());

				System.out.print(
						"\n" + jogador02.toString() + " faça sua escolha: [1] PEDRA, [2] PAPEL, [3] TESOURA --> ");
				int jogadaJogador02 = Integer.valueOf(scanner.nextLine());

				PartidaHumana partidaHumana = new PartidaHumana(jogadaJogador01, jogadaJogador02);

				if (partidaHumana.acaoRodada() == 0) {
					System.out.println("\nA partida terminou em empate.");
				} else if (partidaHumana.acaoRodada() == 1 || partidaHumana.acaoRodada() == -2) {
					System.out.println("\nVitoria do jogador " + jogador01.toString() + ".");
				} else if (partidaHumana.acaoRodada() == -1 || partidaHumana.acaoRodada() == 2) {
					System.out.println("\nVitoria do jogador " + jogador02.toString() + ".");
				}

				System.out.print("\nDeseja jogar novamente? [1] SIM [0] NÃO --> ");
				novaRodada = Integer.valueOf(scanner.nextLine());
			}

			System.out.println("\nObrigado por jogar o jankenPOO!");
		}

		else if (selecaoMenu == 2) {

			System.out.print("\nInsira o nome do jogador: ");
			String nomeJogador = (scanner.nextLine());
			Jogador jogador = new Jogador(nomeJogador);

			int novaRodada = 1;

			while (novaRodada == 1) {

				System.out.println(
						"\nEsta será uma partida de " + jogador.toString() + " contra o computador. Boa sorte!\n");

				System.out.print(jogador.toString() + " faça sua escolha: [1] PEDRA, [2] PAPEL, [3] TESOURA --> ");
				int jogadaJogadorH = Integer.valueOf(scanner.nextLine());

				PartidaComputador partidaComputador = new PartidaComputador(jogadaJogadorH);

				partidaComputador.setJogadaJogadorC();

				System.out.println("\nO computador escolheu " + partidaComputador.retornoJogada() + ".");

				if (partidaComputador.acaoRodada() == 0) {
					System.out.println("\nA partida terminou em empate.");
				} else if (partidaComputador.acaoRodada() == 1 || partidaComputador.acaoRodada() == -2) {
					System.out.println("\nVitoria do jogador " + jogador.toString() + ".");
				} else if (partidaComputador.acaoRodada() == -1 || partidaComputador.acaoRodada() == 2) {
					System.out.println("\nVitoria do computador.");
				}

				System.out.print("\nDeseja jogar novamente? [1] SIM [0] NÃO --> ");
				novaRodada = Integer.valueOf(scanner.nextLine());
			}

			System.out.println("\nObrigado por jogar o jankenPOO!");

		}

		else if (selecaoMenu == 0) {
			System.out.println("\nObrigado por jogar o jankenPOO!");

		}
	}
}

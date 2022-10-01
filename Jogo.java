import java.util.Random;
import java.util.Scanner;

public class Jogo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random random = new Random();

		int numero_Maquina = random.nextInt(10);
		int resposta;
		int escolha;
		String nome;

		System.out.println("Olá, Qual é o seu nome?");
		nome = sc.next();
		System.out.println("Prazer, " + nome);
		System.out.println("Você quer jogar um jogo?");
		System.out.println("=> Digite 1 para sim.");
		System.out.println("=> Digite 2 para não.");
		escolha = sc.nextInt();

		if (escolha == 2) {
			System.out.println("Que pena, talvez outro dia...");
		} else if (escolha == 1) {
			System.out.println("Ok, o jogo funciona assim...");
			System.out.println("eu vou escolher um numero aleatório entre 0 e 10.");
			System.out.println("seu objetivo é acertar o numero que eu vou escolher, Simples né?");
			System.out.println("Pronto, ja escolhi o numero, agora é a sua vez!");
			System.out.println("tente advinhar o numero.");
		}

		do {
			resposta = sc.nextInt();
			if (resposta != numero_Maquina) {
				System.out.println("Tente novamente");
			} else {
				System.out.println("Parabens, voce acertou!");
			}
		} while (resposta != numero_Maquina);
		sc.close();

	}

}

package Atividade;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		
		
		CacaPalavras caca = new CacaPalavras();
		Descoberta descoberta = new Descoberta();
		Scanner scanner = new Scanner (System.in);
		

		System.out.println("Qual jogo você deseja jogar? Digite '1' para Caça Palavras e '2' para Descoberta");
		int escolhe = scanner.nextInt();
		
		if (escolhe == 1) {
			caca.inicia();
	}
		else if(escolhe == 2){
			descoberta.inicia();
		}
		else {
			System.out.println("Numero inválido, tente novamente");
		}
	}

}
	

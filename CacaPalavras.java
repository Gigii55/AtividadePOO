package Atividade;

import java.util.Scanner;

public class CacaPalavras {
 
	public void inicia() {
		
		Scanner scanner = new Scanner (System.in);
		Metodos metodo = new Metodos ();
		Dicas tenta = new Dicas();

		int cont  = 0;
		
		System.out.println("com quantas palavras você deseja jogar? (1 ou 2)");
		int tipo = scanner.nextInt();
		String[] armazena = new String [tipo];
		
		metodo.preencheTabuleiro();
		
			while (cont<tipo) {
				
				armazena [cont] = metodo.selecionarPalavra();
				metodo.colocaPalavra(armazena[cont]);
				cont++;
			
			}
		
	        
			metodo.imprimirTabuleiro();
			

			
			System.out.println("Obrigada por jogar!");
		}

		
		
		
}
	

	

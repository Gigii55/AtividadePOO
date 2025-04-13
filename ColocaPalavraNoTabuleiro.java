package atividade;

import java.util.Random;

public class ColocaPalavraNoTabuleiro {
	
	public void colocaPalavra (String palavra, char[][]tabuleiro){
		
	Random random = new Random ();
	int linha = random.nextInt(10);
	int coluna = random.nextInt(10 - palavra.length());
	
	for(int x =0; x<palavra.length(); x++) {
		tabuleiro[linha][coluna+x] = palavra.charAt(x); // 
	}
	
	}
	
}

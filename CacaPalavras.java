package atividade;

public class CacaPalavras {

	public static void main(String[] args) {
		

		
		SelecionarPalavras palavra = new SelecionarPalavras ();
		PreencheTabuleiro preenche = new PreencheTabuleiro();	
		ColocaPalavraNoTabuleiro coloca = new ColocaPalavraNoTabuleiro ();
		ImprimirTabuleiro imprime = new ImprimirTabuleiro ();		
		
		
		char tabuleiro [] [] = new char [10][10];
		
		String palavraSelecionada = palavra.selecionarPalavra();
		
		char[][] p = preenche.preencheTabuleiro(tabuleiro);
		
		palavra.selecionarPalavra();
		preenche.preencheTabuleiro(tabuleiro);
		coloca.colocaPalavra(palavraSelecionada, p);
		imprime.imprimirTabuleiro(tabuleiro);
	
		
		
}
	
	
	
	}

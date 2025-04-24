package atividade;

public class CacaPalavras {

	public static void main(String[] args) {
		
		SelecionarPalavras palavra = new SelecionarPalavras ();
		PreencheTabuleiro preenche = new PreencheTabuleiro();
		ColocaPalavraNoTabuleiro coloca = new ColocaPalavraNoTabuleiro ();
		ImprimirTabuleiro imprime = new ImprimirTabuleiro ();	
		Dicas dica = new Dicas();
		DicaParaDuasPalavras dica2 = new DicaParaDuasPalavras ();
		
		char tabuleiro [] [] = new char [10][10];
		
		String palavraSelecionada = palavra.selecionarPalavra();
		String palavraSelecionada2 = palavra.selecionarPalavra();
		
		char[][] p = preenche.preencheTabuleiro(tabuleiro);
		
		
		coloca.colocaPalavra(palavraSelecionada, p);
		coloca.colocaPalavra(palavraSelecionada2, p);
		
		imprime.imprimirTabuleiro(tabuleiro);
		
		System.out.println("Qual a palavra 1? ");
		
		dica.tentativas(palavraSelecionada);
		
		System.out.println("Qual a palavra 2? ");
		
		dica2.tentativas(palavraSelecionada2);
		
		
}
	

	}

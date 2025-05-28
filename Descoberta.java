package Atividade;

import java.util.Scanner;

public class Descoberta {
	
    public void inicia () {
    	
    	Scanner scanner = new Scanner (System.in);
    	
    	Metodos metodosCacaPalavras = new Metodos ();
    	Dicas dicas = new Dicas ();
    	
        System.err.println("Bem-vindo ao Jogo da Descobeta");

        
        String palavraSelecionada = metodosCacaPalavras.selecionarPalavra();
        String palavraEmbaralhada = metodosCacaPalavras.embaralharPalavras(palavraSelecionada);

        System.out.println("Qual a palavra " + palavraEmbaralhada + "?");
        
     
        dicas.tentativas(palavraSelecionada);
      
       
 
    }
    
}

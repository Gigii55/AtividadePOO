package atividade;

import java.util.Scanner;

public class Descoberta {
	
    public static void main(String[] args) {
    	
    	Scanner scanner = new Scanner (System.in);
    	DescobertaMetodos descobertaMetodos = new DescobertaMetodos ();
    	SelecionarPalavras selecionaPalavra = new SelecionarPalavras ();
    	Dicas dicas = new Dicas ();
    	
;        System.err.println("Bem-vindo ao Jogo da Descobeta");


        String palavraSelecionada = selecionaPalavra.selecionarPalavra();
        String palavraEmbaralhada = descobertaMetodos.embaralharPalavras(palavraSelecionada);

        System.out.println("Qual a palavra " + palavraEmbaralhada + "?");
        
     
        dicas.tentativas(palavraSelecionada);
      
       

    }
    
}

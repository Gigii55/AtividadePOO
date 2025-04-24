package atividade;

import java.util.Scanner;

public class DicaParaDuasPalavras {

	void tentativas ( String palavraSelecionada2) {
		

		Scanner scanner = new Scanner (System.in);
		
		int tentativas = 1;
		
	    Boolean acertou = false;
	    
	    while (true) { 
	    	
	    	 String tenta = scanner.nextLine();
	    	 
	    	 if(tenta.equals(palavraSelecionada2)){
	    		 
	                System.out.println("Você acertou com " + tentativas + " tentativas");
	                acertou = true;
	                break;
	            }

	            else{
	            	
	                tentativas++;
	                
	                System.out.println("Informe a palavra, 'dica' para receber uma dica ou '0 para desistir'");
	                String entrada = scanner.nextLine();
	                
	                if(entrada.equals("0")) {
	                    System.out.println("Frangote desistiu com " + tentativas + " tentativas");
	                    break;
	                }

	                if(entrada.equals("dica")) {
	                    System.out.println("A primeira letra é '" + palavraSelecionada2.charAt(0) + "', a última é '" + palavraSelecionada2.charAt(palavraSelecionada2.length() - 1) + "'");
	                    continue;
	                }
	            }
	    	
           
        }
	
}
	
}







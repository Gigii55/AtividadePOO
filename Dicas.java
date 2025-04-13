package atividade;

import java.util.Scanner;

public class Dicas {

	void tentativas ( String palavraSelecionada) {
		
		Scanner scanner = new Scanner (System.in);
		
		int tentativas = 1;
		
	    Boolean acertou = false;
	    
	    
	    
	    
	    while (true) { 
	    	
	    	 String tenta = scanner.nextLine();
	    	 
	    	 if(tenta.equals(palavraSelecionada)){
	    		 
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
	                    System.out.println("A primeira letra é '" + palavraSelecionada.charAt(0) + "', a última é '" + palavraSelecionada.charAt(palavraSelecionada.length() - 1) + "'");
	                    continue;
	                }
	            }
	    	
	    	
           

           
        }
	
}
	
}





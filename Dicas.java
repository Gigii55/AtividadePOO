package atividade;

import java.util.Scanner;

public class Dicas {

	void tentativas ( String palavraSelecionada) {
		
		Scanner scanner = new Scanner (System.in);
		String palavraChute = scanner.nextLine();
		
		int tentativas = 1;
		
	    Boolean acertou = false;
	    
	    while (true) { 
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

            if(entrada.equals(palavraSelecionada)){
                System.err.println("Você acertou com " + tentativas + " tentativas");
                acertou = true;
                break;
            }

            else{
                tentativas++;
            }
        }
	
}
	
}





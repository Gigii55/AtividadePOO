package atividade;

import java.util.Random;

public class DescobertaMetodos {

	String embaralharPalavras (String palavraSelecionada){
		
		 char[] palavraArray = palavraSelecionada.toCharArray();
		 Random random = new Random();
		 
		 for(int x=0; x<palavraArray.length; x++){
			 
          int indiceAleatorio = random.nextInt(palavraArray.length);
          char temp = palavraArray[x];
          palavraArray[x] = palavraArray[indiceAleatorio];
          palavraArray[indiceAleatorio] = temp;
      }

      return new String(palavraArray); 
}
	
}  

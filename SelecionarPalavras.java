package atividade;

import java.util.Random;

public class SelecionarPalavras {

			String selecionarPalavra () {
				
				String palavras[] = { "gato", "cachorro", "pato", "galinha", "boi", "vaca", "cavalo", "porco", "rato", "coelho",
					    "leao", "tigre", "urso", "zebra", "girafa", "elefante", "macaco", "lobo", "cervo", "camelo",
					    "cabra", "ovelha", "peixe", "tartaruga", "jacare", "cobra", "lagarto", "sapo", "coruja", "aguia",
					    "falcao", "pombo", "papagaio", "marreco", "ganso", "aranha", "abelha", "formiga", "besouro", "mosca",
					    "mosquito", "lagarta", "caracol", "polvo", "tubarao", "golfinho", "baleia", "foca", "urso", "pinguim"};
				
				Random random = new Random();
		        String palavraSelecionada = palavras[random.nextInt(palavras.length)];
		        
				return palavraSelecionada; 

				}
	}
			
			





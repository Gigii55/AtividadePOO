package Atividade;

import java.util.Random;

public class Metodos {
	
	private String palavras[] = { "gato", "cachorro", "pato", "galinha", "boi", "vaca", "cavalo", "porco", "rato", "coelho",
					    "leao", "tigre", "urso", "zebra", "girafa", "elefante", "macaco", "lobo", "cervo", "camelo",
					    "cabra", "ovelha", "peixe", "tartaruga", "jacare", "cobra", "lagarto", "sapo", "coruja", "aguia",
					    "falcao", "pombo", "papagaio", "marreco", "ganso", "aranha", "abelha", "formiga", "besouro", "mosca",
					    "mosquito", "lagarta", "caracol", "polvo", "tubarao", "golfinho", "baleia", "foca", "urso", "pinguim"};
	 
	 	
	 	private char tabuleiro [] [] = new char [10][10];
	 	
	 	
	 	private String palavraSelecionada;
	 	
	 
	 	
			 public String selecionarPalavra () {
				
				Random random = new Random();
		       
					 this.palavraSelecionada = palavras[random.nextInt(palavras.length)];
		        
							return palavraSelecionada; 

			}
			 
					
					public char[][] preencheTabuleiro() {
						
						Random r = new Random ();
						
						for(int x=0; x<10; x++) {
							
							for (int y=0; y<10; y++) {
								
								tabuleiro[x][y]= (char) ('a'+r.nextInt(25)); //preencheria a matriz inteira com todas as letras de A a Z		 
						}
						 
					}
						return tabuleiro;

						}

				
				
			 
		public String colocaPalavra (String palavra) {
					
			Random random = new Random ();
			
				int linha = random.nextInt(10);
				
					int coluna = random.nextInt(10 - palavra.length());
					
						for(int x =0; x<palavra.length(); x++) {
							
								tabuleiro[linha][coluna+x] = palavra.charAt(x);
					}
	
					return palavra;
			}


						public void imprimirTabuleiro (){
		
							for(int x=0; x<10; x++) {
								
									for (int y=0; y<10; y++) {
										
											System.out.print(tabuleiro[x][y]+ " ");
					
			}
									
									System.out.println("");
		}
	}
						
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

						public String getPalavraSelecionada() {
					 		return this.palavraSelecionada;
					 	}
					 	
					 	public char[] []getTabuleiro() {
					 		return this.tabuleiro;
					 	
					 	}
					 	
					 	
}

	

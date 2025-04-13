package atividade;

public class ImprimirTabuleiro {
	
	public void imprimirTabuleiro (char matrizTabuleiro[][]){
		
		for(int x=0; x<10; x++) {
			for (int y=0; y<10; y++) {
				System.out.print(matrizTabuleiro[x][y]+ " ");
				
			}
			System.out.println("");
		}
	}
	
	
}

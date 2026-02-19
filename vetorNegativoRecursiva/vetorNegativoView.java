package vetorNegativoRecursiva;

public class vetorNegativoView {
	
	public vetorNegativoView() {
		
	}
	
	public int contadorNegativo(int[]vetor, int ind) {
		
		if (ind == 0) {
			return 0;
			
		}if( vetor[ind-1] < 0) {
            return 1 + contadorNegativo(vetor, ind - 1);
		}
		
        return contadorNegativo(vetor, ind - 1);
	}
	
}
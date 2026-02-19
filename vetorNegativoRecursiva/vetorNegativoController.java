package vetorNegativoRecursiva;

import javax.swing.JOptionPane;

public class vetorNegativoController {
	
	public static void main(String[] args) {
		
		int tamVetor = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o valor do tamanho do vetor:"));
		
		int[] vetor = new int[tamVetor];
		
		for(int i = 0; i < tamVetor; i ++) {
			vetor[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o valor da posição " + (i+1) + " do vetor"));	
		}
		
		vetorNegativoView contNegativo = new vetorNegativoView();
		
		int totalNegativos = contNegativo.contadorNegativo(vetor, vetor.length - 1);
		
		JOptionPane.showMessageDialog(null, totalNegativos);

		
	}
	
	
}
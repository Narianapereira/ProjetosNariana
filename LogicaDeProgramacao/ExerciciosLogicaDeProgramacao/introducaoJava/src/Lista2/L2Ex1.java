package Lista2;

import javax.swing.JOptionPane;

public class L2Ex1 {

	public static void main(String[] args) {
		/*
		 * Fa?a um programa que receba um vetor de valores e mostre a quantidade de
		 * valores negativos. Os valores e o tamanho do vetor devem ser informados pelo
		 * usu?rio.
		 */
// criei uma vari?vel para definir o tamanho do vetor e perguntei ao usu?rio
		int tamanhoVetor = Integer.parseInt(JOptionPane.showInputDialog("Digite o tamanho do vetor."));
		// atribu? o tamanho do vetor escolhido pelo usu?rio
		// valida??o para que o tamanho do vetor seja >0
		while (tamanhoVetor <= 0) {
			tamanhoVetor = Integer.parseInt(
					JOptionPane.showInputDialog("O tamanho do vetor deve ser maior que 0. Digite o tamanho do vetor."));
		}
		int[] valores = new int[tamanhoVetor];
		// criei uma vari?vel para somar os negativos
		int negativos = 0;

		// contadora para solicitar os numeros conforme o tamanho do vetor;
		for (int i = 0; i < tamanhoVetor; i++) {
			valores[i] = Integer.parseInt(JOptionPane.showInputDialog("Insira o " + (i + 1) + "? valor."));
			// condi??o para somar os valores caso forem negativos
			if (valores[i] < 0) {
				negativos = negativos + 1;
			}
		}
		JOptionPane.showMessageDialog(null, "O total de valores negativos ? de " + negativos);
	}

}

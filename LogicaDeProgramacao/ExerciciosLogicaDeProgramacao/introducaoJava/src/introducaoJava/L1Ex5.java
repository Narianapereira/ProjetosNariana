package introducaoJava;

//importando classe JOptionPane para usarmos os pain�is de di�logo
import javax.swing.JOptionPane;

public class L1Ex5 {

	public static void main(String[] args) {
		/*
		 * Fa�a um algoritmo que pe�a ao usu�rio 10 n�meros e mostre posteriormente
		 * quantos s�o pares e a soma deles, bem como quantos s�o �mpares e a soma
		 * deles.
		 */
		int[] numero = new int[10];
		int quantidadePares = 0;
		int somaPares = 0;
		int quantidadeImpares = 0;
		int somaImpares = 0;

		for (int i = 0; i < 10; i++) {
			numero[i] = Integer.parseInt(JOptionPane.showInputDialog("Informe o " + (i + 1) + "� valor: "));
			if (numero[i] % 2 == 0) {
				quantidadePares = quantidadePares + 1;
				somaPares = somaPares + numero[i];
			} else {
				quantidadeImpares = quantidadeImpares + 1;
				somaImpares = somaImpares + numero[i];
			}
		}
		JOptionPane.showMessageDialog(null,
				+quantidadePares + " s�o pares, e a soma dos valores pares �  " + somaPares);
		JOptionPane.showMessageDialog(null,
				+quantidadeImpares + " s�o impares, e a soma dos valores impares �  " + somaImpares);
	}
}

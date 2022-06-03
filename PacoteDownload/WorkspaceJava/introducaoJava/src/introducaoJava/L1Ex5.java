package introducaoJava;

//importando classe JOptionPane para usarmos os painéis de diálogo
import javax.swing.JOptionPane;

public class L1Ex5 {

	public static void main(String[] args) {
		/*
		 * Faça um algoritmo que peça ao usuário 10 números e mostre posteriormente
		 * quantos são pares e a soma deles, bem como quantos são ímpares e a soma
		 * deles.
		 */
		int[] numero = new int[10];
		int quantidadePares = 0;
		int somaPares = 0;
		int quantidadeImpares = 0;
		int somaImpares = 0;

		for (int i = 0; i < 10; i++) {
			numero[i] = Integer.parseInt(JOptionPane.showInputDialog("Informe o " + (i + 1) + "º valor: "));
			if (numero[i] % 2 == 0) {
				quantidadePares = quantidadePares + 1;
				somaPares = somaPares + numero[i];
			} else {
				quantidadeImpares = quantidadeImpares + 1;
				somaImpares = somaImpares + numero[i];
			}
		}
		JOptionPane.showMessageDialog(null,
				+quantidadePares + " são pares, e a soma dos valores pares é  " + somaPares);
		JOptionPane.showMessageDialog(null,
				+quantidadeImpares + " são impares, e a soma dos valores impares é  " + somaImpares);
	}
}

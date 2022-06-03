package introducaoJava;

//importando classe JOptionPane para usarmos os painéis de diálogo
import javax.swing.JOptionPane;

public class L1Ex3 {

	public static void main(String[] args) {
		/*
		 * Faça um programa que peça ao usuário para informar 03 números e mostre o
		 * menor entre eles. Considere que o usuário não poderá informar números iguais.
		 */
		// informando números
		int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor."));

		int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite um segundo valor."));
		//condição para que o numero inserido não seja igual ao anterior
		while (numero2 == numero1) {
			numero2 = Integer.parseInt(
					JOptionPane.showInputDialog("O valor deve ser diferente do primeiro. Digite um novo valor."));
		}
		int numero3 = Integer.parseInt(JOptionPane.showInputDialog("Digite um terceiro valor."));
		while ((numero3 == numero1) || (numero3 == numero2)) {
			numero3 = Integer.parseInt(JOptionPane
					.showInputDialog("O valor deve ser diferente dos dois primeiros. Digite um novo valor."));
		}
		//Para mostrar o menor dos números.
		if (numero1 < numero2 && numero1 < numero3) {
			JOptionPane.showMessageDialog(null, "O menor valor é " + numero1);
		} else if (numero2 < numero1 && numero2 < numero3) {
			JOptionPane.showMessageDialog(null, "O menor valor é " + numero2);
		} else if (numero3 < numero1 && numero3 < numero2) {
			JOptionPane.showMessageDialog(null, "O menor valor é " + numero3);
		}
	}

}
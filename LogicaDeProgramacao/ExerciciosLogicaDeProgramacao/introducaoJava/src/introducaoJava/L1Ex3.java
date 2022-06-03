package introducaoJava;

//importando classe JOptionPane para usarmos os pain�is de di�logo
import javax.swing.JOptionPane;

public class L1Ex3 {

	public static void main(String[] args) {
		/*
		 * Fa�a um programa que pe�a ao usu�rio para informar 03 n�meros e mostre o
		 * menor entre eles. Considere que o usu�rio n�o poder� informar n�meros iguais.
		 */
		// informando n�meros
		int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor."));

		int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite um segundo valor."));
		//condi��o para que o numero inserido n�o seja igual ao anterior
		while (numero2 == numero1) {
			numero2 = Integer.parseInt(
					JOptionPane.showInputDialog("O valor deve ser diferente do primeiro. Digite um novo valor."));
		}
		int numero3 = Integer.parseInt(JOptionPane.showInputDialog("Digite um terceiro valor."));
		while ((numero3 == numero1) || (numero3 == numero2)) {
			numero3 = Integer.parseInt(JOptionPane
					.showInputDialog("O valor deve ser diferente dos dois primeiros. Digite um novo valor."));
		}
		//Para mostrar o menor dos n�meros.
		if (numero1 < numero2 && numero1 < numero3) {
			JOptionPane.showMessageDialog(null, "O menor valor � " + numero1);
		} else if (numero2 < numero1 && numero2 < numero3) {
			JOptionPane.showMessageDialog(null, "O menor valor � " + numero2);
		} else if (numero3 < numero1 && numero3 < numero2) {
			JOptionPane.showMessageDialog(null, "O menor valor � " + numero3);
		}
	}

}
package introducaoJava;

//importando classe JOptionPane para usarmos os painéis de diálogo
import javax.swing.JOptionPane;

public class L1Ex2 {

	public static void main(String[] args) {
		/*
		 * Desenvolva um programa que pergunte qual é a maioridade civil do seu
		 * “estado/país” e que posteriormente o usuário informe sua idade. Como
		 * resultado, o programa deve informar se ele é ou não maior de idade.
		 */

		int maioridade = Integer.parseInt(JOptionPane.showInputDialog("Qual a maioridade civil do seu país?"));

		int idade = Integer.parseInt(JOptionPane.showInputDialog("Qual a sua idade?"));

		if (idade >= maioridade) {

			JOptionPane.showMessageDialog(null, "O usuário é maior de idade.");
		} else {
			JOptionPane.showMessageDialog(null, "O usuário é menor de idade.");

		}
	}

}

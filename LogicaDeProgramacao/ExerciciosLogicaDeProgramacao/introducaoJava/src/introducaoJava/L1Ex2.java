package introducaoJava;

//importando classe JOptionPane para usarmos os pain�is de di�logo
import javax.swing.JOptionPane;

public class L1Ex2 {

	public static void main(String[] args) {
		/*
		 * Desenvolva um programa que pergunte qual � a maioridade civil do seu
		 * �estado/pa�s� e que posteriormente o usu�rio informe sua idade. Como
		 * resultado, o programa deve informar se ele � ou n�o maior de idade.
		 */

		int maioridade = Integer.parseInt(JOptionPane.showInputDialog("Qual a maioridade civil do seu pa�s?"));

		int idade = Integer.parseInt(JOptionPane.showInputDialog("Qual a sua idade?"));

		if (idade >= maioridade) {

			JOptionPane.showMessageDialog(null, "O usu�rio � maior de idade.");
		} else {
			JOptionPane.showMessageDialog(null, "O usu�rio � menor de idade.");

		}
	}

}

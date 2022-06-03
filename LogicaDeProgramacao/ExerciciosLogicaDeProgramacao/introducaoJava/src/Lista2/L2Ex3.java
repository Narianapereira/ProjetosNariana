package Lista2;

import javax.swing.JOptionPane;

public class L2Ex3 {

	public static void main(String[] args) {
		/*
		 * Escreva um programa que leia um n�mero inteiro e apresente um menu para o
		 * usu�rio escolher: 1 Verificar se o n�mero � m�ltiplo de algum outro n�mero
		 * (pedir ao usu�rio esse n�mero); 2 Verificar se o n�mero � par; 3 Verificar se
		 * o n�mero est� entre 0 e 1000; 4 Sair
		 */
// solicita o valor inteiro
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor inteiro."));
		// vari�vel para o menu
		int menu = 1;
		// while para repetir o menu at� que o usu�rio escolha sair
		do {
			// escolha do menu
			menu = Integer.parseInt(JOptionPane.showInputDialog("Escolha uma op��o"
					+ "\n 1 - Verificar se o n�mero � multiplo de outro n�mero" + "\n 2 - Verificar se o n�mero � par"
					+ "\n 3 - Verificar se o n�mero est� entre 0 e 1000" + "\n 4 - Sair"));
// switch para cada caso do menu
			switch (menu) {
			case 1:
				int multiplo = Integer.parseInt(JOptionPane.showInputDialog("Verificar se � multiplo de qual valor?"));
				// se divis�o de um numero pelo outro resulta em resto 0, � m�ltiplo
				if (numero % multiplo == 0) {
					JOptionPane.showMessageDialog(null, numero + " � multiplo de " + multiplo);
				} else {
					JOptionPane.showMessageDialog(null, numero + " n�o � multiplo de " + multiplo);
				}
				break;
			case 2:
				if (numero % 2 == 0) {
					JOptionPane.showMessageDialog(null, "O numero � par.");
				} else {
					JOptionPane.showMessageDialog(null, "O n�mero � �mpar.");
				}
				break;
			case 3:
				if ((numero > 0) && (numero < 1000)) {
					JOptionPane.showMessageDialog(null, "N�mero est� entre 0 e 1000");
				} else {
					JOptionPane.showMessageDialog(null, "N�mero n�o est� entre 0 e 1000");
				}
				break;
			case 4:
				System.exit(0);
				break;
			default:
				JOptionPane.showMessageDialog(null, "Voc� inseriu um n�mero inv�lido");

			}
		} while (menu != 4);
	}
}

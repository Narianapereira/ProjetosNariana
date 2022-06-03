package Lista2;

import javax.swing.JOptionPane;

public class L2Ex3 {

	public static void main(String[] args) {
		/*
		 * Escreva um programa que leia um número inteiro e apresente um menu para o
		 * usuário escolher: 1 Verificar se o número é múltiplo de algum outro número
		 * (pedir ao usuário esse número); 2 Verificar se o número é par; 3 Verificar se
		 * o número está entre 0 e 1000; 4 Sair
		 */
// solicita o valor inteiro
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor inteiro."));
		// variável para o menu
		int menu = 1;
		// while para repetir o menu até que o usuário escolha sair
		do {
			// escolha do menu
			menu = Integer.parseInt(JOptionPane.showInputDialog("Escolha uma opção"
					+ "\n 1 - Verificar se o número é multiplo de outro número" + "\n 2 - Verificar se o número é par"
					+ "\n 3 - Verificar se o número está entre 0 e 1000" + "\n 4 - Sair"));
// switch para cada caso do menu
			switch (menu) {
			case 1:
				int multiplo = Integer.parseInt(JOptionPane.showInputDialog("Verificar se é multiplo de qual valor?"));
				// se divisão de um numero pelo outro resulta em resto 0, é múltiplo
				if (numero % multiplo == 0) {
					JOptionPane.showMessageDialog(null, numero + " é multiplo de " + multiplo);
				} else {
					JOptionPane.showMessageDialog(null, numero + " não é multiplo de " + multiplo);
				}
				break;
			case 2:
				if (numero % 2 == 0) {
					JOptionPane.showMessageDialog(null, "O numero é par.");
				} else {
					JOptionPane.showMessageDialog(null, "O número é ímpar.");
				}
				break;
			case 3:
				if ((numero > 0) && (numero < 1000)) {
					JOptionPane.showMessageDialog(null, "Número está entre 0 e 1000");
				} else {
					JOptionPane.showMessageDialog(null, "Número não está entre 0 e 1000");
				}
				break;
			case 4:
				System.exit(0);
				break;
			default:
				JOptionPane.showMessageDialog(null, "Você inseriu um número inválido");

			}
		} while (menu != 4);
	}
}

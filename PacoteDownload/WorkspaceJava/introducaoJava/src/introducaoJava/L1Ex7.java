package introducaoJava;

//importando classe JOptionPane para usarmos os pain�is de di�logo
import javax.swing.JOptionPane;

public class L1Ex7 {

	public static void main(String[] args) {
		/*
		 * Fa�a uma solu��o que alimente um vetor com 10 valores inteiros e tamb�m que
		 * solicite ao usu�rio a entrada de dados de um valor inteiro qualquer. A
		 * solu��o dever� fazer uma busca do valor, informado pelo usu�rio, no vetor e
		 * imprima a posi��o em que este foi encontrado ou se n�o foi encontrado.
		 */

		int[] numero = new int[10];
		// atrubuindo os n�meoros.
		numero[0] = 5;
		numero[1] = 10;
		numero[2] = 15;
		numero[3] = 20;
		numero[4] = 25;
		numero[5] = 30;
		numero[6] = 35;
		numero[7] = 40;
		numero[8] = 45;
		numero[9] = 50;
		int validacao = 0;
// solicitando o valor
		int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor."));
// contadora para percorrer o vetor.
		for (int i = 0; i < 10; i++) {
			if (numero[i] == numero1) {
				// validar se o numero foi encontrado, para que se n�o foi, a mensagem de n�o encontrado apare�a.
				validacao = 1;
				JOptionPane.showMessageDialog(null, "O valor inserido est� na posi��o " + i);
			}
		}
		if (validacao != 1) {
				JOptionPane.showMessageDialog(null, "O valor inserido n�o foi encontrado.");
			}
		}
	}


package introducaoJava;

//importando classe JOptionPane para usarmos os painéis de diálogo
import javax.swing.JOptionPane;

public class L1Ex7 {

	public static void main(String[] args) {
		/*
		 * Faça uma solução que alimente um vetor com 10 valores inteiros e também que
		 * solicite ao usuário a entrada de dados de um valor inteiro qualquer. A
		 * solução deverá fazer uma busca do valor, informado pelo usuário, no vetor e
		 * imprima a posição em que este foi encontrado ou se não foi encontrado.
		 */

		int[] numero = new int[10];
		// atrubuindo os númeoros.
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
				// validar se o numero foi encontrado, para que se não foi, a mensagem de não encontrado apareça.
				validacao = 1;
				JOptionPane.showMessageDialog(null, "O valor inserido está na posição " + i);
			}
		}
		if (validacao != 1) {
				JOptionPane.showMessageDialog(null, "O valor inserido não foi encontrado.");
			}
		}
	}


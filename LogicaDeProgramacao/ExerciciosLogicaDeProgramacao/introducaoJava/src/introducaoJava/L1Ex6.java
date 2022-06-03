package introducaoJava;

//importando classe JOptionPane para usarmos os painéis de diálogo
import javax.swing.JOptionPane;

public class L1Ex6 {

	public static void main(String[] args) {
		/*
		 * Crie uma calculadora que permita o cálculo de uma equação, sem limite de
		 * execuções definido, da seguinte maneira: 1. Peça o primeiro valor , 2. Peça o
		 * cálculo que deseja fazer (entre as 4 operações básicas), 3. Peça um segundo
		 * valor 4. Efetue o cálculo, 5. Peça se o usuário quer continuar calculando. Se
		 * ele responder que sim, volte para o passo 2 usando o resultado do cálculo da
		 * linha 4 como primeiro valor, e se disser que não, mostre o resultado final .
		 * Exemplo de uso para o algoritmo: 4 + 3 = 7 x 4 = 28 / 14 = 2.
		 */
		double numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor."));
		double resultado = 0;
		int continuar = 1;

		do {
			int operacao = Integer.parseInt(JOptionPane.showInputDialog("Qual a operação desejada?" + "\n 1 - Divisão"
					+ "\n 2 - Multiplicação" + "\n 3 - Adição" + "\n 4 - subtração"));
			double numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo valor."));
			switch (operacao) {
			case 1:
				while (numero2 == 0) {
					numero2 = Integer.parseInt(
							JOptionPane.showInputDialog("O segundo valor deve ser diferente de 0, digite novamente."));
				}
				resultado = numero1 / numero2;
				break;
			case 2:
				resultado = numero1 * numero2;
				break;
			case 3:
				resultado = numero1 + numero2;
				break;
			case 4:
				resultado = numero1 - numero2;
				break;
			default:
				JOptionPane.showMessageDialog(null, "Você inseriu escolheu um numero inexistente.");
			}
			JOptionPane.showMessageDialog(null, "O resultado é  " + resultado);
			continuar = Integer
					.parseInt(JOptionPane.showInputDialog("Você deseja continuar?" + "\n 1 - Sim" + "\n 2 - Não"));
			if (continuar == 1) {
				numero1 = resultado;
			}
		} while (continuar == 1);
	}

}

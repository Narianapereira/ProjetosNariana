package introducaoJava;

//importando classe JOptionPane para usarmos os pain�is de di�logo
import javax.swing.JOptionPane;

public class L1Ex6 {

	public static void main(String[] args) {
		/*
		 * Crie uma calculadora que permita o c�lculo de uma equa��o, sem limite de
		 * execu��es definido, da seguinte maneira: 1. Pe�a o primeiro valor , 2. Pe�a o
		 * c�lculo que deseja fazer (entre as 4 opera��es b�sicas), 3. Pe�a um segundo
		 * valor 4. Efetue o c�lculo, 5. Pe�a se o usu�rio quer continuar calculando. Se
		 * ele responder que sim, volte para o passo 2 usando o resultado do c�lculo da
		 * linha 4 como primeiro valor, e se disser que n�o, mostre o resultado final .
		 * Exemplo de uso para o algoritmo: 4 + 3 = 7 x 4 = 28 / 14 = 2.
		 */
		double numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor."));
		double resultado = 0;
		int continuar = 1;

		do {
			int operacao = Integer.parseInt(JOptionPane.showInputDialog("Qual a opera��o desejada?" + "\n 1 - Divis�o"
					+ "\n 2 - Multiplica��o" + "\n 3 - Adi��o" + "\n 4 - subtra��o"));
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
				JOptionPane.showMessageDialog(null, "Voc� inseriu escolheu um numero inexistente.");
			}
			JOptionPane.showMessageDialog(null, "O resultado �  " + resultado);
			continuar = Integer
					.parseInt(JOptionPane.showInputDialog("Voc� deseja continuar?" + "\n 1 - Sim" + "\n 2 - N�o"));
			if (continuar == 1) {
				numero1 = resultado;
			}
		} while (continuar == 1);
	}

}

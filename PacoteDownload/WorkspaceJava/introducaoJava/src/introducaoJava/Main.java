package introducaoJava;

//importando classe JOptionPane para usarmos os pain�is de di�logo
import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {

		int[] valores = new int[10];
		// receber e guardar os 10 numeros

		for (int i = 0; i < 10; i++) {
			valores[i] = Integer.parseInt(JOptionPane.showInputDialog("Informe o " + (i + 1) + "� valor: "));
			// la�o enquanto o usu�rio inserir valores negativos
			while(valores[i] < 0) {
				valores[i] = Integer.parseInt(JOptionPane.showInputDialog("Voc� s� pode inserir valores positivos. Insira novamente"));
			}
		}
		
		

//criando vari�vel para armazenar se o usu�rio deseja encerrar o programa
		String repetir;

		do {

			int opcao = Integer.parseInt(JOptionPane.showInputDialog(
					"O que voc� deseja ver?" + "\n 1 - Todos os valores" + "\n 2 - Somente o primeiro valor"
							+ "\n 3 - Somente o �ltimo valor" + "\n 4 - Ver os valores pares" + "\n 5 - Ver o maior valor inserido."));

			
			
			// programa��o do menu
			switch (opcao) {
			// mostrando todos os valores
			case 1:
				for (int i = 0; i < 10; i++) {
					JOptionPane.showMessageDialog(null, valores[i], "Valor " + (i + 1), JOptionPane.INFORMATION_MESSAGE);
				}
				break;
			// mostrando apenas o 1� valor
			case 2:
				JOptionPane.showMessageDialog(null, valores[0], "Primeiro valor", JOptionPane.INFORMATION_MESSAGE);
				break;
			// Mostrando somente o �ltimo valor
			case 3:
				JOptionPane.showMessageDialog(null, valores[9], "Ultimo valor", JOptionPane.INFORMATION_MESSAGE);
				break;
			// Mostrando somente os valores pares
			case 4:
				String valoresPares = "";
				for (int i = 0; i < 10; i++) {
					if (valores[i] % 2 == 0) {
						if (valoresPares != "") {
							valoresPares += ", ";
						}
						valoresPares += valores[i];
					}
				}
				JOptionPane.showMessageDialog(null, valoresPares, "Valores pares", JOptionPane.INFORMATION_MESSAGE);
				break;
				// caso a op��o seja inv�lida
				
			case 5:
				// Caso queira ver o maior n�mero
				int maiorValor = 0; 
				for (int i = 0; i < 10; i++) {
					if (valores[i] > maiorValor) { 
						maiorValor = valores[i];
					}
				}
				JOptionPane.showMessageDialog(null, maiorValor, "Maior Valor", JOptionPane.INFORMATION_MESSAGE);
				break;
			default:
				JOptionPane.showMessageDialog(null, "Op��o inv�lida", "Erro", JOptionPane.INFORMATION_MESSAGE);
				break;
			}
			// Solicitando se o usu�rio deseja voltar ao menu
			repetir = JOptionPane.showInputDialog(
					"Deseja voltar ao menu?" + "\n Digite s ou S para sim ou outro caractere para encerrar:");
			// fim da estrutura de repeti��o para o menu
		} while (repetir.equals("s")||(repetir.equals("S")));
	}

}

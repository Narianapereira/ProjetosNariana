package M�todos;

import javax.swing.JOptionPane;

public class LMetodosEx3 {

	public static void main(String[] args) {
		/*
		 * Fa�a um programa que a partir do valor de uma compra, fa�a o c�lculo de um
		 * desconto para o usu�rio. O programa deve solicitar o valor total da compra
		 * por meio de um m�todo, que dever� retorn�-lo. Um m�todo deve ser criado para
		 * receber o valor da compra e mostrar o valor final com desconto, considerando:
		 * At� R$100 - sem desconto, o valor permanece o mesmo De R$100,01 a R$200 -
		 * desconto de 20% Acima de R$200 - desconto de 30%
		 */

		double valorCompra = solicitaValor();

		calculaValor(valorCompra);

	}

// m�todo para solicitar o valor da compra
	public static double solicitaValor() {

		double valorCompra = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor total da compra."));
		return valorCompra;
	}

// m�todo para calcular o desconto
	public static void calculaValor(double valorCompra) {
		double valorFinal = 0;
		if (valorCompra <= 100) {
			JOptionPane.showMessageDialog(null, "O valor final da compra sem desconto � de R$ " + valorCompra);

		} else if ((valorCompra > 100) && (valorCompra <= 200)) {
			valorFinal = (valorCompra - (0.2 * valorCompra));
			JOptionPane.showMessageDialog(null, "O valor final com desconto de 20% � de R$ " + valorFinal);
		} else {
			valorFinal = (valorCompra - (0.3 * valorCompra));
			JOptionPane.showMessageDialog(null, "O valor final com desconto de 30% � de R$ " + valorFinal);
		}

	}

}

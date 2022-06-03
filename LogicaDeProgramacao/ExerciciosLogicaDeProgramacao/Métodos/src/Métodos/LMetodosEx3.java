package Métodos;

import javax.swing.JOptionPane;

public class LMetodosEx3 {

	public static void main(String[] args) {
		/*
		 * Faça um programa que a partir do valor de uma compra, faça o cálculo de um
		 * desconto para o usuário. O programa deve solicitar o valor total da compra
		 * por meio de um método, que deverá retorná-lo. Um método deve ser criado para
		 * receber o valor da compra e mostrar o valor final com desconto, considerando:
		 * Até R$100 - sem desconto, o valor permanece o mesmo De R$100,01 a R$200 -
		 * desconto de 20% Acima de R$200 - desconto de 30%
		 */

		double valorCompra = solicitaValor();

		calculaValor(valorCompra);

	}

// método para solicitar o valor da compra
	public static double solicitaValor() {

		double valorCompra = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor total da compra."));
		return valorCompra;
	}

// método para calcular o desconto
	public static void calculaValor(double valorCompra) {
		double valorFinal = 0;
		if (valorCompra <= 100) {
			JOptionPane.showMessageDialog(null, "O valor final da compra sem desconto é de R$ " + valorCompra);

		} else if ((valorCompra > 100) && (valorCompra <= 200)) {
			valorFinal = (valorCompra - (0.2 * valorCompra));
			JOptionPane.showMessageDialog(null, "O valor final com desconto de 20% é de R$ " + valorFinal);
		} else {
			valorFinal = (valorCompra - (0.3 * valorCompra));
			JOptionPane.showMessageDialog(null, "O valor final com desconto de 30% é de R$ " + valorFinal);
		}

	}

}

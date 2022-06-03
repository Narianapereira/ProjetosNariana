package Lista2;

import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class L2Ex4 {

	public static void main(String[] args) {
		/*
		 * Sabe-se que o latão é constituído de 70% de cobre e 30% de zinco. Faça um
		 * programa que permita ao usuário informar uma quantidade de latão em quilos e
		 * forneça o total de cobre e zinco necessários para fabricar essa quantidade.
		 */
// solicita a quantidade em quilos
		double quantidade = Double
				.parseDouble(JOptionPane.showInputDialog("Insira a quantidade de latão em kg desejada."));
		// calcula quanto de cobre seria necessário
		double cobre = 0.7 * quantidade;
		// calcula quanto de zinco
		double zinco = quantidade - cobre;
		// duas casas decimais após a vírgula
		DecimalFormat df = new DecimalFormat();
		df.applyPattern(" #.##");
//imprime
		JOptionPane.showMessageDialog(null,
				"A quantidade de cobre é " + df.format(cobre) + " e a quantidade de zinco é " + df.format(zinco));

	}

}

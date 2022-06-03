package Lista2;

import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class L2Ex4 {

	public static void main(String[] args) {
		/*
		 * Sabe-se que o lat�o � constitu�do de 70% de cobre e 30% de zinco. Fa�a um
		 * programa que permita ao usu�rio informar uma quantidade de lat�o em quilos e
		 * forne�a o total de cobre e zinco necess�rios para fabricar essa quantidade.
		 */
// solicita a quantidade em quilos
		double quantidade = Double
				.parseDouble(JOptionPane.showInputDialog("Insira a quantidade de lat�o em kg desejada."));
		// calcula quanto de cobre seria necess�rio
		double cobre = 0.7 * quantidade;
		// calcula quanto de zinco
		double zinco = quantidade - cobre;
		// duas casas decimais ap�s a v�rgula
		DecimalFormat df = new DecimalFormat();
		df.applyPattern(" #.##");
//imprime
		JOptionPane.showMessageDialog(null,
				"A quantidade de cobre � " + df.format(cobre) + " e a quantidade de zinco � " + df.format(zinco));

	}

}

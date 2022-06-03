package Lista2;

import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class L2Ex2 {

	public static void main(String[] args) {
		/*
		 * Escreva um programa que receba quatro notas do aluno e as insira em um vetor.
		 * Depois, calcule a média aritmética entre as quatro notas e mostre o
		 * "conceito" do aluno conforme as instruções: 9.0 ou maior = Conceito A entre
		 * 8.0 e 8.9 = Conceito B entre 7.0 e 7.9 = Conceito C menor que 7.0 = Conceito
		 * D
		 */
// declara a variavel string
		String conceito = "A";
		double[] nota = new double[4];
		//recebe os valores das notas no vetor através de uma contadora
		for (int i = 0; i < 4; i++) {
			nota[i] = Double.parseDouble(JOptionPane.showInputDialog("Insira a " + (i + 1) + "ª nota."));

		}
		// calcula a média aritmética
		double media = ((nota[0] + nota[1] + nota[2] + nota[3]) / 4);
// condição para atribuir o conceito conforme a nota do aluno
		if (media >= 9.0) {
			conceito = "A";
		} else if ((media >= 8.0) && (media <= 8.9)) {
			conceito = "B";
		} else if ((media >= 7.0) && (media <= 7.9)) {
			conceito = "C";
		} else if (media < 7.0) {
			conceito = "D";
		}
		JOptionPane.showMessageDialog(null, "O conceito do aluno é " + conceito + ".");
	}

}

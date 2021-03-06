package M?todos;

import javax.swing.JOptionPane;

public class LMetodosEx2 {

	public static void main(String[] args) {
		/*
		 * Fa?a um programa que receba as tr?s notas de um aluno e pergunte ao professor
		 * qual m?dia ele deseja calcular: aritm?tica ou ponderada. Se for a m?dia
		 * ponderada, os pesos de cada nota devem ser informados. Cada m?dia dever? ser
		 * calculada por um m?todo; Os dois m?todos devem receber como par?metros as
		 * notas; No caso do m?todo da m?dia ponderada, al?m das notas, o m?todo dever?
		 * receber tamb?m os pesos, que devem ser previamente solicitados ao usu?rio; Os
		 * dois m?todos devem retornar a m?dia; Um m?todo deve ser criado para receber a
		 * m?dia final e mostrar se o aluno est? aprovado ou reprovado, considerando que
		 * a m?dia m?nima para aprova??o ? 7.
		 */

		double[] notas = new double[3];
		double[] pesos = new double[3];
		double mediaAritmetica = 0;
		int tipoNota = 0;
		int i = 0;
		double mediaFinal = 0;

		JOptionPane.showMessageDialog(null, "Esse programa ir? calcular a m?dia aritm?tica ou ponderada de 3 notas.");
// solicita as notas
		for (i = 0; i < 3; i++) {
			notas[i] = Double.parseDouble(JOptionPane.showInputDialog("Insira a " + (i + 1) + "? nota."));
		}
// verifica qual m?dia quer calcular
		tipoNota = Integer.parseInt(
				JOptionPane.showInputDialog("Qual m?dia voc? deseja calcular? \n 1 - Aritm?tica \n 2 - Ponderada"));
// se ponderada, solicita os pesos
		if (tipoNota == 2) {
			for (i = 0; i < 3; i++) {
				pesos[i] = Double.parseDouble(JOptionPane.showInputDialog("Insira o peso da " + (i + 1) + "? nota."));
			}
			// calcula media atrav?s do m?todo
			mediaFinal = calculaMediaPonderada(notas, pesos);
			JOptionPane.showMessageDialog(null, "A m?dia ? " + mediaFinal);

		} else if (tipoNota == 1) {
			mediaFinal = calculaMediaAritmetica(notas);
			JOptionPane.showMessageDialog(null, "A m?dia ? " + mediaFinal);
		}
		// verifica se foi aprovado
		mostraResultadoFinal(mediaFinal);
	}

	public static double calculaMediaAritmetica(double notas[]) {
		double somaMedias = 0;
		double mediaAritmetica = 0;
		// realiza soma das notas
		for (int i = 0; i < 3; i++) {
			somaMedias = somaMedias + notas[i];
			// calcula m?dia
			mediaAritmetica = somaMedias / 3;
		}
// retorno
		return mediaAritmetica;
	}

	public static double calculaMediaPonderada(double notas[], double pesos[]) {
		// calcula media ponderada
		double mediaPonderada = (notas[0] * pesos[0]) + (notas[1] * pesos[1]) + (notas[2] * pesos[2]);
		return mediaPonderada;
	}

	public static void mostraResultadoFinal(double mediaFinal) {
// verifica se o aluno passou
		if (mediaFinal >= 7) {
			JOptionPane.showMessageDialog(null, "O aluno est? aprovado");
		} else {
			JOptionPane.showMessageDialog(null, "O aluno est? reprovado");
		}
	}

}
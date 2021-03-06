package Lista2;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class L2Ex5 {

	public static void main(String[] args) {
		/*
		 * Fa?a um programa que solicite alguns dados dos usu?rios que frequentam um
		 * clube. O programa deve solicitar a idade, se a pessoa ? fumante ou n?o (1-
		 * SIM, 2- N?O), seu sal?rio l?quido e h? quanto tempo frequenta o clube (em
		 * meses). O usu?rio dever? digitar ?encerrar? quando n?o tiver mais pessoas
		 * para registrar. Como dados de sa?da, o programa deve exibir: A m?dia das
		 * idades das pessoas; A m?dia salarial das pessoas; Quantos s?o fumantes e
		 * quantos n?o s?o fumantes; A porcentagem de pessoas que frequentam o clube h?
		 * mais de 03 meses.
		 */

		int fumante = 0;
		double salario = 0;
		int tempoFrequenta = 0;
		int mediaIdade = 0;
		// quantidade de usuarios
		int quantidade = 0;
		int quantidadeFumante = 0;
		int quantidadeNaoFumante = 0;
		int frequentadores3Meses = 0;
		double mediaSalarial = 0;
		// porcentagem que frequenta a mais de tr?s meses
		int porcentagemFrequentadores = 0;
		// validar se continua o cadastro
		String finalizar = "continuar";
		DecimalFormat df = new DecimalFormat("0.00");
		

		do {

			int idade = Integer.parseInt(JOptionPane.showInputDialog("Qual a idade do usu?rio?"));
			// calcula a quantidade de usuarios
			quantidade = quantidade + 1;
			// calcula a m?dia de idade
			mediaIdade = ((mediaIdade + idade) / quantidade);
			fumante = Integer.parseInt(JOptionPane.showInputDialog("O usu?rio ? fumante? \n 1 - Sim, \n 2 - N?o "));
			// calcula a quantidade de fumantes e nao fumantes
			if (fumante == 1) {
				quantidadeFumante = quantidadeFumante + 1;
			} else {
				quantidadeNaoFumante = quantidadeNaoFumante + 1;
			}
			salario = Double.parseDouble(JOptionPane.showInputDialog("Qual o sal?rio l?quido do usu?rio?"));
			// calcula m?dia salarial
			mediaSalarial = ((mediaSalarial + salario) / quantidade);
			tempoFrequenta = Integer.parseInt(JOptionPane.showInputDialog("Quantos meses frequenta o clube?"));
			// calcula quantos frequentam a mais de 3 meses
			if (tempoFrequenta > 3) {
				frequentadores3Meses = frequentadores3Meses + 1;
				// transforma em porcentagem a quantidade de frquentadores
				porcentagemFrequentadores = ((frequentadores3Meses * 100) / quantidade);
			}
			// valida a continua??o
			finalizar = JOptionPane.showInputDialog(
					"Se n?o deseja cadastrar mais usu?rios, digite 'encerra', se deseja, digite 'continuar'.");
		// finaliza quando o usu?rio digitar encerra
		}while (!finalizar.equals("encerra"));
		// imprime
		JOptionPane.showMessageDialog(null, "A m?dia de idade dos usu?rios ? " + mediaIdade
				+ " anos e a m?dia salarial ? R$ " + df.format(mediaSalarial) + ".");
		JOptionPane.showMessageDialog(null, "A quantidade de fumantes ? " + quantidadeFumante
				+ " e a quantidade de n?o fumantes ? " + quantidadeNaoFumante + ".");
		JOptionPane.showMessageDialog(null, " A porcentagem de usu?rios que frequentam o clube a mais de 3 meses ? de "
				+ porcentagemFrequentadores + "%.");
	}

}

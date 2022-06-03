package Lista2;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class L2Ex6 {

	public static void main(String[] args) {
		/*
		 * Uma empresa deseja saber alguns dados sobre suas vendas no passado. Faça um
		 * programa que armazene em um vetor o valor total das vendas de cada um dos 12
		 * meses do ano (que deverá ser informado pelo usuário) e mostre: O mês com a
		 * maior venda; O mês com a menor venda; A média das vendas do ano todo; A média
		 * das vendas dos meses pares; A média das vendas do 2º semestre.
		 */

		double[] valorVendas = new double[12];
		double maiorVenda = 0;
		double menorVenda = 0;
		//primeiro realizei a soma dentro da contadora para depois fazer a media
		double somaVendas = 0;
		double somaVendasPares = 0;
		double somaVendasSegundo = 0;
		double mediaVendas = 0;
		double mediaVendasPares = 0;
		double mediaVendasSegundo = 0;
		//armazena os meses de maior ou menor venda
		int mesMaior = 0;
		int mesMenor = 0;
		DecimalFormat df = new DecimalFormat("0.00");
		
		for (int i = 0; i < 12; i++) {
			valorVendas[i] = Double
					.parseDouble(JOptionPane.showInputDialog("Qual o valor total de vendas do " + (i + 1) + "º mês?"));
			if (valorVendas[i] > maiorVenda) {
				// armazena o valor da maior venda para comparar
				maiorVenda = valorVendas[i];
				mesMaior = i;
			} else if (valorVendas[i] < menorVenda) {
				// armazena o valor da menor venda para comparar
				menorVenda = valorVendas[i];
				mesMenor = i;
			}
			//soma os valores de venda
			somaVendas = (somaVendas + valorVendas[i]);
			if (i % 2 == 0) {
				// soma as vendas pares
				somaVendasPares = (somaVendasPares + valorVendas[i]);
			}
			if (i >= 6) {
				//soma as vendas do segundo semestre
				somaVendasSegundo = (somaVendasSegundo + valorVendas[i]);
			}
			// calcula as médias
			mediaVendas = somaVendas / 12;
			mediaVendasPares = somaVendasPares / 6;
			mediaVendasSegundo = somaVendasSegundo / 6;
		}

		JOptionPane.showMessageDialog(null, "O mês com maior venda foi o " + (mesMaior + 1) + "º mês.");
		JOptionPane.showMessageDialog(null, "O mês com menor venda foi o " + (mesMenor + 1) + "º mês.");
		JOptionPane.showMessageDialog(null, "A média das vendas do ano foi de R$" + df.format(mediaVendas) + ".");
		JOptionPane.showMessageDialog(null, "A média de vendas dos meses pares foi de R$" + mediaVendasPares + ".");
		JOptionPane.showMessageDialog(null,
				"A média de vendas do segundo semestre foi de R$" + mediaVendasSegundo + ".");
	}

}

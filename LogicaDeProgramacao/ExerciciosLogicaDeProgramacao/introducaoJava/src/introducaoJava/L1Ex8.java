package introducaoJava;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class L1Ex8 {

	public static void main(String[] args) {
		/*
		 * Fa�a um programa que carregue os valores das vendas de uma loja no primeiro
		 * semestre do ano. Considere para tal uma matriz [6,4], sendo que s�o 06 meses
		 * e 04 semanas por m�s. Ao final, mostre na tela: Total de vendas do semestre
		 * Total vendido em cada m�s
		 */
		/*
		 * vari�veis reais. Uma matriz para os valores das vendas Um vetor para os
		 * valores mensais e uma simples para o valor semestral
		 */

		double[] valorMensal = new double[6];
		double[][] valores = new double[6][4];
		double totalSemestre = 0;
		DecimalFormat df = new DecimalFormat("0.00");
		
// contadora para armazenar os valores fornecidos na matriz.
		for (int l = 0; l < 6; l++) {
			for (int c = 0; c < 4; c++) {
				// c+1 porque a matriz inicia em 0 no java
				valores[l][c] = Double.parseDouble(JOptionPane
						.showInputDialog("Digite o valor da " + (c + 1) + "� semana na " + (l + 1) + " m�s."));
				// para os valores totais mensais, a soma armazena os valores semanais no vetor
				valorMensal[l] = (valorMensal[l] + valores[l][c]);
			}
			totalSemestre = totalSemestre + valorMensal[l];
		}
		JOptionPane.showMessageDialog(null, "O total vendido no semestre foi de R$ " + df.format(totalSemestre));
		// contadora para informar os valores dos 6 meses sem ter que escrever 6 vezes.
		for (int l = 0; l < 6; l++) {
			JOptionPane.showMessageDialog(null, "O total vendido no " + (l + 1) + " m�s foi de R$ " + df.format(valorMensal[l]));
		}
	}
}
package Lista2;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class L2Ex7 {

	public static void main(String[] args) {

		// atribui os valores da tabela a matriz;
		double[][] notas = { { 9.53, 8.66, 8.45 }, { 7.57, 9.00, 8.01 }, { 8.87, 9.44, 7.88 }, { 7.30, 6.77, 9.21 } };
		// atribui as mat?rias a um vetor para depois imprimir
		String[] materias = { "Matem?tica", "F?sica", "Qu?mica" };
		double maiorNota = 0;
		String disciplinaMaiorNota = "matem?tica";
		int disciplinaMedia = 1;
		double somaMedia = 0;
		double media = 0;
		int c = 0;
		int l = 0;
		int opcoesMenu = 0;
		int opcaoBimestre = 0;
		String imprimeMaterias = " ";
		String imprimeNotas = " ";
		int i = 0;
		DecimalFormat df = new DecimalFormat("0.00");

		for (l = 0; l < 4; l++) {
			for (c = 0; c < 3; c++) {
				// encontra a maior nota e armazena ela na vari?vel maiorNota
				if (notas[l][c] > maiorNota) {
					maiorNota = notas[l][c];
					// armazena a disciplina da maior nota conforme a coluna em que est? a maior
					// nota
					if (c == 1) {
						disciplinaMaiorNota = "matem?tica";
					} else if (c == 2) {
						disciplinaMaiorNota = "f?sica";
					} else {
						disciplinaMaiorNota = "qu?mica";
					}
				}
			}
		}
		// imprime o menu para o usu?rio
		//estrutura de repeti??o
		do {
			opcoesMenu = Integer.parseInt(JOptionPane.showInputDialog(
					"Qual op??o voc? deseja acessar? \n 1 - Todas as notas \n 2 - Maior nota \n 3 - M?dia das notas de uma disciplina \n 4 - Notas de um dos bimestres \n 5- Encerrar"));
// executa conforme opcao escolhida pelo usu?rio
			switch (opcoesMenu) {
			case 1:
				// atrubui os valores das notas a string para imprimir - concatenar!!
				for (l = 0; l < 4; l++) {
					for (c = 0; c < 3; c++) {
						imprimeNotas = imprimeNotas + notas[l][c];
						imprimeNotas = imprimeNotas + " ? ? ? ? ? ? ? ";
					}
					// para quebra de linha na tabela
					imprimeNotas = imprimeNotas + "\n";
				}
				// atribui os nomes das materias a string - concatena
				for (i = 0; i < 3; i++) {
					imprimeMaterias = imprimeMaterias + materias[i];
					imprimeMaterias = imprimeMaterias + " ?";

				}
				JOptionPane.showMessageDialog(null, imprimeMaterias + "\n" + imprimeNotas);

				break;
			case 2:
				// imprime a maior nota
				JOptionPane.showMessageDialog(null,
						"A maior nota foi " + maiorNota + " de " + disciplinaMaiorNota + ".");
				break;
			case 3:
				// escolhe a mat?ria que quer ver a m?dia
				disciplinaMedia = Integer.parseInt(JOptionPane.showInputDialog(
						"Qual mat?ria voc? deseja ver a m?dia? \n 1 - Matem?tica \n 2 - F?sica \n 3 - Qu?mica"));
				// soma das linhas da coluna escolhida atrav?s da vari?vel disciplinaMedia
				for (l = 0; l < 4; l++) {
					somaMedia = somaMedia + notas[l][(disciplinaMedia - 1)];
				}
// calculo da media com a soma das linhas							
				media = somaMedia / 4;
				JOptionPane.showMessageDialog(null, "A m?dia desta disciplina foi de " + df.format(media));

				break;
			case 4:
				// imprime a parte de cima da matriz
				opcaoBimestre = Integer
						.parseInt(JOptionPane.showInputDialog("Qual bimestre voc? deseja ver as notas?"));
				if (opcaoBimestre == 1) {
					// atribui os nomes das materias a string - concatena
					for (i = 0; i < 3; i++) {
						imprimeMaterias = imprimeMaterias + materias[i];
						imprimeMaterias = imprimeMaterias + " ?";
					}
					for (l = 0; l < 2; l++) {
						for (c = 0; c < 3; c++) {
							imprimeNotas = imprimeNotas + notas[l][c];
							imprimeNotas = imprimeNotas + " ? ? ? ? ? ? ? ";
						}
						// para quebra de linha na tabela
						imprimeNotas = imprimeNotas + "\n";
					}
					JOptionPane.showMessageDialog(null, imprimeMaterias + "\n" + imprimeNotas);
				} else if (opcaoBimestre == 2) {
					// imprime a parte de baixo da matriz
					for (i = 0; i < 3; i++) {
						imprimeMaterias = imprimeMaterias + materias[i];
						imprimeMaterias = imprimeMaterias + " ?";
					}
					for (l = 2; l < 4; l++) {
						for (c = 0; c < 3; c++) {
							imprimeNotas = imprimeNotas + notas[l][c];
							imprimeNotas = imprimeNotas + " ? ? ? ? ? ? ? ";
						}
						imprimeNotas = imprimeNotas + "\n";
					}
					JOptionPane.showMessageDialog(null, imprimeMaterias + "\n" + imprimeNotas);
				}
			}
// fim da estrutura de repeti??o
		} while (opcoesMenu != 5);
	}
}

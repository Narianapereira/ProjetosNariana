import javax.swing.JOptionPane;

public class JogoDaVelha {

	public static void main(String[] args) {
		String jogador = "x";
		int posicao = 0;
		String[][] matriz = { { "1", "2", "3" }, { "4", "5", "6" }, { "7", "8", "9" } };

		mostraTabela(matriz);

		switch (posicao) {
		case 1:
			matriz[0][0] = jogador;
		
			jogador = trocaJogador(jogador);
			break;
		case 2:
			matriz[0][1] = jogador;
		
			jogador = trocaJogador(jogador);
			break;
		case 3:
			matriz[0][2] = jogador;
		
			jogador = trocaJogador(jogador);
			break;
		case 4:
			matriz[1][0] = jogador;
		
			jogador = trocaJogador(jogador);
			break;
		case 5:
			matriz[1][1] = jogador;
			
			jogador = trocaJogador(jogador);
			break;
		case 6:
			matriz[1][2] = jogador;
			
			jogador = trocaJogador(jogador);
			break;
		case 7:
			matriz[2][0] = jogador;
			
			jogador = trocaJogador(jogador);
			break;
		case 8:
			matriz[2][1] = jogador;
			
			jogador = trocaJogador(jogador);
			break;
		case 9:
			matriz[2][2] = jogador;
			
			jogador = trocaJogador(jogador);
		}
		mostraTabela(matriz);
	}

	public static String trocaJogador(String jogador) {
		if (jogador.equalsIgnoreCase("x")) {
			jogador = "o";
		} else {
			jogador = "x";
		}
		return jogador;
	}

	public static void mostraTabela(String[][] matriz) {
		int posicao = 0;
		String imprimeTabela = "";
		for (int i = 0; i < 3; i++) {
			for (int c = 0; c < 3; c++) {

				imprimeTabela = imprimeTabela + matriz[i][c];
				imprimeTabela = imprimeTabela + " ? ?   ";

			}
			imprimeTabela = imprimeTabela + "\n";

		}
		posicao = Integer
				.parseInt(JOptionPane.showInputDialog(null, imprimeTabela + "\n Escolha a o n?mero onde quer jogar."));
	}
}
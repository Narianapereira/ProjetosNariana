package View;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import Model.*;

public class EntradaSaida {

	public static int solicitaOpcao() {

		String[] opcoesMenu = { "Fabricar carros", "Vender um carro", "Ver informações dos carros", "Sair" };

		JComboBox<String> menuInicial = new JComboBox<String>(opcoesMenu);
		JOptionPane.showConfirmDialog(null, menuInicial, "Bem vindo a Fábrica da Nari", JOptionPane.OK_CANCEL_OPTION);
		return menuInicial.getSelectedIndex();
	}

	public static int solicitaQtCarros() {

		int qtCarros = Integer.parseInt(JOptionPane.showInputDialog("Quantos carros você deseja fabricar?"));
		return qtCarros;

	}

	public static String solicitaModelo() {
		String modelo = JOptionPane.showInputDialog("Qual modelo escolhido?");
		return modelo;

	}

	public static String solicitaCor() {
		String cor = JOptionPane.showInputDialog("Qual cor do carro escolhido?");
		return cor;
	}

	public static void imprimeLista(String todosCarros) {
		JOptionPane.showMessageDialog(null, todosCarros, "Carros disponíveis", JOptionPane.INFORMATION_MESSAGE);
	}

	public static int escolherCarroVender(ArrayList<Carro> listaDeCarros) {
		// oferta as opcoes de carro para vender, recebendo como parametro a lista de
		// carros
		int qtDeCarros = listaDeCarros.size();
		// constrói o vetor para o JComboBox a partir da listaDeCarros
		String[] descricaoCarros = new String[qtDeCarros];
		String[] corCarros = new String[qtDeCarros];
		String[] opcaoVenda = new String[qtDeCarros];
		
		for (int i = 0; i < qtDeCarros; i++) {
			descricaoCarros[i] = listaDeCarros.get(i).getModelo();
			corCarros[i] = listaDeCarros.get(i).getCor();
			// cria string para cor + modelo na hora da venda
			opcaoVenda[i] = descricaoCarros[i] + " - " + corCarros[i];
		}

		// cria JComboBox com o vetor descricaoCarros
		JComboBox<String> escolherCarroVender = new JComboBox<String>(opcaoVenda);
		// se usuario clicar cancelar, armazena na variavel confirmar "2";
		int confirmar = JOptionPane.showConfirmDialog(null, escolherCarroVender, "Qual carro deseja vender?",
				JOptionPane.OK_CANCEL_OPTION);
		// se ele clica ok, armazena 0 na variavel confirmar
		if (confirmar == 0) {
			int carroEscolhido = escolherCarroVender.getSelectedIndex();
			return carroEscolhido;
// se nao, retorna -1
		} else {
			return -1;
		}
	}
}
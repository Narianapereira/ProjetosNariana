package Control;

import Model.*;
import View.EntradaSaida;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Controler {

	private Fabrica fabrica = null;

	public void exibeMenu() {

		int opcaoMenu;
		fabrica = new Fabrica();
		do {

			opcaoMenu = EntradaSaida.solicitaOpcao();

			switch (opcaoMenu) {

			case 0:
				int qtCarros = EntradaSaida.solicitaQtCarros();

				for (int i = 0; i < qtCarros; i++) {
					fabrica.fabricarCarro();
				}
				break;
			case 1:

				// pega a lista de carros da fabrica
				ArrayList<Carro> listaDeCarros = fabrica.getListaDeCarros();
				// boleano que valida a lista atraves do metodo isEmpty
				boolean validaLista = listaDeCarros.isEmpty();
				// se a lista possui carros, realiza a venda
				if (validaLista == false) {
					// passa a lista como parametro para o metodo da entrada e saida solicitando o
					// carro a vender
					int carroEscolhido = EntradaSaida.escolherCarroVender(listaDeCarros);
					// passa o carro escolhido como parametro para o metodo de vender carro na
					// fabrica
					
					if (carroEscolhido != -1) {
						fabrica.venderCarro(carroEscolhido);
						// se método retornou -1, usuario clicou cancelar, venda nao é realizada;
					} else {
						JOptionPane.showMessageDialog(null, "Você clicou cancelar");
					}
				} else {
					JOptionPane.showMessageDialog(null, "Não há carros a venda.");
				}
				break;
			case 2:
				String todosCarros = fabrica.informacoesCarros();
				// se lista esta vazia retorna string vazio e mostra msg de que nao ha carros
				if (todosCarros.equals("")) {
					JOptionPane.showMessageDialog(null, "Não há carros a mostrar");
					// se há carros na lista, imprime carros no metodo da EntradaSaida
				} else {
					EntradaSaida.imprimeLista(todosCarros);
				}
				break;
			}
		} while (opcaoMenu != 3);

		System.exit(0);

	}
}

package Model;

import java.util.ArrayList;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;

import View.EntradaSaida;

public class Fabrica {

	private ArrayList<Carro> listaDeCarros = new ArrayList<Carro>();

	public ArrayList<Carro> getListaDeCarros() {
		return listaDeCarros;
	}

	public void setListaDeCarros(ArrayList<Carro> listaDeCarros) {
		this.listaDeCarros = listaDeCarros;
	}

	public void venderCarro(int carroEscolhido) {

		// recebe o carro escolhido para a venda e remove do array
		listaDeCarros.remove(carroEscolhido);

	}

	public void fabricarCarro() {
		Carro carro = new Carro();
		carro.setModelo(EntradaSaida.solicitaModelo());
		carro.setCor(EntradaSaida.solicitaCor());
		listaDeCarros.add(carro);
	}

	public String informacoesCarros() {
		// verifica se lista está vazia, se estiver, retorna um String vazio
		boolean verificaLista = listaDeCarros.isEmpty();
		if (verificaLista == false) {
			String todosCarros = "";

			for (Carro carro : this.listaDeCarros) {
				todosCarros += carro.getModelo() + " - " + carro.getCor() + "\n";
			}
			return todosCarros;
		} else {
			String todosCarros = "";
			return todosCarros;
		
		}
	}
}
package View;

import Model.*;

import java.util.ArrayList;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;

public class Entrada {

	public static int solicitaOpcao() {

		String[] opcoesMenu = { "Cadastrar produto", "Ver produtos cadastrados", "Dar entrada de produtos no estoque",
				"Vender produtos", "Ver estoque", "Ver cupons fiscais", "Ver valor total de vendas", "Sair" };

		JComboBox<String> menu = new JComboBox<String>(opcoesMenu);
		JOptionPane.showConfirmDialog(null, menu, "Bem vindo ao Material de Construção da Nari",
				JOptionPane.OK_CANCEL_OPTION);
		return menu.getSelectedIndex();

	}

	public static String solicitaDescricao() {

		String produto = JOptionPane.showInputDialog("Qual produto a ser cadastrado?");
		return produto;
	}

	public static int solicitaCodigo() {

		int codigo = Integer.parseInt(JOptionPane.showInputDialog("Qual código do produto?"));
		return codigo;
	}

	public static double solicitaPreco() {

		double preco = Double.parseDouble(JOptionPane.showInputDialog("Qual preço do produto?"));
		return preco;
	}

	public static int solicitaCodigoProdutoEntrada() {

		int codigo = Integer.parseInt(JOptionPane.showInputDialog("Qual código do produto a dar entrada?"));
		return codigo;

	}

	public static int solicitaQtProdutos() {
		int qtProdutos = Integer.parseInt(JOptionPane.showInputDialog("Insira a quantidade de produtos."));
		return qtProdutos;

	}

	public static int escolheProdutoVender(ArrayList<Produto> listaDeProdutosEstoque) {
		int qtProdutos = listaDeProdutosEstoque.size();

		String[] descricaoProduto = new String[qtProdutos];
		int[] qtEstoque = new int[qtProdutos];
		String[] opcaoVenda = new String[qtProdutos];
// pego a qt e a descrição
		for (int i = 0; i < qtProdutos; i++) {
			descricaoProduto[i] = listaDeProdutosEstoque.get(i).getDescricao();
			qtEstoque[i] = listaDeProdutosEstoque.get(i).getQt();
// cria string com o a qt em estoque(transforma) mais a descrição
			opcaoVenda[i] = descricaoProduto[i] + " | " + String.valueOf(qtEstoque[i]);

		}

		JComboBox<String> escolheProdutoVender = new JComboBox<String>(opcaoVenda);
// se usuario clicar cancelar, armazena "-1" na variavel confirmar
		int confirmar = JOptionPane.showConfirmDialog(null, escolheProdutoVender, "Descrição | Qt",
				JOptionPane.OK_CANCEL_OPTION);
		// se ele clica ok, armazena "0" na variavel confirmar
		if (confirmar == 0) {
		int produtoEscolhido = escolheProdutoVender.getSelectedIndex();
		return produtoEscolhido;
		}else {
			return -1;
		}
	}

}

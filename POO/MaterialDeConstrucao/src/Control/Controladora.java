package Control;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import Model.*;
import View.*;

public class Controladora {

	private MaterialDeConstrucao material = null;

	public void exibeMenu() {
		int opcaoMenu;

		material = new MaterialDeConstrucao();

		do {
			opcaoMenu = Entrada.solicitaOpcao();

			switch (opcaoMenu) {
			case 0:
				material.cadastraProduto();
				break;
			case 1:
				// ver produtos cadastrados
				String infosProdutosCadastrados = material.geraInfosProdutosCadastrados();

				Saida.imprimeListaDeProdutos(infosProdutosCadastrados);
				break;
			case 2:
// da entrada do produto no estoque
				int codigoProdutoEntrada = Entrada.solicitaCodigoProdutoEntrada();
				int qtProdutosEntrada = Entrada.solicitaQtProdutos();

				material.daEntradaProdutos(codigoProdutoEntrada, qtProdutosEntrada);
				break;
			case 3:
				// vende produtos
				ArrayList<Produto> listaDeProdutosEstoque = material.getListaDeProdutosEstoque();
				// verifica se há produtos em estoque
				boolean verificaEstoque = listaDeProdutosEstoque.isEmpty();
				if (!verificaEstoque) {
					int produtoEscolhido = Entrada.escolheProdutoVender(listaDeProdutosEstoque);
					// verifica se o usuário apertou cancelar, que retornaria -1
					if (produtoEscolhido != -1) {
						int qtProdutosVender = Entrada.solicitaQtProdutos();
						material.vendeProduto(produtoEscolhido, qtProdutosVender);
					} else {
						JOptionPane.showMessageDialog(null, "Você cancelou a venda.");
					}
				} else {
					JOptionPane.showMessageDialog(null, "Não há produtos em estoque");
				}
				break;
			case 4:
				// ver estoque
				String infosEstoque = material.geraInfosEstoque();
				Saida.imprimeInfosEstoque(infosEstoque);
				break;
			case 5:
// ver os cupons fiscais
				String infosCupons = material.geraInfosCupons();
				Saida.imprimeInfosCupons(infosCupons);
				break;
			case 6:
// ver valor total das vendas
				double valorTotal = material.geraValorTotal();
				Saida.imprimeValorTotal(valorTotal);

			}
		} while (opcaoMenu != 7);

	}

}

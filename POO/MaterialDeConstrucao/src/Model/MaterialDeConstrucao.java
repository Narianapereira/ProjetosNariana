package Model;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;

import View.Entrada;

public class MaterialDeConstrucao {

	private ArrayList<Produto> listaDeProdutosCadastrados = new ArrayList<Produto>();
	private ArrayList<Produto> listaDeProdutosEstoque = new ArrayList<Produto>();
	private ArrayList<CupomFiscal> listaDeCupons = new ArrayList<CupomFiscal>();

	public ArrayList<Produto> getListaDeProdutosEstoque() {
		return listaDeProdutosEstoque;
	}

	public void cadastraProduto() {

		Produto produto = new Produto();
		produto.setCodigo(Entrada.solicitaCodigo());
		produto.setDescricao(Entrada.solicitaDescricao());
		produto.setPreco(Entrada.solicitaPreco());
		produto.setQt(0);
		listaDeProdutosCadastrados.add(produto);

	}

	public String geraInfosProdutosCadastrados() {
		DecimalFormat df = new DecimalFormat("R$ 0.00");

		String infosProdutosCadastrados = "Código | Descrição | Preço\n";

		for (Produto produto : this.listaDeProdutosCadastrados) {
			infosProdutosCadastrados += produto.getCodigo() + " | " + produto.getDescricao() + " | "
					+ df.format(produto.getPreco()) + "\n";
		}
		return infosProdutosCadastrados;

	}

	public void daEntradaProdutos(int codigoProdutoEntrada, int qtProdutosEntrada) {

		for (Produto produto : listaDeProdutosCadastrados) {

			if (produto.getCodigo() == codigoProdutoEntrada) {
// verifica se o produto já existe
				boolean verificaProduto = listaDeProdutosEstoque.contains(produto);
				// se não, seta a quantidade e add o produto
				if (!verificaProduto) {
					produto.setQt(qtProdutosEntrada);
					listaDeProdutosEstoque.add(produto);
// se já existe, soma a nova qt a qt antiga
				} else {
					int qtEstoque = produto.getQt();
					qtEstoque += qtProdutosEntrada;
					produto.setQt(qtEstoque);
				}

			}
		}

	}

	public void vendeProduto(int produtoEscolhido, int qtProdutosVender) {
// pega qt previa do produto
		int qtPrevia = listaDeProdutosEstoque.get(produtoEscolhido).getQt();
		// subtrai a qt a ser vendida
		int qtPosVenda = qtPrevia - qtProdutosVender;
		// seta a nova quantidade
		listaDeProdutosEstoque.get(produtoEscolhido).setQt(qtPosVenda);

		CupomFiscal cupom = new CupomFiscal();

		// gera cupom fiscal
		cupom.setDescricao(listaDeProdutosEstoque.get(produtoEscolhido).getDescricao());
		cupom.setDate();
		cupom.setQt(qtProdutosVender);
		cupom.setValorTotal(qtProdutosVender * (listaDeProdutosEstoque.get(produtoEscolhido).getPreco()));
		listaDeCupons.add(cupom);

	}

	public String geraInfosEstoque() {
		DecimalFormat df = new DecimalFormat("R$ 0.00");

		String infosEstoque = "Código | Descrição | Preço | Qt\n";

		for (Produto produto : this.listaDeProdutosEstoque) {
			infosEstoque += produto.getCodigo() + " | " + produto.getDescricao() + " | " + df.format(produto.getPreco())
					+ " | " + produto.getQt() + "\n";
		}
		return infosEstoque;
	}

	public String geraInfosCupons() {
		DecimalFormat df = new DecimalFormat("R$ 0.00");

		String infosCupons = "Descrição | Data | Qt | Valor\n";
		for (CupomFiscal cupom : this.listaDeCupons) {
			infosCupons += cupom.getDescricao() + " | " + cupom.getDate() + " | " + cupom.getQt() + " | "
					+ df.format(cupom.getValorTotal()) + "\n";
		}
		return infosCupons;

	}

	public double geraValorTotal() {
		double valorTotal = 0;
		for (CupomFiscal cupom : this.listaDeCupons) {
			valorTotal += cupom.getValorTotal();
		}
		return valorTotal;
	}
}

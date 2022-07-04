package Model;

import java.util.ArrayList;
import java.util.Date;

import javax.swing.JOptionPane;

public class Conta {

	private String titularDaConta;
	private String tipoConta;
	private double saldo;
	private ArrayList<Movimentacao> listaDeMovimentacao = new ArrayList<Movimentacao>();

	public String getTitularDaConta() {
		return titularDaConta;
	}

	public void setTitularDaConta(String titularDaConta) {
		this.titularDaConta = titularDaConta;
	}

	public String getTipo() {
		return tipoConta;
	}

	public void setTipo(String tipoConta) {
		this.tipoConta = tipoConta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public ArrayList<Movimentacao> getListaDeMovimentacao() {
		return listaDeMovimentacao;
	}

	public void setListaDeMovimentacao(ArrayList<Movimentacao> listaDeMovimentacao) {
		this.listaDeMovimentacao = listaDeMovimentacao;
	}

	public void depositar(double valorDeposito) {
		this.saldo += valorDeposito;
	}

	public void sacar(double valorSaque) {
		// verificação para fixar o valor da conta em -1000
		if (this.saldo - valorSaque >= -1000) {
			this.saldo -= valorSaque;
		} else {
			JOptionPane.showMessageDialog(null, "Você não possui saldo");
		}
	}

	public double gerarSaldo() {
		return saldo;
	}

	public String gerarDadosDaConta() {
		String dadosDaConta = "Titular: " + this.titularDaConta + "\nTipo de conta: " + this.tipoConta + "\nSaldo: "
				+ this.saldo;
		return dadosDaConta;
	}

	public String gerarExtrato() {
		String extrato = "Extrato da conta:\n";

		for (Movimentacao movimentacao : this.listaDeMovimentacao) {
			int tipo = movimentacao.getTipo();
			double valor = movimentacao.getValor();
			Date data = movimentacao.getData();
			extrato += "Tipo movimentação: " + tipo + "\nValor: " + valor + "\nData: " + data + "\n";
		}

		return extrato;
	}

	public String gerarExtratoDeposito() {
		String extratoDeposito = "Extrato depósitos:\n";

		for (Movimentacao movimentacao : this.listaDeMovimentacao) {
			if (movimentacao.getTipo() == 2) {
				double valor = movimentacao.getValor();
				Date data = movimentacao.getData();
				extratoDeposito += "Valor: " + valor + "\nData: " + data + "\n";
			}
		}
		return extratoDeposito;
	}

	public String gerarExtratoSaque() {
		String extratoSaque = "Extrato saques: \n";

		for (Movimentacao movimentacao : this.listaDeMovimentacao) {
			if (movimentacao.getTipo() == 1) {
				double valor = movimentacao.getValor();
				Date data = movimentacao.getData();
				extratoSaque += "Valor: " + valor + "\nData: " + data + "\n";

			}
		}
		return extratoSaque;
	}
}

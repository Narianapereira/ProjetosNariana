package Controler;

import java.util.ArrayList;
import java.util.Date;

import Model.*;
import View.*;

public class Controler {

	public void exibeMenu() {

		int opcao;
		Conta conta = new Conta();

		// solicita titular da conta a adiciona ao atributo da conta
		String titularDaConta = EntradaSaida.solicitaTitular();
		conta.setTitularDaConta(titularDaConta);
		
		// solicita tipo de conta a atribui a conta
		String tipoConta = EntradaSaida.solicitaTipo();
		conta.setTipo(tipoConta);
		ArrayList<Movimentacao> listaDeMovimentacao = new ArrayList<Movimentacao>();

		do {
			opcao = EntradaSaida.solicitaOpcao();

			switch (opcao) {
			case 0:

				double valorDeposito = EntradaSaida.solicitaInformacoesDeposito();
				conta.depositar(valorDeposito);

				Date data = new Date();
				int tipoMovimentacao = 2;
				Movimentacao movimentacao = new Movimentacao();
				movimentacao.setValor(valorDeposito);
				movimentacao.setData(data);
				movimentacao.setTipo(tipoMovimentacao);
				listaDeMovimentacao.add(movimentacao);

				break;

			case 1:
				double valorSaque = EntradaSaida.solicitaInformacoesSaque();
				conta.sacar(valorSaque);

				data = new Date();
				tipoMovimentacao = 1;
				movimentacao = new Movimentacao();
				movimentacao.setValor(valorSaque);
				movimentacao.setData(data);
				movimentacao.setTipo(tipoMovimentacao);
				listaDeMovimentacao.add(movimentacao);
				break;

			case 2:
				int opcaoConsulta = EntradaSaida.solicitaOpcaoConsulta();

				switch (opcaoConsulta) {
				case 0:
					double saldo = conta.gerarSaldo();
					EntradaSaida.exibirSaldo(saldo);
					break;
				case 1:
					String dadosDaConta = conta.gerarDadosDaConta();
					EntradaSaida.exibirDadosDaConta(dadosDaConta);
					break;

				case 2:
					// seta a lista de movimentacao
					conta.setListaDeMovimentacao(listaDeMovimentacao);
					String extrato = conta.gerarExtrato();
					EntradaSaida.exibirExtrato(extrato);
					break;
				case 3:
					conta.setListaDeMovimentacao(listaDeMovimentacao);
					String extratoDeposito = conta.gerarExtratoDeposito();
					EntradaSaida.exibirExtratoDeposito(extratoDeposito);
					break;

				case 4:
					conta.setListaDeMovimentacao(listaDeMovimentacao);
					String extratoSaque = conta.gerarExtratoSaque();
					EntradaSaida.exibirExtratoDeposito(extratoSaque);
				}
			}
		} while (opcao != 3);
	}

}

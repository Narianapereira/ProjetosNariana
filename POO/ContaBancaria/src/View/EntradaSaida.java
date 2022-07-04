package View;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;

public class EntradaSaida {

	public static int solicitaOpcao() {

		String[] opcao = { "Depositar", "Sacar", "Consultar", "Sair" };
		JComboBox<String> menu = new JComboBox<String>(opcao);
		JOptionPane.showConfirmDialog(null, menu, "Bem vindo ao Banco da Nari", JOptionPane.OK_CANCEL_OPTION);
		return menu.getSelectedIndex();
	}

	public static String solicitaTitular() {
		String titularDaConta = JOptionPane.showInputDialog("Qual o nome do titular da conta?");
		return titularDaConta;
	}

	public static String solicitaTipo() {
		String[] opcoes = { "Poupança", "Corrente" };
		String tipoConta = "";
		int tipo = JOptionPane.showOptionDialog(null, "Informe o tipo da conta: ", "Tipo de conta",
				JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opcoes, opcoes[1]);

		if (tipo == 0) {
			tipoConta = "Poupança";

		} else if (tipo == 1) {
			tipoConta = "Corrente";
		}
		return tipoConta;
	}

	public static double solicitaInformacoesDeposito() {
		double valorDeposito = Double.parseDouble(JOptionPane.showInputDialog("Qual o valor a ser depositado?"));
		return valorDeposito;
	}

	public static double solicitaInformacoesSaque() {
		double valorSaque = Double.parseDouble(JOptionPane.showInputDialog("Qual valor a ser sacado?"));
		return valorSaque;
	}

	public static int solicitaOpcaoConsulta() {
		String[] opcaoConsulta = { "Exibir saldo", "Exibir dados da conta", "Exibir extrato completo",
				"Exibir extrato depósito", "Exibir extrato saques" };
		JComboBox<String> menuConsulta = new JComboBox<String>(opcaoConsulta);
		JOptionPane.showConfirmDialog(null, menuConsulta, "Escolha a opção de consulta", JOptionPane.OK_CANCEL_OPTION);
		return menuConsulta.getSelectedIndex();
	}

	public static void exibirSaldo(double saldo) {
		JOptionPane.showMessageDialog(null, "O saldo da conta é de: " + saldo);
	}

	public static void exibirDadosDaConta(String dadosDaConta) {
		JOptionPane.showMessageDialog(null, dadosDaConta);
	}

	public static void exibirExtrato(String extrato) {
		JOptionPane.showMessageDialog(null, extrato);
	}

	public static void exibirExtratoDeposito(String extratoDeposito) {
		JOptionPane.showMessageDialog(null, extratoDeposito);
	}

	public static void exibirExtratoSaque(String extratoSaque) {
		JOptionPane.showMessageDialog(null, extratoSaque);
	}
}

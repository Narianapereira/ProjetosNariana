package View;

import Model.*;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class Saida {

	public static void imprimeListaDeProdutos(String listaDeProdutos) {
		JOptionPane.showMessageDialog(null, listaDeProdutos);

	}

	public static void imprimeInfosEstoque(String infosEstoque) {
		JOptionPane.showMessageDialog(null, infosEstoque);
	}

	public static void imprimeInfosCupons(String infosCupons) {
		JOptionPane.showMessageDialog(null, infosCupons);
	}

	public static void imprimeValorTotal(double valorTotal) {
		DecimalFormat df = new DecimalFormat("R$ 0.00");
		JOptionPane.showMessageDialog(null, "O valor total de vendas é: " + df.format(valorTotal));
	}
}

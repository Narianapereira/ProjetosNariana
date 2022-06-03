package Métodos;

import javax.swing.JOptionPane;

public class LMetodosEx1 {

	public static void main(String[] args) {
		/*
		 * Faça um programa que solicite o ano de nascimento de um usuário e seja
		 * mostrada a sua idade em 2021. Não é necessário considerar se o usuário já fez
		 * ou não aniversário. Um método deve ser criado para solicitar o ano de
		 * nascimento ao usuário e retorná-lo, e outro método deve ser criado para
		 * receber o ano de nascimento, calcular a idade atual e mostrá-la.
		 */
		
		// atribui o ano de nascimento solicitado pelo metodo a variável 
		int anoNascimento = solicitaAno();
		// calcula ano de nascimento através do método
		calculaIdade(anoNascimento);

	}
// método para solicitar o ano
	public static int solicitaAno() {
		int anoNascimento = Integer.parseInt(JOptionPane.showInputDialog("Qual é o seu ano de nascimento?"));
		return anoNascimento;
	}
// método para calcular a idade
	public static void calculaIdade(int anoNascimento) {
		int idade = 2021 - anoNascimento;
		JOptionPane.showMessageDialog(null, "A sua idade em 2021 é: " + idade + " anos.");
	}

}

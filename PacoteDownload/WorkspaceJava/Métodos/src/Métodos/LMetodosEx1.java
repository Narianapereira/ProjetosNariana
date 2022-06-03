package M�todos;

import javax.swing.JOptionPane;

public class LMetodosEx1 {

	public static void main(String[] args) {
		/*
		 * Fa�a um programa que solicite o ano de nascimento de um usu�rio e seja
		 * mostrada a sua idade em 2021. N�o � necess�rio considerar se o usu�rio j� fez
		 * ou n�o anivers�rio. Um m�todo deve ser criado para solicitar o ano de
		 * nascimento ao usu�rio e retorn�-lo, e outro m�todo deve ser criado para
		 * receber o ano de nascimento, calcular a idade atual e mostr�-la.
		 */
		
		// atribui o ano de nascimento solicitado pelo metodo a vari�vel 
		int anoNascimento = solicitaAno();
		// calcula ano de nascimento atrav�s do m�todo
		calculaIdade(anoNascimento);

	}
// m�todo para solicitar o ano
	public static int solicitaAno() {
		int anoNascimento = Integer.parseInt(JOptionPane.showInputDialog("Qual � o seu ano de nascimento?"));
		return anoNascimento;
	}
// m�todo para calcular a idade
	public static void calculaIdade(int anoNascimento) {
		int idade = 2021 - anoNascimento;
		JOptionPane.showMessageDialog(null, "A sua idade em 2021 �: " + idade + " anos.");
	}

}

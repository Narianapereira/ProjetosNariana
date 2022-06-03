package introducaoJava;

//importando classe JOptionPane para usarmos os painéis de diálogo
import javax.swing.JOptionPane;

public class L1Ex4 {

	public static void main(String[] args) {
		// Faça um algoritmo que mostre a soma de todos os valores pares entre o
		// intervalo de dois números digitados pelo usuário.

		int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor."));

		int numero2 = Integer.parseInt(
				JOptionPane.showInputDialog("Digite um segundo valor maior que o primeiro, formando um intervalo"));
		int soma = 0;
		int numero3 = 0;
// caso numero1 < numero2, então troca-se o numero1 por numero2
		if (numero1 > numero2) {
			numero3 = numero1;
			numero1 = numero2;
			numero2 = numero3;
			
		}
		for (int i = numero1; i <= numero2; i++) {
			// contadora i vai iniciar em numero1 e vai variar uma contadora até chegar em
			// numero2, ou seja < numero2
			if (i % 2 == 0) {
				soma = (soma + i);
			}

		}
		JOptionPane.showMessageDialog(null, "A soma dos valores pares é  " + soma);
	}
}
package introducaoJava;

//importando classe JOptionPane para usarmos os painéis de diálogo
import javax.swing.JOptionPane;

public class L1Ex1 {

	public static void main(String[] args) {

		int horas = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor em horas."));

		int minutos = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor em minutos."));

		int segundos = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor em segundos."));

		int horasSegundos = (horas * 3600);
		int minutoSegundos = (minutos * 60);
		int totalSegundos = (horasSegundos + minutoSegundos + segundos);

		JOptionPane.showMessageDialog(null, "O total em segundos é " + totalSegundos);

	}

}

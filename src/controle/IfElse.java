package controle;

import javax.swing.JOptionPane;

public class IfElse {

	public static void main(String[] args) {
		
		String valor = JOptionPane.showInputDialog("Digite um número inteiro:");
		int numero = Integer.parseInt(valor);
		
		if(numero % 2 == 0) {
			JOptionPane.showMessageDialog(null, "O número é par!");
		} else {
			JOptionPane.showMessageDialog(null, "O número é ímpar!");
		}
	}
}

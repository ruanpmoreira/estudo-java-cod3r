package controle;

import javax.swing.JOptionPane;

public class DesafioDiaSemana {

	public static void main(String [] args) {
		
		String dia = JOptionPane.showInputDialog("Digite o dia da semana:");
		
		if (dia.equalsIgnoreCase("domingo")) {
			JOptionPane.showMessageDialog(null, "1");
		} else if (dia.equalsIgnoreCase("segunda")) {
			JOptionPane.showMessageDialog(null, "2");
		} else if (dia.equalsIgnoreCase("terça") || dia.equalsIgnoreCase("terca")) {
			JOptionPane.showMessageDialog(null, "3");
		} else if (dia.equalsIgnoreCase("quarta")) {
			JOptionPane.showMessageDialog(null, "4");
		} else if (dia.equalsIgnoreCase("quinta")) {
			JOptionPane.showMessageDialog(null, "5");
		} else if (dia.equalsIgnoreCase("sexta")) {
			JOptionPane.showMessageDialog(null, "6");
		} else if (dia.equalsIgnoreCase("sábado") || dia.equalsIgnoreCase("sabado")) {
			JOptionPane.showMessageDialog(null, "7");
		} else {
			JOptionPane.showMessageDialog(null, "Dia inválido!");
		}
		
	}
}

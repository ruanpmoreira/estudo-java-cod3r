package controle;

import java.util.Scanner;

public class WhileIndeterminado {

	public static void main (String [] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Diga algo para o computador: ");
		String texto = "";
		
		while(!texto.equalsIgnoreCase("sair")) {
			System.out.print("Você diz: ");
			texto = entrada.nextLine();
		}
		
		System.out.print("while encerrado");
		
		entrada.close();
	}
}

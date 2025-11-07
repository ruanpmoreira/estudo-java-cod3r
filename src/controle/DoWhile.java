package controle;

import java.util.Scanner;

public class DoWhile {

	public static void main (String [] args) {
		
		System.out.println("Texte do/While");
		Scanner entrada = new Scanner(System.in);
		String texto = "";
		
		do {
			System.out.print("Você diz: ");
			texto = entrada.nextLine();
			
		} while (!texto.equalsIgnoreCase("sair"));
		
		System.out.println("Do/While encerrado");
		entrada.close();
	}
}

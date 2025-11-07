package controle;

import java.util.Scanner;

public class SwitchComBreak {

	public static void main (String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		String conceito = "";
		
		System.out.print("Digite a nota: ");
		int nota = entrada.nextInt();
		
		switch(nota) {
		case 10:
		case 9:
			conceito ="Conceito A.";
			break;
		case 8:
		case 7:
			conceito ="Conceito B.";
			break;
		case 6:
		case 5:
			conceito ="Conceito C.";;
			break;
		case 4:
		case 3:
			conceito ="Conceito D.";
			break;
		case 2:
		case 1:
		case 0:
			conceito ="Conceito E.";;
			break;
		default:
			conceito ="Não encontrado";
		}
		
		System.out.println("O conceito é: " + conceito);
	
		entrada.close();
	}
}

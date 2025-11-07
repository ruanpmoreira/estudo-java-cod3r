package controle.exercicios;

import java.util.Scanner;

public class ExercicioAnoBissexto {
	
	public static void main (String [] args) {
		/*
		 * Criar um programa informa se o ano atual é um ano bissexto
		 * O ano bissexto é divisivel por 4;
		 * Um ano que termina em "00" só é bissexto se for também divisível por 400;
		 */
		Scanner entrada = new Scanner(System.in);
		System.out.print("Informe o ano: ");
		int ano = entrada.nextInt();
		
		if (ano % 400 == 0 || (ano % 4 == 0) && (ano % 100 != 0)) {
			System.out.printf("O ano %d é bissexto", ano);
		} else {
			System.out.printf("O ano %d não é bissexto", ano);
		}
		entrada.close();
		
	}

}

package controle.exercicios;

import java.util.Scanner;

public class ExercicioPar {

	public static void main (String[] args) {
		
		/**
		 * 1. Criar um programa que receba um número e verifique se ele está entre 0 e
		 * 10 e é par;
		 */
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite um número inteiro: ");
		int num1 = entrada.nextInt();
		
		if(num1 > 0 && num1 < 10) {
			if(num1 % 2 == 0) {
				System.out.printf("%d é maior que 0, menor que 10 e é par!", num1);
			} else {
				System.out.printf("%d é maior que 0, menor que 10 mas não é par", num1);
			}
		} else
			System.out.printf("%d não é um número válido", num1);
		
		entrada.close();
	}
}

package arrays.desafio;

import java.util.Scanner;

public class SomaElementos {
	
	public static void main (String [] args) {
		//Crie um programa que receba 10 números inteiros e mostre a soma de todos.
		
		Scanner entrada = new Scanner(System.in);
		int numero[] = new int[10];
		int soma = 0;
		
		for (int i = 0; i < numero.length; i++) {
			System.out.printf("Digite o número %d: ", i + 1);
			numero[i] = entrada.nextInt();
			soma += numero[i];
		}
		
		System.out.println("Números digitados: ");
		for (int numeros: numero) {
			System.out.printf("[%d] ", numeros);
		}
		
		System.out.println();
		
		System.out.println("A soma dos números informada é: " + soma);
		
		entrada.close();
	}

}

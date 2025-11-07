package arrays.desafio;

import java.util.Arrays;
import java.util.Scanner;

public class MaiorMenor {
	
	public static void main (String[] args) {
		//Leia 8 números e exiba qual é o maior e o menor.
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite 8 números inteiros");
		
		int numero[] = new int[8];
		int maiorNumero = Integer.MIN_VALUE;
		int menorNumero = Integer.MAX_VALUE;
		
		for (int i = 0; i < numero.length; i++) {
			System.out.printf("Digite o numero %d: ", i + 1);
			numero[i] = entrada.nextInt();
			
			if (numero[i] >= maiorNumero) {
				maiorNumero = numero[i];
			} if (numero[i] <= menorNumero) {
				menorNumero = numero[i];
			}
		}
		
		
		System.out.print("Números digitados: \n" + Arrays.toString(numero));
		
		System.out.printf("\nMaior número: %d: \n", maiorNumero);
		System.out.printf("Menor número: %d: \n", menorNumero);
		
		
		entrada.close();
	}

}

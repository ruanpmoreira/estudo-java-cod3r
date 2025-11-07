package arrays.desafio;

import java.util.Random;

public class ArrayParesImpares {

	public static void main (String[] args) {
		//Preencha um array com 20 números aleatórios (use Random). 
		//Depois, mostre quantos são pares e quantos são ímpares.
		
		Random gerador = new Random();
		int numeroAleatorio[] = new int[20];
		int numeroPar = 0;
		int numeroImpar = 0;
		
		
		//Gerar e armazenar 20 números aleatórios na array
		for (int i = 0; i < numeroAleatorio.length; i++) {
			numeroAleatorio[i] = gerador.nextInt(200) + 1;
			
			if (numeroAleatorio[i] %2 == 0) {
				numeroPar++;
			} else 
				numeroImpar++;
		}
		
		for (int n: numeroAleatorio) {
			System.out.printf("%d -> %s\n", n, (n % 2 == 0 ? "Par" : "Impar"));
		}
		
		System.out.printf("\nNúmeros pares: %d\n", numeroPar);
		System.out.printf("Números impares: %d\n", numeroImpar);
	}
}

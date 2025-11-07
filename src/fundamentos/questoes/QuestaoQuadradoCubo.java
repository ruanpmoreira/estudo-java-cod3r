package fundamentos.questoes;

import java.util.Scanner;

public class QuestaoQuadradoCubo {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite um valor: ");
		double valor = entrada.nextDouble();
		
		final double vlQuadrado = Math.pow(valor, 2);
		final double vlCubo = Math.pow(valor, 3);
		
		System.out.printf("O valor de %.2f ao quadrado é: %.2f", valor, vlQuadrado);
		System.out.printf("\nO valor de %.2f ao cubo é: %.2f", valor, vlCubo);
		
		entrada.close();
	}
}

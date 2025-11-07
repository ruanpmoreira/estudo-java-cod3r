package controle.exercicios;

import java.util.Scanner;

public class ExercicioSomaPositivos {

	/*Criar um programa que enquanto estiver recebendo números positivos, 
	 * imprime no console a soma dos números inseridos, 
	 * caso receba um número negativo, encerre o programa. 
	 * Tente utilizar a estrutura do while.
	 */
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int numero = 0;
		int soma = 0;
		while(numero >= 0) {
			System.out.print("Digite um número: ");
			numero = entrada.nextInt();
			
			if (numero >=0) {
				soma += numero;
				System.out.println("A soma dos números até agora é: " + soma);
			} else {
				System.out.println("O programa foi encerrado pois digitou um número negativo");
			}
		}
		
		entrada.close();
	}
}

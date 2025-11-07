package controle.exercicios;

import java.util.Scanner;

public class ExercicioMaiorNumero {

	//Crie um programa que recebe 10 valores e ao final imprima o maior número.
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int valor;
		int maiorValor = 0;
		int contador = 1;
		
		do {
			System.out.print("Digite um valor: ");
			valor = entrada.nextInt();
			contador++;
			
			if (valor > maiorValor) {
				maiorValor = valor;
			}
			
		} while (contador <=10); 
		
		System.out.println("O maior número é: " + maiorValor);
			
		
		
		entrada.close();
	}
}

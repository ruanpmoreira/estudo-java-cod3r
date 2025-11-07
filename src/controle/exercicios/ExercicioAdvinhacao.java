package controle.exercicios;

import java.util.Scanner;
import java.util.Random;

public class ExercicioAdvinhacao {

	public static void main(String[] args) {
		Random gerador = new Random();
		int numeroSorteado = gerador.nextInt(101);
		Scanner entrada = new Scanner(System.in);		
		
		System.out.println("Descubra o número entre 0 e 100: ");
		int numero = 101;
		
		for (int i = 10; i >=1; i--) {
			System.out.println("Tentativas: " + i);
			System.out.print("Digite um número: ");
			numero = entrada.nextInt();
			if(numero == numeroSorteado) {
				System.out.println("Acertou, o número correto era: " + numeroSorteado);
				break;
			} else if (numero > numeroSorteado) {
				System.out.println("O número informado é maior!");
			} else {
				System.out.println("O número informado é menor");
			}
		}
		
		entrada.close();
	}
}

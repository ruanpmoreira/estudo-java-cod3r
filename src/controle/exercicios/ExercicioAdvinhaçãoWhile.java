package controle.exercicios;

import java.util.Scanner;
import java.util.Random;

public class ExercicioAdvinhaçãoWhile {

	public static void main(String[] args) {
		
		Ascii arte = new Ascii();
		System.out.println(arte.asciiGato);
		System.out.println("Oi, eu sou o gato do java e estou pensando em um número"); 
		System.out.println("aleatório de 0 a 100, será que você consegue advinhar?"); 
		
		Random gerador = new Random();
		int numeroSorteado = gerador.nextInt(101);
		Scanner entrada = new Scanner(System.in);
		
		int contadorTentativas = 1;
		//System.out.println(numeroSorteado);
		
		while (contadorTentativas <=10) {
			System.out.print("Digite o número que estou pensando: ");
			int numero = entrada.nextInt();
			
			System.out.println("Tentativa " + contadorTentativas);
			
			if(numero > numeroSorteado) {
				System.out.println("O número que estou pensando é menor!");
				contadorTentativas++;
			} else if (numero < numeroSorteado) {
				System.out.println("O número que estou pensando é maior!");
				contadorTentativas++;
			} else {
				System.out.printf("Parabéns, o número que eu pensei é %d", numero);
				System.out.printf("\nVocê acertou com %d tentativas", contadorTentativas);
				break;
			}
			System.out.println("Que pena, você não conseguiu descobrir com 10 tentativas.");
		}
		
		entrada.close();
	}
}

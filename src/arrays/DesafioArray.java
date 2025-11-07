package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class DesafioArray {
	
	public static void main(String [] args) {
		
		Scanner entrada = new Scanner(System.in);
		int qtNotas;
		double soma = 0;
		
		System.out.print("Digite a quantidade de notas que deseja lançar: ");
		qtNotas = entrada.nextInt();
		
		double notas[] = new double [qtNotas];
		
		//Entrada das notas
		for (int i = 0; i < notas.length; i++) {
			System.out.printf("Digite a nota %d: ", i + 1);
			notas[i] = entrada.nextDouble();
		}
		
		System.out.println("Notas: " + Arrays.toString(notas));
		
		//Soma das notas
	
		for (double nota: notas) {
			soma += nota;
		}
		
		//Apresentação dos resultados
		double media = soma / notas.length;
		System.out.println("Soma das notas: " + soma);
		System.out.printf("A média das notas foi: %.2f", media);
		
		
		entrada.close();
		
	}

}

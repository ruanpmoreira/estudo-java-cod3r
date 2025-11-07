package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Matriz {
	
	public static void main (String [] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe a quantidade de alunos: ");
		int qtDeAlunos = entrada.nextInt();
		System.out.print("Informe a quantidade de notas: ");
		int qtDeNotas = entrada.nextInt();
		
		double [][] notasDaTurma = new double[qtDeAlunos][qtDeNotas];
		
		double soma = 0;
		for (int i = 0; i < notasDaTurma.length; i++) {
			for(int j = 0; j < notasDaTurma[i].length; j++) {
				System.out.printf("Informe a nota %d do aluno %d: ", j + 1, i + 1);
				notasDaTurma[i][j] = entrada.nextDouble();
				soma += notasDaTurma[i][j];
			}			
		}
		
		for (double[] notasDoAluno: notasDaTurma) {
			System.out.println(Arrays.toString(notasDoAluno));
		}
		
		/*for (int i = 0; i < notasDaTurma.length; i++) {
		    for (int j = 0; j < notasDaTurma[i].length; j++) {
		        System.out.print(notasDaTurma[i][j] + " ");
		    }
		    System.out.println(); // quebra de linha para o próximo aluno
		} */
		
		double media = soma / (qtDeAlunos * qtDeNotas);
		System.out.println("O total das notas foi: " + soma);
		System.out.println("A média das nota foi: " + media);
		
		entrada.close();
	}

}

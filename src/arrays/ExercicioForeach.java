package arrays;

import java.util.Arrays;

public class ExercicioForeach {
	
	public static void main(String[] args) {
		
		double notasAlunoA[] = new double[4];
		
		System.out.println(Arrays.toString(notasAlunoA));
		notasAlunoA[0] = 7.9;
		notasAlunoA[1] = 5.4;
		notasAlunoA[2] = 8.1;
		notasAlunoA[3] = 6.4;
		
		System.out.println(notasAlunoA[1]);
		System.out.println(notasAlunoA[notasAlunoA.length - 1]); //pegar a última nota
		System.out.println(Arrays.toString(notasAlunoA));
		
		double totalAlunoA = 0;
		
		for (double notas: notasAlunoA) {
			totalAlunoA += notas;
		}
		
		System.out.println("Média aluno A: " + totalAlunoA / notasAlunoA.length);
		
		double notasAlunoB[] = { 6.3, 7.5, 8.8, 10 };
		
		System.out.println(Arrays.toString(notasAlunoB));
		
		double totalAlunoB = 0;
		for (double notas: notasAlunoB) {
			totalAlunoB += notas;
		}
			
		System.out.println("Média aluno B: " + totalAlunoB / notasAlunoB.length);
		
	}

}

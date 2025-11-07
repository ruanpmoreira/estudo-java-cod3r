package arrays;

import java.util.Arrays;

public class Exercicio {
	
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
		
		for (int i = 0; i < notasAlunoA.length; i++) {
			totalAlunoA += notasAlunoA[i];
		}
		
		System.out.println(totalAlunoA / notasAlunoA.length);
		
		double notasAlunoB[] = { 6.3, 7.5, 8.8, 10 };
		
		System.out.println(Arrays.toString(notasAlunoB));
		
		double totalAlunoB = 0;
		for (int i = 0; i < notasAlunoB.length; i++) {
			totalAlunoB += notasAlunoB[i];
		}
			
		System.out.println(totalAlunoB / notasAlunoB.length);
		
	}

}

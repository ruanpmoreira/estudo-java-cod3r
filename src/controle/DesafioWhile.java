package controle;

import java.util.Scanner;

public class DesafioWhile {

	public static void main(String [] args) {
		
		System.out.println("***  Para sair digite -1   ***\n");
		System.out.println("--------------------");
		
		double total = 0;
		double nota = 0;
		int notasValidas = 0;
		
		Scanner entrada = new Scanner(System.in);
		
		while(nota != -1) {
			System.out.print("Digite a nota do aluno: ");
			nota = entrada.nextDouble();
			if (nota >= 0.00 && nota <= 10) {
				total += nota;
				notasValidas++;
			} else if (nota !=-1){
				System.out.println("\nNota inválida, digite novamente!");
			} 
		}
		
		System.out.printf("\nValor total das notas: %.2f\n", total);
		double media = total / notasValidas;
		System.out.printf("A média é: %.2f e o total de alunos é %d", media, notasValidas);
		entrada.close();
	}
}

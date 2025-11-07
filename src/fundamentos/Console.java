package fundamentos;

import java.util.Scanner;

public class Console {

	public static void main(String[] args) {
		System.out.print("Bom");
		System.out.print(" dia \n\n");
		
		System.out.println("Bom");
		System.out.println("dia");
		
		System.out.printf("Megasena: %d %d %d %d %d %d %n", 1,2,3,4,5,6);
		System.out.printf("Salário: %.2f %n", 1547.5687);
		
		System.out.printf("Nome: %s", "João \n");
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o seu nome: ");
		String nome = entrada.nextLine();
		System.out.print("Digite o seu sobrenome: ");
		String sobrenome = entrada.nextLine();
		System.out.print("Digite a sua idade: ");
		int idade = entrada.nextInt();
		
		System.out.printf("\nSeu nome é %s %s e você tem %d anos",nome, sobrenome, idade);
		
		entrada.close();
	}
}

package arrays.desafio;
import java.util.Scanner;

public class InversaoOrdem {
	
	public static void main(String[] args) {
		//Leia 5 nomes e exiba-os na ordem inversa da leitura.
		
		Scanner entrada = new Scanner(System.in);
		
		String nome[] = new String[5];
		
		//Receber os nomes
		for (int i = 0; i < nome.length; i++) {
			System.out.printf("Digite o %dº nome: ", i+1);
			nome[i] = entrada.nextLine();
		}
		
		System.out.println("\nNomes na ordem inversa\n");
		
		//Mostrar na ordem inversa
		for (int i = nome.length-1; i >= 0; i--) {
			System.out.println(nome[i]);
		}
		
		entrada.close();
	}

}

package fundamentos;

import java.util.Scanner;

public class TipoStringEquals {

	public static void main(String[] args) {
		
		System.out.println("2" =="2");
		String s1 = new String("2");
		System.out.println("2" == s1);
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.printf("Digite um número: ");
		String s2 = entrada.nextLine();
		
		
		System.out.println("2" == s2);
		System.out.println("2".equals(s2));
		System.out.println("2".equals(s2.trim()));
		
		entrada.close();
		
	}
}

package fundamentos;

import java.util.Scanner;

public class DesafioConversao {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o primeiro salário: ");
		String salario1 = entrada.nextLine();
		System.out.print("Digite o segundo salário: ");
		String salario2 = entrada.nextLine();
		System.out.print("Digite o terceiro salário: ");
		String salario3 = entrada.nextLine();
		
		double primeiroSalario = Double.parseDouble(salario1.replace(",", "."));
		double segundoSalario = Double.parseDouble(salario2.replace(",", "."));
		double terceiroSalario = Double.parseDouble(salario3.replace(",", "."));
		
		double soma = (primeiroSalario + segundoSalario + terceiroSalario);
		double media = (soma / 3);
		
		System.out.println("A média salárial é: " + media);
		
		
		entrada.close();
	}
}

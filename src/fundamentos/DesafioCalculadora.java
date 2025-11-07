package fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.printf("Digite o primeiro número: ");
		double num1 = entrada.nextDouble();
		System.out.printf("Digite o segundo número: ");
		double num2 = entrada.nextDouble();
		
		System.out.print("Digite a operação que deseja realizar(+, -, *, /, % ): ");
		String operador = entrada.next();	
		
		//Lógica
		double resultado = "+".equals(operador) ? num1 + num2: 0;
		resultado = "-".equals(operador) ? num1 - num2: resultado;
		resultado = "*".equals(operador) ? num1 * num2: resultado;
		resultado = "/".equals(operador) ? num1 / num2: resultado;
		resultado = "%".equals(operador) ? num1 % num2: resultado;
		
		System.out.printf("%.2f %s %.2f = %.2f", num1, operador, num2, resultado);
		
		entrada.close();
	}
}

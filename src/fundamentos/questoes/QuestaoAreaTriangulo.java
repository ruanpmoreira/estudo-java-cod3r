package fundamentos.questoes;

import java.util.Scanner;

public class QuestaoAreaTriangulo {

	public static void main(String[] args) {
		//(base x altura) / 2
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe a base do triângulo: ");
		String baseStr = entrada.next();
		double base = Double.parseDouble(baseStr);
		System.out.print("Informe a altura do triângulo: ");
		String alturaStr = entrada.next();
		double altura = Double.parseDouble(alturaStr);
		
		double area = (base * altura) / 2;
		
		System.out.println("A área do triangulo é: " + area);
		
		entrada.close();
	}
}

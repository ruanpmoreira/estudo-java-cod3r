package fundamentos.questoes;

import java.util.Scanner;
import java.util.Locale;

public class QuestaoIMC {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		// IMC = peso / (altura x altura)
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o seu peso em KG: ");
		String pesoStr = entrada.next().replace(",", ".");
		double peso = Double.parseDouble(pesoStr);
		System.out.print("Digite a sua altura em metros: ");
		String alturaStr = entrada.next().replace(",", ".");
		double altura = Double.parseDouble(alturaStr);
		
		double IMC = peso / (Math.pow(altura,2));
		
		System.out.printf("O seu IMC é: %.2f", IMC);
		
		entrada.close();
	}
}

package fundamentos.questoes;

import java.util.Scanner;

public class QuestaoConversaoTemperaturaFahrenheit {

	public static void main(String[] args) {
		//(ºF - 32) x 5/9 = ºC
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digita a temperatura em Fahrenheit: ");
		double tempF = entrada.nextDouble();
		
		double tempC = (tempF - 32.0) * (5.0 / 9.0);
		
		System.out.printf("º%.2fF é igual a º%.2fC", tempF, tempC);
		
		
		entrada.close();
	}
}

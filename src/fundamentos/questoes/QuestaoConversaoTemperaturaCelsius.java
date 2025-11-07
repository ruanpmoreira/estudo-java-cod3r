package fundamentos.questoes;

import java.util.Scanner;

public class QuestaoConversaoTemperaturaCelsius {

	public static void main(String[] args) {
		////(ºC x 9/5) + 32 = ºF
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite a temperatura em Celsius: ");
		double tempC = entrada.nextDouble();
		
		double tempF = (tempC * 9.0 / 5.0) + 32.0;
		
		System.out.printf("º%.2fC é igual a º%.2fC", tempC, tempF);
		
		
		entrada.close();
	}
}

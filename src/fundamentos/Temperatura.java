package fundamentos;

public class Temperatura {

	public static void main(String[] args) {
		//(ºF - 32) x 5/9 = ºC
		
		final double AJUSTE = 32;
		final double FATOR = 5.0/9.0;
		
		double fahrenheit = 89;
		double celsius = (fahrenheit - AJUSTE) * FATOR;
		System.out.println(fahrenheit + " graus fahrenheit é igual a " + celsius + " graus celsius.");
		
		fahrenheit = 120;
		celsius = (fahrenheit - AJUSTE) * FATOR;
		System.out.println(fahrenheit + " graus fahrenheit é igual a " + celsius + " graus celsius.");
		
		
	}
}

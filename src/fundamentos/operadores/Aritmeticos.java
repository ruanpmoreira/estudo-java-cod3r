package fundamentos.operadores;

public class Aritmeticos {

	public static void main(String[] args) {
		
		var x = 22.5; //inferencia
		double y = 18.7;
		
		System.out.println(x + y);
		System.out.println(x - y);
		System.out.println(x * y);
		System.out.println(x / y);
		
		int a = 8;
		int b = 5;
		
		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / b);
		System.out.println(a / (double) b);
		
		System.out.println(a % b); // Operação módulo - pega o resto da equação
		
		System.out.println(a - b + x * y); 
		
		
		
	}
}

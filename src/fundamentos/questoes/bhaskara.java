package fundamentos.questoes;

public class bhaskara {

	public static void main(String[] args) {
//		delta = b2 -4ac
//		delta =12 2 - 4 x 1 x -13
		
		int a = 1;
		int b = (int)Math.pow(12, 2);
		int c = - 13;
		
		int delta = b - (4 * a * c);
		System.out.println("O valor de delta é: " + delta);
	}
}
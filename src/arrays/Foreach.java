package arrays;

public class Foreach {
	
	public static void main(String[] args) {
		
		double notas[] = { 7.2, 6.8, 9.7, 5.5 };
		
		for (int i = 0; i < notas.length; i++) {
			System.out.printf("[%.2f] ",notas[i]);
		}
		
		System.out.println();
		
		for(double nota: notas) {
			System.out.printf("[%.2f] ", nota);
		}
		
	}

}

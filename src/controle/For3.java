package controle;

public class For3 {

	public static void main (String[] args) {
		System.out.println("For x For\n");
		System.out.println("[i j]\n");
		
		for (int i = 0; i < 10; i++) {
			for(int j = 0; j < 10; j++) {
				System.out.printf("[%d %d]", i,j);
			}
			System.out.print("\n");
		}
	}
}

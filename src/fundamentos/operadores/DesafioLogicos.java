package fundamentos.operadores;

public class DesafioLogicos {
	public static void main(String[] args) {
		
		boolean trabalho1 = false;
		boolean trabalho2 = false;
		
		boolean comprouTV50 = trabalho1 && trabalho2;
		boolean comprouTV32 = trabalho1 ^ trabalho2;
		boolean tomouSorvete = trabalho1 || trabalho2;
		
		System.out.println("Comprou TV 50\"? " + comprouTV50);
		System.out.println("Comprou TV 32\"? " + comprouTV32);
		System.out.println("Família tomou sorvete? " + tomouSorvete);
		System.out.println("Família ficou com fome? " + !tomouSorvete); //operador unário
		
	}

}

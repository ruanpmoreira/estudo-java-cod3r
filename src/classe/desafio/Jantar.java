package classe.desafio;

public class Jantar {
	
	public static void main(String [] args) {
		
		Pessoa p1 = new Pessoa("João", 80.9);
		Comida c1 = new Comida("Arroz", 0.133);
		Comida c2 = new Comida("Feijão", 0.221);
		
		System.out.println(p1.apresentar());
		p1.comer(c1);
		System.out.println(p1.apresentar());
		p1.comer(c2);
		System.out.println(p1.apresentar());
		
	}

}

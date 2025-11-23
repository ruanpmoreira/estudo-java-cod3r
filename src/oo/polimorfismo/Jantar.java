package oo.polimorfismo;

public class Jantar {
	
	public static void main(String[] args) {
		
		Pessoa convidado1 = new Pessoa(99.5);
		
		System.out.println(convidado1.getPeso());
		
		Arroz ingrediente1 = new Arroz(0.250);
		Feijao ingrediente2 = new Feijao(0.300);
		
		convidado1.comer(ingrediente1);
		System.out.println(convidado1.getPeso());
		convidado1.comer(ingrediente2);
		System.out.println(convidado1.getPeso());
		
		Sorvete sobremesa = new Sorvete(0.200);
		convidado1.comer(sobremesa);
		System.out.println(convidado1.getPeso());
	}

}

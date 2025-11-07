package colecoes;

import java.util.ArrayList;

public class Lista {
	
	public static void main(String [] args) {
		
		ArrayList<Usuario> lista = new ArrayList<>();
		
		Usuario u1 = new Usuario("Ruan");
		lista.add(u1);
		lista.add(new Usuario("Kathy"));
		lista.add(new Usuario("Maomao"));
		lista.add(new Usuario("Hikari"));
		lista.add(new Usuario("Carlos"));
		lista.add(new Usuario("Ruan"));
		
		System.out.println(lista.get(3));
		
		System.out.println("Remove -> " + lista.remove(4).nome);
		System.out.println("Remove Ruan -> " + lista.remove(new Usuario("Ruan")));
		
		System.out.println("Contém Kathy? " + lista.contains(new Usuario("Kathy")));
		
		for (Usuario u: lista) {
			System.out.println(u.nome);
		}

	}

}

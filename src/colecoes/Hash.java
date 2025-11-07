package colecoes;

import java.util.HashSet;

public class Hash {
	
	public static void main(String [] args) {
		
		HashSet<Usuario> usuarios = new HashSet<>();
		
		usuarios.add(new Usuario("Sora"));
		usuarios.add(new Usuario("Layla"));
		usuarios.add(new Usuario("Mia"));
		usuarios.add(new Usuario("Anna"));
		
		boolean resultado = usuarios.contains(new Usuario("Sora"));
		System.out.println(resultado);
	}

}

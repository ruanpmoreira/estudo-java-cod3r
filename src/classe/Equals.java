package classe;

public class Equals {
	
	public static void main(String[] args) {
		
		Usuario u1 = new Usuario();
		u1.nome = "Pedro Nascimento Correia";
		u1.email = "pedronascimento@zemail.com.br";
		
		Usuario u2 = new Usuario();
		u2.nome = "Pedro Nascimento Correia";
		u2.email = "pedronascimento@zemail.com.br";
		
		System.out.println(u1 == u2);
		System.out.println(u1.equals(u2));
		System.out.println(u2.equals(u1));
	}

}

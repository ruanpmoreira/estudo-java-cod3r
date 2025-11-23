package oo.encapsulamento;

public class PessoaTeste {
	
	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa("Ruan", "Carlos", -45);
		
		p1.setIdade(188);
		System.out.println(p1.getNome());
		System.out.println(p1.getSobrenome());
		System.out.println(p1.getIdade());
		System.out.println(p1.getNomeCompleto());
	}

}

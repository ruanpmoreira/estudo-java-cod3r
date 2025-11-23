package oo.encapsulamento;

public class Pessoa {
	
	private String nome;
	private String sobrenome;
	private int idade;
	
	Pessoa (String nome, String sobrenome, int idade){
		this.nome = nome;
		this.sobrenome = sobrenome;
		idade = Math.abs(idade);
		if (idade >= 0 && idade < 120) {
			this.idade = idade;
		}	
	}
	
	//Getters
	public String getNome () {
		return nome;
	}
	
	public String getSobrenome () {
		return sobrenome;
	}
	
	public int getIdade() {
		return idade;
	}
	
	public String getNomeCompleto () {
		return getNome() + " " + getSobrenome();
	}
	
	//Setters
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setSobrenome (String sobrenome) {
		this.sobrenome = sobrenome;
	}
	
	public void setIdade (int idade) {
		idade = Math.abs(idade);
		if (idade >= 0 && idade <= 120) {
			this.idade = idade;
		}
		
	}
	
}

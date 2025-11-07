package classe.desafio;

public class Pessoa {
	
	String nomePessoa;
	double pesoPessoa;
	
	Pessoa (String nomePessoa, double pesoPessoa){
		this.nomePessoa = nomePessoa;
		this.pesoPessoa = pesoPessoa;
	}
	
	void comer (Comida comida) {
		pesoPessoa += comida.pesoComida;
	}
	
	String apresentar() {
		return "Olá, eu sou " + nomePessoa + " e tenho " + pesoPessoa + " KG's";
	}

}

package fundamentos;

public class TiposPrimitivos {

	public static void main(String[] args) {
		//Informações dos funcionários
		
		//Tipos numéricos inteiros
		
		byte anosDeEmpresa = 23;
		short numeroDeVoos = 536;
		int id = 59365;
		long pontosAcumulados = 3_125_982_842L; //O L significa que o número literal informado é long
		
		//Tipos numéricos reais
		
		float salario = 11_445.17F; //literal float
		double vendasAcumuladas = 2_991_797_103.01;
		
		//tipo booleano
		
		boolean estaDeFerias = false; //true
		
		//Tipo caractere
		
		char status = 'A'; //Ativo
		
		//Dias de empresa
		System.out.println("Dias de empresa: " + anosDeEmpresa * 365);
		
		//Número de viagens
		System.out.println("Número de viagens: " + numeroDeVoos / 2);
		
		//Pontos por real
		System.out.println("Pontos por real: " + pontosAcumulados / vendasAcumuladas);
		
		System.out.println(id + " ganha -> " + salario);
		System.out.println("Está de férias? " + estaDeFerias);
		System.out.println("Status: " + status);
		
	}
}

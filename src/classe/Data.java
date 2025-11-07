package classe;

public class Data {

	int dia;
	int mes;
	int ano;
	
	Data (){
//		dia = 01;
//		mes = 01;
//		ano = 1970;
		this(1,1,1970); //construtor dentro do construtor p/ receber valores
	}
	
	Data (int dia, int mes, int ano){
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	
	String obterData() {
		final String formato = "%d/%d/%d"; //variável local
		return String.format(formato,this.dia,mes,ano);
	}
	
	void imprimirDataFormatada() {
		System.out.println(obterData());
	}
	
	/*String obterData(){
		String dataFormatada = Integer.toString(dia) + "/" + Integer.toString(mes) + "/" +
	Integer.toString(ano);
		return dataFormatada;
		
	}*/
}

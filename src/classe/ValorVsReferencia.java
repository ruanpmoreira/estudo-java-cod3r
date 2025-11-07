package classe;

public class ValorVsReferencia {

	public static void main(String[] args) {
		int a = 2;
		int b = a; //atribuição por valor (primitivo)
		
		a++;
		b--;
		
		System.out.println(a + " " + b);
		
		Data d1 = new Data(27,10,2025);
		Data d2 = d1; //atribuição por referência (objeto)
		
		d1.dia = 31;
		d2.mes = 11;
		
		d1.imprimirDataFormatada();
		System.out.println(d2.obterData());
		
		voltarDataPadrao(d1); //Como a atribuição foi feita por referencia, ela altera o valor original
		
		d1.imprimirDataFormatada();
		d2.imprimirDataFormatada();
		
		int c = 5;
		alterarPrimitivo(c);
		System.out.println(c); //O int c = 5 declarado aqui, tem um local de memória diferente do método
		
	}
	
	static void voltarDataPadrao (Data d) {
		d.dia = 1;
		d.mes = 1;
		d.ano = 1970;
	}
	
	static void alterarPrimitivo (int a) {
		a++;
	}
}

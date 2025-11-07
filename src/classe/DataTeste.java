package classe;

public class DataTeste {

	public static void main(String[] args) {
		
		Data d1 = new Data();
		Data d2 = new Data(23,10,2025);
		
		
		System.out.println(d1.obterData());
		d2.imprimirDataFormatada();

	}
}

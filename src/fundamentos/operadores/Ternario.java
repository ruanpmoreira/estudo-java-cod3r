package fundamentos.operadores;

public class Ternario {

	public static void main(String[] args) {
		
		double media = 4.6;
		
		String resultadoParcial = media <= 5 ? "Reprovado." : "Em recuperação.";
		String resultadoFinal = media >= 7 ? "Aprovado." : resultadoParcial;
		
		System.out.printf("O Aluno está: %s", resultadoFinal);
		
		System.out.println("\n");
		
		double nota = 9.8;
		boolean bomComportamento = true;
		boolean passouPorMedia = nota >= 7;
		boolean temDesconto = bomComportamento && passouPorMedia;
		
		String resultado = temDesconto ? "tem" : "não tem";
		
		System.out.printf("O aluno %s desconto", resultado);
	}
}

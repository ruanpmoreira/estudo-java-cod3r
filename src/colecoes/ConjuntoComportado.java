package colecoes;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoComportado {

	public static void main(String[] args) {
		
		//Set<String> listaAprovados = new HashSet<>();
		SortedSet<String> listaAprovados = new TreeSet<>(); //Inclui por ordem alfabética
		
		listaAprovados.add("Ruan");
		listaAprovados.add("Kathy");
		listaAprovados.add("Hikari");
		listaAprovados.add("Maomao");
		
		for (String candidato: listaAprovados) {
			System.out.println(candidato);
		}
		
		Set<Integer> nums = new HashSet<>();
		
		nums.add(1);
		nums.add(13);
		nums.add(263);
		nums.add(7);
		
		//nums.get(1); Não é possível acessar pelo índice
		
		for (int n: nums) {
			System.out.println(n);
		}
	}
}

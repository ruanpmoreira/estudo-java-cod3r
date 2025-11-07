package oo.composicao;

public class CompraTeste {
	
	public static void main(String[] args) {
		
		Compra compra1 = new Compra();
		
		compra1.cliente = "João Nascimento";
		compra1.adicionarItem(new Item("Caneta", 20, 7.45));		
		compra1.adicionarItem(new Item("Borracha", 12, 6.39));		
		compra1.adicionarItem(new Item("Caderno", 4, 18.33));	
		
		System.out.println("Size: " + compra1.itens.size());
		System.out.println("Valor total da compra: " + compra1.obterValorTotal());
		
		
	}

}

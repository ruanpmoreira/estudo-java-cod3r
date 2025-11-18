package oo.composicao.desafio;

public class Sistema {
	
	public static void main(String[] args) {
		Cliente cliente1 = new Cliente("Ruan Carlos");
		
		Compra compra1 = new Compra();
		compra1.adicionarItem(new Produto("Caneta", 1.50), 15);
		compra1.adicionarItem("Borracha", 0.75, 5);
		
		Compra compra2 = new Compra();
		compra2.adicionarItem(new Produto("Lápis", 1.00), 8);
		compra2.adicionarItem("Estojo", 5.45, 3);
		
		cliente1.adicionarCompra(compra1);
		cliente1.adicionarCompra(compra2);
		
		System.out.printf("Total da compra 1: %.2f\n", compra1.obterValorTotal());
		System.out.printf("Total da compra 2: %.2f\n", compra2.obterValorTotal());
		
		System.out.printf("Valor total de compras do %s: %.2f", cliente1.nome, cliente1.obterValorTotal());
		
		
	}

}

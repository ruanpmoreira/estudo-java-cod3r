package oo.composicao.desafio;

public class Sistema {
	
	public static void main(String [] args) {
		
		Compra compra1 = new Compra();
		System.out.println("====Inicialização do sistema====\n");
				
		Cliente cliente1 = new Cliente("Ruan Carlos");
		
		compra1.adicionarItem("Mouse", 87.25, 2);
		compra1.adicionarItem(new Produto("Teclado", 130.47), 1);
		
		Compra compra2 = new Compra();
		compra2.adicionarItem("Fone", 20.18, 3);
		compra2.adicionarItem(new Produto("Caixa de Som", 45.10), 1);
		
		cliente1.adicionarCompra(compra1);
		cliente1.adicionarCompra(compra2);
		
		System.out.println(cliente1.obterValorTotal());
		
	}

}

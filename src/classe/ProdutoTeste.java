package classe;

public class ProdutoTeste {
	
	public static void main (String[] args) {
		
		Produto p1 = new Produto("Notebook", 4500.00);
		
		Produto p2 = new Produto();
		p2.nome = "Celular";
		p2.preco = 1300.48;
		
		Produto.desconto = 0.29;
		
		System.out.println(p1.nome + " " + p1.precoComDesconto());
		System.out.println(p2.nome + " " + p2.precoComDesconto());
		
		double precoFinal1 = p1.precoComDesconto();
		double precoFinal2 = p2.precoComDesconto(0.1);
		double mediaCarrinho = (precoFinal1 + precoFinal2) / 2;
		
		System.out.printf("A média do carrinho é R$%.2f", mediaCarrinho);
	}

}

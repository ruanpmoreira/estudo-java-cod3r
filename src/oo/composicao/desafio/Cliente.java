package oo.composicao.desafio;

import java.util.List;
import java.util.ArrayList;

public class Cliente {
	
	String nome;
	
	List<Compra> compras = new ArrayList<>();
	
	void adicionarCompra(Compra compra) {
		this.compras.add(compra);
	}
	
	Cliente (String nome) {
		this.nome = nome;
	}
	
	double obterValorTotal() {
		double total = 0;
		
		for (Compra compra: this.compras) {
			total += compra.obterValorTotal();
		}
		
		return total;
	}

}

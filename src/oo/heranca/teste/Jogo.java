package oo.heranca.teste;

import oo.heranca.Heroi;
import oo.heranca.Jogador;
import oo.heranca.Monstro;

public class Jogo {
	
	public static void main(String[] args) {
		
		Jogador j1 = new Heroi(10,10);
		j1.vida = 100;
		
		Jogador j2 = new Monstro();
		j2.x = 10;
		j2.y = 11;
		j2.vida = 100;
		
//		j1.andar(Direcao.NORTE);
//		j1.andar(Direcao.NORTE);
//		j1.andar(Direcao.LESTE);
//		j1.andar(Direcao.NORTE);
		
		System.out.println("Herói");
		System.out.println("Vida:" + j1.vida);
		System.out.println("\nPosição: ");
		System.out.println("x: " + j1.x);
		System.out.println("y: " + j1.y);
		
		System.out.println("============================");
		
		System.out.println("\nMonstro\n");
		System.out.println("Vida:" + j2.vida);
		System.out.println("\nPosição: ");
		System.out.println("x: " + j2.x);
		System.out.println("y: " + j2.y);
		
		System.out.println("\nAtaque!\n");
		
		j1.atacar(j2);
		j2.atacar(j1);
		System.out.println("Herói vida: " + j1.vida);
		System.out.println("Monstro vida: " + j2.vida);
	}

}

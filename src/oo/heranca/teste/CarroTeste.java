package oo.heranca.teste;
import java.util.Scanner;

import oo.heranca.desafio.Carro;
import oo.heranca.desafio.Civic;
import oo.heranca.desafio.Ferrari;

public class CarroTeste {
	
	public static void main(String [] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("FERRARI");
		Ferrari ferrari = new Ferrari(350);
		
		boolean executando = true;
		int opcao = 0;
		
		while(executando) {
			System.out.println("1 - Acelerar");
			System.out.println("2 - Frear");
			System.out.println("3 - Ligar Turbo");
			System.out.println("4 - Desligar Turbo");
			System.out.println("5 - Ligar Ar");
			System.out.println("6 - Desligar Ar");
			System.out.println("7 - Sair");
			System.out.println("Selecione uma opção: ");
			opcao = entrada.nextInt();
			
			switch(opcao) {
				case 0:
					executando = false;
				case 1:
					ferrari.acelerar();
					System.out.println(ferrari.velocidadeDoAr());
					System.out.println("Acelerando: " + ferrari);
					break;
				case 2:
					ferrari.frear();
					System.out.println("Freando: " + ferrari);
					break;
				case 3:
					ferrari.ligarTurbo();
					System.out.println("Turbo ligado: " + ferrari);
					break;
				case 4:
					ferrari.desligarTurbo();
					System.out.println("Turbo desligado: " + ferrari);
					break;
				case 5:
					ferrari.ligarAr();
					System.out.println("Ar Ligado: " + ferrari);
					break;
				case 6:
					ferrari.desligarAr();
					System.out.println("Ar Desligado: " + ferrari);
					break;
				case 7:
					executando = false;
					break;
			}
		}
		
		
		System.out.println("-------------------------");
		
		System.out.println("CIVIC");
		Carro civic = new Civic(100);
		
		System.out.println("Velocidade Atual: " + civic);
		civic.acelerar();
		System.out.println("Acelerando: " +civic);
		civic.acelerar();
		System.out.println("Acelerando: " + civic);
		civic.acelerar();
		System.out.println("Acelerando: " + civic);
		
		civic.frear();
		System.out.println("Freando: " + civic);
		civic.frear();
		System.out.println("Freando: " + civic);
		
		entrada.close();
	}
	
}

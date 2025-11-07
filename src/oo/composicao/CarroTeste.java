package oo.composicao;

public class CarroTeste {
	
	public static void main (String [] args) {
		
		Carro c1 = new Carro();
		
		System.out.println("Carro está ligado? " + c1.estaLigado());
		c1.ligar();
		System.out.println("Carro está ligado? " + c1.estaLigado());
		
		System.out.println("Giros do motor: " + c1.motor.giros());
		
		c1.acelerar();
		c1.acelerar();
		c1.acelerar();
		c1.acelerar();
		System.out.println("Giros após acelerar: " + c1.motor.giros());
		
		c1.frear();
		c1.frear();
		c1.frear();
		
		//Faltou encapsulamento
		//c1.motor.fatorInjecao = -30;
		System.out.println("Giros após frear: " + c1.motor.giros());
	}

}

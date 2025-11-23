package oo.heranca.desafio;

public class Carro {
	
	final int VELOCIDADE_MAXIMA;
	double velocidadeAtual = 0;
	private int delta = 5;
	
	Carro (int velocidadeMaxima){
		VELOCIDADE_MAXIMA = velocidadeMaxima;
	}
	
	public void acelerar () {
		if(velocidadeAtual + getDelta() > VELOCIDADE_MAXIMA) {
			velocidadeAtual = VELOCIDADE_MAXIMA;
		} else {
			velocidadeAtual += getDelta();
		}	
	}
	
	public void frear () {
		if (velocidadeAtual >= 5) {
			velocidadeAtual -=5;
		} else {
			velocidadeAtual = 0;
		}
	}
	
	public String toString () {
		return velocidadeAtual + "Km/h.";
	}
	
	public void setDelta(int delta) {
		this.delta = delta;
	}
	
	public int getDelta() {
		return delta;
	}

}

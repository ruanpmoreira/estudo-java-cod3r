package oo.heranca.desafio;

public class Ferrari extends Carro implements Esportivo, Luxo {
	
	private boolean turboLigado;
	private boolean arLigado;
	
	public Ferrari (){
		this(350);
	}
	
	public Ferrari (int velocidadeMaxima) {
		super(velocidadeMaxima);
		setDelta(15);
	}
	
	public void ligarTurbo() {
		turboLigado = true;
	}
	
	public void desligarTurbo() {
		turboLigado = false;
	}
	
	public void ligarAr() {
		arLigado = true;
	}
	
	public void desligarAr() {
		arLigado = false;
	}
	
	@Override
	public int getDelta() {
		if (turboLigado && !arLigado) {
			return 35;
		} else if (turboLigado && arLigado) {
			return 30;
		} else if (!turboLigado && !arLigado) {
			return 20;
		} else {
			return 15;
		}
	}
	
//	@Override
//	void acelerar() {
//		if(velocidadeAtual + 15 > VELOCIDADE_MAXIMA) {
//			velocidadeAtual = VELOCIDADE_MAXIMA;
//		} else {
//			velocidadeAtual += 15;
//		}	
//	}

}

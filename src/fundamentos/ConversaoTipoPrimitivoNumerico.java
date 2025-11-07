package fundamentos;

public class ConversaoTipoPrimitivoNumerico {

	public static void main(String[] args) {
		
		float a = 1;
		System.out.println(a); //conversão implícita - int para float
		
		float b = (float)1.1234567888888; //conversão explícita (CAST)
		System.out.println(b);
		
		int c = 240;
		byte d = (byte)c;
		System.out.println(d);
		
		double e = 1.99999;
		int f = (int)e;
		System.out.println(f); //Não arredonda
	}
}

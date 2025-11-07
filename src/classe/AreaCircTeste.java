package classe;

public class AreaCircTeste {

	public static void main(String[] args) {
		
		AreaCirc a1 = new AreaCirc(5.0);
		
		System.out.println(a1.raio);
		System.out.println(a1.area());
		System.out.println(a1.area(6));
	}
}

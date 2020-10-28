package fundamentos;

public class Temperatura {

	public static void main(String[] args) {
//		(ºF - 32) x 5/9 = ºC
		double fireraind = 80.0;
		final double AJUSTE = 32;
		final double FATOR = 5.0/9.0;
		double result = (fireraind - AJUSTE) * FATOR;
		System.out.println(result);		
	}
}

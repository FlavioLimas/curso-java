
public class ConversaoTipoPrimitivosNumerico {

	public static void main(String[] args) {

		double a = 1; // implicita
		System.out.println(a);
		float b = (float) 1.2345888888888; // explicta (CAST)
		System.out.println(b);
		
		int c = 340;
		byte d = (byte) c;
		System.out.println(d);
		
		double e = 1.999999999;
		int f = (int) e;
		System.out.println(f);
		
	}

}

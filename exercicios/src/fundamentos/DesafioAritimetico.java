package fundamentos;

public class DesafioAritimetico {

	public static void main(String[] args) {

		Integer calcPrimeiraExpressao = (6 * (3 + 2)); // Elevado 2 = 900 / 6
		
		Integer calcSegundaExpressao = (3 * 2);
		
		Integer calcTerceiraExpressao = (1 - 5) * (2 - 7) / 2; // Elevado 2 e Div 2 -4 * -5
		
		Integer a = (int) Math.pow(calcPrimeiraExpressao, 2);
		
		a = a / calcSegundaExpressao;
		
		Integer b = (int) Math.pow(calcTerceiraExpressao, 2);
		
		Integer divisor = (int) Math.pow(a - b, 3);
		
		Integer dividendo = (int) Math.pow(10, 3);
		
		System.out.println(divisor / dividendo);
	}

}

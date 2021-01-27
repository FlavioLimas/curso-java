package fundamentos;

import java.util.Scanner;

public class DesafioCalcularora {
	
	public static Integer leituraNum() {
		Scanner entrada = new Scanner(System.in);
		return entrada.nextInt();
	}
	
	public static String leituraText() {
		Scanner entrada = new Scanner(System.in);
		return entrada.nextLine();
	}
	
	public static void main(String[] args) {
		
		System.out.println("Informe o primeiro numero ");
		int n1 = leituraNum();
		
		System.out.println("Informe a operação ");
		String operacao = leituraText();
		
		System.out.println("Informe o primeiro segundo ");
		int n2 = leituraNum();
		
		System.out.println("Resultado da operacao: ");
		
		if (operacao.equals("+")) {
			System.out.println(n1 + n2);
		}
		
		if (operacao.equals("-")) {
			System.out.println(n1 - n2);
		}
		
		if (operacao.equals("*")) {
			System.out.println(n1 * n2);
		}
		
		if (operacao.equals("/")) {
			System.out.println(n1 / n2);
		}
		
		if (operacao.equals("%")) {
			System.out.println(n1 % n2);
		}
	}

}

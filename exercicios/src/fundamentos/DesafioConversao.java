

import java.util.Scanner;

public class DesafioConversao {
	
	private static String formataDados(String dado) {

		dado = dado.replaceAll(",", ".");
		return dado;
	}
	
	private static Double converteToDouble(String salario) {

		double valorConvertido = Double.parseDouble(salario);
		return valorConvertido;
	}
	
	private static Double somaSalario(Double primeiroSalario, Double segundoSalario, Double terceiroSalario) {
		
		Double soma = primeiroSalario + segundoSalario + terceiroSalario;
		return soma;
	}
	
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		System.out.printf("Favor informar os 3 ultimos Sal�rios: \n");
		System.out.printf("1� Sal�rio: ");
		Double primeiroSalario = converteToDouble(formataDados(entrada.nextLine()));
		
		System.out.printf("2� Sal�rio: ");
		Double segundoSalario = converteToDouble(entrada.nextLine().replace(",", "."));
		
		System.out.printf("3� Sal�rio: ");
		Double terceiroSalario = converteToDouble(formataDados(entrada.nextLine()));
		
		entrada.close();
		
		System.out.println(primeiroSalario + " \n" + segundoSalario + " \n" + terceiroSalario);
		System.out.println("Soma Salarial referente aos 3 meses: " + somaSalario(primeiroSalario, segundoSalario, terceiroSalario));
		System.out.println("A Media salarial �: " + somaSalario(primeiroSalario, segundoSalario, terceiroSalario) / 3);
		
	}

}

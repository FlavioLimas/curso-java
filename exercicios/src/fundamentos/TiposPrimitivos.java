package fundamentos;

public class TiposPrimitivos {
	
	public static void main(String[] args) {
//		Informa��es do funcionario
		
//		Tipos Numericos inteiros
		byte anosDeEmpresa = 23;
		short numeroDeVoos = 542;
		int id = 56789;
		long pontosAcumulados = 3_134_845_223L;
		
//		Tipos numericos reais
		float salario = 11_4465.44F;
		double vendasAcumuladas = 2_991_797_103.01;
		
//		Tipo booleano 
		boolean estaDeFerias = false;
		
//		Tipo caractere
		char status = 'A';
		
//		Dias de empresa
		System.out.println(anosDeEmpresa * 365);
		
//		Numeros de viagens
		System.out.println(numeroDeVoos / 2);
		
//		Pontos por real
		System.out.println(pontosAcumulados / vendasAcumuladas);
		
		System.out.println(id + ": ganha -> " + salario);
		System.out.println("F�rias " + estaDeFerias);
		System.out.println("Status: " + status);
	}

}

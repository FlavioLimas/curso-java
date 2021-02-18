import java.util.Arrays;
import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        System.out.println("Quantas notas: ");
        Scanner entrada = new Scanner(System.in);

        int posicoes =  entrada.nextInt();
        double notas[] = new double[posicoes];

        for (int i = 0; i < notas.length; i++) {
            System.out.print("Informe a nota " + (i + 1) + ": ");
            // Tem que ser informado o valor com "," e não "." para os campos decimais devido a configuração do S.O. em pt-br
            notas[i] = entrada.nextDouble();
        }
        System.out.println(Arrays.toString(notas));
        entrada.close();

        double soma = 0;

        for (double nota : notas) {
            soma += nota;
        }
        System.out.printf("A média do aluno %.2f", soma / notas.length);
    }
    
}

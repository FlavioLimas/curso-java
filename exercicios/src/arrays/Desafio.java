import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        System.out.println("Qunatas notas voce gostaria de informar: ");
        Scanner entrada = new Scanner(System.in);

        int posicoes =  entrada.nextInt();
        double notas[] = new double[posicoes];

        for (int i = 0; i < notas.length; i++) {
            System.out.print("Informe a nota: ");
            notas[i] = entrada.nextDouble();
            System.out.println("Nota informada " + notas[i]);
        }
        entrada.close();

        double soma = 0;

        for (double nota : notas) {
            soma += nota;
        }
        System.out.printf("A média do aluno %.2f", soma / notas.length);
    }
    
}

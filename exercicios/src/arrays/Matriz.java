import java.util.Arrays;
import java.util.Scanner;

public class Matriz {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        System.out.print("Quantos alunos? ");
        int qtdAlunos = entrada.nextInt();

        System.out.print("Quantas notas por aluno? ");
        int qtdNotas = entrada.nextInt();

        double turmas[][] = new double[qtdAlunos][qtdNotas];

        double total = 0;
        for (int a = 0; a < turmas.length; a++) {
            for (int n = 0; n < turmas[a].length; n++) {
                System.out.printf("Informe a nota %dª do aluno %dº ", (n + 1), (a + 1));
                turmas[a][n] = entrada.nextDouble();
                total += turmas[a][n];
            }
        }

        double media = total / (qtdAlunos * qtdNotas);
        System.out.println("Media da turma " + media);

        for (double[] notasDoAluno : turmas) {
            
            System.out.println(Arrays.toString(notasDoAluno));
        }

        entrada.close();
    }
}

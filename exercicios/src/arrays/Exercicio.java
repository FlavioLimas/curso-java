import java.util.Arrays;

public class Exercicio {
    public static void main(String[] args) {
        
        double[] notasAlunoA = new double[3];
        System.out.println(Arrays.toString(notasAlunoA));

        notasAlunoA[0] = 7.9;
        notasAlunoA[1] = 8;
        notasAlunoA[2] = 6.7;

        System.out.println(Arrays.toString(notasAlunoA));

        // Calculando media do aluno

        double total = 0;
        for(int i = 0; i < notasAlunoA.length; i++) {
            total += notasAlunoA[i];
        }
        // Na operação entre um double e um int o resultado será sempre um double
        System.out.println(total / notasAlunoA.length);
    }    

}

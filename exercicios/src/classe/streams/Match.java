package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Match {
    public static void main(String[] args) {
        List<Aluno> alunos = Arrays.asList(
            new Aluno("Ana", 7.1),
            new Aluno("Luna", 6.1),
            new Aluno("Gui", 8.1),
            new Aluno("Gabi", 10.)
        );
        Predicate<Aluno> isAprove = 
            a -> a.nota >= 7.;

        System.out.println(alunos.stream().allMatch(isAprove));
        System.out.println(alunos.stream().anyMatch(isAprove));
    }
}

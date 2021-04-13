package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

public class Reduce2 {
    public static void main(String[] args) {
        List<Aluno> alunos = Arrays.asList(
            new Aluno("Ana", 7.1),
            new Aluno("Luna", 6.1),
            new Aluno("Gui", 8.1),
            new Aluno("Gabi", 10.)
        );

        Predicate<Aluno> isAprove = 
            a -> a.nota >= 7.;

        Function<Aluno, Double> returnNota =
            a -> a.nota;

        BinaryOperator<Double> soma = 
            (a, b) -> a + b;

        alunos.stream()
            .filter(isAprove)
            .map(returnNota)
            .reduce(soma)
            .ifPresent(System.out::println);
    }
}

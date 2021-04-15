package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

public class Reduce3 {
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
        BiFunction<Media, Double, Media> calcularMedia = 
            (media, nota) -> media.adicionar(nota);
        BinaryOperator<Media> combinarMedia =
            (m1 ,m2) -> Media.calcMedia(m1, m2);

        System.out.println("A média dos aprovados é " +
        alunos.stream()
            .filter(isAprove)
            .map(returnNota)
            .reduce(new Media(), calcularMedia, combinarMedia)
            .getMedia());

    }
}

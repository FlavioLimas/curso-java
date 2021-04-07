package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Filter {
    public static void main(String[] args) {
        
        List<Aluno> alunos =  Arrays.asList(
            new Aluno("Ana", 7.8),
            new Aluno("Bia", 5.8),
            new Aluno("Daniel", 9.8),
            new Aluno("Gui", 6.8),
            new Aluno("Rebeca", 7.1),
            new Aluno("Silvia", 8.8)
        );
        
        Predicate<Aluno> isAprove =
            a -> a.nota >= 7;

        Function<Aluno, String> imprimeAprovado = 
        a -> "Parabéns! " + a.nome + "! Você foi aprovado(a)!";
        
        alunos.stream()
            .filter(isAprove)
            .map(imprimeAprovado)
            .forEach(System.out::println);
    }
}

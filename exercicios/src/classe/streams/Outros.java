package streams;

import java.util.Arrays;
import java.util.List;

public class Outros {
    public static void main(String[] args) {
        List<Aluno> alunos = Arrays.asList(
        new Aluno("Ana", 7.1),
        new Aluno("Luna", 8.5),
        new Aluno("Gui", 8.1),
        new Aluno("Gabi", 10.),
        new Aluno("Ana", 7.1),
        new Aluno("Pedro", 8.5),
        new Aluno("Gui", 8.1),
        new Aluno("Maria", 10.)
    );

    System.out.println("Distinct..." );
    alunos.stream()
    .distinct()
    .forEach(System.out::println);
    }
}

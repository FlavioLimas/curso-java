package streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MinMax {

    public static void main(String[] args) {
        List<Aluno> alunos = Arrays.asList(
            new Aluno("Ana", 7.1),
            new Aluno("Luna", 8.5),
            new Aluno("Gui", 8.1),
            new Aluno("Gabi", 10.)
        );
        
        Comparator<Aluno> melhorNota = (a1, a2) -> {
            if(a1.nota > a2.nota) return 1;
            if(a1.nota < a2.nota) return -1;
            return 0;
        };

        System.out.println(
            alunos.stream()
            .max(melhorNota).get()
        );
    }
    
}

package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class TestCanal {
    public static void main(String[] args) {
        List<Canal> canais = Arrays.asList(
            new Canal(1, "GFA000012S", true),
            new Canal(2, "PDI000013S", true),
            new Canal(3, "GFA000014S", false),
            new Canal(4, "GDE000015S", false),
            new Canal(5, "GFA000016S", true)
        );

        Predicate<Canal> isGFA =
            f -> f.getNome().contains("GFA");

        Predicate<Canal> isAtivo = f -> f.getAtivo();

        Function<Canal, String> printCanal = 
            m -> "Id " +  m.getId() + " Canal de acesso " + m.getNome();
            
        canais.stream()
            .filter(isGFA)
            .filter(isAtivo)
            .map(printCanal)
            .forEach(System.out::println);
    }
}

package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Map {
    public static void main(String[] args) {
        
        Consumer<String> print = System.out::print;

        List<String> marcas = Arrays.asList("BMW ", "Audi ", "Honda \n\n");
        marcas.stream().map(m -> m.toUpperCase()).forEach(print);

        // Usando composicao
        marcas.stream()
            .map(Util.maiuscula)
            .map(Util.primeiraLetra)
            .map(Util::grito)
            .forEach(print);
    }
}

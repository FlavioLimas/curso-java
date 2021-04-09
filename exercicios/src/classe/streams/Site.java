package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Site {
    public static void main(String[] args) {
        List<Produto> carinhoCompras = Arrays.asList(
            new Produto("Caneta", 6.50, .5, false),
            new Produto("NoteBook", 3499.99, .35, true),
            new Produto("Impressora", 2299.99, .40, true)
        );

        Predicate<Produto> temDesconto = 
            f -> f.getDesconto() >= .30;

        Predicate<Produto> temFreteGratis = 
            f -> f.getFrete();

        Function<Produto, String> print = 
            m -> "O " + m.getNome() + " super Promoção " + m.getPreco() + " Não perca";

        carinhoCompras.stream()
            .filter(temDesconto)
            .filter(temFreteGratis)
            .map(print)
            .forEach(System.out::println);

    }
}

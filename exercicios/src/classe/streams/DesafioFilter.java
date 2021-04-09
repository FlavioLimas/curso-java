package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class DesafioFilter {
    public static void main(String[] args) {
        List<Produto> carinhoCompras = Arrays.asList(
            new Produto("Lapis", 6.50, .5, 30.),
            new Produto("Caneta", 6.50, .5, 30.),
            new Produto("NoteBook", 3499.99, .35, 30.),
            new Produto("Impressora", 2299.99, .40, 30.),
            new Produto("Lapis", 6.50, .5, 30.),
            new Produto("Caneta", 6.50, .5, 30.),
            new Produto("NoteBook", 3499.99, .35, 30.),
            new Produto("Impressora", 2299.99, .40, 30.),
            new Produto("Impressora", 2299.99, .40, 30.)
        );

        Predicate<Produto> temDesconto = 
            f -> f.getDesconto() >= .30;

        Predicate<Produto> temFreteGratis = 
            f -> f.getFrete() == 0;

        Function<Produto, String> print = 
            m -> "O " + m.getNome() + " super Promoção " + m.getPreco() + " Não perca";

        carinhoCompras.stream()
            .filter(temDesconto)
            .filter(temFreteGratis)
            .map(print)
            .forEach(System.out::println);

    }
}

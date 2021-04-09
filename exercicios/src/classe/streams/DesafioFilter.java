package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class DesafioFilter {
    public static void main(String[] args) {
        List<Produto> carinhoCompras = Arrays.asList(
            new Produto("Lapis", 1.99, .35, 0.),
            new Produto("NoteBook", 4899.89, .32, 0.),
            new Produto("Caderno", 30., .45, 0.),
            new Produto("Impressora",1200., .40, 0.),
            new Produto("iPad", 3100., .29, 0.),
            new Produto("Relogio", 1.900, .12, 0.),
            new Produto("Monitor", 800., .31, 0.)
        );

        Predicate<Produto> temDesconto = 
            f -> f.getDesconto() >= .3;

        Predicate<Produto> temFreteGratis = 
            f -> f.getFrete() == 0;
       
        Predicate<Produto> precoRelevante = 
            f -> f.getPreco() >= 500;

        Function<Produto, String> print = 
            m -> "O " + m.getNome() + " super Promoção " + m.getPreco() + " Não perca";

        carinhoCompras.stream()
            .filter(temDesconto)
            .filter(temFreteGratis)
            .filter(precoRelevante)
            .map(print)
            .forEach(System.out::println);

    }
}

package lambdas;

import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Dasafio {
    public static void main(String[] args) {
        Produto p = new Produto("iPad", 3235.89, .13);

        BinaryOperator<Double> precoReal = (preco, desconto) -> {
            return (preco * (1 - desconto));
        };

        UnaryOperator<Double> impostoMunicipal = (preco) -> {
            return (preco >= 2500 ? (preco * (1 + 8.5)) : 0);
        };

        UnaryOperator<Double> frete = (preco) -> {
            return (preco >= 3000 ? preco + 100 : preco + 50);
        };

        Function<Double, Double> arredondar = 
            valor -> Math.ceil(valor);

        Function<Double, String> format =
            valor -> String.format("%.2f", valor);

        System.out.println(
            precoReal
            .andThen(impostoMunicipal)
            .andThen(frete)
            .andThen(arredondar)
            .andThen(format)
            .apply(p.preco, p.desconto)
        );
    }
    
}

package lambdas;

import java.util.function.BinaryOperator;
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

        
    }
    
}

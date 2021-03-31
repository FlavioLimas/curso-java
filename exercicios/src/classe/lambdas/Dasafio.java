package lambdas;

import java.util.function.BinaryOperator;

public class Dasafio {
    public static void main(String[] args) {
        Produto p = new Produto("iPad", 3235.89, .13);

        BinaryOperator<Double> precoReal = (preco, desconto) -> {
            return (preco * (1 - desconto));
        };

        
    }
    
}

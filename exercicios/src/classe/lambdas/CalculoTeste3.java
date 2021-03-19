package lambdas;

import java.util.function.BinaryOperator;

public class CalculoTeste3 {
    /**
     * Implementacao de funções do java.util.function
     **/
    public static void main(String[] args) {
        BinaryOperator<Double> calc = (x, y) -> { return x + y; };

        System.out.println(calc.apply(2., 3.));
        calc = (x, y) -> x * y;
        System.out.println(calc.apply(2., 3.));

    }
}

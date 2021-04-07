package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public class DesafioMap {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        Consumer<String> print = System.out::print;
        UnaryOperator<String> invertString =
        m -> new StringBuilder(m).reverse().toString();
        nums.stream()
            .map(m -> Integer.toBinaryString(m))
            .map(invertString)
            .map(m -> String.valueOf(Integer.parseInt(m, 2)))
            .forEach(print);
    }
}

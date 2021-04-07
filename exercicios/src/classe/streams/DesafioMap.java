package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class DesafioMap {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        Consumer<String> println = System.out::println;
        Function<Integer, String> binaryToString =
            m -> Integer.toBinaryString(m);

        UnaryOperator<String> invertString =
            m -> new StringBuilder(m).reverse().toString();

        Function<String, String> stringToBinary = 
            m -> String.valueOf(Integer.parseUnsignedInt(m));
        nums.stream()
            .map(binaryToString)
            .map(invertString)
            .map(stringToBinary)
            .forEach(println);
    }
}

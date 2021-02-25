import java.util.ArrayDeque;
import java.util.Deque;

import org.graalvm.compiler.lir.LIRVerifier;

public class Pilha {
    public static void main(String[] args) {
        Deque<String> livros = new ArrayDeque<String>();

        livros.add("O Pequeno Principe"); // return true or false
        livros.push("Don Quixote");
        livros.push("O Hobbit");

        System.out.println(livros);
    }
}

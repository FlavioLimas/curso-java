import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {
    public static void main(String[] args) {
        Deque<String> livros = new ArrayDeque<String>();

        System.out.println(livros.add("O Pequeno Principe")); // return true or false
        livros.push("Don Quixote");
        livros.push("O Hobbit");
        System.out.println(livros.contains("O Hobbit"));
        System.out.println(livros.isEmpty());

        for (String livro : livros) {
            System.out.print(livro + " ");
        }

        System.out.println(livros.peek());
        System.out.println(livros.element());
        System.out.println(livros.getFirst());
        System.out.println(livros.getLast());
        System.out.println(livros.poll());
        // System.out.println(livros.pop()); // Remove
        // System.out.println(livros.remove());

        livros.size();
        livros.clear();

        System.out.println(livros);

    }
}

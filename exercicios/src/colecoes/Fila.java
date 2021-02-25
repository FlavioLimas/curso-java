import java.util.LinkedList;
import java.util.Queue;

public class Fila {
    public static void main(String[] args) {
        Queue<String> fila = new LinkedList<>();

        // Offer e Add -> adicionam elementos na fila
        //Diferença é o comportamento quando a fila está cheia!
        fila.add("Ana");
        fila.offer("Bia"); // Lança uma exceção
        fila.add("Carlos"); // retorna null
        fila.offer("Daniel");
        fila.add("Rafaela");
        fila.offer("Gui");
        
        // Lista vazia peek retorna null
        // Lista vazia element dispara uma excepition java.util.NoSuchElementException
        //Diferença é o comportamento quando a fila está vazia!
        System.out.println(fila.peek()); // retorna false
        System.out.println(fila.peek());
        System.out.println(fila.element()); // Lança uma exceção
        System.out.println(fila.element());
    }
}

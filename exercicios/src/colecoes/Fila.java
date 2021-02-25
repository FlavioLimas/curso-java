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
        
        // Peek e Element -> obter o proximo elemento da fila (sem remover)

        // Fila vazia peek retorna null
        // Fila vazia element dispara uma excepition java.util.NoSuchElementException
        //Diferença é o comportamento quando a fila está vazia!
        System.out.println(fila.peek()); // retorna false
        System.out.println(fila.peek());
        System.out.println(fila.element()); // Lança uma exceção
        System.out.println(fila.element());

        System.out.println("Remove ->> " + fila.remove()); // Remove o proximo item da fila e retorna o item removido
                                                            // - OBS: Caso não tenha nenhum elemento na fila será dispara uma excepition java.util.NoSuchElementException

        System.out.println(fila.poll()); // Remove o primeiro elemento da fila depois retorna a fila com elementos que sobraram 
                                                // -OBS: caso não tenha nenhum elemento na fila será retornado null
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());

        System.out.println(fila.size()); // Tamanho da fila
        System.out.println(fila.isEmpty()); // Verifica se a fila esta vazia
        fila.clear(); // Limpa a fila
        System.out.println(fila.isEmpty()); // Verifica se a fila esta vazia
        
        System.out.println(fila.toString());
    }
}

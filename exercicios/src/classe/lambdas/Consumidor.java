package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumidor {
    // Definição de um T que não retorna nada
    public static void main(String[] args) {
        
        imprimeProduto(new Produto("Caneta", 12.34, .09));
        
        
    }
    public static void imprimeProduto(Produto produto) {
        Consumer<Produto> imprimir = p -> System.out.println(p.nome + "!!!");
        imprimir.accept(produto);
    }
}

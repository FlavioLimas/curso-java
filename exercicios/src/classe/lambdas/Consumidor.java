package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumidor {
    // Definição de um T que não retorna nada
    public static void main(String[] args) {
        Consumer<Produto> imprimir = p -> System.out.println(p.nome + "!!!");

        Produto produto1 = new Produto("Caneta", 12.34, .09);
        imprimir.accept(produto1);
        
        Produto produto2 = new Produto("Notebook", 2987.99, .25);
        Produto produto3 = new Produto("Caderno", 19.90, .03);
        Produto produto4 = new Produto("Borracha", 7.80, .18);
        Produto produto5 = new Produto("Lapis", 4.39, .09);

        List<Produto> listProduto = Arrays.asList(produto1, produto2, produto3, produto4, produto5);
        listProduto.forEach(imprimir);
    }
}

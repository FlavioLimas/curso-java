package oo.composicao;

public class CompraTeste {
    public static void main(String[] args) {
        Compra compra = new Compra();
        Item item = new Item();
        compra.cliente = "João Pedro";
        item.nome = "Bola";
        item.quantidade = 1;
        item.preco = 5;

        compra.itens.add(item);

        System.out.println("O " + compra.cliente + " Comprou " + item.quantidade + " " + item.nome + " pelo valor R$ "
                + String.format("%.2f", item.preco));
    }
}

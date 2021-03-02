package oo.composicao;

public class CompraTeste {
    public static void main(String[] args) {
        
        Compra compra1 = new Compra();
        compra1.cliente = "João Pedro";
        compra1.addItemAndAssociaCompra("Caneta", 20, 7.45);
        compra1.addItemAndAssociaCompra(new Item("Borracha", 12, 3.89));
        compra1.addItemAndAssociaCompra(new Item("Caderno", 3, 18.79));

        System.out.println(compra1.itens.size());
        System.out.println(compra1.getValorTotal());
        // System.out.println("O " + compra1.cliente + " Comprou " + itens.quantidade + " " + itens.nome + " pelo valor R$ "
        //         + String.format("%.2f", itens.preco));
    }
}

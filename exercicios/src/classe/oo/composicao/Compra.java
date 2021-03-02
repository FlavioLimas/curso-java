package oo.composicao;

import java.util.ArrayList;

public class Compra {
    String cliente;    
    ArrayList<Item> itens = new ArrayList<Item>();

    void addItemAndAssociaCompra(String nome, int quantidade, double preco) {
        this.addItemAndAssociaCompra(new Item(nome, quantidade, preco));
    }

    void addItemAndAssociaCompra(Item item) {
        this.itens.add(item);
        item.compra = this;
    }

    double getValorTotal() {
        double total = 0;

        for (Item item : itens) {
            total += item.quantidade * item.preco;
        }

        return total;
    }
}

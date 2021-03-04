package oo.composicao.desafio;

import java.util.ArrayList;
import java.util.List;

public class Compra {
    final List<Item> itens = new ArrayList<Item>();

    void setItem(Produto produto, int quantidade) {
        this.itens.add(new Item(produto, quantidade));
    }

    void setItem(String nome, double preco, int quantidade) {
        Produto produto = new Produto(nome, preco);
        this.itens.add(new Item(produto, quantidade));
    }

    double getValorToral() {
        double valorTotal = .0;
        for(Item item : itens) {
            valorTotal += (item.quantidade * item.produto.preco);
        }
        return valorTotal;
    }

    public String toString() {
        String itemList = null;
        for (Item item : itens) {
            itemList = item.toString();
        }
        return itemList;
    }
}

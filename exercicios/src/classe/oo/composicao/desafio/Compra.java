package oo.composicao.desafio;

import java.util.ArrayList;
import java.util.List;

public class Compra {
    List<Item> itens = new ArrayList<Item>();

    Compra(Item item) {
        this.itens.add(item);
    }

    Compra(List<Item> itens) {
        this.itens = itens;
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

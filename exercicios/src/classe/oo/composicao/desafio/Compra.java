package oo.composicao.desafio;

import java.util.ArrayList;
import java.util.List;

public class Compra {
    List<Item> itens = new ArrayList<Item>();

    double getValorToral() {
        double valorTotal = .0;
        for(Item item : itens) {
            valorTotal += (item.quantidade * item.produto.preco);
        }
        return valorTotal;
    }
}

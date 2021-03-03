package oo.composicao.desafio;

import java.util.ArrayList;
import java.util.List;

public class ClienteTeste {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Flavio");

        Produto note = new Produto("NoteBook", 5.500);
        Produto mesa = new Produto("Mesa", 119.90);
        Produto cadeiraGamer = new Produto("CadeiraGamer", 969.90);

        Item item1 = new Item(note, 1);
        Item item2 = new Item(mesa, 2);
        Item item3 = new Item(cadeiraGamer, 1);

        List<Item> itens = new ArrayList<Item>();
        itens.add(item2);
        itens.add(item3);
        Compra compra1 = new Compra(item1);
        Compra compra2 = new Compra(itens);

        cliente.fazCompra(compra1);
        cliente.fazCompra(compra2);

        if (compra1.itens.size() > 1) {
            System.out.println("Parabens " + cliente.nome + " pela compra do " + compra1.toString()
                    + " valor a ser pago R$" + cliente.getValorTotal());
        } else {
            for (Item item : compra2.itens) {
            System.out.println("Parabens " + cliente.nome + " pela compra do " + item.produto.nome
                    + " valor a ser pago R$" + item.produto.preco);
            }
            System.out.println(cliente.getValorTotal());
        }
    }
}

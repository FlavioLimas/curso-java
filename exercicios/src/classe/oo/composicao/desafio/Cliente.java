package oo.composicao.desafio;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    final String nome;
    final List<Compra> compras = new ArrayList<Compra>();

    Cliente(String nome){
        this.nome = nome;
    }

    void fazCompra(Compra compra) {
        this.compras.add(compra);
    }

    double getValorTotal() {
        double valorToral = .0;
        for (Compra compra : compras) {
            valorToral += compra.getValorToral();
        }
        return valorToral;
    }
}

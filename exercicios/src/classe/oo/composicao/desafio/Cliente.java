package oo.composicao.desafio;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    String nome;
    List<Compra> compras = new ArrayList<Compra>();

    double getValorTotal() {
        double valorToral = .0;
        for (Compra compra : compras) {
            valorToral += compra.getValorToral();
        }
        return valorToral;
    }
}

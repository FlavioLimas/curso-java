package oo.composicao.desafio;

public class Item {
    Produto produto;
    int quantidade;

    Item(Produto produto, int quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
    }

    public String toString() {
        return this.produto.nome;
    }
}

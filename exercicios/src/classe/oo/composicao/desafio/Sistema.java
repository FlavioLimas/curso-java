package oo.composicao.desafio;

public class Sistema {
    public static void main(String[] args) {

        Compra compra1 = new Compra();
        compra1.setItem("Caneta", 9.67, 100);
        compra1.setItem(new Produto("NoteBook", 1897.88), 2);

        Compra compra2 = new Compra();
        compra2.setItem("Caderno", 10, 10);
        compra2.setItem(new Produto("Impressora", 998.90), 1);

        Cliente cliente = new Cliente("Maria Julia Moraes");
        cliente.fazCompra(compra1);
        cliente.fazCompra(compra2);

        System.out.println(cliente.getValorTotal());
    }
}

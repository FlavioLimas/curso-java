package oo.encapsulamento;

public class PessoaTeste {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("João", -30);

        p1.setIdade(40);

        System.out.println(p1.toString());
    }
}

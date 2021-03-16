package oo.encapsulamento;

public class Pessoa {
    private int idade;

    public Pessoa(int idade) {
        this.idade = Math.abs(idade);
    }
    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int novaIdade) {
        if (novaIdade >= 0) {
            this.idade = novaIdade;
        }
    }
}

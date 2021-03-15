package oo.heranca.dasafio;

public class Carro {
    private final int VELOCIDADE_MAXIMA;
    private int velocidadeAtual;
    protected int delta = 150;

    public Carro(int velocidadeMaxima){
        VELOCIDADE_MAXIMA = velocidadeMaxima;
    }
    public void acelerar() {
        if (velocidadeAtual + delta > VELOCIDADE_MAXIMA) {
            velocidadeAtual = VELOCIDADE_MAXIMA;
        } else {
            this.velocidadeAtual += delta;
        }
    }

    public void frear() {
        if (this.velocidadeAtual >= 5) {
            this.velocidadeAtual -= 5;
        } else {
            this.velocidadeAtual = 0;
        }
    }

    public String toString() {
        return Integer.toString(this.velocidadeAtual) ;
    }
}

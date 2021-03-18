package oo.heranca.dasafio;

public class Carro {
    private final int VELOCIDADE_MAXIMA;
    private int velocidadeAtual;
    private int delta = 150;

    protected Carro(int velocidadeMaxima){
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
    public int getDelta() {
        return delta;
    }
    public void setDelta(int delta) {
        this.delta = delta;
    }
}

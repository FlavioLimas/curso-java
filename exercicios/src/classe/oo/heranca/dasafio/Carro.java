package oo.heranca.dasafio;

public class Carro {
    int velocidadeAtual;

    void acelerar() {
        this.velocidadeAtual += 5;
    }

    void frear() {
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

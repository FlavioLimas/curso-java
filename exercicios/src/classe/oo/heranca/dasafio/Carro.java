package oo.heranca.dasafio;

public class Carro {
    int velocidadeAtual;

    void acelerar() {
        this.velocidadeAtual += 5;
    }

    void frear() {
        if (this.velocidadeAtual > 0) {
            this.velocidadeAtual -= 5;
        }
    }
}

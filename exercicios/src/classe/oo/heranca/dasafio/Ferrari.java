package oo.heranca.dasafio;

public class Ferrari extends Carro {

    Ferrari(){
        super(300);
    }

    void acelerar() {
        velocidadeAtual += 15;
    }
}

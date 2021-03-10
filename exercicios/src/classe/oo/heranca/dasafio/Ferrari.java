package oo.heranca.dasafio;

public class Ferrari extends Carro {

    Ferrari(){
        this(315);
    }

    Ferrari(int velocidadeMaxima){
        super(velocidadeMaxima);
        delta = 350;
    }

    /**
     * TODO: Não é mais necessairo devido a implementação acima
     */
    // @Override
    // void acelerar() {
    //     velocidadeAtual += 15;
    // }
}

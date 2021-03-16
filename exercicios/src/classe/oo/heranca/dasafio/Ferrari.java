package oo.heranca.dasafio;

public class Ferrari extends Carro {

    public Ferrari(){
        this(315);
    }

    public Ferrari(int velocidadeMaxima){
        super(velocidadeMaxima);
        delta = 350;
    }

    /**
     * TODO: Não é mais necessairo devido a implementação acima
     */
    // @Override
    // public void acelerar() {
    //     velocidadeAtual += 15;
    // }
}

package oo.heranca.dasafio;

public class Ferrari extends Carro implements Esportivo {

    public Ferrari(){
        this(315);
    }

    public Ferrari(int velocidadeMaxima){
        super(velocidadeMaxima);
        delta = 15;
    }

    @Override
    public void ligarTurbo() {
        delta = 35;
        
    }

    @Override
    public void desligarTurbo() {
        delta = 15;
    }
    /**
     * TODO: Não é mais necessairo devido a implementação acima
     */
    // @Override
    // public void acelerar() {
    //     velocidadeAtual += 15;
    // }
}

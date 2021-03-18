package oo.heranca.dasafio;

public class Ferrari extends Carro implements Esportivo, Luxo {
    private boolean ligarTurbo = false;
    private boolean ligarAr = false;

    public Ferrari(){
        this(315);
    }

    public Ferrari(int velocidadeMaxima){
        super(velocidadeMaxima);
        setDelta(15);
    }

    @Override
    public void ligarTurbo() {
        ligarTurbo = true;
        
    }

    @Override
    public void desligarTurbo() {
        ligarTurbo = false;
    }

    @Override
    public void ligarAr() {
        ligarAr = true;
    }

    @Override
    public void desligarAr() {
        ligarAr = false;
    }

    private int validaVelocidadeTurboAr(boolean ligarTurbo, boolean ligarAr) {
        if(ligarTurbo && !ligarAr) {
            return 35;
        } else if (ligarTurbo && ligarAr) {
            return 30;            
        } else if(!ligarTurbo && !ligarAr) {
            return 20;
        } else {
            return 15;
        }
    }

    @Override
    public int getDelta() {
        return validaVelocidadeTurboAr(ligarTurbo, ligarAr);
    }
    
    /**
     * TODO: Não é mais necessairo devido a implementação acima
     */
    // @Override
    // public void acelerar() {
    //     velocidadeAtual += 15;
    // }
}

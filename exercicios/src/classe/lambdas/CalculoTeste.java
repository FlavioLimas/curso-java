package lambdas;

public class CalculoTeste {

    public static void main(String[] args) {
        
        Calculo calculo = new Somar();
        Calculo multiplicar = new Multiplicar();

        System.out.println(calculo.executar(2, 3));
    }
    
}

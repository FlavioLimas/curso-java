package lambdas;

import java.util.function.Function;

public class Funcao {
        public static void main(String[] args) {
        Function<Integer, String> parOuImpar = 
            numero -> numero % 2 == 0 ? "Par" : "Ímpar";
    
        System.out.println(parOuImpar.apply(32));

        Function<String, String> oResultado = 
            valor -> "O resultado é: " + valor;
        
        Function<String, String> empolgado = valor -> valor + "!!!";

        System.out.println(parOuImpar
            .andThen(oResultado)
            .andThen(empolgado)
            .apply(32));

    }
    
}

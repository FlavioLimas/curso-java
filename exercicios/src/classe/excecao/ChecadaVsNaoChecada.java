package excecao;

public class ChecadaVsNaoChecada {
    
    public static void main(String[] args) {
        geraErro1();
        geraErro2();
    }

    static void geraErro1() {
        new RuntimeException("Ocorreu um erro bem legal #01!");
    }

    static void geraErro2() {
        new RuntimeException("Ocorreu um erro bem legal #02!");
    }
}

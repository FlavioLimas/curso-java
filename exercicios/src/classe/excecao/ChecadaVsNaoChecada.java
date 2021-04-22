package excecao;

public class ChecadaVsNaoChecada {
    
    public static void main(String[] args) {
        try {
            geraErro1();
        } catch (Exception e) {
            e.printStackTrace();
        }
        geraErro2();

        System.out.println("Fim :)");
    }

    static void geraErro1() {
        throw new RuntimeException("Ocorreu um erro bem legal #01!");
    }

    static void geraErro2() {
        new Exception("Ocorreu um erro bem legal #02!");
    }
}

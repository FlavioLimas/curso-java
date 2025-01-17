package excecao;

public class ChecadaVsNaoChecada {
    
    public static void main(String[] args) {
        try {
            geraErro1();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try {
            geraErro2();   
        } catch (Throwable e) {
            System.out.println("Gera error #2");
        }
         
        System.out.println("Fim :)");
    }

    /* 
    * Exception NÃO chacada e NÃO verificada
    */
    static void geraErro1() {
        throw new RuntimeException("Ocorreu um erro bem legal #01!");
    }

    /* 
    * Exception chacada e verificada
    */
    static void geraErro2() throws Exception {
        throw new Exception("Ocorreu um erro bem legal #02!");
    }
}

package excecao;

public class Causa {
    public static void main(String[] args) {
        
    }

    static void metodoA(Aluno aluno) {
        metodoB(aluno);
    }

    static void metodoB(Aluno aluno) {
        if (aluno == null) {
            throw new NullPointerException("Aluno esta NUUUULLLOOO");
        }

        System.out.println(aluno.nome);
    }
}

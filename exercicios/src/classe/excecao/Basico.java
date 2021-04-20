package excecao;


public class Basico {
    public static void main(String[] args) {

        Aluno aluno = null;

        imprimirNomeAluno(aluno);

        System.out.println(7 / 0);

        System.out.println("Fim :)");
    }

    public static void imprimirNomeAluno(Aluno aluno) {
        System.out.println(aluno.nome);
    }
}

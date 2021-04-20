package excecao;


public class Basico {
    public static void main(String[] args) {

        Aluno aluno = null;
        try {
            imprimirNomeAluno(aluno);
        } catch(Exception excecao) {
            System.out.println("Ocorreu um erro no momento da impressão do nome do usuário");
        }

        try {
            System.out.println(7 / 0);
        } catch (ArithmeticException e) {
            System.out.println("Ocorreu o erro: " + e.getMessage());
        }

        System.out.println("Fim :)");
    }

    public static void imprimirNomeAluno(Aluno aluno) {
        System.out.println(aluno.nome);
    }
}

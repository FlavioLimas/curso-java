package oo.composicao;

public class CursoTeste {

    static void imprime(Curso curso) {
        for (Aluno aluno : curso.alunos) {
            System.out.println("Estou matriculado no curso " + curso.nome + "...");
            System.out.println("... e o meu nome é " + aluno.nome);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("João");
        Aluno aluno2 = new Aluno("Maria");
        Aluno aluno3 = new Aluno("Pedro");

        Curso curso1 = new Curso("Java Completo");
        Curso curso2 = new Curso("Web 2023");
        Curso curso3 = new Curso("React Native");

        curso1.adicionarAluno(aluno1);
        curso1.adicionarAluno(aluno2);

        curso2.adicionarAluno(aluno1);
        curso2.adicionarAluno(aluno3);

        aluno1.adicionarCurso(curso3);
        aluno2.adicionarCurso(curso3);
        aluno3.adicionarCurso(curso3);

        System.out.println("Curso 1");
        imprime(curso1);
        System.out.println("Curso 2");
        imprime(curso2);
        System.out.println("Curso 3");
        imprime(curso3);
        // for (Aluno aluno : curso1.alunos) {
        //     System.out.println("Estou matriculado no curso " + curso1.nome + "...");
        //     System.out.println("... e o meu nome é " + aluno.nome);
        //     System.out.println();
        // }
        // for (Aluno aluno : curso2.alunos) {
        //     System.out.println("Estou matriculado no curso " + curso2.nome + "...");
        //     System.out.println("... e o meu nome é " + aluno.nome);
        //     System.out.println();
        // }
        
        // for (Aluno aluno : curso3.alunos) {
        //     System.out.println("Estou matriculado no curso 3 " + curso3.nome + "...");
        //     System.out.println("... e o meu nome é " + aluno.nome);
        //     System.out.println();
        // }

    }
    
}

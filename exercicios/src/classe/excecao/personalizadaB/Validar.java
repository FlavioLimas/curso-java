package excecao.personalizadaB;

import excecao.Aluno;

public class Validar {
    private Validar() {}

    public static void validarAluno(Aluno aluno) throws StringVaziaException, NumeroForaIntervaloException {
        if(aluno == null) {
            throw new IllegalArgumentException("O aluno está null!");
        }

        if (aluno.nome == null || aluno.nome.trim().isEmpty()) {
            throw new StringVaziaException("nome");
        }

        if (aluno.nota < 0 || aluno.nota > 10) {
            throw new NumeroForaIntervaloException("nota");
            
        }
    }
}

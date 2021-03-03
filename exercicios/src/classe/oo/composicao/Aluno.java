package oo.composicao;

import java.util.ArrayList;
import java.util.List;

public class Aluno {
    final String nome;
    final List<Curso> cursos = new ArrayList<>();

    Aluno(String nome) {
        this.nome = nome;
    }

    void adicionarCurso(Curso curso) {
        this.cursos.add(curso);
        curso.alunos.add(this); // Adicionando esse curso ao aluno recebido como parametro
    }

    Curso getCursoPorNome(String nome) {
        for (Curso curso : this.cursos) {
            if (curso.nome.equalsIgnoreCase(nome)) {
                return curso;
            }
        }
        return null;
    }

    // Sempre que for necessario converter um objeto em string deve ser implementado o metodo toString
    public String toString() {
        return nome;
    }
}

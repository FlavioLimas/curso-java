package streams;

public class Aluno {
    
    final String nome;
    final Double nota;
    public Aluno(String nome, Double nota) {
        this.nome = nome;
        this.nota = nota;
    }

    @Override
    public String toString() {
        return nome + " tem nota " + nota;
    }
}

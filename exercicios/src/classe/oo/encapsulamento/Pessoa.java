package oo.encapsulamento;

public class Pessoa {
    private String nome;
    private String sobreNome;
    private int idade;

    public Pessoa(String nome, String sobreNome, int idade) {
        setNome(nome);
        setSobreNome(sobreNome);
        setIdade(idade);
    }
    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int novaIdade) {
        novaIdade = Math.abs(novaIdade);
        if (novaIdade >= 0 && novaIdade <= 120) {
            this.idade = novaIdade;
        }
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Olá eu sou " + getNomeCompleto() + " e a minha idade é " + getIdade() + " anos";
    }
    public String getSobreNome() {
        return sobreNome;
    }

    public String getNomeCompleto() {
        return getNome() + " " + getSobreNome();
    }
    public void setSobreNome(String sobreNome) {
        this.sobreNome = sobreNome;
    }
}

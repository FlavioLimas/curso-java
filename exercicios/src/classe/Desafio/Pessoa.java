package Desafio;

public class Pessoa {
    String nome;
    double peso;

    Pessoa(String nome, double peso) {
        this.nome = nome;
        this.peso = peso;
    }
    
    void comer(Comida comida) {
        if (comida != null) {
            this.peso += comida.peso;            
        }
    }

    String arpesentar() {
        return String.format("Olá eu sou o %s e tenho %.3f Kgs.", nome, peso);
    }
}

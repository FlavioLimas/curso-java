package Desafio;

public class Jantar {
    public static void main(String[] args) {
        Comida comida1 = new Comida();
        Comida comida2 = new Comida();
        
        Pessoa pessoa1 = new Pessoa("Flavio", 50.);
        Pessoa pessoa2 = new Pessoa("Fulano", 70.);
        pessoa1.comer(comida1);
        pessoa2.comer(comida2);

        System.out.printf("Antes da refeicao peso %.3f do %s\n", pessoa2.peso, pessoa2.nome);
        System.out.printf("Antes da refeicao peso %.3f do %s\n", pessoa1.peso, pessoa1.nome);
        comida1.nome = "feijão";
        comida1.peso = 0.225;
        comida2.nome = "arroz";
        comida2.peso = 0.100;
        
        pessoa1.comer(comida1);
        pessoa2.comer(comida2);


        System.out.printf("Antes da refeicao peso %.3f do %s\n", pessoa1.peso, pessoa1.nome);
        System.out.printf("Antes da refeicao peso %.3f do %s", pessoa2.peso, pessoa2.nome);
        
    }
    
}

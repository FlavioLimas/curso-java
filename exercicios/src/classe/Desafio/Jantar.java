package Desafio;

public class Jantar {
    public static void main(String[] args) {
        Comida comida1 = new Comida("feijão", 0.225);
        Comida comida2 = new Comida("arroz", 0.100);
        
        Pessoa pessoa1 = new Pessoa("Flavio", 50.);
        Pessoa pessoa2 = new Pessoa("Fulano", 70.);

        System.out.printf("Antes da refeicao peso %.3f do %s\n", pessoa2.peso, pessoa2.nome);
        System.out.printf("Antes da refeicao peso %.3f do %s\n", pessoa1.peso, pessoa1.nome);
        
        pessoa1.comer(comida1);
        pessoa2.comer(comida2);


        System.out.printf("Antes da refeicao peso %.3f do %s\n", pessoa1.peso, pessoa1.nome);
        System.out.printf("Antes da refeicao peso %.3f do %s", pessoa2.peso, pessoa2.nome);
        
    }
    
}

package Desafio;

public class Jantar {
    public static void main(String[] args) {
        Comida comida1 = new Comida("Arroz", 0.180);
        Comida comida2 = new Comida("Feijão", 0.300);
        
        Pessoa pessoa1 = new Pessoa("Flavio", 99.8);
        System.out.println(pessoa1.arpesentar());
     
        pessoa1.comer(comida1);
        System.out.println("Após a refeicao:");
        System.out.println(pessoa1.arpesentar());
        
        pessoa1.comer(comida2);
        System.out.println("Após a refeicao:");
        System.out.println(pessoa1.arpesentar());
        
        
        
        Pessoa pessoa2 = new Pessoa("João", 70.);
        System.out.println(pessoa2.arpesentar());
        pessoa2.comer(comida2);
        System.out.println("Após a refeicao:");
        System.out.println(pessoa2.arpesentar());
        
    }
    
}

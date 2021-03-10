package oo.heranca.dasafio;

public class VerificaVelocidade {
    public static void main(String[] args) {
        Civic civic = new Civic(190);
        Ferrari ferrari = new Ferrari(400);

        System.out.println("Velocidade atual Civic >>> " + civic + "Km/h.");
        System.out.println("Velocidade atual Ferrari >>> " + ferrari + "Km/h.");

        civic.acelerar();
        ferrari.acelerar();
        civic.acelerar();
        ferrari.acelerar();
        civic.acelerar();
        ferrari.acelerar();

        civic.acelerar();
        ferrari.acelerar();
        civic.acelerar();
        ferrari.acelerar();
        civic.acelerar();
        ferrari.acelerar();

        civic.acelerar();
        ferrari.acelerar();
        civic.acelerar();
        ferrari.acelerar();
        civic.acelerar();
        ferrari.acelerar();

        civic.acelerar();
        ferrari.acelerar();
        civic.acelerar();
        ferrari.acelerar();
        civic.acelerar();
        ferrari.acelerar();

        // civic.frear();
        // ferrari.frear();
        // civic.frear();
        // ferrari.frear();
        // civic.frear();
        // ferrari.frear();
        // civic.frear();
        // ferrari.frear();
        // civic.frear();
        // ferrari.frear();
        // ferrari.frear();
        // ferrari.frear();
        // ferrari.frear();
        // ferrari.frear();
        
        System.out.println("Velocidade atual Civic >>> " + civic + "Km/h.");
        System.out.println("Velocidade atual Ferrari >>> " + ferrari + "Km/h.");
    }
}

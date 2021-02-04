import java.util.Scanner;

public class DesafioDiasSemana {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe do dia da semana: ");
        String diaSemana = entrada.nextLine();
        
        if (diaSemana.equals("Domingo")) {
            System.out.println(1);
        } else if (diaSemana.equals("Segunda")) {
            System.out.println(2);
        } else if (diaSemana.equals("Terca")) {
            System.out.println(3);
        } else if (diaSemana.equals("Quarta")) {
            System.out.println(4);
        } else if (diaSemana.equals("Quinta")) {
            System.out.println(5);
        } else if (diaSemana.equals("Sexta")) {
            System.out.println(6);
        } else if (diaSemana.equals("Sabado")) {
            System.out.println(7);
        } else {
            System.out.print("Infomrado dia inválido");
        }

        entrada.close();
    }
}

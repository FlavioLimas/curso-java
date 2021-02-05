import java.util.Scanner;

public class DesafioWhile {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int count = 0;
        double nota = 0;
        double total = 0;

        while (nota != -1) {
            System.out.println("Favor informar a nota: ");
            nota = Double.parseDouble(entrada.next());

            if (nota >= 0 && nota <= 10) {

                total += nota;
                count++;

            } else if (nota != -1) {
                System.out.println("Favor infomrar uma nota valida!");
                nota = -1;
            }
        }
        double media = total / count;
        System.out.println("Média = " + media);
        entrada.close();
    }
}

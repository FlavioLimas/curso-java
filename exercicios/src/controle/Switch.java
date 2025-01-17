import java.util.Scanner;

public class Switch {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        
        String conceito = "";
        System.out.print("Informe a nota: ");
        int nota = Integer.parseInt(entrada.next());
        
        switch (nota) {
            case 10:
            case 9:
                conceito = "A";
            break;
            case 8: 
            case 7:
                conceito = "B";
            break;
            case 6:
            case 5:
                conceito = "C";
            break;
            case 4:
            case 3:
                conceito = "D";
            break;
            case 2:
            case 1:
            case 0:
                conceito = "E";
            break;
            default:
            conceito = "não encontrado";
        }
        if (nota >= 0 && nota <=10) {   
            System.out.println("Conceito é : " + conceito + "\nNota: " + nota);
        } else {
            System.out.println("Nora inválida!");
        }
        entrada.close();
    }
}

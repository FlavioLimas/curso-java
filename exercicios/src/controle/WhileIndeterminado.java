import java.util.Scanner;

public class WhileIndeterminado {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        String valor = "";
        
        while(!valor.equalsIgnoreCase("sair")) {
            System.out.println("Informe um texto: ");
            valor = entrada.nextLine();
            System.out.println("Você diz: " + valor);
        }
        entrada.close();
    }
}

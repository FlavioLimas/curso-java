import java.util.Scanner;

public class DesafioWhile {
    
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        double nota = 0;
        double count = 0;
        while (nota != -1) {
            
            
            if (nota >= 0 || nota <= 10) {
                System.out.println("Favor informar a nota: ");
                nota = Double.parseDouble(entrada.next());
                
                count++;
                if (count > 1) {
                    
                    nota =+ nota;
                    System.out.println("A mádia é: " + nota / count); 

                }
                
            } else {
                System.out.println("Favor infomrar uma nota valida!");
                nota = -1;
            }
        }
        entrada.close();
    }
}

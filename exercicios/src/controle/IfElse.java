// package controle;

import javax.swing.JOptionPane;

public class IfElse {
    public static void main(String[] args) {
        
        String valor = JOptionPane.showInputDialog("Informe o número:");

        int numero = Integer.parseInt(valor);

        // Verificando se o numero é par ou impar

        if(numero %2 == 0) {
            System.out.println("Número Par!");
        } else {
            System.out.println("Número Impar!");
        }
    }
}

package fundamentos;

import javax.swing.JOptionPane;

public class DesafioCalcularora {
	
	public static void main(String[] args) {
		
		double n1 = Double.parseDouble(JOptionPane.showInputDialog("Informe o primeiro numero").trim());
		
		String operacao = JOptionPane.showInputDialog("Informe a operação").trim();
		
		double n2 = Double.parseDouble(JOptionPane.showInputDialog("Informe o segundo numero").trim());
		
		if (operacao.equals("+")) {
			double resultado = n1 + n2;
			JOptionPane.showMessageDialog(null,"Resultado da operacao:" + resultado );
		}
		
		if (operacao.equals("-")) {
			double resultado = n1 - n2;
			JOptionPane.showMessageDialog(null, "Resultado da operacao:" + resultado);
		}
		
		if (operacao.equals("*")) {
			 double resultado = n1 * n2; 
			JOptionPane.showMessageDialog(null, "Resultado da operacao:" + resultado);
		}
		
		if (operacao.equals("/")) {
			double resultado = n1 / n2;
			JOptionPane.showMessageDialog(null, "Resultado da operacao:" + resultado);
		}
		
		if (operacao.equals("%")) {
			double resultado = n1 % n2;
			JOptionPane.showMessageDialog(null, "Resultado da operacao:" + resultado);
		}
		
		if (operacao.isEmpty()) {
			JOptionPane.showMessageDialog(null, "Resultado da operacao:" + 0);
		}
	}

}

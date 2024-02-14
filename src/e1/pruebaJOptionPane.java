package e1;

import javax.swing.JOptionPane;

public class pruebaJOptionPane {
	public static void main(String[] args) {
		System.out.println("Datos: " + JOptionPane.showInputDialog("ingresar dato"));
		try {
			int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingresar Número"));
			System.out.println(numero);
		} catch (NumberFormatException e) {
			
			
		}
		
		
		
	}

}

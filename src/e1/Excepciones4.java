package e1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Excepciones4 {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);

		int num1 = 0, num2 = 0;

		System.out.println("Ingresa el numerador: ");
		try {
			num1 = leer.nextInt();

			System.out.println("Ingresa el denominador: ");
			num2 = leer.nextInt();
			System.out.println(num1 + " / " + num2 + " = " + dividir(num1, num2));
		} catch (InputMismatchException e) {
			System.out.println("Debes introducir un número");
			System.out.println("Mensaje: " + e.getMessage().toString());
			System.out.println("Error de tipo: " + e.getClass().toString());
			
		} catch (ArithmeticException e) {
				System.out.println("Division por 0");
				System.out.println("Mensaje: " + e.getMessage().toString());
				System.out.println("Error de tipo: " + e.getClass().toString());
		}finally {
			System.out.println("Esta linea se va ejecutar siempre.");
			leer.close();
		}

//		try {
//			System.out.println(num1 + " / " + num2 + " = " + dividir(num1, num2));
//		} catch (ArithmeticException e) {
//			System.out.println("DIVISION POR 0");
//		}

	}

	static double dividir(int num1, int num2) throws ArithmeticException {
//		try {
//			return (num1 / num2);
//		} catch (ArithmeticException e) {
//			System.out.println("Division por 0");
//			return 0;
//		}
//		
		return (num1 / num2);
	}

}

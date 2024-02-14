package e1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Excepciones2 {
	public static void main(String[] args) {

		System.out.println("Opciones:\n1. Introducir datos: \n2. Salir ");
		Scanner leer = new Scanner(System.in);

		int opciones = leer.nextInt();
		if (opciones == 1) {
			try {
				pedirDatos();
			} catch (Exception e) {
				System.out.println("Debes ingresas un número");
			}

		} else {
			System.out.println("Adiós");
			System.exit(0);
		}
	}

	static void pedirDatos() throws InputMismatchException {
//		try {

		Scanner leer = new Scanner(System.in);
		System.out.println("Nombre: ");
		String nombre = leer.nextLine();
		System.out.println("Edad: ");
		int edad = leer.nextInt();
		System.out.println("Hola " + nombre + " tienes " + edad + " años");
//		} catch (InputMismatchException e) {
//			System.out.println("Debes ingresas un número");
//			
//		}
		System.out.println("FIN");
	}

}

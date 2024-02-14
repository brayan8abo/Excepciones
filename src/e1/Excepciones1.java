package e1;

import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

import javax.imageio.ImageIO;

public class Excepciones1 {
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);

		int edad;
		boolean correcto = false;
		do {

			System.out.println("Ingresa tu edad");
			try {

				edad = leer.nextInt();// dentro del try catch puedo recoger datos,cuando me saca una excepcion, es
										// decir deberiamos entrar en un bucle hasta que me meta un dato del tipo qu
										// estamos pidiendo
				correcto = true;
			} catch (InputMismatchException e) { // la e significa un objeto llamado excepcion
				System.out.println("Error en la entrada de datos");
				leer.nextLine(); // si no limpio el buffer se queda en un bucle infinito gdgdgdgdg
				correcto = false;

			}

		} while (!correcto);
		
		System.out.println("Fin");
		
		Image imagen;
		
		try {
			imagen = ImageIO.read(new File("C:\\dir\\imagen.bmp")); // con ruta absoluta puedo ver files
		} catch (IOException e) {
			System.out.println("Imagen no encontrada");
	
			e.printStackTrace();
		}

	}
}

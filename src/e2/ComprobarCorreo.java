package e2;

import java.io.IOException;

import javax.swing.JOptionPane;

public class ComprobarCorreo {
	public static void main(String[] args) {

		String correo = JOptionPane.showInputDialog("Introducir Correo");

		try {
			checkMail(correo);
		} catch (LongitudCorreoErroneaException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	static void checkMail(String correo) throws LongitudCorreoErroneaException {
		int arroba = 0;
		boolean punto = false;

		if (correo.length() <= 3) {
//			IOException miExcepcion = new IOException();
//			throw miExcepcion;
			throw new LongitudCorreoErroneaException("[Longitud del correo erronea], MENSAJE COMO PARAMETRO DEL CONSTRUCTOR" );

		}

		for (int i = 0; i < correo.length(); i++) {
			if (correo.charAt(i) == '@') {
				arroba++;

			}
			if (correo.charAt(i) == '.') {
				punto = true;

			}

		}
		if (arroba == 1 && punto == true) {
			System.out.println("Correo-e " + correo + " Correcto");

		} else {
			System.out.println("Correo-e " + correo + " incorrecto");
			throw new LongitudCorreoErroneaException("Revisa el @ y el punto MENSAJE COMO PARAMETRO DEL CONSTRUCTO");
		}

	}

}

class LongitudCorreoErroneaException extends RuntimeException {

	public LongitudCorreoErroneaException() {

	}

	public LongitudCorreoErroneaException(String mensaje) {
		super(mensaje);

	}

}

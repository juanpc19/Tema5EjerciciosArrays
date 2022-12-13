package ejercicios;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {

		int tabla [] = new int [8];
		
		int numeroIntroducido;
		
		Scanner dogma = new Scanner (System.in);
		
		for (int i=0; i<tabla.length; i++) {
			System.out.println("Introduzca un numero: ");
			numeroIntroducido = dogma.nextInt();
			tabla[i]=numeroIntroducido;
		}
		
		
		for (int i=tabla.length-1; i>=0; i--) {
			System.out.println(tabla[i]);
		
		}
		
		dogma.close();

	}

}

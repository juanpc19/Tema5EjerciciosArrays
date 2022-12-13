package ejercicios;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		
		int tabla [] = new int  [8];
		
		int numeroIntroducido;
		
		Scanner dogma = new Scanner (System.in);
		
		for (int i=0; i<tabla.length; i++) {
			System.out.println("Introduzca un numero: ");
			numeroIntroducido = dogma.nextInt();
			tabla[i]=numeroIntroducido;
		}
		
		for (int auxiliar : tabla) {
			boolean esPar=false;
			if (auxiliar%2==0) {
				esPar=true;
			}
			
			System.out.println(esPar ? auxiliar + " Es par." : auxiliar + " Es impar.");
		}

		dogma.close();
	}

}

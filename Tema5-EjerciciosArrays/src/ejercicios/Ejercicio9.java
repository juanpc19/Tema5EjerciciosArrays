package ejercicios;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		
		String meses [] = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
		
		int temperaturas [] = new int [20];
		
		Scanner dogma = new Scanner (System.in);
		
		System.out.println("Introduzca la temperatura de los 12 meses empezando por enero: ");
		
		for (int i=temperaturas[0]; i<meses.length; i++) {
			int temperaturaIntroducida = dogma.nextInt();
			temperaturas[i]=temperaturaIntroducida;
		}
		
		//hacer 9print cojn for +each con los dos arrays combinados 
			dogma.close();

	}

}

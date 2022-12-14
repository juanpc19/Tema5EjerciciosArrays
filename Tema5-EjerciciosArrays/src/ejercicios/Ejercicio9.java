package ejercicios;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		
		//Creo array tipo String meses con tanta longitud como meses del año introducidos manualmente
		String meses [] = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
		
		//Creo array tipo int cuya longitud es igual a la longitud del array meses lo cual sera de utilidad en los bucles
		int temperaturas [] = new int [meses.length];
		
		//Creo Scanner, lo nombro dogma y lo importo
		Scanner dogma = new Scanner (System.in);
		
		//Solicito al usuario las temperaturas para los meses
		System.out.println("Introduzca la temperatura de los 12 meses empezando por enero: ");
		
		//Creo bucle que recorrera la longitud del array meses (12) y hara tantas iteraciones como longitud tenga
		for (int i=0; i<meses.length; i++) {
			//En cada iteracion doy valor a la siguiente posicion del array temperaturas
			temperaturas[i] = dogma.nextInt();
		}
		
		//Creo bucle que recorrera la longitud del array temperaturas (12) y hara tantas iteraciones como longitud tenga 
		for (int i=0; i<temperaturas.length; i++) {
			//Hago print de valor de posicion de array meses que indique i en la iteracion actual + dos puntos 
			System.out.print(meses[i] + ": ");
			
			//Creo bucle que seguira haciendo iteraciones mientras el valor de la posicion 
			//de temperaturas (indicada por el bucle principal) sea diferente de 0
			while (temperaturas[i]!=0) {
				//Hago print de asterisco cada iteracion
				System.out.print("*");
				//Y resto 1 al valor almacenado en la posicion
				temperaturas[i]--;
			}
			//Hago print de salto de linea al final de iteracion del bucle principal
			System.out.println();
			//Y paso a repetir el proceso con la siguiente posicion del array meses en la siguiente iteracion del bucle principal
		}
			//Cierro escaner
			dogma.close();
	}

}

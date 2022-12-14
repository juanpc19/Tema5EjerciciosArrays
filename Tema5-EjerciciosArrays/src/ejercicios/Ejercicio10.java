package ejercicios;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {

		int numeros [] = new int [100];
		
		int numeroUsuario;
		
		Scanner dogma = new Scanner(System.in);
		
		for (int i=0; i<numeros.length; i++ ) {
		numeros[i]=(int) (Math.random()*10+1);
		System.out.println(numeros[i]);
		}
		
		System.out.println("Introduzca un numero entero:");
		
		numeroUsuario = dogma.nextInt();
		
		for (int i=0; i<numeros.length; i++) {
			if (numeros[i]==numeroUsuario) {
				System.out.println(i);
			}
		}
		
		dogma.close();
		
	}

}

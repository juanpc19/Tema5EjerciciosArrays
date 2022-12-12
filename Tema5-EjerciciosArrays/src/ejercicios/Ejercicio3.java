package ejercicios;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {

		double tablaDecimales[] = new double [5];
		
		double numeroIntroducido;
		
		Scanner dogma= new Scanner(System.in);
		
		for (int i=0; i<tablaDecimales.length; i++) {
			System.out.println("Introduzca un numero decimal: ");
			numeroIntroducido=dogma.nextDouble();
			tablaDecimales[i]=numeroIntroducido;
		}

		for (double auxiliar : tablaDecimales) {
			System.out.println(auxiliar);
		}
	
		dogma.close();
		
	}

}

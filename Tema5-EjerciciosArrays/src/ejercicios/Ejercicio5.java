package ejercicios;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {

		double tablaReales[] = new double [10];
		
		double numeroIntroducido;
		
		Scanner dogma = new Scanner(System.in);
		
		for (int i=0; i<tablaReales.length; i++) {
			System.out.println("Introduzca un numero decimal: ");
			numeroIntroducido=dogma.nextDouble();
			tablaReales[i]=numeroIntroducido;
		}

		//Como array esta creado al dar a maximo valor posicion 0 en array este valor es 0
		double maximo = tablaReales[0];
		
		//Como array esta creado al dar a minimo valor posicion 0 en array este valor es 0
		double minimo = tablaReales[0];
		
		for (double auxiliar : tablaReales) {
			
			if (auxiliar>maximo) {
				maximo=auxiliar;
			}
			
			if (auxiliar<minimo) {
				minimo=auxiliar;
			}
			
		}
		
		System.out.println("Numero maximo: " + maximo + " Numero minimo: " + minimo);
		
		dogma.close();
	}

}

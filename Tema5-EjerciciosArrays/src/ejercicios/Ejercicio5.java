package ejercicios;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {

		double tablaReales[] = new double [10];
		
		double numeroIntroducido;
		
		double maximo = tablaReales[0];
		
		double minimo = tablaReales[0];
		
		Scanner dogma = new Scanner(System.in);
		
		for (int i=0; i<tablaReales.length; i++) {
			System.out.println("Introduzca un numero entero: ");
			numeroIntroducido=dogma.nextInt();
			tablaReales[i]=numeroIntroducido;
		}

		for (double auxiliar : tablaReales) {
			
		
			if (auxiliar>maximo) {
				maximo=auxiliar;
			}
			
			if (auxiliar<minimo) {
				minimo=auxiliar;
			}
			
		}
		
		System.out.println(maximo);
		
		dogma.close();
	}

}

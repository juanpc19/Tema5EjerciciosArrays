package ejercicios;

public class Ejercicio8 {

	public static void main(String[] args) {
		
		int numeros []= new int [20];
		
		int cuadrados []= new int [20];
		
		int cubos []= new int [20];
		
	//	int numeroRandom = (int) (Math.random()*100);

		for (int i=0; i<numeros.length; i++) {
			numeros[i]=(int) (Math.random()*100+1);
			System.out.println(numeros[i]);
		}
		
		System.out.println("....................................................................");
		
		for (int i=0; i<cuadrados.length; i++) {
			
			cuadrados[i]= (int) Math.pow(numeros[i],2);
		
			System.out.println(cuadrados[i]);
		}
		
		System.out.println("....................................................................");
		
		for (int i=0; i<cubos.length; i++) {
			
			cubos[i]= (int) (Math.pow(numeros[i],2)*numeros[i]);
		
			System.out.println(cubos[i]);
			
			//Asi o un cuarto bucle for fuera de los demas? para hacer prints en columnas de numeros [i] cuadrados [i] y cubos [i]
		}
		
	}

}

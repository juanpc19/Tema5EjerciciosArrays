package ejercicios;

public class Ejercicio4 {

	public static void main(String[] args) {
		
		int num[] = new int [12];
		
		num [0]=39;
		
		num [1]=-2;
		
		num [4]=0;
		
		num [6]=14;
		
		num [8]=5;
		
		num [9]=120;
		
		for (int auxiliar : num) {
			System.out.println(auxiliar);
		}
	
		//Los valores no modificados muestran 0 porque han sido inicializados a 0 en la creacion del array
	}

}

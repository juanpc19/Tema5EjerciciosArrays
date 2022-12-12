package ejercicios;

public class Ejercicio2 {

	public static void main(String[] args) {
		
	int tablaEnteros[] = new int [10];
		
	int sumaTotal=0;
	
		for (int i=0; i<tablaEnteros.length; i++) {
			tablaEnteros[i]=(int) (Math.random()*100+1);
		}
		
		for (int auxiliar : tablaEnteros) {
			sumaTotal+=auxiliar;
		}
		
		System.out.println(sumaTotal);
		
	}

}

package ejercicios;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		int tablaEnteros[] = new int [10];
		
		for (int i=0; i<tablaEnteros.length; i++) {
			tablaEnteros[i]=(int) (Math.random()*100+1);
			System.out.println(tablaEnteros[i]);
		}

	}

}

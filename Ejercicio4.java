package actividades_desarrollo_interfaces;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int array[] = new int[10];
		
		System.out.println("Introduce numero positivo o negativo entero");
		
		int numero;
		
		int positivo = 0;
		
		int numero_positivos = 0;
		
		int negativo = 0;
		
		int numero_negativos = 0;
		
		int media_positivos = 0;
		
		int media_negativos = 0;
		
		for (int i = 0; i < array.length; i++) {
			
			numero = Integer.parseInt(sc.nextLine());
			
			array[i] = numero;
			
			if(array[i] > 0) {
				
				numero_positivos++;
				
				positivo += array[i];
				
			}
			
			else if(array[i] < 0) {
				
				numero_negativos++;
				
				negativo += array[i];
				
			}
				
			
		}
		
		
		if(numero_positivos > 0) {
			
			media_positivos = positivo / numero_positivos;
			
		}
		
		if(numero_negativos > 0) {
			
			media_negativos = negativo / numero_negativos;
			
		}
		
		sc.close();
		
		System.out.println("la media de positivos es : " + media_positivos + " y la media de negativos es : " + media_negativos);
		
	}

}

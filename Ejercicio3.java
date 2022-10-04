package actividades_desarrollo_interfaces;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce el mes");
		
		int mes = Integer.parseInt(sc.nextLine());
		
		if(mes >= 1 && mes <= 12) {
			
			if(mes == 1) {
				
				System.out.println("Es enero y tiene 31 dias");
				
			}
			
			else if(mes == 2) {
				
				System.out.println("Es febrero y tiene 28 dias");
				
			}
			
			else if(mes == 3) {
				
				System.out.println("Es marzo y tiene 31 dias");
				
			}
			
			else if(mes == 4) {
				
				System.out.println("Es abril y tiene 30 dias");
				
			}
			
			else if(mes == 5) {
				
				System.out.println("Es mayo y tiene 31 dias");
				
			}
			
			else if(mes == 6) {
				
				System.out.println("Es junio y tiene 30 dias");
				
			}
			

			else if(mes == 7) {
				
				System.out.println("Es julio y tiene 31 dias");
				
			}
			
			else if(mes == 8) {
				
				System.out.println("Es Agosto y tiene 31 dias");
				
			}
			
			else if(mes == 9) {
				
				System.out.println("Es Septiembre y tiene 30 dias");
				
			}
			
			else if(mes == 10) {
				
				System.out.println("Es Octubre y tiene 31 dias");
				
			}
			
			else if(mes == 11) {
				
				System.out.println("Es Noviembre y tiene 30 dias");
				
			}
			
			else  {
				
				System.out.println("Es Diciembre y tiene 31 dias");
				
			}
			
		}
		
	}

}

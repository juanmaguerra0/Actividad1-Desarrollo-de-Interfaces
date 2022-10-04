package actividades_desarrollo_interfaces;

public class Ejercicio1 {

	public static void main(String[] args) {

		int a = 4;
		
		int b = 5;
		
		int c = 6;
		
		int d = 9;
		
		System.out.println(a + " " + b + " " + c + " " + d);
		
		b = c;
		
		c = a;
		
		a = d;
		
		d = b;
		
		System.out.println(a + " " + b + " " + c + " " + d);
		
	}

}

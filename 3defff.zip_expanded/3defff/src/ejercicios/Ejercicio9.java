package ejercicios;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		
		int cifras=0;
		int num;
		int decimas = 1;

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduzca un número mayor que cero: ");
		num = sc.nextInt();
		
		if(num<0) {
			
			System.out.println("Lo siento, el número tiene que ser mayor que cero.");
		
		}else{
			
			for (int div = num/decimas; div>=1;div = num/decimas)	{
				
				cifras++;
				decimas *=10;
			
		}
			
		System.out.println("El número tiene " + cifras + " dígitos.");
		
		sc.close();
}
}
}
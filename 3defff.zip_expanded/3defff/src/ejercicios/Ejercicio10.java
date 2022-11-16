package ejercicios;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		
		int numero;
		int num;
		int aux=0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca un número para saber si es capicúa.");
		numero=sc.nextInt();
		num=numero;
		while(num!=0) {
			
			int cifra = num % 10;
			aux = aux*10 + cifra;
			num=num/10;
			
		}
		
		if(numero==aux) {
			System.out.println("Es número capicúo");
		}else {
			System.out.println("No es número capicúo");
		}
		sc.close();
	}
}



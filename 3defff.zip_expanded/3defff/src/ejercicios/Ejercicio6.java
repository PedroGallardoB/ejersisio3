package ejercicios;

import java.util.Scanner;

public class Ejercicio6 {
public static void main(String[] args) {
	
	int num;
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Introduzca un número del 1 al 20.");
	System.out.println("Escribirás desde el 1 todos los anteriores hasta él tantas veces como indique su valor");
	num=sc.nextInt();
	
	if (num>0 && num<20) {
		for (int aux = 1; aux<=num ;aux++) {
			
			System.out.println();
			
			for (int aux2 = 1; aux2<=aux ;aux2++) {
				System.out.print(aux);
			}
		}
	}

	sc.close();
}
}

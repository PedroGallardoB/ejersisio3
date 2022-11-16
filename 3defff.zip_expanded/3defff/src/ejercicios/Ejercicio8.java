package ejercicios;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {

		int fallo=0;
		int total=0;
		int num;
		int old;

		Scanner sc = new Scanner(System.in);

		System.out.print("Introduzca un número inicial:");
		num = sc.nextInt();
		total++;

		while (num != 0) {

				old = num;
				
				System.out.print("Introduzca un número: ");
				num = sc.nextInt();
				total++;
				
				if (num == 0) {
					
					total--;
					System.out.println("Fallos : " + fallo + ", Total de números: " + total);
					
				}
				if (num<old) {
					System.out.println("Fallo, es menor.");
					fallo++;
				}
				
				
			}
		
		sc.close();
		}
}
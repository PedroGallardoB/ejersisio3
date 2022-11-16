package ejercicios;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int altura;
		System.out.print("Introduzca la altura del triángulo: ");
		altura = sc.nextInt();
		System.out.println();

		for (int salto = 1; salto <= altura; salto++) {
			
			int espacio = altura - salto;

			for (int pintar = 1; pintar <= espacio; pintar++) {

				System.out.print(" ");

			}

			for (int aux = 1; aux <= salto; aux++) {
				System.out.print("* ");

			}

			System.out.println();
			
		}
		
		sc.close();

	}
}

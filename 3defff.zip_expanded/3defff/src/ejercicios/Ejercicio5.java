package ejercicios;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {

		int num1;
		int num2;
		int mcm = 0;
		int mayor;
		int menor;
		int contador;

		Scanner sc = new Scanner(System.in);

		System.out.print("Calcular mínimo común múltiplo, introduzca el primer número: ");
		num1 = sc.nextInt();
		
		System.out.print("Introduzca el segundo número: ");
		num2 = sc.nextInt();

		if (num1 == num2) {

			mcm = num1;

		} else {
			mayor = num1 > num2 ? num1 : num2;
			menor = num1 < num2 ? num1 : num2;
			contador = mayor-1;

			while (mcm != contador) {

				contador++;
				if (contador % mayor == 0 && 0 == contador % menor)
					mcm = contador;

			}

		}
		System.out.println("El mínimo común multiplo es " + mcm);
		sc.close();

	}
}

package ejercicios;

import java.util.Scanner;

public class Ejercicio2 {
	public static void main(String[] args) {

		int num; // Número introducido
		int contador = 0;
		boolean primo;
		Scanner sc = new Scanner(System.in); // Llamamos al escáner

		// Pedimos al usuario el número

		System.out.println("Introduzca un número para cuantos primos hay hasta él."); // Pedimos
		num = sc.nextInt(); // Leemos

		// Comprobamos que el número introducido es positivo
		if (num > 0) {
			// Recorremos los números desde 2 hasta número-1

			for (int aux = 2; aux <= num; aux++) {
				// Si el número es divisible por i deja de ser primo
				
				primo = true;

				for (int aux2 = 2; aux > aux2; aux2++) {
					// Si el número es divisible por i deja de ser primo
					if (aux % aux2 == 0) {
						primo = false;
						break;
					}
				}
				
				if (primo) {
					
					contador++;
				}
			}
				System.out.println(contador);
				sc.close();

			
		}

	}
}
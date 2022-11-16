package ejercicios;

import java.util.Scanner; //Importamos el escáner

public class Ejercicio1 {
	public static void main(String[] args) {

		/*
		 
		 */

		int hor; // La variable guarda los segundos
		int min; // La variable guarda los minutos
		int seg; // La variable guarda las horas
		int aumentar;// La variable guarda los segundos que aumentaremos

		Scanner sc = new Scanner(System.in); // Llamamos al escáner

		// Pedimos al usuario las horas minutos y segundos

		System.out.println("Introduzca las horas"); // Pedimos
		hor = sc.nextInt(); // Leemos

		System.out.println("Introduzca los minutos"); // Pedimos
		min = sc.nextInt(); // Leemos

		System.out.println("Introduzca los segundos"); // Pedimos
		seg = sc.nextInt(); // Leemos

		// Pedimos al usuario los segundos a aumentar
		System.out.println("Introduzca los segundos que quiera aumentar"); // Pedimos
		aumentar = sc.nextInt(); // Leemos

		if (seg > 60 || min > 60 || hor > 24 || seg < 0 || min < 0 || hor < 0) {
			System.out.println("Los valores introducidos son incorrectos");
		} else {

			seg += aumentar; // Hacemos que se sumen los segundos a los que introduzca el usuario

			// Hacemos las correspondientes conversiones

			while (seg > 59) { // Hacer solo mientras seg sea mayor o igual a 60

				seg = seg - 60; // Restamos 60s
				min++;// Se suma un minuto

				if (min > 59) { // Hacer solo mientras min sea mayor o igual a 60

					min = min - 60; // Restamos 60m
					hor++; // Se suma una hora a hora
				}

				if (hor > 23) { // Hacer solo mientras hor sea mayor o igual a 24

					hor -= 24;
				}

			}

			// Nos aseguramos de que los rangos sean los correctos

			// Mostramos el resultado
			System.out.println("Son las " + hor + ":" + min + ":" + seg);
		}

		sc.close();// Cerramos el escáner

	}
}
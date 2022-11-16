package ejercicios;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {

			int num;
			Scanner sc = new Scanner(System.in);
			
			System.out.print("Introduzca un número: ");
			
			num=sc.nextInt();
			
			if (num>0 && num<20) {
				for (int aux = 1; aux<=num ;aux++) {
					
					System.out.println();
					
					for (int aux2 = 1; aux2<=aux ;aux2++) {
						System.out.print(aux2);
					}
				
					for (int aux3 = aux-1; aux3>=1 ;aux3--) {
						System.out.print(aux3);
					}
				}
			}

			sc.close();
		}
		}


		


package src;

import java.util.Scanner;

public class ExFor2 {
	
	/*Escreva um programa que lê um número inteiro N e depois lê N números inteiros.
	 *  O programa deve então imprimir a média dos números lidos.
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int total = 0;
		

		for (int i = 0; i < 2; i++){

			if (i <= 2) {

				System.out.println("digite um numero");
				int n = sc.nextInt();

				total += n;

			}

		}
		double finalDouble = total;
		finalDouble = finalDouble / 2;
		
		
		System.out.println("Media final "+finalDouble);
		sc.close();
	}

	
	}



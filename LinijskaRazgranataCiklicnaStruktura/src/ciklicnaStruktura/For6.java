package ciklicnaStruktura;

import java.util.Scanner;

public class For6 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Unesite broj n: ");
		int n = sc.nextInt();
		sc.close();

		int faktorijel = 1;
		for (int i = n; i >= 1; i--) {
			faktorijel *= i;
		}
		System.out.println("Faktorijel broja " + n + " je " + faktorijel);
	}

}

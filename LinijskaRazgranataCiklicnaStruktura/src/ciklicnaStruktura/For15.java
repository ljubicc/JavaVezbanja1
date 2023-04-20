package ciklicnaStruktura;

import java.util.Scanner;

public class For15 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int negativni = 0;
		int nula = 0;
		int pozitivni = 0;

		for (int i = 1; i <= 10; i++) {
			System.out.println("Unesite " + i + ". broj: ");
			int broj = sc.nextInt();
			if (broj < 0) {
				negativni++;
			} else if (broj == 0) {
				nula++;
			} else {
				pozitivni++;
			}

		}
		System.out.println(
				"Od unetih brojeva ima\nnegativnih: " + negativni + "\nnula: " + nula + "\npozitivnih: " + pozitivni);
		sc.close();
	}

}

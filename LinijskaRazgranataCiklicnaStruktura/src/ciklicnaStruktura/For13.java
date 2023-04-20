package ciklicnaStruktura;

import java.util.Scanner;
import java.text.DecimalFormat;

public class For13 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.##");
		
		System.out.println("Koliko brojeva zelite da unesete? ");
		int brojevi = sc.nextInt();

		int brojac = 0;
		int suma = 0;

		for (int i = 1; i <= brojevi; i++) {
			System.out.print("Unesite " + i + ". broj: ");
			suma += sc.nextInt();
			brojac++;
		}
		System.out.println("Aritmeticka sredina unetih brojeva je: " + df.format((double)suma / brojac));

		sc.close();
	}

}

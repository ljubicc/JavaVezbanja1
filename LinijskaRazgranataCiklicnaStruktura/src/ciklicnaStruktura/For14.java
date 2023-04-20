package ciklicnaStruktura;

import java.util.Scanner;

public class For14 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Unesite prvi broj: ");
		int prviBroj = sc.nextInt();
		System.out.println("Unesite poslednji broj: ");
		int poslednjiBroj = sc.nextInt();
		sc.close();

		int suma = 0;
		int brojParnih = 0;

		for (int i = prviBroj; i <= poslednjiBroj; i++) {
			if (i % 2 == 0) {
				suma += i;
				brojParnih++;
			}
		}
		System.out.println("Aritmeticka sredina parnih brojeva u datom opsegu iznosi " + suma / brojParnih);
	}

}

package ciklicnaStruktura;

import java.io.*;

public class Zadatak8 {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Unesite broj: ");
		int broj = Integer.parseInt(br.readLine());
		
		int i = broj;
		int max = 0;
		int cifra;
		while (broj != 0) {
			cifra = broj % 10;
			if (cifra > max)
				max = cifra;
			broj /= 10;
		}
		System.out.println("Najveca cifra unetog broja " + i + " je cifra " + max);
	}

}

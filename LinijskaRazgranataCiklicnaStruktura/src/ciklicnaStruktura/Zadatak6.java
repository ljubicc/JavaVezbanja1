package ciklicnaStruktura;

import java.io.*;

public class Zadatak6 {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Unesite broj: ");
		int broj = Integer.parseInt(br.readLine());
		
		if (broj == 0) {
			System.out.println("Ukupan broj cifara je 1");
		} else {
			int brojac = 0;
			while (broj != 0) {
				broj /= 10;
				brojac++;
			}
			System.out.println("Ukupan broj cifara je " + brojac);
		}
	}

}

package linijskaStruktura;

import java.util.Scanner;

public class Primer14 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Unesite dvocifreni broj: ");
		int broj = input.nextInt();
		
		int j = broj % 10;
		int d = broj / 10;
		
		System.out.println(broj + " cifra jedinica = " + j + " cifra desetica = " + d);
		
		input.close();
	}

}

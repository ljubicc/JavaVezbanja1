package ciklicnaStruktura;

import java.util.Scanner;

public class For10 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Unesite pocetnu vrednost: ");
		int pocetak = sc.nextInt();
		System.out.println("Unesite krajnju vrednost: ");
		int kraj = sc.nextInt();
		
		sc.close();
		
		for(int i = pocetak; i <= kraj; i++) {
			if(i % 3 == 0) {
				System.out.println(i);
			}
		}
				
	}

}

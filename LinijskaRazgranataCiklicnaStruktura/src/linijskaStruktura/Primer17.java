package linijskaStruktura;

import java.util.Scanner;

public class Primer17 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Unesite trocifreni broj: ");
		int broj = sc.nextInt();
		
		int j = broj % 10;
		int d = (broj / 10) % 10;
		int s = broj / 100;
		
		System.out.println("Broj " + broj + "\nCifra stotina = " + s + "\nCifra desetica = " + d + "\nCifra jedinica = "  + j);
		
		sc.close();
		

	}

}

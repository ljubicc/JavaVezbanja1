package linijskaStruktura;

import java.util.Scanner;

public class Primer10 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Unesite ugao u radijanima: ");
		double r = sc.nextDouble();
		
		System.out.println("Sinus ugla u radijanima : " + Math.sin(r));
		System.out.println("Kosinus ugla u radijanima: " + Math.cos(r));
		
		sc.close();
	}

}

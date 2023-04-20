package linijskaStruktura;

import java.util.Scanner;

public class Primer13 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Unesite koordinate tacke M:");
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		System.out.println("Unesite koordinate tacke N: ");
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		
		double d = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
		System.out.println("Rastojanje : " + d);
		input.close();
	}

}

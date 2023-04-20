package linijskaStruktura;

import java.util.Scanner;

public class Primer12 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		
		System.out.println("Unesite koordinate tacke M:");
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		System.out.println("Unesite koordinate tacke N: ");
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		
		double m = Math.sqrt(Math.pow(x1, 2) + Math.pow(y1, 2));
		double n = Math.sqrt(Math.pow(x2, 2) + Math.pow(y2,2));
		
		System.out.println("Rastojanje tacke M od koor.poc. je " + m);
		System.out.println("Rastojanje tacke N od koor.poc. je " + n);
				
		input.close();
	}

}

package linijskaStruktura;

import java.util.Scanner;

public class Primer15 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Unesite dvocifreni broj: ");
		int broj = input.nextInt();
		
		int j = broj % 10;
		int d = broj / 10;
		int r = d - j;
		
		System.out.println("Dvocifreni broj : " + broj + "\nRazlika cifara : " + r);
		 
		input.close();
		
	}

}

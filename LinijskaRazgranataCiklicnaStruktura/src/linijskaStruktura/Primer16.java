package linijskaStruktura;

import java.util.Scanner;

public class Primer16 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Unesite sekunde: ");
		int s = input.nextInt();
		
		int h = s / 3600;
		int m = (s % 3600) / 60;
		int sec = s % 60;
		
		System.out.println(s + " sekundi = " + h + " sati " + m + " minuta " + sec + " sekundi");
		
		input.close();
		

	}

}

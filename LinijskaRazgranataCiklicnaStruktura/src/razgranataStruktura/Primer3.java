package razgranataStruktura;

import java.util.Scanner;


public class Primer3 {

	public static void main(String[] args) {
				
		Scanner sc = new Scanner(System.in);
		int a, b, y;
		System.out.println("Unesite vrednosti a i b: ");
		a = sc.nextInt();
		b = sc.nextInt();
		
		if(a >= 0)
			y = Math.min(a, b);
		else
			y = 2 * Math.min(a, b);
		
		System.out.println("Za a = " + a + " i b = " + b + " y = " + y);
		sc.close();
	}

}

package razgranataStruktura;

import java.util.Scanner;

public class Primer19 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Unesite vrednosti q, r, i s:");
		int q = sc.nextInt();
		int r = sc.nextInt();
		int s = sc.nextInt();
		
		int y = Math.min(q,  Math.max(r, s));
		
		System.out.println("y = " + y);
		sc.close();

	}

}

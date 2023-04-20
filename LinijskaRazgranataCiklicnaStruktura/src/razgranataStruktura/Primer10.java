package razgranataStruktura;

import java.util.Scanner;

public class Primer10 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Unesite vrednosti a, b i c: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int max = a;
		if(b > max)
			max = b;
		if(c > max)
			max = c;
		
		System.out.println("Max = " + max);
		sc.close();
	}

}

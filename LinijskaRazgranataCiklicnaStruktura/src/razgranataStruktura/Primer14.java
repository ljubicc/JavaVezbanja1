package razgranataStruktura;

import java.util.Scanner;

public class Primer14 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Unesite trocifreni broj:");
		int broj = sc.nextInt();
		
		int j = broj % 10;
		int d = (broj / 10) % 10;
		int s = broj / 100;
		
		
		if(j > d) {
			int temp = d;
			d = j;
			j = temp;
		}
		if(j > s) {
			int temp = s;
			s = j;
			j = temp;
		}
		if(d > s) {
			int temp = s;
			s = d;
			d = temp;
		}
		
		int noviBroj = s * 100 + d * 10 + j;
		System.out.println(noviBroj);
		
		sc.close();	

	}

}

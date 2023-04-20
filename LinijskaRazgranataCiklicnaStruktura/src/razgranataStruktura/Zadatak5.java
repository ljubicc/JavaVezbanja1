package razgranataStruktura;

import java.util.Scanner;

public class Zadatak5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Unesite godinu:");
		int godina = sc.nextInt();
		
		boolean prestupna = (godina % 4 == 0 && godina % 100 != 0) || (godina % 400 == 0) ? true : false;
		System.out.println("Uneta godina " + godina + " je prestupna: " + prestupna);
		sc.close();
		
		

	}

}

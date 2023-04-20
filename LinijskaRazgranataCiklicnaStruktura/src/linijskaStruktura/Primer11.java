package linijskaStruktura;

import java.util.Scanner;

public class Primer11 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Unesite velicinu u kilobajtima: ");
		int kb = sc.nextInt();

		System.out.println("Velicina " + kb + " kilobajta = " + (kb * 1024) + " bajta");

		sc.close();
	}

}

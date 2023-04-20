package razgranataStruktura;

import java.util.Scanner;

public class Zadatak7 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Unesite tri prirodna broja od 1 do 365:");
		int k1 = sc.nextInt();
		int k2 = sc.nextInt();
		int k3 = sc.nextInt();
		sc.close();
		
		if(k1 % 7 == 0 && k2 % 7 == 0 && k3 % 7 == 0) {
			System.out.println("Oznacavaju iste dane u godini.");
		}
		else if(k1 % 7 == 1 && k2 % 7 == 1 && k3 % 7 == 1) {
			System.out.println("Oznacavaju iste dane u godini.");
		}
		else if(k1 % 7 == 2 && k2 % 7 == 2 && k3 % 7 == 2) {
			System.out.println("Oznacavaju iste dane u godini.");
		}
		else if(k1 % 7 == 3 && k2 % 7 == 3 && k3 % 7 == 3) {
			System.out.println("Oznacavaju iste dane u godini.");
		}
		else if(k1 % 7 == 4 && k2 % 7 == 4 && k3 % 7 == 4) {
			System.out.println("Oznacavaju iste dane u godini.");
		}
		else if(k1 % 7 == 5 && k2 % 7 == 5 && k3 % 7 == 5) {
			System.out.println("Oznacavaju iste dane u godini.");
		}
		else if(k1 % 7 == 6 && k2 % 7 == 6 && k3 % 7 == 6) {
			System.out.println("Oznacavaju iste dane u godini.");
		}
		else if(k1 % 7 == 7 && k2 % 7 == 7 && k3 % 7 == 7) {
			System.out.println("Oznacavaju iste dane u godini.");
		}
		else {
			System.out.println("Nisu isti dani u nedelji.");
		}
		
	}

}

package razgranataStruktura;

import java.util.Scanner;


public class Zadatak33 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite karakter:");
		char znak = sc.next().charAt(0);
		sc.close();
		
		if(znak >= 'A' && znak <= 'Z' || znak >= 'a' && znak <= 'z') {
		switch(znak) {
		case 'a' :
		case 'A' :
		case 'e' :
		case 'E' :
		case 'i' :
		case 'I' :
		case 'o' :
		case 'O' :
		case 'u' :
		case 'U' :
			System.out.println("samoglasnik");
			break;			
		default :
			System.out.println("suglasnik");
		}
		}
		else {
			System.out.println("Specijalni znaci i brojevi nisu slova!");
		}

	}

}

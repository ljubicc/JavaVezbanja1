package razgranataStruktura;

import java.util.Scanner;

public class Zadatak22 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite redni broj dana u nedelji:");
		int rb = sc.nextInt();
		sc.close();
		
		switch(rb) {
		case 1 :
			System.out.println("Ponedeljak");
			break;
		case 2 :
			System.out.println("Utorak");
			break;
		case 3 : 
			System.out.println("Sreda");
			break;
		case 4 :
			System.out.println("Cetvrtak");
			break;
		case 5 :
			System.out.println("Petak");
			break;
		case 6 :
			System.out.println("Subota");
			break;
		case 7 :
			System.out.println("Nedelja");
					
		}

	}

}

package razgranataStruktura;

import java.util.Scanner;

public class Zadatak11 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	try {
		System.out.println("Unesite ocenu od 1 do 5:");
		int ocena = sc.nextInt();
		sc.close();
		
		switch(ocena) {
		case 1 :
			System.out.println("nedovoljan");
			break;
		case 2 :
			System.out.println("dovoljan");
			break;
		case 3 :
			System.out.println("dobar");
			break;
		case 4 :
			System.out.println("vrlo dobar");
			break;
		case 5 :
			System.out.println("odlican");
			break;
		default :
				System.out.println("Morate uneti ocenu u opsegu 1 - 5!");
				
		}
	}catch(Exception e) {
		System.out.println("Morate uneti ocenu u opsegu 1 - 5!");
	}
	
	
		
	}

}

package razgranataStruktura;


import java.util.Scanner;

public class Zadatak1 {

	public static void main(String[] args) throws Exception{
		
		Scanner sc = new Scanner(System.in);
		
		
		
		System.out.println("Unesite znak:");
		char znak = sc.next().charAt(0);
		
		
		if(znak >= 'A' && znak <='Z')
			System.out.println("Unesti znak je veliko slovo " + znak);
		else if(znak >= '0' && znak <= '9')
			System.out.println("Unesti znak je cifra " + znak);		
		else if(znak >= 'a' && znak <= 'z')
			System.out.println("Uneti znak je malo slovo " + znak);
		else
			System.out.println("Uneti znak je specijalni znak " + znak);

		
		sc.close();

	}

}

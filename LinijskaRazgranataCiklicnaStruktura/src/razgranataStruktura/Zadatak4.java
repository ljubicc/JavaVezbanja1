package razgranataStruktura;

import java.util.Scanner;

public class Zadatak4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Unesite dan, mesec i godinu:");
		int dan = sc.nextInt();
		int mesec = sc.nextInt();
		int godina = sc.nextInt();
		sc.close();
		boolean prestupna = ((godina % 4 == 0) && (godina % 100 == 0) || (godina % 400 != 0)) ? true : false; 
		switch(mesec) {
		case 1 : 
			if(dan <= 24) {
				dan += 7;
			}else {
				dan = (dan + 7) - 31;
				mesec++;
			}
			break;
		case 2 :
			if(dan < 21) {
				dan += 7;
			}else {
				dan = (dan + 7) - 28;
				mesec++;
			}
			break;
		case 3 :
			if(dan < 25) {
				dan += 7;
			}else {
				dan = (dan + 7) - 31;
				mesec++;
			}
			break;
		case 4 :
			if(dan <= 23) {
				dan += 7;
			}else {
				dan = (dan + 7) - 30;
				mesec++;
			}
			break;
		case 5 :
			if(dan <= 24) {
				dan += 7;
			}else {
				dan = (dan + 7) - 31;
				mesec++;
			}
			break;
		case 6 :
			if(dan <= 23) {
				dan += 7;
			}else {
				dan = (dan + 7) - 30;
				mesec++;
			}
			break;
		case 7 :
			if(dan <= 24) {
				dan += 7;
			}else {
				dan = (dan + 7) - 31;
				mesec++;
			}
			break;
		case 8 :
			if(dan <= 24) {
				dan += 7;
			}else {
				dan = (dan + 7) - 31;
				mesec++;
			}
			break;
		case 9 :
			if(dan <= 23) {
				dan += 7;
			}else {
				dan = (dan + 7) - 30;
				mesec++;
			}
			break;
		case 10 :
			if(dan <= 24) {
				dan += 7;
			}else {
				dan = (dan + 7) - 31;
				mesec++;
			}
			break;
		case 11 :
			if(dan <= 23) {
				dan += 7;
			}else {
				dan = (dan + 7) - 30;
				mesec++;
			}
			break;
		case 12 :
			if(dan <= 24) {
				dan += 7;
			}else {
				dan = (dan + 7) - 31;
				godina ++;
				mesec = 1;
			}
			break;
		}
		
		if(prestupna && mesec == 2) {
			dan = dan - 1;
		}
		
		System.out.println(dan + "." + mesec + "." + godina + ".");
	}

}

package linijskaStruktura;

import java.io.*;

public class Primer9 {

	public static void main(String[] args) throws Exception{
		
		BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
		
		double f, c;		
		
		System.out.println("Unesite temperaturu u celzijusima:");		
		c = Double.parseDouble(sc.readLine());
		
		f = c * 1.8 + 32;
		System.out.println("Temp u farenhajtima : " + f);
	}

}

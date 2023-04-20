package razgranataStruktura;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Primer5 {

	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("#.##");
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite vrednost za a:");
		int a = sc.nextInt();
		
		double y;
		if(a > 0)
			y = Math.sqrt(a);
		else
			y = Math.pow(a, 2);
		 
		System.out.println("y = " + df.format(y));
		sc.close();

	}

}

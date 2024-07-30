package bee1036;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		double A = scan.nextDouble();
		double B = scan.nextDouble();
		double C = scan.nextDouble();
		
		double delta = Math.pow(B, 2)-4*A*C;
		double r1 = (-B + Math.sqrt(delta)) / (2 * A);
		double r2 = (-B - Math.sqrt(delta)) / (2 * A);
			
		
		if(delta > 0 && A != 0) {
		System.out.printf("R1 = %.5f\n", r1);
        System.out.printf("R2 = %.5f\n", r2);
		}
        else {
        	System.out.println("Impossivel calcular");
        }
		
		scan.close();

	}

}

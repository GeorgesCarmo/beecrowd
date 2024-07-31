package bee1043;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double a = scan.nextDouble();
		double b = scan.nextDouble();
		double c = scan.nextDouble();
		double perimetro = a + b + c;
		double area = (a+b) * c/2;
		
		if((a+b)>c && (b+c)>a && (a+c)>b) {
			System.out.println("Perimetro = "+String.format("%.1f", perimetro));
		}else {
			System.out.println("Area = "+String.format("%.1f", area));
		}

		scan.close();

	}

}

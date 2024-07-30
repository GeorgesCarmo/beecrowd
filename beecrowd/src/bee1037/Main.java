package bee1037;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double number = scan.nextDouble();
		
		if(number >= 0 && number <= 25.0) {
			System.out.println("Intervalo [0,25]");
		}else if(number > 25.0 && number <= 50.0) {
			System.out.println("Intervalo (25,50]");
		}else if(number > 50.0 && number <= 75.0) {
			System.out.println("Intervalo (50,75]");
		}else if(number > 75.0 && number <= 100.0) {
			System.out.println("Intervalo (75,100]");
		}else {
			System.out.println("Fora de intervalo");
		}
		
		scan.close();

	}

}

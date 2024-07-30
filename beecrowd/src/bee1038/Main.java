package bee1038;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int code = scan.nextInt();
		int quantity = scan.nextInt();
		double price = 0;
		
		switch (code) {
		case 1: {
			price = 4.0;
			break;
		}
		case 2: {
			price = 4.5;
			break;
		}
		case 3: {
			price = 5.0;
			break;
		}
		case 4: {
			price = 2.0;
			break;
		}
		case 5: {
			price = 1.5;
			break;
		}
		default:
			System.out.println("Entrada incorreta");
			break;
		}
		double total = price * quantity;
		System.out.printf("Total: R$ %.2f", total);
		
		scan.close();

	}

}

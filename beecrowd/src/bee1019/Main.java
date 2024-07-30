package bee1019;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {


		Scanner scan = new Scanner(System.in);
		
		int value = scan.nextInt();
		int hours = value/3600;
		value %= 3600;
		int minuts = value/60;
		int seconds = value%=60;

		System.out.println(hours+":"+minuts+":"+seconds);
		
		
		scan.close();

	}

}

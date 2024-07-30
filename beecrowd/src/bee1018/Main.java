package bee1018;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {


		Scanner scan = new Scanner(System.in);
		
		int value = scan.nextInt();
		int originalValue = value;
		int result;
		
		System.out.println(originalValue);
		
		result = value/100;
		System.out.println(result+" nota(s) de R$ 100,00");
		value %= 100;
		
		result = value/50;
		System.out.println(result+" nota(s) de R$ 50,00");
		value %= 50;
		
		result = value/20;
		System.out.println(result+" nota(s) de R$ 20,00");
		value %= 20;
		
		result = value/10;
		System.out.println(result+" nota(s) de R$ 10,00");
		value %= 10;
		
		result = value/5;
		System.out.println(result+" nota(s) de R$ 5,00");
		value %= 5;
		
		result = value/2;
		System.out.println(result+" nota(s) de R$ 2,00");
		value %= 2;
		
		result = value/1;
		System.out.println(result+" nota(s) de R$ 1,00");
		
		scan.close();

	}

}

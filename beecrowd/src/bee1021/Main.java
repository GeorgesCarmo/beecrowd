package bee1021;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double value = scan.nextDouble();
		
		int result;
		System.out.println("NOTAS:");
		result = (int)value/100;
		System.out.println(result+" nota(s) de R$ 100.00");
		value %= 100;
		
		result = (int)value/50;
		System.out.println(result+" nota(s) de R$ 50.00");
		value %= 50;
		
		result = (int)value/20;
		System.out.println(result+" nota(s) de R$ 20.00");
		value %= 20;
		
		result = (int)value/10;
		System.out.println(result+" nota(s) de R$ 10.00");
		value %= 10;
		
		result = (int)value/5;
		System.out.println(result+" nota(s) de R$ 5.00");
		value %= 5;
		
		result = (int)value/2;
		System.out.println(result+" nota(s) de R$ 2.00");
		value %= 2;
		value *= 100;
		System.out.println("MOEDAS:");
		
		result = (int)value/100;
		System.out.println(result+" moeda(s) de R$ 1.00");
		value %= 100;
		
		result = (int) (value/50);
		System.out.println(result+" moeda(s) de R$ 0.50");
		value %= 50;
		
		result = (int) (value/25);
		System.out.println(result+" moeda(s) de R$ 0.25");
		value %= 25;
		
		result = (int) (value/10);
		System.out.println(result+" moeda(s) de R$ 0.10");
		value %= 10;
		
		result = (int) (value/5);
		System.out.println(result+" moeda(s) de R$ 0.05");
		value %= 5;
		
		result = (int) (value/1);
		System.out.println(result+" moeda(s) de R$ 0.01");
		
		scan.close();

	}

}

package bee1020;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int value = scan.nextInt();
		
		int years = value/365;
		value%=365;
		int months = value/30;
		int days = value%=30;
		
		System.out.println(years+" ano(s)");
		System.out.println(months+" mes(es)");
		System.out.println(days+" dia(s)");
		
		
		
		scan.close();

	}

}

package bee1060;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int count = 0;
		double n;
		
		for(int i = 0; i < 6; i++) {
			n = scan.nextDouble();
			if(n > 0) {
				count++;
			}		
		}

		System.out.println(count+" valores positivos");
		
		scan.close();

	}

}

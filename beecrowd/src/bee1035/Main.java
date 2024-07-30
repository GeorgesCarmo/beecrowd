package bee1035;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int A = scan.nextInt();
		int B = scan.nextInt();
		int C = scan.nextInt();
		int D = scan.nextInt();
		int resto = A%2;
		
		if((B > C && D > A) && ((C+D)>(A+B)) && (C > 0 && D > 0) && (resto == 0)) {
			System.out.println("Valores aceitos");
		}else {
			System.out.println("Valores não aceitos");
		}
		
		scan.close();

	}

}

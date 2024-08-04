package bee1045;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		double A = scan.nextDouble();
		double B = scan.nextDouble();
		double C = scan.nextDouble();

		double A2, BC, maior;

		if (B > A) {
			maior = A;
			A = B;
			B = maior;
		}
		if (C > A) {
			maior = A;
			A = C;
			C = maior;
		}

		A2 = Math.pow(A, 2);
		BC = Math.pow(B, 2) + Math.pow(C, 2);

		System.out.println("A:" + A);
		System.out.println("B:" + B);
		System.out.println("C:" + C);

		if (A >= B + C) {
			System.out.println("NAO FORMA TRIANGULO");
		} else {
			if (A2 > BC) {
				System.out.println("TRIANGULO OBTUSANGULO");
			} else if (A2 < BC) {
				System.out.println("TRIANGULO ACUTANGULO");
			} else {
				System.out.println("TRIANGULO RETANGULO");
			}
		}

		if (A == B && B == C) {
			System.out.println("TRIANGULO EQUILATERO");
		} else if (A == B || A == C || B == C) {
			System.out.println("TRIANGULO ISOSCELES");
		}

		scan.close();
	}

}

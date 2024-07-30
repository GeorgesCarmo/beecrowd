package bee1040;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double n1 = scan.nextDouble();
		double n2 = scan.nextDouble();
		double n3 = scan.nextDouble();
		double n4 = scan.nextDouble();
		
		float media = (float) (((n1*2)+(n2*3)+(n3*4)+(n4*1))/10);
		
		System.out.println("Media: "+String.format("%.1f", media));
		System.out.printf("Media: %.1f\n",media);
		
		if(media > 7.0) {
			System.out.println("Aluno aprovado.");
		}else if(media < 5.0) {
			System.out.println("Aluno reprovado.");
		}else if(media >=5 && media < 7.0) {
			System.out.println("Aluno em exame.");
			double exame = scan.nextDouble();
			double mediaFinal = (media + exame)/2;
			System.out.println("Nota do exame: "+String.format("%.1f", exame));
			if(mediaFinal >= 5.0) {
				System.out.println("Aluno aprovado.");
			}else {
				System.out.println("Aluno reprovado.");
			}
			System.out.println("Media final: "+String.format("%.1f", mediaFinal));
		}

		scan.close();

	}

}

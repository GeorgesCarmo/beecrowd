package bee1046;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
			int starTime = scan.nextInt();
			int endTime = scan.nextInt();
			int duration;
			
			if(starTime > endTime) {
				duration = 24 - starTime;
				duration += endTime;
				System.out.println("O JOGO DUROU "+duration+" HORA(S)");
			}
			else if(starTime < endTime) {
				duration = endTime - starTime;
				System.out.println("O JOGO DUROU "+duration+" HORA(S)");
			}
			else if(starTime == endTime) {
				System.out.println("O JOGO DUROU 24 HORA(S)");
			}
		
		
		
		scan.close();

	}

}

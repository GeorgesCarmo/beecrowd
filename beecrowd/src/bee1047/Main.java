package bee1047;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int initialHour = scan.nextInt();
		int initialMinute = scan.nextInt();
		int finalHour = scan.nextInt();
		int finalMinute = scan.nextInt();
		int initialHoursInMinutes = (initialHour * 60) + initialMinute;
		int finalHoursInMinutes = (finalHour * 60) + finalMinute;
		int durationHour, durationMinute;
		
		if(initialHoursInMinutes > finalHoursInMinutes) {
			durationHour = (1440 + finalHoursInMinutes)- initialHoursInMinutes;
			durationMinute = durationHour % 60;
			durationHour /= 60;
			System.out.println("O JOGO DUROU "+durationHour+" HORA(S) E "+durationMinute+" MINUTO(S)");
		}
		else if(finalHoursInMinutes > initialHoursInMinutes){
			durationHour = finalHoursInMinutes - initialHoursInMinutes;
			durationMinute = durationHour % 60;
			durationHour /= 60;
			System.out.println("O JOGO DUROU "+durationHour+" HORA(S) E "+durationMinute+" MINUTO(S)");
		}
		else {
			System.out.println("O JOGO DUROU 24 HORA(S) E 0 MINUTO(S)");
		}
		

		scan.close();

	}

}

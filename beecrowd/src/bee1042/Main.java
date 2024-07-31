package bee1042;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n1 = scan.nextInt();
		int n2 = scan.nextInt();
		int n3 = scan.nextInt();

		int list[] = { n1, n2, n3 };
		int newList[] = Arrays.copyOf(list, 3);
		Arrays.sort(list);

		for (int i = 0; i < list.length; i++) {
			System.out.println(list[i]);
		}

		System.out.println();

		for (int i = 0; i < newList.length; i++) {
			System.out.println(newList[i]);
		}

		scan.close();

	}

}

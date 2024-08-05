package bee1048;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double salary = scan.nextDouble();
		double newSalary = 0;
		double earned = 0;
		double percentual = 0;
		
		if(salary >= 0 && salary <= 400) {
			newSalary = salary * 1.15;
			earned = newSalary - salary;
			percentual = 15;	
		}
		else if(salary > 400 && salary <= 800) {
			newSalary = salary * 1.12;
			earned = newSalary - salary;
			percentual = 12;
		}
		else if(salary >= 800.01 && salary <= 1200) {
			newSalary = salary * 1.10;
			earned = newSalary - salary;
			percentual = 10;
		}
		else if(salary >= 1200.01 && salary <= 2000) {
			newSalary = salary * 1.07;
			earned = newSalary - salary;
			percentual = 7;
		}
		else{
			newSalary = salary * 1.04;
			earned = newSalary - salary;
			percentual = 4;
		}
		
		System.out.printf("Novo salario: %.2f\n", newSalary);
		System.out.printf("Reajuste ganho: %.2f\n", earned);
		System.out.println("Em percentual: "+percentual+" %");
		
		scan.close();

	}

}

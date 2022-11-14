package java_basics;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		int number, hour;
		double value, salary;
		
		number = sc.nextInt();
		hour = sc.nextInt();
		value = sc.nextDouble();
		
		salary = value * hour;
		
		System.out.printf("Number = %d%n", number);
		System.out.printf("Salary = U$ %.2f", salary);
		
	}

}

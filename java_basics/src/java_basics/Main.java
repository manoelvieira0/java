package java_basics;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double x;
		x = sc.nextDouble();
		System.out.println("Você digitou: " + x);
		
		sc.close();
	}

}

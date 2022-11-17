package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {
	
	public static final double PI = 3.14159;

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe o raio: ");
		double raio = sc.nextDouble();
		
		double c = circuferencia(raio);
		
		double v = volume(raio);
		
		System.out.printf("Circuferência: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.println("Pi: " + PI);

		sc.close();
	}
	
	public static double circuferencia(double raio) {
		return 2.0 * PI * raio;
	}
	
	public static double volume(double raio) {
		return 4 * PI * raio * raio * raio / 3.0;
	}

}

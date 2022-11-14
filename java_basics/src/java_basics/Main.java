package java_basics;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);
		
		double pi, raio, area;
		
		System.out.println("Informe o valor do raio: ");
		raio = sc.nextDouble();
		pi = 3.14159;
		
		area = pi * Math.pow(raio, 2);
		
		System.out.printf("Área do Raio = %.4f%n", area);
		
	}

}

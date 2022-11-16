package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Retangulo;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		Retangulo retangulo = new Retangulo();
		
		System.out.println("Informe a largura do retângulo: ");
		retangulo.width = sc.nextDouble();
		
		System.out.println("Informe a altura do retângulo: ");
		retangulo.height = sc.nextDouble();
		
		System.out.printf("Area = %.2f%n", retangulo.area());
		System.out.printf("Perímetro = %.2f%n", retangulo.perimetro());
		System.out.printf("Diagonal = %.2f%n", retangulo.diagonal());
		
		sc.close();
	}

}

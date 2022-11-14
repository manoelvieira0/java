package java_basics;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a, b;
		
		System.out.println("Informe um número a: ");
		a = sc.nextInt();
		
		System.out.println("Informe um número b: ");
		b = sc.nextInt();
		
		if(a % b == 0 || b % a == 0) {
			System.out.println("SÃO MÚLTIPLOS");
		} else {
			System.out.println("NÃO SÃO MÚLTIPLOS");
		}
		
		sc.close();

	}

}

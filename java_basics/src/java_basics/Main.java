package java_basics;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int codigo, quantidade;
		double total;
		
		double hotdog = 4.00;
		double xsalada = 4.50;
		double xbacon = 5.00;
		double torrada = 2.00;
		double refrigerante = 1.50;
		
		System.out.println("Informe o código do produto: ");
		codigo = sc.nextInt();
		
		System.out.println("Informe a quantidade: ");
		quantidade = sc.nextInt();
		
		if(codigo == 1) {
			total = quantidade * hotdog;
			System.out.printf("Total: R$ %.2f%n", total);
		} else if (codigo == 2){
			total = quantidade * xsalada;
			System.out.printf("Total: R$ %.2f%n", total);
		}
		else if (codigo == 3){
			total = quantidade * xbacon;
			System.out.printf("Total: R$ %.2f%n", total);
		}
		else if (codigo == 4){
			total = quantidade * torrada;
			System.out.printf("Total: R$ %.2f%n", total);
		}
		else if (codigo == 5){
			total = quantidade * refrigerante;
			System.out.printf("Total: R$ %.2f%n", total);
		}
		
		sc.close();

	}

}

package java_basics;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int senha = 2002;
		int tentativa = sc.nextInt();
		
		while (tentativa != senha) {
			System.out.println("Senha Inválida");
			tentativa = sc.nextInt();
		}
		
		System.out.println("Acesso Permitido");

		sc.close();
		
	}

}

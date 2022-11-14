package java_basics;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int horaInicial, horaFinal;
		int duracao;
		
		System.out.println("Informe a hora inicial: ");
		horaInicial = sc.nextInt();
		
		System.out.println("Informe a hora final: ");
		horaFinal = sc.nextInt();
		
		if(horaInicial < horaFinal) {
			duracao = horaFinal - horaInicial;
			System.out.printf("O JOGO DUROU %d HORA(S)", duracao);
		} else {
			duracao = 24 - horaInicial + horaFinal;
			System.out.printf("O JOGO DUROU %d HORA(S)", duracao);
		}
		
		sc.close();

	}

}

package java_basics;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		String original = "Manoel vieira sabe Muito AbCdeF  ";
		
		String lower = original.toLowerCase();
		String upper = original.toUpperCase();
		String trim = original.trim();
		String sub = original.substring(2);
		String subtring = original.substring(2, 9);
		String replace = original.replace("a", "x");

		
		System.out.println(lower);
		System.out.println(upper);
		System.out.println(trim);
		System.out.println(sub);
		System.out.println(subtring);
		System.out.println(replace);
		
	}

}

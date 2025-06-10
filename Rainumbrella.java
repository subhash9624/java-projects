package xyz;

import java.util.Scanner;

public class Rainumbrella {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the condition:");
		String s=sc.next();
		if (s.equals("yes")) {
			System.out.println("take an umbrella");
		}
		else {
			System.out.println("no need of an umbrella");
		}
	}
}

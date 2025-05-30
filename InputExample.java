package xyz;

import java.util.Scanner;

public class InputExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);//taking the input in the system
		
		System.out.println("Enter the Age:");
		int age = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the Name:");
		String Name = sc.nextLine();
		System.out.println(Name + age);
	}

}

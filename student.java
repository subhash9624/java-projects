package xyz;

import java.util.LinkedList;
import java.util.Scanner;

public class student {

	public static void main(String[] args) {
		
		LinkedList<String> name1 = new LinkedList<String>(); 
		Scanner sc = new Scanner(System.in);
		//String name = sc.nextLine();
		System.out.println("Enter 5 student names:");
		
		for(int i=0;i<5;i++) {
			
			String name = sc.nextLine();
			name1.add(name);
		}
		
		System.out.println("five students names are:");
		
		for(String i:name1) {
			
			System.out.println(i);
		}
	}

}

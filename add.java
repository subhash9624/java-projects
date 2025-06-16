package xyz;

import java.util.Scanner;

/*class addition{
	 void sum(int a,int b) {
		
		int Addition=a+b;
		 System.out.println(Addition);
	}
}*/

public class add {

	public static void main(String[] args) {
		int sum;
		System.out.println("Enter two numbers:");
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		
		sum=a+b;
		System.out.println("The addition of a+b is:=");
		 System.out.println(sum);
	}

}

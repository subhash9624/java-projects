package xyz;
import java.util.Scanner;
public class calander {

	public static void main(String[] args) {
		Scanner ob=new Scanner(System.in);
		String day=ob.nextLine();
		switch(day) {
		case "monday":
			System.out.println("lets learn python");
			break;
			
		case "tuesday":
			System.out.println("lets learn java");
			break;

		case "wednesday":
			System.out.println("lets learn DSA");
			break;
		
		case "thursday":
			System.out.println("lets learn JS");
			break;
		
		case "friday":
			System.out.println("lets learn R");
			break;
			
		case "saturday":
			System.out.println("lets learn C++");
			break;
			
		case "sunday":
			System.out.println("lets learn REACT");
			break;
		default:
			System.out.println("Invalid input day");
  }
 }
}
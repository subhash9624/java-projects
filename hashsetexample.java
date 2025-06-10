package xyz;
import java.util.*;
import java.util.List;
public class hashsetexample {

	public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);
		        Set<String> set = new HashSet<>();

		        System.out.println("enter the elements");
		        int n = scanner.nextInt();
		        scanner.nextLine(); 

		        for (int i = 0; i < n; i++) {
		            System.out.print("Enter element " + i);
		            String element = scanner.nextLine();
		            set.add(element); 
		        }
		        System.out.println("\n HashSet: " + set);
		        scanner.close();
		        
	}

}

package xyz;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class hashmapping {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		HashMap<String, String> hm = new HashMap<>();
        System.out.println("enter the elements");
        int n = scanner.nextInt();
        scanner.nextLine(); 

        for (int i = 0; i < n; i++) {
        	System.out.println("Entry " + (i + 1) + ":");
            System.out.print("Enter key: ");
            String key = scanner.nextLine();
            System.out.print("Enter value: ");
            String value = scanner.nextLine();
            hm.put(key,value);
        }
        for (Map.Entry<String, String> entry : hm.entrySet()) {
        System.out.println("Key:" + entry.getKey() + "  Value:" + entry.getValue());
        }
        scanner.close();
	}
}

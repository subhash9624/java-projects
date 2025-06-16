package xyz;
import java.util.*;
public class reversewords {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.println("Enter a sentence:");
	        String input = scanner.nextLine();

	        String[] words = input.split(" ");

	        System.out.println("Reversed words:");
	        for (int i = words.length - 1; i >= 0; i--) {
	            System.out.print(words[i] + " ");
	        }

	        scanner.close();
	    }
	}



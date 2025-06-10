package xyz;

public class encapsulation {
    public static void main(String[] args) {
        Student student = new Student();

        student.setName("Alice");
        student.setRoll(101);
        student.setMarks(35);

        // Getting and displaying values
        System.out.println("Name: " + student.getName());
        System.out.println("Roll: " + student.getRoll());
        System.out.println("Marks: " + student.getMarks());
        System.out.println("Result: " + student.checkResult());
    }
}



class Student {
    private String name;
    private int roll;
    private int marks;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getRoll() {
        return roll;
    }
    public void setRoll(int roll) {
        this.roll = roll;
    }

    public int getMarks() {
        return marks;
    }
    public void setMarks(int marks) {
        this.marks = marks;
    }

    public String checkResult() {
        return (marks >= 40) ? "Pass" : "Fail";
    }
}


/*import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;
public class Todolistapp {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		ArrayList<String> tasks=new ArrayList<>();
		
		while(true) {
		System.out.println("simple to do list app");
		System.out.println("1.add task");
		System.out.println("2.view a task");
		System.out.println("3.delete a task");
		System.out.println("4.exit");
		System.out.println("choose an option(1-4):");
		
		int choice=sc.nextInt();
		sc.nextLine();
		if(choice==1) {
			System.out.println("Enter your task");
			String task=sc.nextLine();
			tasks.add(task);
			System.out.println("task added sucessfully");
		}
	}
	}
}
*/

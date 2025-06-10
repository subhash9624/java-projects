package xyz;
import java.util.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
public class arraylist {

	public static void main(String[] args) {
		List<String> employees = new ArrayList<>();
		 
		employees.add("subhash");
        employees.add("chaitanya");
        employees.add("prabhas");
        System.out.println(employees);
        Collections.reverse(employees);
        System.out.println(employees);
	}
}

package xyz;

import java.util.TreeSet;

public class librarybooksid {

	public static void main(String[] args) {
		TreeSet<Integer> book=new TreeSet<Integer>();
		 book.add(5002);
		 book.add(4998);
		 book.add(5005);
		 book.add(4999);
		 book.add(5001);
		 System.out.println(book);
		System.out.println(book.first());
		System.out.println(book.last());
		System.out.println(book.higher(4999));
		System.out.println(book.lower(5005));
		


	}

}

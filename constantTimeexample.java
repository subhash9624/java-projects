package xyz;

public class constantTimeexample {

	public static void print1stelement(int[] arr ) {
		if (arr.length>0) {
			for(int i=0;i<arr.length;i++)
			System.out.println("first element is:"+arr[i]);
		}
		else {
			System.out.println("array is empty!");
		}
	}
	public static void main(String[] args) {
		
		int[] numbers= {10,20,30,40,50,60};
		print1stelement(numbers);
	}

}

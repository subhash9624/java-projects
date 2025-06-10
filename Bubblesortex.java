package xyz;

public class Bubblesortex {

	public static void main(String[] args) {
		int[] numbers = {5,2,4,1,3};
		
		//bubble sort logic
		for(int i=0;i<numbers.length-1;i++) {
			for(int j=0;j<numbers.length-1;j++) {
				//if the number is bigger than one,swap them
				if(numbers[j]>numbers[j+1]) {
					//swapping
					int temp=numbers[j];
					numbers[j]=numbers[j+1];
					numbers[j+1]=temp;
				}
			}
			
		}
		//print the sorted numbers
		System.out.println("sorted list");
		for(int num:numbers) {
			System.out.println(num+" ");
		}
		

	}

}

package xyz;

import java.util.Arrays;

public class Logtimecomplexity {

	public static void main(String[] args) {
		int[] numbers= {1,2,3,7,9,11,13};
		int target=1;
		//Arrays.sort(numbers);
		int low=0;
		int high=numbers.length-1;
		
		while(low<=high) {
			int mid=(low+high)/2;
			if(numbers[mid]==target) {
				System.out.println("found number :"+target+" at position :"+mid);
				return;
			}
			else if(numbers[mid]<target) {
				low=mid+1;
			}
			else {
				high=mid-1;
			}
		}
		System.out.println("number not found");
	}
}

package xyz;

public class linearsearchexample {

	public static void main(String[] args) {
		int[] numbers= {5,8,2,9,4,7};
		int target=10;
		boolean found=false;
		
		for(int i=0;i<numbers.length;i++) {
			if(numbers[i]==target) {
			System.out.println("Found"+" "+target+" at index "+i);
			found=true;		
			break;
			}
		}
			if(!found) {
				System.out.println("Found"+" "+target+" not found");
			}

}
}
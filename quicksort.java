package xyz;

public class quicksort {
	static int QS(int[] a,int low ,int high) {
		int pivot=a[high];
		int i=low-1;
		for(int j=low;j<high;j++) {
			if(a[j]<pivot) {
				
				i++;
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
		int temp=a[i+1];
		a[i+1]=a[high];
		a[high]=temp;
		return i+1;
		
	}
	static void sort(int a[],int low,int high) {
		if(low<high) {
			int pi=QS(a,low,high);
			sort(a,low,pi-1);
			sort(a,pi+1,high);
		}
	}
	static void print(int a[]) {
		for(int num:a) 
			System.out.println(num+" ");
			System.out.println();
	}
	public static void main(String[] args) {
		int[] a= {12,9,3,6,8,2};
		System.out.println("original array");
		print(a);
		sort(a,0, a.length-1);
		System.out.println("sorted array");
		print(a);

	}

}

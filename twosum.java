package xyz;

public class twosum {
	public static int[] two(int[] a,int t) {
		for(int i=0;i<a.length-1;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]+a[j]==t) {
					System.out.println("Indices: " + a[i] + ", " + a[j]);
				}
			}
		}
		return new int[] {};
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {1,2,3,4,5};
		int t=9;
		two(a,t);
		//System.out.println("Indices: " + result[0] + ", " + result[1]);
		
	}
}
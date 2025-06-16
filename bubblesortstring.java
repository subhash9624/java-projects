package xyz;

public class bubblesortstring {

	public static void main(String[] args) {
		String[] fruits= {"apple","banana","jack","pappya"};
		int n=fruits.length;
		
		for (int i=0;i<n-1;i++){
            for (int j=0;j<n-i-1;j++){
                if (fruits[j].compareTo(fruits[j+1])>0) {
                	String temp = fruits[j];
                    fruits[j] = fruits[j + 1];
                    fruits[j+1] = temp;

            }

	}

}
		System.out.println("Sorted strings:");
        for (String word : fruits) {
            System.out.println(word);
}
	}
}
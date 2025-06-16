package xyz;
import java.util.Arrays;
public class BinarySearchArray {
		   
		    public static int binarySearch(int[] arr, int target) {
		        int left = 0, right = arr.length - 1;

		        while (left <= right) {
		            int mid = left + (right - left) / 2;

		            if (arr[mid] == target) {
		                return mid; // Element found
		            } else if (arr[mid] < target) {
		                left = mid + 1; // Search in right half
		            } else {
		                right = mid - 1; // Search in left half
		            }
		        }
		        return -1; // Element not found
		    }

		    public static void main(String[] args) {
		        // Static array input (unsorted)
		        int[] arr = {23, 5, 7, 12, 1, 19};
		        int target = 12;

		        // Sort the array before binary search
		        Arrays.sort(arr);
		        System.out.println("Sorted array: " + Arrays.toString(arr));

		        // Perform binary search
		        int result = binarySearch(arr, target);

		        // Print result
		        if (result == -1) {
		            System.out.println("Element " + target + " not found.");
		        } else {
		            System.out.println("Element " + target + " found at index (after sorting): " + result);
		        }


	}

}

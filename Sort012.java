//Sort an array of 0s, 1s and 2s
// Approach: Count the number of 0s, 1s and 2s in the given array. Then store all the 0s in the beginning followed by all the 1s then all the 2s.
// Algorithm:
// Keep three counter c0 to count 0s, c1 to count 1s and c2 to count 2s
// Traverse through the array and increase the count of c0 is the element if 0,increase the count of c1 if the element is 1 and increase the count of c2 if the element is 2
// Now again traverse the array and replace first c0 elements with 0, next c1 elements with 1 and next c2 elements with 2.



// Java implementation of the approach 
import java.io.*; 

class Sort012 { 
	// Utility function to print the contents of an array 
	static void printArr(int arr[], int n) 
	{ 
		for (int i = 0; i < n; i++) 
			System.out.print(arr[i] + " "); 
	} 
	
	// Function to sort the array of 0s, 1s and 2s 
	static void sortArr(int arr[], int n) 
	{ 
		int i, cnt0 = 0, cnt1 = 0, cnt2 = 0; 
	
		// Count the number of 0s, 1s and 2s in the array 
		for (i = 0; i < n; i++) { 
			switch (arr[i]) { 
			case 0: 
				cnt0++; 
				break; 
			case 1: 
				cnt1++; 
				break; 
			case 2: 
				cnt2++; 
				break; 
			} 
		} 
	
		// Update the array 
		i = 0; 
	
		// Store all the 0s in the beginning 
		while (cnt0 > 0) { 
			arr[i++] = 0; 
			cnt0--; 
		} 
	
		// Then all the 1s 
		while (cnt1 > 0) { 
			arr[i++] = 1; 
			cnt1--; 
		} 
	
		// Finally all the 2s 
		while (cnt2 > 0) { 
			arr[i++] = 2; 
			cnt2--; 
		} 
	
		// Print the sorted array 
		printArr(arr, n); 
	} 
	
	// Driver code 
	public static void main(String[] args) 
	{ 
		int arr[] = { 0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1 }; 
		int n = arr.length; 
		sortArr(arr, n); 
	} 
} 

// This code is contributed by shubhamsingh10 

//Given an almost sorted array where only two elements are swapped, how to sort the array efficiently?
//The idea is to traverse from rightmost side and find the first out of order element (element which is smaller than previous element). 
//Once first element is found, find the other our of order element by traversing the array toward left side.

//Below is implementation of above idea.
// Java program to  
// sort using one swap 
import java.io.*; 
  
class max1swapsort  
{ 
// This function sorts an array  
// that can be sorted by single swap 
static void sortByOneSwap(int arr[],  
                          int n) 
{ 
    // Traverse the given array 
    // from rightmost side 
    for (int i = n - 1; i > 0; i--) 
    { 
        // Check if arr[i]  
        // is not in order 
        if (arr[i] < arr[i - 1]) 
        { 
            // Find the other element  
            // to be swapped with arr[i] 
            int j = i - 1; 
            while (j >= 0 && arr[i] < arr[j]) 
                j--; 
  
            // Swap the pair 
            int temp = arr[i]; 
            arr[i] = arr[j + 1]; 
            arr[j + 1] = temp; 
      
            break; 
        } 
    } 
} 
  
// A utility function to  
// print an array of size n 
static void printArray(int arr[], int n) 
{ 
    int i; 
    for (i = 0; i < n; i++) 
        System.out.print(arr[i] + " "); 
    System.out.println(); 
} 
  
// Driver Code 
public static void main(String[] args)  
{ 
int arr[] = {10, 30, 20,  
             40, 50, 60, 70}; 
int n = arr.length; 
  
System.out.println("Given array is "); 
printArray(arr, n); 
  
sortByOneSwap(arr, n); 
  
System.out.println("Sorted array is "); 
printArray(arr, n); 
} }
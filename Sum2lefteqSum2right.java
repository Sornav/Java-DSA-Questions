//Find an element in array such that sum of left array is equal to sum of right array
// We form a prefix and suffix sum arrays
// 
// Given array : 1 4 2 5
// Prefix Sum :  1  5 7 12
// Suffix Sum :  12 11 7 5
// 
// Now, we will traverse both prefix arrays.
// The index at which they yield equal result,
// is the index where the array is partitioned 
// with equal sum.
// Java program to find an element  
// such that sum of right side element  
// is equal to sum of left side 
public class Sum2lefteqSum2right { 
      
    // Finds an element in an array such that 
    // left and right side sums are equal 
    static int findElement(int arr[], int n) 
    { 
        // Forming prefix sum array from 0 
        int s1=0;
        int[] prefixSum = new int[n];
        for(int i=0;i<n;i++)
        {
            s1=s1+arr[i];
            prefixSum[i]=s1;
         }
        //OR
        
        
       //  int[] prefixSum = new int[n]; 
      //prefixSum[0] = arr[0]; 
     // for (int i = 1; i < n; i++) 
    //   prefixSum[i] = prefixSum[i - 1] + arr[i]; 
       
       
       int s2=0;
        int[] suffixSum = new int[n];
        for(int i=n-1;i>0;i--)
        {
            s2=s2+arr[i];
            suffixSum[i]=s2;
         }

       
       
       //OR
       
       
       
       
       
        // Forming suffix sum array from n-1 
       //  int[] suffixSum = new int[n]; 
//         suffixSum[n - 1] = arr[n - 1]; 
//         for (int i = n - 2; i >= 0; i--) 
//             suffixSum[i] = suffixSum[i + 1] + arr[i]; 
       
        // Find the point where prefix and suffix 
        // sums are same. 
        for (int i = 1; i < n - 1; i++) 
            if (prefixSum[i] == suffixSum[i]) 
                return arr[i]; 
       
        return -1; 
    } 
       
    // Driver code 
    public static void main(String args[]) 
    { 
        int arr[] = { 1,2,3,4,5,6,7,7,1 }; 
        int n = arr.length; 
        System.out.println(findElement(arr, n)); 
    } 
} 
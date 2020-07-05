import java.util.*; 
  ///100% same as Normal Quick Sort just choose  a random pivot
class RandomisedQuickSort  
{  
    public static int N = 5; 
    public static int[] arr = new int[N]; 
      
    // This Function helps in calculating random  
    // numbers between low(inclusive) and high(inclusive) 
         
    /* This function takes last element as pivot,  
    places the pivot element at its correct  
    position in sorted array, and places all  
    smaller (smaller than pivot) to left of  
    pivot and all greater elements to right  
    of pivot */
      
   public static int partition (int[] arr,  
                                 int low, int high) 
    { 
        Random rand= new Random(); 
        int pivot = rand.nextInt(high-low) + low; 
          
        int temp1=arr[pivot]; 
        arr[pivot]=arr[high]; 
        arr[high]=temp1;

         pivot = arr[high];int pivotloc = low; 
        for (int i = low; i <= high; i++) 
        { 
            // inserting elements of less value  
            // to the left of the pivot location 
            if(arr[i] < pivot) 
            { 
                int temp = arr[i]; 
                arr[i] = arr[pivotloc]; 
                arr[pivotloc] = temp; 
                pivotloc++; 
            } 
        } 
          
        // swapping pivot to the final pivot location 
        int temp = arr[high]; 
        arr[high] = arr[pivotloc]; 
        arr[pivotloc] = temp; 
          
        return pivotloc; 
    } 

  
    /* The main function that implements QuickSort()  
    arr[] --> Array to be sorted,  
    low --> Starting index,  
    high --> Ending index */
    void sort(int arr[], int low, int high)  
    {  
         if (low < high)  
        { 
            /* pi is partitioning index, arr[pi] is  
            now at right place */
            int pi = partition(arr, low, high);  
  
            // Recursively sort elements before  
            // partition and after partition  
            sort(arr, low, pi-1);  
            sort(arr, pi+1, high);  
        } 
    }  
  
    /* A utility function to print array of size n */
    static void printArray(int arr[])  
    {  
        int n = arr.length;  
        for (int i = 0; i < n; ++i)  
            System.out.print(arr[i]+" ");  
        System.out.println();  
    }  
  
    // Driver code  
    public static void main(String args[])  
    {  
        int arr[] = {10, 7, 8, 9, 1, 5,5,7,3,4,5,0,2,34,5,6,8,6};  
        int n = arr.length;  
  
        RandomisedQuickSort ob = new RandomisedQuickSort();  
        ob.sort(arr, 0, n-1);  
  
        System.out.println("sorted array");  
        printArray(arr);  
    }  
}  
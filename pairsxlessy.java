//Count of pairs (x, y) in an array such that x < y
// Efficient approach: For an element x. In order to find the count of valid pairs of the form (x, y1), (x, y2), …, (x, yn), 
// we need to count the elements which are greater than x. For the smallest element, there will be n – 1 elements 
// greater than it. Similarly, the second smallest element can form n – 2 pairs and so on. 
// Therefore, the desired count of valid pairs will be (n – 1) + (n – 2) + …. + 1 = n * (n – 1) / 2 
// where n is the length of the array.

class pairsxlessy { 
  
    // Function to return the number of 
    // pairs (x, y) such that x < y 
    static int getPairs(int a[]) 
    { 
        // Length of the array 
        int n = a.length; 
  
        // Calculate the number of valid pairs 
        int count = (n * (n - 1)) / 2; 
  
        // Return the count of valid pairs 
        return count; 
    } 
  
    // Driver code 
    public static void main(String[] args) 
    { 
        int a[] = { 2, 4, 3, 1 }; 
        System.out.println(getPairs(a)); 
    } 
} 
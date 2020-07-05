//Java program to find if there is path 
// from top left to right bottom in a matrix
//can use the same approach for finding path between 2 points
// Algorithm:
// Mark the cell 0,0 as 1.
// Run a loop from 0 to row length and if the cell above is marked 1 and the current cell is not blocked then mark the current cell as 1.
// Run a loop from 0 to column length and if the left cell is marked 1 and the current cell is not blocked then mark the current cell as 1.
// Traverse the matrix from start to the end row-wise in increasing index of rows and columns.
// If the cell is not blocked then check that any of its adjacent cells (check only the cell above and the cell to the left). is marked 1 or not. If marked 1 then mark the cell 1.
// If the cell (row-1, col-1) is marked 1 return true else return false.
class PathMatrix
{ 
    // to find the path from 
    // top left to bottom right 
    static boolean isPath(int arr[][]) 
    { 
        // set arr[0][0] = 1 
        arr[0][0] = 1; 
  
        // Mark reachable (from top left) nodes 
        // in first row and first column. 
        for (int i = 1; i < 5; i++) 
            if (arr[0][i] != -1) 
                arr[0][i] = arr[0][i - 1]; 
        for (int j = 1; j < 5; j++) 
            if (arr[j][0] != -1) 
                arr[j][0] = arr[j - 1][0]; 
  
        // Mark reachable nodes in 
        //  remaining matrix. 
        for (int i = 1; i < 5; i++) 
            for (int j = 1; j < 5; j++) 
                if (arr[i][j] != -1) 
                    arr[i][j] = Math.max(arr[i][j - 1], 
                                        arr[i - 1][j]); 
  
        // return yes if right  
        // bottom index is 1 
        return (arr[5 - 1][5 - 1] == 1); 
    } 
       
    //Driver code  
    public static void main(String[] args) 
    { 
        // Given array 
        int arr[][] = { { 0, 0, 0, -1, 0 }, 
                        { -1, 0, 0, -1, -1 }, 
                        { 0, 0, 0, 0, 0 }, 
                        { -1, 0, -1, 0, -1 }, 
                        { 0, 0, -1, 0, 0 } }; 
  
        // path from arr[0][0]  
        // to arr[row][col] 
        if (isPath(arr)) 
            System.out.println("Yes"); 
        else
            System.out.println("No"); 
    } 
} 
// This code is contributed  
// by prerna saini  
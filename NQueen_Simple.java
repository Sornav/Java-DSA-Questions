public class NQueen_Simple
{
public static void print(int[] Q,int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(" " + Q[i]);
        }
        System.out.println(" ");
    }

    public static boolean Feasible(int[] Q,int p,int k) {
        for (int i = 0; i < p; i++) {    ////we need to check from starting row if column conflict is there or not for each row so q[i]==k where i-row,k=colunm
            if (Q[i] == k || Math.abs(Q[i] - k) == Math.abs(i - p)) {
                return false;
            }
        }
        return true;
    }

    public static void NQueens(int[] Q, int k, int n) {//passing row
                for (int i = 0; i < n; i++) {//loop for column
            
            if (Feasible(Q,k, i)) {
                Q[k] = i;//put the queen in the kth row and ith col
                if (k == n-1) {//check if last row
                print(Q, n);
            
               }

                NQueens(Q, k + 1, n);//check for next row
            }
        }
    }

    public static void main(String[] args) {
        int[] Q = new int[4];
        NQueens(Q, 0, 4);
    }
    }
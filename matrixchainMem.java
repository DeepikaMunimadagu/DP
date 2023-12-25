import java.util.*;

public class Main {
    // HARD LEVEL PROBLEM
    public static int mem(int arr[], int i, int j, int dp[][]){
        if(i >= j){
            return 0;
        }
        if(dp[i][j] != -1){
            return dp[i][j];
        }
        int ans = Integer.MAX_VALUE;
        for(int k=i; k<j; k++){
            int cost1 = mem(arr, i, k, dp);
            int cost2 = mem(arr, k+1, j, dp);
            int cost3 = arr[i] * arr[k+1] * arr[j];
            ans = Math.min(ans, cost1 + cost2 + cost3);
        }
        return dp[i][j] = ans;
    }

    public static void main(String args[]){
        int arr[] = {1, 2, 3, 4, 3};
        int n = arr.length;

        int dp[][] = new int[n][n];
        for(int i=0; i<n; i++){
            Arrays.fill(dp[i], -1);
        }
        System.out.println(mem(arr, 0, n-1, dp));
    }
}

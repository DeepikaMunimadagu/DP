import java.util.*;
public class Main{
    //HARD LEVEL PROBLEM
    public static int mem(int arr[], int i, int j){
        if(i==j){
            return 0;
        }
        int ans = Integer.MAX_VALUE;
        for(int k=i; k<=j-1; k++){
            int cost1 = mem(arr,i,k);
            int cost2 = mem(arr,k+1,j);
            int cost3 = arr[i-1] * arr[k] * arr[j];
            int finalCost = cost1 + cost2 + cost3;
            ans = Math.min(ans, finalCost);
        }
        return ans;
    }
    public static void main(String args[]){
        int arr[] = {1, 2, 3, 4, 3};
        int n = arr.length;
        System.out.println(mem(arr, 1, n-1));
    }
}

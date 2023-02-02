package LinearSearch.code;

// https://leetcode.com/problems/richest-customer-wealth/

public class MaxWealth {
    public static void main(String[] args) {

    }
    public int maximumWealth2(int[][] accounts) {
        // person = rol
        // account = col
        int ans = Integer.MIN_VALUE;
        for (int[] ints : accounts) {
            // when you start a new row, take a new sum for that row
            int sum = 0;
            for (int anInt : ints) {
                sum += anInt;
            }
            // now we have sum of accounts of person
            // check with overall ans
            if (sum > ans) {
                ans = sum;
            }
        }
        return ans;
    }

    public static int maximumWealth(int[][] accounts) {
        
        int max = Integer.MIN_VALUE;
        
        for (int m = 0; m < accounts.length; m++){
            
            int sum = 0;
            for (int n = 0; n < accounts[m].length; n++){
                sum = sum + accounts[m][n];
            }
            
            max = Math.max(max, sum);
            
        }
        
        return max;
    }
}

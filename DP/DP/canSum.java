package DP;

class Solution{
    public static void main(String args[]){
        int target = 300;
        int[] arr = new int[]{ 7, 10 };
        int[] dp = new int[target+1];
        System.out.println(canSum(target, arr, dp));
    }

    private static boolean canSum(int target, int[] arr, int[] dp){
        if(target < 0) return false;
        if(dp[target] != 0) return dp[target]>0 ? true : false;
        if(target == 0) return true;

        for(int i=0; i<arr.length; i++){
            int delta = target-arr[i];
            if(canSum(delta, arr, dp)){              
                dp[target] = 1;
                return true;
            }
        }
        dp[target] = -1;
        return false;
    }
}
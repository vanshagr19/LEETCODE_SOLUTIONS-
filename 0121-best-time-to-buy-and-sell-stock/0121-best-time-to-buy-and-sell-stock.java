class Solution {
    public int maxProfit(int[] arr) {
        int buy = arr[0];
        int profit  = 0;
        for (int i = 1 ; i < arr.length ; i++){
            if (buy >= arr[i]){
                buy = arr[i];
            }
            else{
                
                profit = Math.max(profit, arr[i]-buy );
            }
        }
        return profit ;
    }
}
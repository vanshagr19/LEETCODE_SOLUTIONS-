class Solution {
    public int trap(int[] arr) {
        int l = 0 ;
        int n = arr.length; 
        int r = n-1;
        int ans = 0;
        int lmax = 0;
        int rmax = 0;
        while(l<r){
             lmax = Math.max(lmax ,arr[l]);
             rmax = Math.max(rmax , arr[r]);

            if (lmax > rmax){
                ans = ans + rmax - arr[r];
                r--;
            }
            else{
                ans = ans + lmax - arr[l];
                l++;
            }
        }
        return ans ;
    }
}
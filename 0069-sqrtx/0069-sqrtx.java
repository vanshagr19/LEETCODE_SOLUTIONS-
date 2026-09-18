class Solution {
    public int mySqrt(int n) {
        if (n == 0) return 0;
        int st = 1;
        int end = n;
        int ans = 0;
        while(st<=end){
            int mid = st +(end-st)/2;
            
            if (mid == n/mid) return mid;
            else if(mid < n/mid){
                ans =mid;
                st = mid+1;
            }
            else{
                end =mid-1;
            }
        }
        return ans;
    }
}
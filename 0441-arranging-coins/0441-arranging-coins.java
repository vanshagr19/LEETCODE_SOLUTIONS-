class Solution {
    public int sqrt (long n){
        if (n == 0 ) return 0;
        long st = 0;
        long end = n;
        while(st <= end){
            long mid = st +(end - st)/2;
            if (mid == n / mid) {
                return (int) mid;
            } else if (mid > n / mid) {
                end = mid - 1;
            } else {
                st = mid + 1;
            }
        }
        return (int)end;
    }
    public int arrangeCoins(int n) {
        long m = (long)n;
        return (sqrt(8L*m+1L) - 1)/2;
    }
}
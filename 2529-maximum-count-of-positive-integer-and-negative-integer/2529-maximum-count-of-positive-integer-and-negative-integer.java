class Solution {
    public int negativecount (int[] arr ){
        int st = 0;
        int n = arr.length;
        int end = n-1;
        int ans =-1;
        while(st <= end){
            int mid = st +(end - st)/2;
            if (arr[mid] < 0){
                ans =mid ;
                st = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return ans;
    }

    public int positivecount(int[] arr){
        int st = 0;
        int n = arr.length;
        int end = n-1;
        int ans =n;
        while(st <= end){
            int mid = st +(end - st)/2;
            if (arr[mid] > 0){
                ans =mid ;
                end = mid-1;
            }
            else{
                st = mid+1;
            }
        }
        return ans;
    }

    public int maximumCount(int[] arr) {
        int n = arr.length;
        int maxpos = n - positivecount(arr);
        int maxneg = negativecount(arr)+1;
        return Math.max(maxpos,maxneg);
    }
}
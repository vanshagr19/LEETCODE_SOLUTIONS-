class Solution {
    public int maxArea(int[] arr) {
        int n  = arr.length;
        int st = 0;
        int end = n-1;
        int maxwater = 0;

        while(st<= end){
            int width = end -st ;
            int height  = Math.min(arr[st ], arr[end]);

            int water = height * width ;
            maxwater = Math.max(water,maxwater);

            if (arr[st] > arr[end]) end-- ;
            else st++; 
        }
        return maxwater;
    }
}
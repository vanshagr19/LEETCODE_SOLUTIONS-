class Solution {
    public int search(int[] arr, int key) {
        int n = arr.length;
        int st = 0;
        int end = n-1;
        while(st<=end){
            int mid = st+(end-st)/2;
            if(arr[mid] == key) return mid;
            else if(arr[mid] > key){
                end = mid-1;
            }
            else{
                st =mid+1;
            }
        }
        return -1;
    }
}
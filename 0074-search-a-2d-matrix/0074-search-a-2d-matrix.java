class Solution {

    public boolean search(int[][] arr , int key, int m ){
        int n  = arr[0].length;
        int st = 0 ;
        int end = n-1;
        while(st <= end){
            int mid = st+(end-st)/2;
            if (arr[m][mid] == key) return true;
            else if(arr[m][mid] > key) end = mid - 1;
            else st = mid +1 ;
        }
        return false;
    }

    public boolean searchMatrix(int[][] arr, int key) {
        int m= arr.length;
        int n  = arr[0].length;
        int st = 0 ;
        int end = m-1;
        while(st <= end){
            int mid = st+(end - st)/2;
            if (arr[mid][0] <= key && arr[mid][n-1] >= key){
                return search(arr , key ,mid);
            }
            else if(key < arr[mid][0]){
                end = mid-1;
            }
            else {
                st = mid+1;
            }
        }
        return false;
    }
}
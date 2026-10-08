class Solution {
    public int largestRectangleArea(int[] arr) {
        int n = arr.length;
        int[] prevs = new int[n];
        int[] nexts = new int[n];
        Stack<Integer> st = new Stack<>();
        prevs[0] = -1 ;
        st.push(0);
        for(int i = 1 ; i < n ; i++){
            while(st.size() > 0 && arr[st.peek()] >= arr[i]) st.pop();
            if(st.size() == 0 ) prevs[i] = -1;
            else prevs[i] = st.peek();

            st.push(i);
        }
        while(!st.isEmpty()) st.pop();

        nexts[n-1] = n ;
        st.push(n-1);
        for(int i = n-2 ; i >= 0; i--){
            while(st.size() > 0 && arr[st.peek()] >= arr[i]) st.pop();
            if(st.size() == 0 ) nexts[i] = n;
            else nexts[i] = st.peek();
            st.push(i);
        }
        int max = Integer.MIN_VALUE;
        for (int i = 0 ; i < n ; i++){
            int area = arr[i] *(nexts[i] - prevs[i] -1);
            max = Math.max(max , area);
        }
        return max;
    }
}
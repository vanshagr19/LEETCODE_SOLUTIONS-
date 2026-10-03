class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> st = new Stack<>();
        for (int i = 0 ; i < operations.length ; i++){
            if (operations[i].equals("C") ) st.pop();
            else if ( operations[i].equals("D") ){
                st.push(2*(st.peek() ));
            }
            else if ( operations[i].equals("+") ){
                int top= st.pop();
                int top2 = st.peek();
                st.push(top);
                st.push(top+top2);
            }
            else{
                st.push(Integer.parseInt(operations[i]));
            }
        }
        int sum = 0 ;
        while(st.size() != 0){
            int top = st.pop();
            sum += top;
        }
        return sum;
    }
}
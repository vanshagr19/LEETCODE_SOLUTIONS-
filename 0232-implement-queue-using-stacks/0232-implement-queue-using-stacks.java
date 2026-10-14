class MyQueue {
    Stack<Integer> st = new Stack<>();
    Stack<Integer> help = new Stack<>();

    public MyQueue() {

    }

    public void push(int x) {
        if (st.size() == 0) st.push(x);
        else{
            while(st.size() >0){
                help.push(st.pop());
            }
            st.push(x);
            while(help.size() > 0 ){
                st.push(help.pop());
            }
        }
    }

    public int pop() {
        return st.pop();
    }

    public int peek() {
        return st.peek();
    }

    // public void push(int x) {
    //     st.push(x);
    // }

    // public int pop() {
    //     while (st.size() > 1) {
    //         help.push(st.pop());
    //     }
    //     int rele = st.pop();
    //     while (help.size() > 0) {
    //         st.push(help.pop());
    //     }
    //     return rele;
    // }

    // public int peek() {
    //     while (st.size() > 1) {
    //         help.push(st.pop());
    //     }
    //     int rele = st.peek();
    //     while (help.size() > 0) {
    //         st.push(help.pop());
    //     }
    //     return rele;
    // }

    public boolean empty() {
        return (st.isEmpty());
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
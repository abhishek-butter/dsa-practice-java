class MinStack {
    Stack<Integer> s;
    Stack<Integer> ms;

    public MinStack() {
        s=new Stack<>();
        ms=new Stack<>();
        
        
    }
    
    public void push(int val) {
        s.push(val);

        if(ms.isEmpty())ms.push(val);
        else ms.push(Math.min(val,ms.peek()));
        
    }
    
    public void pop() {
        s.pop();
        ms.pop();
        
    }
    
    public int top() {
        return s.peek();
        
    }
    
    public int getMin() {
        return ms.peek();
        
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
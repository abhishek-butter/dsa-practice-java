class MinStack {
    Stack<Integer> main;
    Stack<Integer> min;

    public MinStack() {//this is a constructor;
        main=new Stack<>();
        min=new Stack<>();
        
    }
    
    public void push(int value) {
        if(main.isEmpty()){
            
            min.add(value);

        }       
        else if(!main.isEmpty()){
            
            if(value<min.peek()){
                min.add(value);
                
            }
            else min.add(min.peek());

        }
        main.add(value);
        
        
    }
    
    public void pop() {
        main.pop();
        min.pop();
        
    }
    
    public int top() {
        return main.peek();
        
    }
    
    public int getMin() {
        return min.peek();
        
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
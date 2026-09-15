class FreqStack {
    HashMap<Integer,Integer> map;
    HashMap<Integer,Stack<Integer>> engine;
    int topf=0;

    public FreqStack() {
        map=new HashMap<>();
        engine=new HashMap<>();
        
    }
    
    public void push(int val) {
        map.put(val,map.getOrDefault(val,0)+1);
        engine.computeIfAbsent(map.get(val),k->new Stack<>());
        engine.get(map.get(val)).push(val);
        topf=Math.max(topf,map.get(val));

        
    }
    
    public int pop() {
        int v= engine.get(topf).pop();
        map.put(v,map.get(v)-1);
        if(engine.get(topf).isEmpty())topf--;
        return v;
        
    }
}

/**
 * Your FreqStack object will be instantiated and called as such:
 * FreqStack obj = new FreqStack();
 * obj.push(val);
 * int param_2 = obj.pop();
 */
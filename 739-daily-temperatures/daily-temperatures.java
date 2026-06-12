class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> s=new Stack<>();
        int r[]=new int[temperatures.length];

        for(int i=0;i<temperatures.length;i++){
            while(!s.isEmpty() &&temperatures[i]>temperatures[s.peek()]){
                int o=s.pop();
                r[o]=i-o;

            
            }
            s.add(i);
        }
        while(!s.isEmpty())r[s.pop()]=0;
        return r;
        
    }
}